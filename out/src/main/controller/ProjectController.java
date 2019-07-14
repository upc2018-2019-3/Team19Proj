package controller;

import dao.Connector;
import model.Project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProjectController {

    private Connection connection = null;


    public ProjectController(){
        Connector connector = new Connector();
        connection = connector.getConnector();
    }

    public List<Project> selectAllProject(){
        List<Project> list = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            String sql = "select * from project";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Project project = new Project();

                project.setProjectid(rs.getInt("projectid"));
                project.setProjectname(rs.getString("projectname"));
                project.setOverview(rs.getString("overview"));
                project.setDoc(rs.getString("doc"));

                list.add(project);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public void insertProject(Project project){
        int projectid = project.getProjectid();
        String projectname = project.getProjectname();
        String overview = project.getOverview();
        String doc = project.getDoc();

        try {
            Statement statement = connection.createStatement();
            String sql = "insert into project values(\""+projectid+"\",\""+projectname+"\",\""+overview+"\",\""+doc+"\")";
            //System.out.println(sql);
            statement.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public void deleteProject(String projectId){
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate("set foreign_key_checks=0");
            String sql = "delete from project where projectid=\""+projectId+"\"";
            statement.executeUpdate(sql);
            statement.executeUpdate("set foreign_key_checks=1");
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public static void main(String[] args){
        ProjectController projectController = new ProjectController();

        Project project = new Project();
        project.setProjectid(8);
        project.setProjectname("洪杰在行动");
        project.setOverview("warming heart");
        project.setDoc("不好");
        projectController.insertProject(project);

        List<Project> list = new ArrayList<>();
        list = projectController.selectAllProject();
        System.out.println(list);
    }
}
