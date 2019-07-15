package servlet.user;

import controller.ProjectController;
import model.Project;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class selectUserProject extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        User user = (User) req.getSession().getAttribute("user");
        if(user != null){
            ProjectController controller = new ProjectController();
            List<Project> list = controller.selectAllProject();
            req.setAttribute("list",list);
            req.getRequestDispatcher("userPages/ProjectM.jsp").forward(req,resp);
        }else{
            resp.sendRedirect("index.jsp");
        }
    }
}
