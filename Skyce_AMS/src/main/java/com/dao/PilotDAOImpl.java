package com.dao;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Pilot;

@Repository
public class PilotDAOImpl implements PilotDAO{
    @Autowired
    SessionFactory sessionFactory;
    
    public int deletePilot(int pilotNo) {
        Query query=sessionFactory.openSession().createSQLQuery("delete from pilot where pilotNo=(?)");
        query.setParameter(0, pilotNo);
        return query.executeUpdate();
    }
    public Pilot updatePilot(Pilot pilot) {
        Query query=sessionFactory.openSession().createSQLQuery("update pilot set dgcapilotID=(?),age=(?),email=(?),firstName=(?),lastName=(?) where pilotNo=(?)");
        query.setParameter(5, pilot.getPilotNo());
        query.setParameter(0, pilot.getDgcaPilotID());
        query.setParameter(1, pilot.getAge());
        query.setParameter(2, pilot.getEmail());
        query.setParameter(3, pilot.getFirstName());
        query.setParameter(4, pilot.getLastName());
        query.executeUpdate();
        return pilot;
    }
    
    public Pilot getPilot(int pilotNo) {
        return (Pilot) sessionFactory.openSession().get(Pilot.class, pilotNo);
    }
    
    public List<Pilot> listPilots(){
        @SuppressWarnings("unchecked")
        List<Pilot> pilotList=sessionFactory.openSession().createQuery("from Pilot").list();
        return pilotList;   
    }
    
    public Pilot savePilot(Pilot pilot) {
    	sessionFactory.openSession().save(pilot);
    	
        /*Query query=sessionFactory.openSession().createSQLQuery("insert into pilot(dgcaPilotID,age,email,firstName,lastName) values (?,?,?,?,?)");
        query.setParameter(0, pilot.getDgcaPilotID());
        query.setParameter(1, pilot.getAge());
        query.setParameter(2, pilot.getEmail());
        query.setParameter(3, pilot.getFirstName());
        query.setParameter(4, pilot.getLastName());
        query.executeUpdate();*/
        return pilot;
    }
    
}
