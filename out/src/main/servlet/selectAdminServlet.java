package servlet;

import com.mysql.cj.api.Session;
import controller.AdminController;
import controller.UserController;
import model.Admin;
import model.User;

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

        UserController controller = new UserController();
        List<User> list = controller.selectAllUser();
        req.setAttribute("list",list);
        req.getRequestDispatcher("adminPages/SystemM.jsp").forward(req,resp);
        //PrintWriter writer = resp.getWriter();
        //writer.println(list.toString());
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        doPost(req, resp);
    }
}
