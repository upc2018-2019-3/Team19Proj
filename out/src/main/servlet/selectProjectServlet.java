package servlet;

import controller.AdminController;
import controller.ProjectController;
import model.Project;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class selectProjectServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProjectController projectController = new ProjectController();
        List<Project> list = new ArrayList<>();
        list = projectController.selectAllProject();
        request.setAttribute("list",list);
        request.getRequestDispatcher("adminPages/ProjectM.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        doPost(request,response);
    }
}
