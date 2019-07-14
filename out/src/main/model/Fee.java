package model;

public class Fee {
    private int projectid;
    private int impleid;
    private float projectfee;
    private float implefee;
    private String starttime;
    private String endtime;

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

    public float getProjectfee() {
        return projectfee;
    }

    public void setProjectfee(float projectfee) {
        this.projectfee = projectfee;
    }

    public float getImplefee() {
        return implefee;
    }

    public void setImplefee(float implefee) {
        this.implefee = implefee;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "projectid=" + projectid +
                ", impleid=" + impleid +
                ", projectfee=" + projectfee +
                ", implefee=" + implefee +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                '}';
    }
}
