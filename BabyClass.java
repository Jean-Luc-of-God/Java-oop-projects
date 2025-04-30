import java.util.List;

class BabyClass extends NurseryClass {
    public BabyClass() {
        super("BC001", "Baby Class", 15);
    }

    @Override
    boolean enrollStudent(Student student) {
        if (student.age < 2 || student.age > 3) {
            System.out.println("Student " + student.studentName + " does not meet the age requirements for Baby Class.");
            return false;
        }
        if (students.size() >= maxCapacity) {
            System.out.println("Baby Class is at full capacity.");
            return false;
        }
        students.add(student);
        student.registeredClass = this;
        System.out.println("Student " + student.studentName + " enrolled in Baby Class.");
        return true;
    }

    @Override
    void trackProgress() {
        System.out.println("Tracking progress for Baby Class.");
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
