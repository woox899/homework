import java.beans.PropertyEditorManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student studentAndy = new Student("Andy", "12A", 2);
        studentAndy.appendSubjectAndGrade("Math", 5);
        studentAndy.appendSubjectAndGrade("Phis", 4);
        studentAndy.appendSubjectAndGrade("Geo", 5);
        studentAndy.getGPA();

        Student studentMichael = new Student("Michael", "13A", 3);
        studentMichael.appendSubjectAndGrade("Math", 3);
        studentMichael.appendSubjectAndGrade("Phis", 3);
        studentMichael.appendSubjectAndGrade("Geo", 4);

        Student studentJohn = new Student("John", "14A", 4);
        studentJohn.appendSubjectAndGrade("Math", 5);
        studentJohn.appendSubjectAndGrade("Phis", 3);
        studentJohn.appendSubjectAndGrade("Geo", 3);

        HashSet<Student> students = new HashSet<>();
        students.add(studentAndy);
        students.add(studentMichael);
        students.add(studentJohn);

        System.out.println(students);
    }
}














