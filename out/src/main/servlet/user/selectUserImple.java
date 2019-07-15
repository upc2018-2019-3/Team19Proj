package servlet.user;

import controller.ImplementController;
import model.Implement;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class selectUserImple extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        List<Implement>list = new ArrayList<>();
        ImplementController controller = new ImplementController();
        list = controller.selectImple(String.valueOf(user.getId()));
        //PrintWriter writer = resp.getWriter();
        //writer.println(list.toString());
        req.setAttribute("list",list);
        req.getRequestDispatcher("userPages/ImplementM.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
