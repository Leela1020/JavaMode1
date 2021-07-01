package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Plane;

@Repository
public class PlaneDAOImpl implements PlaneDAO{
	@Autowired
	SessionFactory sessionFactory;
	
	public int deletePlane(int planeNo) {
		Query query=sessionFactory.openSession().createSQLQuery("delete from plane where planeNo=(?)");
		query.setParameter(0, planeNo);
		return query.executeUpdate();
	}
	public Plane updatePlane(Plane plane) {
		Query query=sessionFactory.openSession().createSQLQuery("update plane set planeID=(?),modelName=(?),planeCapacity=(?),planeCompany=(?),planeType=(?) where planeNo=(?)");
		query.setParameter(0, plane.getPlaneID());
		query.setParameter(1, plane.getModelName());
		query.setParameter(2, plane.getPlaneCapacity());
		query.setParameter(3, plane.getPlaneCompany());
		query.setParameter(4,plane.getPlaneType());
		query.setParameter(5, plane.getPlaneNo());
		query.executeUpdate();
		return plane;
	}
	public int setHangarID(Plane plane) {
		Query query=sessionFactory.openSession().createSQLQuery("update plane set hangarID=(?) where planeID=(?)");
		query.setParameter(0, plane.getHangarID());
		query.setParameter(1, plane.getPlaneID());
		return query.executeUpdate();
	}
	public Plane getPlane(int planeNo) {
		return (Plane) sessionFactory.openSession().get(Plane.class, planeNo);
	}
	public List<Plane> listPlanes(){
		@SuppressWarnings("unchecked")
		List<Plane> planeList=sessionFactory.openSession().createQuery("from Plane").list();
		return planeList;
	}
	public int deallotPlane(int planeNo) {
		Query query=sessionFactory.openSession().createSQLQuery("update plane set hangarID=null where planeNo=(?)");
		query.setParameter(0, planeNo);
		return query.executeUpdate();
	}
	@SuppressWarnings("unchecked")
	public List<Plane> getAvailablePlanes(){
		return (List<Plane> )sessionFactory.openSession().createQuery("from Plane p where p.hangarID=null").list();
	}

	public Plane savePlane(Plane plane) {
		Query query=sessionFactory.openSession().createSQLQuery("insert into plane(planeID,modelName,planeCompany,planeCapacity,planeType,hangarID) values(?,?,?,?,?,?)");
		query.setParameter(0, plane.getPlaneID());
		query.setParameter(1, plane.getModelName());
		query.setParameter(2, plane.getPlaneCompany());
		query.setParameter(3, plane.getPlaneCapacity());
		query.setParameter(4, plane.getPlaneType());
		query.setParameter(5,plane.getHangarID());
		query.executeUpdate();
		return plane;
	}

}
