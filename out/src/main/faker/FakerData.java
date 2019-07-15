package faker;

import com.github.javafaker.Faker;
import controller.*;
import model.*;

import java.util.Locale;
import java.util.Random;

public class FakerData {
    public void FakeAdmin(){
        Locale locale = new Locale("zh","CN");
        Locale locale1 = new Locale("en", "us");
        Faker faker = new Faker(locale);
        Faker faker1 = new Faker(locale1);
        for(int i=0;i<50;i++){
            Admin admin = new Admin();
            admin.setAdminname(faker.name().name());
            admin.setAdminaccount(faker1.name().username());
            admin.setPassword(faker.app().name());
            System.out.println(admin.toString());
            AdminController adminController = new AdminController();
            adminController.insertAdmin(admin);
        }
    }

    public static void FakeUser(){
        Locale locale = new Locale("zh","CN");
        Locale locale1 = new Locale("en", "us");
        Faker faker = new Faker(locale);
        Faker faker1 = new Faker(locale1);
        for(int i=0;i<50;i++){
            User user = new User();
            user.setId(i+1);
            user.setUsername(faker.name().name());
            user.setUseraccount(faker1.internet().emailAddress());
            user.setPassword(faker.app().name());
            UserController controller = new UserController();
            controller.insertUser(user);
        }
    }


    public static void FakerProject(){
        Locale locale = new Locale("zh", "CN");
        Faker faker = new Faker(locale);
        for(int i=0;i<50;i++){
            Project project = new Project();
            project.setProjectid(i+1);
            project.setProjectname(faker.name().title());
            project.setOverview(faker.company().name());
            project.setDoc(faker.phoneNumber().cellPhone());
            System.out.println(project.toString());
            ProjectController controller = new ProjectController();
            controller.insertProject(project);
        }
    }

    public static void FakeImplement(){
        Locale locale = new Locale("zh","CN");
        Faker faker = new Faker(locale);

        ImplementController controller = new ImplementController();
        for (int i=0;i<10;i++){
            Implement implement = new Implement();
            implement.setUserid(i);
            for(int j=0;j<10;j++){
                implement.setImpleid(i*j);
                implement.setProjectid(j);
                implement.setImplename(faker.name().title());
                implement.setImplestart(faker.date().birthday().toString());
                implement.setImpleend(faker.date().birthday().toString());
                controller.insertImplement(implement);
            }
        }
    }

    public static void FakeFee(){
        Locale locale = new Locale("zh","CN");
        Faker faker = new Faker(locale);


        FeeController controller = new FeeController();
        for (int i=0;i<50;i++){
            Fee fee = new Fee();
            fee.setUserid(i+1);
            for(int j=0;j<10;j++){
                fee.setImpleid(i*j);
                fee.setProjectid(j);
                fee.setProjectfee(faker.number().numberBetween(1000,100000));
                fee.setStarttime(faker.date().birthday().toString());
                fee.setEndtime(faker.date().birthday().toString());
                controller.insertFee(fee);
            }
        }
    }

    public static void main(String[] args){
        FakeFee();
    }

}
