package Entity;

public class User {
    private int id;
    private String fullname;
    private String email;
    private String password;
    private int expInYear;
    private String proSkill;
    private int projectID;
    private Role role;

    public User() {
    }

    public User(int id, String fullname, String email, String password, int expInYear, String proSkill, int projectID, Role role) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        this.projectID = projectID;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                ", projectID=" + projectID +
                ", role=" + role +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
