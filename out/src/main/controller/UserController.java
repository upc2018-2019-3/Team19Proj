package controller;


import dao.Connector;
import model.Admin;
import model.User;

import javax.jws.soap.SOAPBinding;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserController {
    private Connection connection = null;

    public UserController(){
        Connector connector = new Connector();
        connection = connector.getConnector();
    }

    public void insertUser(User user){
        int userid = user.getId();
        String username = user.getUsername();
        String useraccount = user.getUseraccount();
        String password = user.getPassword();

        try{
            String sql = "insert into user values(?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,userid);
            statement.setString(2,username);
            statement.setString(3,useraccount);
            statement.setString(4,password);
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public User selectUser(String account){
        User user = new User();
        try{
            String sql = "select * from user where useraccount=\""+account+"\"";
           // System.out.println(sql);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                user.setId(rs.getInt("userid"));
                user.setUsername(rs.getString("username"));
                user.setUseraccount(rs.getString("useraccount"));
                user.setPassword(rs.getString("password"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public List<User> selectAllUser(){
        List<User> list = new ArrayList<>();
        try{
            String sql = "select * from user";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setUseraccount(rs.getString(3));
                user.setPassword(rs.getString(4));
                list.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void deleteUser(int userid){

        try{
            Statement statement = connection.createStatement();
            String sql = "delete from user where userid=\""+String.valueOf(userid)+"\"";
            statement.executeUpdate(sql);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        UserController controller = new UserController();
        User user = controller.selectUser("quan@123");
        System.out.println(user.toString());
    }

}
