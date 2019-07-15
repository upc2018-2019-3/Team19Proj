package servlet.user;

import controller.UserController;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class selectUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String useraccount = req.getParameter("useraccount");
        String password = req.getParameter("password");

        System.out.println(useraccount+password);

        UserController controller = new UserController();
        User user = controller.selectUser(useraccount);
        System.out.println(user.toString());

        if(password.equals(user.getPassword())){
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            resp.sendRedirect("/out/selectuserproject");
        }
        else{
            resp.sendRedirect("index.jsp");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
