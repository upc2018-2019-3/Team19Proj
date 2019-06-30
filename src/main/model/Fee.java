package model;

public class Fee {
    private int projectid;
    private int impleid;
    private String projectfee;
    private String implefee;

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public int getImpleid() {
        return impleid;
    }

    public void setImpleid(int impleid) {
        this.impleid = impleid;
    }

    public String getProjectfee() {
        return projectfee;
    }

    public void setProjectfee(String projectfee) {
        this.projectfee = projectfee;
    }

    public String getImplefee() {
        return implefee;
    }

    public void setImplefee(String implefee) {
        this.implefee = implefee;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "projectid=" + projectid +
                ", impleid=" + impleid +
                ", projectfee='" + projectfee + '\'' +
                ", implefee='" + implefee + '\'' +
                '}';
    }
}
