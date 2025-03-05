import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student studentAndy = new Student("Andy", "12A", 2,
                Map.of("Math", 4, "Phis", 5, "Geo", 4));

        Student studentMichael = new Student("Michael", "13A", 1,
                Map.of("Math", 3, "Phis", 3, "Geo", 2));

        Student studentJohn = new Student("John", "14A", 3,
                Map.of("Math", 5, "Phis", 5, "Geo", 5));

        HashSet<Student> students = new HashSet<>();
        students.add(studentAndy);
        students.add(studentMichael);
        students.add(studentJohn);

//        removeStudent(students);
//        transferToTheNextCourse(students);
//        printStudents(students, 1);
        students.forEach(System.out::println);


        PhoneDirectoryClass phoneDirectory = new PhoneDirectoryClass();

        // Добавляем в справичник
        phoneDirectory.add("Иванов", "33-11-22");
        phoneDirectory.add("Петров", "71-33-11");
        phoneDirectory.add("Сидоров", "71-33-11");
        phoneDirectory.add("Иванов", "34-67-88");

        // Поиск номера по фамилии
        phoneDirectory.get("Петров");

        System.out.println(phoneDirectory.phoneDirectory);
    }

    // Удаление студента
    public static void removeStudent(Set<Student> students) {
        students.removeIf(student -> student.getGPA() < 3 );
    }

    // Перевод на следующий курс
    public static void transferToTheNextCourse(Set<Student> students) {
        for (Student student : students) {
            if (student.getGPA() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    // Принт имени студента
    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (course == student.getCourse()) {
                System.out.println(student.getName());
            }
        }
    }
}















