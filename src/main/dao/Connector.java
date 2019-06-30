package dao;

import java.sql.*;

public class Connector {
    public final String username = "root";
    public final String password = "12345";
    public final String url = "jdbc:mysql://localhost:3306/outsourcingmis?serverTimezone=UTC";

    public Connection getConnector(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            //return connection;
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) throws Exception {
        Connector connector = new Connector();
        connector.getConnector();
    }
}
