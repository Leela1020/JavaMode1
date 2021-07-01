package com.petpeers;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmpassword");
		//make user object
		User userModel = new User(name, password, confirmPassword);

		// to create a database model
		UserDB regUser;
		try {
		regUser = new UserDB(DBConnection.getConnection());
		if (regUser.saveUser(userModel)) {
			   response.sendRedirect("login.jsp");
			} else {
				
			    response.sendRedirect("register.jsp");
			    }

		} catch (Exception e) {
	
		e.printStackTrace();
		}
		
		
	}

}
