package servlet;
import controller.AdminController;
import model.Admin;

import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminaccount = request.getParameter("adminaccount");
		String password = request.getParameter("password");
		AdminController adminController = new AdminController();
		Admin admin = new Admin();
		admin = adminController.selectAdmin(adminaccount);
		if(admin.getPassword().equals(password)){
			response.sendRedirect("/out/selectAdmin");
		}else {
			response.sendRedirect("index.jsp");
		}
	}

}
