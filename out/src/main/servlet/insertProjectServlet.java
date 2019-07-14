package servlet;

import controller.ProjectController;
import model.Project;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class insertProjectServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String projectid = request.getParameter("projectid");
        String projectname = request.getParameter("projectname");
        String overview = request.getParameter("overview");
        String doc = request.getParameter("doc");

        Project project = new Project();
        project.setProjectid(Integer.parseInt(projectid));
        project.setProjectname(projectname);
        project.setOverview(overview);
        project.setDoc(doc);

        PrintWriter writer = response.getWriter();
        writer.println(project.toString());

        ProjectController projectController = new ProjectController();
        projectController.insertProject(project);

        response.sendRedirect("/out/selectProject");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doPost(request, response);
    }


}
