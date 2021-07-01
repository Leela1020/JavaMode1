package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Hangar;

@Repository
public class HangarDAOImpl implements HangarDAO{
	@Autowired
	SessionFactory sessionFactory;
	
	public Hangar updateHangar(Hangar hangar) {
		Query query=sessionFactory.openSession().createSQLQuery("update hangar set hangarID=(?),hangarType=(?),status=(?) where hangarNo=(?)");
		query.setParameter(0, hangar.getHangarID());
		query.setParameter(1, hangar.getHangarType());
		query.setParameter(2, hangar.getStatus());
		query.setParameter(3, hangar.getHangarNo());
		query.executeUpdate();
		return hangar;
	}
	public int deleteHangar(int hangarNo) {
		Query query=sessionFactory.openSession().createSQLQuery("delete from hangar where hangarNo=(?)");
		query.setParameter(0, hangarNo);
		return query.executeUpdate();
	}
	@SuppressWarnings("unchecked")
	public List<Hangar> getAvailableHangars(){
		return (List<Hangar>) sessionFactory.openSession().createQuery("from Hangar h where h.status=0").list();	
	}
	public int setAvailability(Hangar hangar,int status) {
		Query query=sessionFactory.openSession().createSQLQuery("update hangar set status=(?) where hangarNo=(?)");
		query.setParameter(0, status);
		query.setParameter(1, hangar.getHangarNo());
		return query.executeUpdate();
	}
	public Hangar addHangar(Hangar hangar) {
		Query query=sessionFactory.openSession().createSQLQuery("insert into hangar(hangarID,status,hangarType) values (?,?,?)");
		query.setParameter(1, hangar.getStatus());
		query.setParameter(2, hangar.getHangarType());
		query.setParameter(0, hangar.getHangarID());
		query.executeUpdate();
		return hangar;
	}
	@SuppressWarnings("unchecked")
	public List<Hangar> listHangars(){
		return sessionFactory.openSession().createQuery("from Hangar").list();
	}
	public Hangar getHangar(int hangarNo) {
		return (Hangar) sessionFactory.openSession().get(Hangar.class, hangarNo);
	}
}
