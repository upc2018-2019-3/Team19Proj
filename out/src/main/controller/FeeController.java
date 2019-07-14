package controller;

import dao.Connector;
import model.Fee;

import java.sql.Connection;
import java.sql.Statement;

public class FeeController {
    private Connection connection = null;

    public FeeController(){
        Connector connector = new Connector();
        connection = connector.getConnector();
    }

    public void insertFee(Fee fee){
        int projectid = fee.getProjectid();
        int impleid = fee.getImpleid();
        float projectfee = fee.getProjectfee();
        float implefee = fee.getImplefee();
        String starttime = fee.getStarttime();
        String endtime = fee.getEndtime();

        try{
            Statement statement = connection.createStatement();
            String sql = "insert into fee values(\""+projectid+"\",\""+impleid+"\",\""+
                    projectfee+"\",\""+implefee+"\",\""+starttime+"\",\""+endtime+"\")";
            System.out.println(sql);
            statement.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Fee fee = new Fee();
        fee.setProjectid(8);
        fee.setImpleid(12);
        fee.setProjectfee(1265.2f);
        fee.setImplefee(1256.4f);
        fee.setStarttime("2019-6-31");
        fee.setEndtime("3019-7-1");

        try {
            FeeController feeController = new FeeController();
            feeController.insertFee(fee);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
