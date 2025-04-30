import java.util.ArrayList;
import java.util.List;

abstract class NurseryClass {
    String classId;
    String className;
    int maxCapacity;
    Teacher assignedTeacher;
    List<Student> students;

    public NurseryClass(String classId, String className, int maxCapacity) {
        this.classId = classId;
        this.className = className;
        this.maxCapacity = maxCapacity;
        this.students = new ArrayList<>();
    }

    abstract boolean enrollStudent(Student student);
    abstract void trackProgress();
    abstract void conductActivity(String activityName);
    abstract void generateClassReport();
}
