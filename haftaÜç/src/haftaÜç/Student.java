package hafta‹Á;

public class Student extends User {

    private String firstName;
    private String lastName;
    private String lesson;

    public Student(String firstName, String lastName, String lesson, int id, String email) {
        super(id, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.lesson = lesson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return lesson;
    }

    public void setCourse(String lesson) {
        this.lesson = lesson;
    }

   
    
    
}
