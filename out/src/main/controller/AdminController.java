package controller;

import dao.Connector;
import model.Admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminController {

    private Connection connection = null;

    public AdminController(){
        Connector connector = new Connector();
        connection = connector.getConnector();
    }

    public Admin selectAdmin(String account) {
        Admin admin = new Admin();
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from admin where adminaccount =\"" + account +"\"";
            System.out.println(sql);
            ResultSet rs = statement.executeQuery(sql);
            //Admin admin = new Admin();
            while (rs.next()) {
                admin.setAdminid(rs.getInt("adminid"));
                admin.setAdminname(rs.getString("adminname"));
                admin.setAdminaccount(rs.getString("adminname"));
                admin.setPassword(rs.getString("password"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return admin;

    }

    public List<Admin> selectAllAdmin(){
        List<Admin> list = new ArrayList<>();
        try{
            String sql = "select * from admin";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Admin admin = new Admin();
                admin.setAdminid(rs.getInt("adminid"));
                admin.setAdminaccount(rs.getString("adminaccount"));
                admin.setAdminname(rs.getString("adminname"));
                admin.setPassword(rs.getString("password"));
                list.add(admin);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void insertAdmin(Admin admin){
        int adminid = admin.getAdminid();
        String adminname = admin.getAdminname();
        String adminaccount = admin.getAdminaccount();
        String password = admin.getPassword();

        try{
            Statement statement = connection.createStatement();

            String sql = "insert into admin values(\""+adminid+"\",\""+adminname+"\",\""+adminaccount+"\",\""+password+"\")";
            //System.out.println(sql);
            statement.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteAdmin(int adminid){

        try{
            Statement statement = connection.createStatement();
            String sql = "delete from admin where adminid=\""+String.valueOf(adminid)+"\"";
            statement.executeUpdate(sql);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Admin admin = new Admin();
        admin.setAdminid(2);
        admin.setAdminname("ć´Şć°");
        admin.setAdminaccount("hongjie");
        admin.setPassword("quanhong123");


        AdminController adminController = new AdminController();
        //adminController.insertAdmin(admin);
//        admin = adminController.selectAdmin("quanhongjie");
//        System.out.println(admin.toString());

        List<Admin> list = new ArrayList<>();
        adminController.insertAdmin(admin);
        list = adminController.selectAllAdmin();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }

    }

}
