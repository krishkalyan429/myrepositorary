package com.cg.trg.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.trg.service.UserService;
import com.cg.trg.service.UserServiceImpl;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService=new UserServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String submitType= request.getParameter("submit");
		//		System.out.println(submitType);
		if(submitType.equals("Sign In")){
			String userId=request.getParameter("userid");
			String password=request.getParameter("password");
			try {
				if(userService.isValidCredential(userId, password)) {				
					request.getRequestDispatcher("views/menu.jsp")
					.forward(request, response);
				}else {
					out.println("Invalid Credentials. Login Again");
					request.getRequestDispatcher("login_latest.html")
					.include(request, response);
				}
			}catch(Exception e) {

			}
		}else  {
			request.getRequestDispatcher("views/user-registration.jsp")
			.forward(request, response);
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
