package com.cg.trg.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.trg.bean.User;
import com.cg.trg.service.UserService;
import com.cg.trg.service.UserServiceImpl;


@WebServlet("/showall")
public class GetAllUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		try {
			List<User> userList= userService.getAllUsers();
			request.setAttribute("userList", userList);
			request.getRequestDispatcher("views/show-all-users.jsp")
			.forward(request, response);			
		}catch(Exception e) {
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, e.getMessage());
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
