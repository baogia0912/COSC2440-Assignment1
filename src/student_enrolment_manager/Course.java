package student_enrolment_manager;

public class Course {
    private String ID;
    private String name;
    private int credits;

    public Course(String ID, String name, int credits) {
        this.ID = ID;
        this.name = name;
        this.credits = credits;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
