package servlet;

import controller.AdminController;
import model.Admin;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class insertAdminServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws SecurityException, IOException {
        doPost(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws SecurityException, IOException {
        String adminid = request.getParameter("adminid");
        String adminname = request.getParameter("adminname");
        String adminaccount = request.getParameter("adminaccount");
        String password = request.getParameter("password");

        Admin admin = new Admin();
        admin.setAdminid(Integer.valueOf(adminid));
        admin.setAdminname(adminname);
        admin.setAdminaccount(adminaccount);
        admin.setPassword(password);

        AdminController adminController = new AdminController();
        adminController.insertAdmin(admin);

        response.sendRedirect("/out/selectAdmin");
//        PrintWriter printWriter = response.getWriter();
//        printWriter.println(admin);
    }
}
