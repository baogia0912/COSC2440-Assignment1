package student_enrolment_manager;

import java.util.Date;

public class Student {
    private String ID;
    private String name;
    private Date birthday;

    public Student(String ID, String name, Date birthday) {
        this.ID = ID;
        this.name = name;
        this.birthday = birthday;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
