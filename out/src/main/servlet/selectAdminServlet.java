package servlet;

import com.mysql.cj.api.Session;
import controller.AdminController;
import model.Admin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class selectAdminServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //PrintWriter pw = resp.getWriter();
        //pw.println("hello servlet");

        AdminController adminController = new AdminController();
        List<Admin> list = new ArrayList<>();
        list = adminController.selectAllAdmin();
        req.setAttribute("list",list);
        req.getRequestDispatcher("SystemM.jsp").forward(req,resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        doPost(req, resp);
    }
}
