package controller;

import dao.Connector;
import model.Implement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ImplementController {
    private Connection connection = null;

    public ImplementController(){
        Connector connector = new Connector();
        connection = connector.getConnector();
    }

    public void insertImplement(Implement implement){
        int impleid = implement.getImpleid();
        String implename = implement.getImplename();
        int projectid = implement.getProjectid();
        String implestart = implement.getImplestart();
        String impleend = implement.getImpleend();
        int userid = implement.getUserid();

        try{
            Statement statement = connection.createStatement();
            String sql = "insert into implement value(\""+impleid+"\",\""+implename+"\",\""+projectid+"\",\""+implestart+"\",\""+impleend+"\",\""+userid+"\")";
            System.out.println(sql);
            statement.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<Implement> selectAllImple(){
        List<Implement> list = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            String sql = "select * from implement";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Implement implement = new Implement();
                implement.setImpleid(rs.getInt("impleid"));
                implement.setImplename(rs.getString("implename"));
                implement.setProjectid(rs.getInt("projectid"));
                implement.setImplestart(rs.getString("implestart"));
                implement.setImpleend(rs.getString("impleend"));
                implement.setUserid(rs.getInt("userid"));
                list.add(implement);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public List<Implement> selectImple(String userid){
        List<Implement> list = new ArrayList<>();
        try{
            String sql = "select * from implement where userid="+userid;
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Implement implement = new Implement();
                implement.setImpleid(rs.getInt("impleid"));
                implement.setImplename(rs.getString("implename"));
                implement.setProjectid(rs.getInt("projectid"));
                implement.setImplestart(rs.getString("implestart"));
                implement.setImpleend(rs.getString("impleend"));
                implement.setUserid(rs.getInt("userid"));
                list.add(implement);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }


    public static void main(String[] args){
        ImplementController controller = new ImplementController();
        List<Implement> list = controller.selectImple("1");
        System.out.println(list.toString());
    }
}
