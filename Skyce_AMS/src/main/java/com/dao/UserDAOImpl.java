package com.dao;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;

	public User registerAdmin(User user) {
		String ID = generateID();
		  @SuppressWarnings("unchecked")
		List<User> userList=sessionFactory.openSession().createQuery("from User").list();
		  List<String> idList=userList.stream().map(p->p.getAdminID()).collect(Collectors.toList());
		  System.out.println(idList);
		  for (int i=0;i<idList.size();i++)
		  { String id=idList.get(i); 
		  if (ID.equals(id)) 
		  {
			  i=0;
		  ID=generateID();
		  } 
		  } 
		user.setAdminID(ID);
		sessionFactory.openSession().save(user);
		return user;
	}

	public static String generateID() {
		String ID = "";
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			String num = new Integer(random.nextInt(10 - 0) + 0).toString();
			ID = ID + num;
		}
		return ID;
	}

	public User registerManager(User user) {
		sessionFactory.openSession().save(user);
		return user;
	}

	public String loginAdmin(String adminID, String password) {
		Query query = sessionFactory.openSession()
				.createQuery("from User u where u.adminID= :adminID and u.password= :password");
		query.setParameter("adminID", adminID);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<User> ulist = query.list();
		return ulist.get(0).getFirstName();
	}

	public String loginManager(String managerID, String password) {
		Query query = sessionFactory.openSession()
				.createQuery("from User u where u.managerID= :managerID and u.password= :password");
		query.setParameter("managerID", managerID);
		query.setParameter("password", password);
		@SuppressWarnings("unchecked")
		List<User> ulist = query.list();
		return ulist.get(0).getFirstName();
	}

	public List<User> listManagerRequest() {
		Criteria cr = sessionFactory.openSession().createCriteria(User.class);
		cr.add(Restrictions.isNull("adminID"));
		cr.add(Restrictions.isNull("managerID"));
		@SuppressWarnings("unchecked")
		List<User> userList = cr.list();
		System.out.println(userList);
		return userList;

	}

	@SuppressWarnings("unchecked")
	public boolean approveManager(int userID) {
		Query query = sessionFactory.openSession()
				.createSQLQuery("update user set managerID=:managerID where userID=:userID");
		String ID = generateID();
		  List<User> userList=sessionFactory.openSession().createQuery("from User").list();
		  List<String> idList=userList.stream().map(p->p.getManagerID()).collect(Collectors.toList());
		  System.out.println(idList);
		  for (int i=0;i<idList.size();i++)
		  { String id=idList.get(i); 
		  if (ID.equals(id)) 
		  {
			  i=0;
		  ID=generateID();
		  } 
		  } 
		query.setParameter("managerID", ID);
		query.setParameter("userID", userID);
		int result = query.executeUpdate();
		if (result == 1)
			return true;
		else
			return false;
	}
	public boolean deleteManager(int userID) {
		Query query=sessionFactory.openSession().createSQLQuery("delete from user where userID=(?)");
		query.setParameter(0, userID);
		int result=query.executeUpdate();
		if (result==1) 
			return true;
		else
			return false;
	}

}
