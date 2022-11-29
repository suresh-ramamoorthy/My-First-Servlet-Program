package com.smartuniversity.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

import com.smartuniversity.db.DatabaseUtil;
import com.smartuniversity.dto.User;

/**
 * Servlet implementation class UserformController
 */
@WebServlet("/UserformController")
public class UserformController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserformController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("welcome");
				//response.getWriter().append("Suscessfully Registered");
				
				
				String studentname = request.getParameter("studentName");
				String studentrollnumber = request.getParameter("rollNumber");
				String studentemailid = request.getParameter("emailId");
				String studentmobilenumber = request.getParameter("mobileNumber");
				
				System.out.println(studentname +"...." + studentrollnumber +"...." + studentemailid +"...."+ studentmobilenumber);
				
				User userobj = new User();
				userobj.setId(UUID.randomUUID());
				userobj.setStudentName(studentname);
				userobj.setRollNumber(studentrollnumber);
				userobj.setEmailId(studentemailid);
				userobj.setMobileNumber(studentmobilenumber);
				
				DatabaseUtil.save(userobj);
				
				response.sendRedirect("UserlistController");
				
				//request.setAttribute("userobj", userobj);
				//request.getRequestDispatcher("UserList.jsp").include(request, response);
				//response.sendRedirect("UserList.jsp");
	}

}
