import java.beans.PropertyEditorManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student studentAndy = new Student("Andy", "12A", 2,
                Map.of("Math", 4, "Phis", 5, "Geo" , 4));

        Student studentMichael = new Student("Michael", "13A", 1,
                Map.of("Math", 3, "Phis", 3, "Geo" , 2));

        Student studentJohn = new Student("John", "14A", 3,
                Map.of("Math", 5, "Phis", 5, "Geo" , 5));

        HashSet<Student> students = new HashSet<>();
        students.add(studentAndy);
        students.add(studentMichael);
        students.add(studentJohn);

        removeStudent(students);
        transferToTheNextCourse(students);

        System.out.println(students);
    }

    public static void removeStudent(Set<Student> students) {
        students.removeIf(student -> student.getGPA());
    }

    public static void transferToTheNextCourse(Set<Student> students) {
        for(Student student : students) {
            if(!student.getGPA()) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }
}














