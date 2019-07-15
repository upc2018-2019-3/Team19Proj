package controller;

import dao.Connector;
import model.Fee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
        int userid = fee.getUserid();

        try{
            Statement statement = connection.createStatement();
            String sql = "insert into fee values(\""+projectid+"\",\""+impleid+"\",\""+
                    projectfee+"\",\""+implefee+"\",\""+starttime+"\",\""+endtime+"\",\""+userid+"\")";
            System.out.println(sql);
            statement.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public List<Fee> selectAllFee(){
        List<Fee> list = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            String sql = "select * from fee";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Fee fee = new Fee();
                fee.setProjectid(rs.getInt("projectid"));
                fee.setImpleid(rs.getInt("impleid"));
                fee.setProjectfee(rs.getFloat("projectfee"));
                fee.setImplefee(rs.getFloat("implefee"));
                fee.setStarttime(rs.getString("starttime"));
                fee.setEndtime(rs.getString("endtime"));
                fee.setUserid(rs.getInt("userid"));
                list.add(fee);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public List<Fee> selectFee(String userid){
        List<Fee> list = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            String sql = "select * from fee where userid="+userid;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Fee fee = new Fee();
                fee.setProjectid(rs.getInt("projectid"));
                fee.setImpleid(rs.getInt("impleid"));
                fee.setProjectfee(rs.getFloat("projectfee"));
                fee.setImplefee(rs.getFloat("implefee"));
                fee.setStarttime(rs.getString("starttime"));
                fee.setEndtime(rs.getString("endtime"));
                fee.setUserid(rs.getInt("userid"));
                list.add(fee);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }


    public static void main(String[] args){
        FeeController controller = new FeeController();
        List<Fee> list = controller.selectFee("1");
        System.out.println(list.toString());
    }
}
