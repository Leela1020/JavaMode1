package com.petpeers;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//fetching data from login form
		 PrintWriter out=response.getWriter();
        String logname = request.getParameter("name");
        String logpass = request.getParameter("password");
        
        try {
        	
        UserDB db=  new UserDB(DBConnection.getConnection());
        User user = db.logUser(logname, logpass);
        
        if(user!=null){
            HttpSession session = request.getSession();
            session.setAttribute("logUser", user);
            response.sendRedirect("home.jsp");
        }else{
            out.println("User not found");
        }
        }catch(Exception e) {
	
		e.printStackTrace();
	}
	}
        
}
