package model;

import java.util.Date;

public class Implement {
    private int impleid;
    private String implename;
    private int projectid;
    private String implestart;
    private String impleend;

    public int getImpleid() {
        return impleid;
    }

    public void setImpleid(int impleid) {
        this.impleid = impleid;
    }

    public String getImplename() {
        return implename;
    }

    public void setImplename(String implename) {
        this.implename = implename;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public String getImplestart() {
        return implestart;
    }

    public void setImplestart(String implestart) {
        this.implestart = implestart;
    }

    public String getImpleend() {
        return impleend;
    }

    public void setImpleend(String impleend) {
        this.impleend = impleend;
    }

    @Override
    public String toString() {
        return "Implement{" +
                "impleid=" + impleid +
                ", implename='" + implename + '\'' +
                ", projectid=" + projectid +
                ", implestart=" + implestart +
                ", impleend=" + impleend +
                '}';
    }
}
