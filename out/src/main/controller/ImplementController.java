package controller;

import dao.Connector;
import model.Implement;

import java.sql.Connection;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

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

        try{
            Statement statement = connection.createStatement();
            String sql = "insert into implement value(\""+impleid+"\",\""+implename+"\",\""+projectid+"\",\""+implestart+"\",\""+impleend+"\")";
            System.out.println(sql);
            statement.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Implement implement = new Implement();
        implement.setImpleid(1);
        implement.setImplename("小全世界行");
        Date date = new Date();
        implement.setImplestart(DateFormat.getDateInstance().format(date));
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE,1);
        Date date1 = c.getTime();
        implement.setImpleend(DateFormat.getDateInstance().format(date1));

        try{

            ImplementController implementController = new ImplementController();
            implementController.insertImplement(implement);

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
