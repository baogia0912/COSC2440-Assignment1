package student_enrolment_manager;

interface StudentEnrolmentManager {
    public boolean add();
    public boolean update();
    public boolean delete();
    public boolean getOne();
    public boolean getAll();
}

public class StudentEnrolment implements StudentEnrolmentManager {
    private Student student;
    private Course course;
    private String semester;

    public StudentEnrolment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    public StudentEnrolment() {
    }

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public boolean getOne() {
        return false;
    }

    @Override
    public boolean getAll() {
        return false;
    }
}
