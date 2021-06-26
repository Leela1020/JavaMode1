package com.dao;

import java.util.Random;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.model.User;
@Qualifier("user")
@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	/*public List<String> getAdminIDs(){
		List<String> idList=sessionFactory.getCurrentSession().createSQLQuery("select adminID from user").list();
		System.out.println(idList);
		return idList;*/
	//}
	public void registerAdmin(User user) {
		String ID=generateID();
		/*List<String> idList=new UserDAOImpl().getAdminIDs();
		for (int i=0;i<idList.size();i++) {
			String id=idList.get(i);
			if (ID.equals(id)) {
				i=0;
				ID=generateID();
			}
		}*/
		user.setAdminID(ID);
		sessionFactory.openSession().save(user);	
	}
	public static String generateID() {
		String ID="";
		Random random=new Random();
		for (int i=0;i<5;i++) {
		@SuppressWarnings("deprecation")
		String num=new Integer(random.nextInt(10-0)+0).toString();
		ID=ID+num;}
		return ID;
	}
	public User registerManager() {
		return null;
	}
	public User loginAdmin() {
		return null;
	}
	public User loginManager() {
		return null;
	}

}
