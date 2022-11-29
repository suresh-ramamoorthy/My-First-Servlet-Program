package com.smartuniversity.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.smartuniversity.db.DatabaseUtil;
import com.smartuniversity.dto.User;

/**
 * Servlet implementation class UserlistController
 */
@WebServlet("/UserlistController")
public class UserlistController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserlistController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<User>userList = DatabaseUtil.getAllUsers();
		
		request.setAttribute("users",userList);
		
		request.getRequestDispatcher("UserList.jsp").include(request,response);
	}

}
