import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name = "";
    private String group = "";
    private int course = 0;
    private Map<String, Integer> gradesForSubjects = new HashMap<>();

    Student(String name, String group, int course, Map<String, Integer> gradesForSubjects) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.gradesForSubjects = gradesForSubjects;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    double getGPA() {
        double tmp = 0;
        double gpa = 0;
        for (int value : gradesForSubjects.values()) {
            tmp += value;
            gpa = tmp / gradesForSubjects.size();
        }
        return gpa;
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", group='" + group +
                ", course=" + course +
                ", grades=" + gradesForSubjects;
    }
}