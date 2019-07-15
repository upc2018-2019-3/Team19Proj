package servlet.user;


import controller.FeeController;
import model.Fee;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class selectUserFee extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user = (User) req.getSession().getAttribute("user");
        FeeController controller = new FeeController();
        List<Fee> list = new ArrayList<>();
        list = controller.selectFee(String.valueOf(user.getId()));
        req.setAttribute("list",list);
        req.getRequestDispatcher("/userPages/ChargeM.jsp").forward(req,resp);

        //PrintWriter writer = resp.getWriter();
        //writer.println(list.toString());
    }
}
