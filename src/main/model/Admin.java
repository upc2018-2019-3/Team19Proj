package model;

public class Admin {
    private int adminid;
    private String adminname;
    private String adminaccount;
    private String password;

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminaccount() {
        return adminaccount;
    }

    public void setAdminaccount(String adminaccount) {
        this.adminaccount = adminaccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminid=" + adminid +
                ", adminname='" + adminname + '\'' +
                ", adminaccount='" + adminaccount + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
