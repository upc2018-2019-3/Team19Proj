package model;

public class Project {
    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectid=" + projectid +
                ", projectname='" + projectname + '\'' +
                ", overview='" + overview + '\'' +
                ", doc='" + doc + '\'' +
                '}';
    }

    private int projectid;
    private String projectname;
    private String overview;
    private String doc;

}
