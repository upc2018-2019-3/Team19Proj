package servlet;

import controller.ImplementController;
import controller.ProjectController;
import model.Implement;
import model.Project;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class selectImpleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Implement> list = new ArrayList<>();
        ImplementController controller = new ImplementController();
        list = controller.selectAllImple();

        req.setAttribute("list", list);
        req.getRequestDispatcher("adminPages/ImplementM.jsp").forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
