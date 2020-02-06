public class Teachers {
    private String Firstname;
    private String LastName;
    private String subject;


    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //Constructor
    public Teachers(String firstname, String lastName, String course) {
        Firstname = firstname;
        LastName = lastName;
        this.subject = course;

    }





}
