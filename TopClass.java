import java.util.List;

class TopClass extends NurseryClass {
    public TopClass() {
        super("TC001", "Top Class", 25);
    }

    @Override
    boolean enrollStudent(Student student) {
        if (student.age < 4 || student.age > 5) {
            System.out.println("Student " + student.studentName + " does not meet the age requirements for Top Class.");
            return false;
        }
        if (students.size() >= maxCapacity) {
            System.out.println("Top Class is at full capacity.");
            return false;
        }
        students.add(student);
        student.registeredClass = this;
        System.out.println("Student " + student.studentName + " enrolled in Top Class.");
        return true;
    }

    @Override
    void trackProgress() {
        System.out.println("Tracking progress for Top Class.");
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
