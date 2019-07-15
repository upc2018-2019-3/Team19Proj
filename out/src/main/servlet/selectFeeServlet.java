package servlet;

import controller.FeeController;
import model.Fee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class selectFeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Fee> list = new ArrayList<>();
        FeeController controller = new FeeController();
        list = controller.selectAllFee();
        req.setAttribute("list", list);
        req.getRequestDispatcher("adminPages/ChargeM.jsp").forward(req,resp);
    }
}
