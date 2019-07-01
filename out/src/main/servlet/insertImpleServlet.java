package servlet;

import controller.ImplementController;
import model.Implement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class insertImpleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String impleid = request.getParameter("impleid");
        String implename = request.getParameter("implename");
        String projectid = request.getParameter("projectid");
        String implestart = request.getParameter("implestart");
        String impleend = request.getParameter("impleend");
        Implement implement = new Implement();
        implement.setImpleid(Integer.valueOf(impleid));
        implement.setImplename(implename);
        implement.setProjectid(Integer.valueOf(projectid));
        implement.setImplestart(implestart);
        implement.setImpleend(impleend);

        ImplementController implementController = new ImplementController();
        implementController.insertImplement(implement);
        response.sendRedirect("index.jsp");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doPost(request,response);
    }
}
