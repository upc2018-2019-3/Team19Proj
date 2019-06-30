package controller;

import dao.Connector;
import model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserController {
    private Connection connector = null;
    //private Statement statement = null;

    public UserController(){
        Connector connection = new Connector();
        connector = connection.getConnector();
        //statement = connector.createStatement();
    }
    public User selectUser(String name) throws Exception{
        Statement statement = connector.createStatement();
        User user = new User();
        String sql = "select * from user where `username` = "+name;
        System.out.println(sql);
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            user.setId(rs.getInt("userid"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
        }
        return user;
    }

    public List<User> selectAllUser() throws Exception{
        Statement statement = connector.createStatement();
        List<User> list = new ArrayList<User>();
        String sql = "select * from user";
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            User user = new User();
            user.setId(rs.getInt("userid"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            list.add(user);
        }
        return list;
    }

    public void insertUser(User user){
        int id = user.getId();
        String name = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();
        try{
            Statement statement = connector.createStatement();
            String sql = "insert into user values("+id+",\""+name+"\",\""+password+"\",\""+email+"\")";
            System.out.println(sql);
            statement.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteUser(User user){
        int id=user.getId();
        try {
            Statement statement = connector.createStatement();
            String sql = "delete from user where userid = "+id;
            statement.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        UserController userController = new UserController();
        try{
//            List<User> list  = new ArrayList<User>();
//            list = userController.selectAllUser();
//            for(int i=0;i<list.size();i++){
//                System.out.println(list.get(i).toString());
//            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
