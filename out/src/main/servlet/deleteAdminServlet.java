package servlet;

import controller.AdminController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class deleteAdminServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws SecurityException, IOException {
        String adminid = request.getParameter("adminid");

        AdminController adminController = new AdminController();
        int id = Integer.parseInt(adminid.trim());
        adminController.deleteAdmin(id);
        response.sendRedirect("/out/selectAdmin");


//        String url = request.getRequestURI();
//        PrintWriter printWriter = response.getWriter();
//        printWriter.println(adminid);
//        printWriter.println(url);

    }
    protected void doPOst(HttpServletRequest request, HttpServletResponse response)throws SecurityException, IOException {
        doGet(request, response);
    }
}
