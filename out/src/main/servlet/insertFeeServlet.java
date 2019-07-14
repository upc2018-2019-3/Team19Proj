package servlet;

import controller.FeeController;
import model.Fee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class insertFeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String projectid = request.getParameter("projectid");
        String impleid = request.getParameter("impleid");
        String projectfee = request.getParameter("projectfee");
        String implefee = request.getParameter("implefee");
        String starttime = request.getParameter("starttime");
        String endtime = request.getParameter("endtime");

        Fee fee = new Fee();
        fee.setProjectid(Integer.valueOf(projectid));
        fee.setProjectid(Integer.valueOf(impleid));
        fee.setProjectfee(Float.valueOf(projectfee));
        fee.setImplefee(Float.valueOf(implefee));
        fee.setStarttime(starttime);
        fee.setEndtime(endtime);

        FeeController feeController = new FeeController();
        feeController.insertFee(fee);

        PrintWriter writer = response.getWriter();
        writer.println(fee.toString());

        //response.sendRedirect("ChargeM.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
