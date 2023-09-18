public class Students {
    private int id;
    private String name;
    private String surname;
    private String faculty;
    private String group;
    public Students(){
        this.id = 0;
        this.name = "Name Unassigned";
        this.surname = "Surname Unassigned";
        this.faculty = "Faculty Unassigned"; // Information, Technologies, Economics, Mathematics
        this.group = "Group Unassigned";
    }
    public Students(int id, String name, String surname, String faculty, String group){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getFaculty() {
        return faculty;
    }
    public String getGroup() {
        return group;
    }
    public String getSurname() {
        return surname;
    }
}
