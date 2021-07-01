package com.petpeers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.petpeers.DBConnection;
public class UserDB {
	Connection con ;
	
	public UserDB(Connection con) {
        this.con = con;
	}
	
    public boolean saveUser(User user){
        boolean set = false;
        try{
        	PreparedStatement ps=null;
		    ps=this.con.prepareStatement("insert into user(name,password,confirmpassword) values(?,?,?)");
            ps.setString(1, user.getName());
           ps.setString(2, user.getPassword());
           ps.setString(3, user.getConfirmPassword());
           ps.executeUpdate();
           set = true;
        }catch(Exception e){
        	System.out.println(e);
        }
        return set;
		
	}
    //user login
    public User logUser(String name, String password){
        User user=null;
        try{
        	PreparedStatement ps=null;
             ps = this.con.prepareStatement("select * from user where name=? and password=?");
            ps.setString(1, name);
            ps.setString(2, password);  
            ResultSet rs = ps.executeQuery();
           if(rs.next()){
                user = new User();
                //user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
}




