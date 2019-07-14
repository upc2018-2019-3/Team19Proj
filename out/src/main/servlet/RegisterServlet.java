package servlet;


import controller.AdminController;
import model.Admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */

public class RegisterServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminname = request.getParameter("adminname");
		String psswword = request.getParameter("psswword");
		String adminaccount=request.getParameter("adminaccount");

		Admin admin = new Admin();
		admin.setAdminname(adminname);
		admin.setAdminaccount(adminaccount);
		admin.setPassword(psswword);

		AdminController adminController = new AdminController();
		adminController.insertAdmin(admin);

		response.sendRedirect("index.jsp");
	}

}
