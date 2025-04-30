import java.util.List;

class MiddleClass extends NurseryClass {
    public MiddleClass() {
        super("MC001", "Middle Class", 20);
    }

    @Override
    boolean enrollStudent(Student student) {
        if (student.age < 3 || student.age > 4) {
            System.out.println("Student " + student.studentName + " does not meet the age requirements for Middle Class.");
            return false;
        }
        if (students.size() >= maxCapacity) {
            System.out.println("Middle Class is at full capacity.");
            return false;
        }
        students.add(student);
        student.registeredClass = this;
        System.out.println("Student " + student.studentName + " enrolled in Middle Class.");
        return true;
    }

    @Override
    void trackProgress() {
        System.out.println("Tracking progress for Middle Class.");
    }

    @Override
    void conductActivity(String activityName) {
        System.out.println("Conducting activity: " + activityName);
    }

    @Override
    void generateClassReport() {
        System.out.println("Class Name: " + className);
        System.out.println("Assigned Teacher: " + assignedTeacher.teacherName);
        System.out.println("Number of Enrolled Students: " + students.size());
    }
}
