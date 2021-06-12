package com.cg.trg.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.trg.bean.User;
import com.cg.trg.service.UserService;
import com.cg.trg.service.UserServiceImpl;



@WebServlet("/user-reg")
public class UserRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		String userId= request.getParameter("userid");
		String userName= request.getParameter("username");
		String password= request.getParameter("password");
		String confirmPassword= request.getParameter("confirmpassword");
		String email= request.getParameter("email");
		Long mobile= Long.parseLong(request.getParameter("mobile"));
		String status="";
		try {
			if(!password.equals(confirmPassword)) {				
				throw new IllegalArgumentException("Password not matching..");
				
			}

			User user= new User(userId,userName,password,email,mobile);		
			status=userService.addUser(user);
//			request.setAttribute("status", status);
			out.println("User Registration Successfull");
			request.getRequestDispatcher("login_latest.html")
			.include(request, response);
		}catch(IllegalArgumentException e) {
			status="Unable to add user";
			response.sendError(HttpServletResponse.SC_NOT_ACCEPTABLE, e.getMessage()+"\n"+status);
		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}