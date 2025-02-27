import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name = "";
    private String group = "";
    private int course = 0;

    // коллекция предметов и оценок
    Map<String, Integer> gradesForSubjects = new HashMap<>();

    void appendSubjectAndGrade(String subject, Integer grade) {
        gradesForSubjects.put(subject, grade);
    }

    boolean getGPA() {
        int gpa = 0;
        boolean answer = false;
        for (int value: gradesForSubjects.values()) {
            gpa += value / gradesForSubjects.size();
        }
        if (gpa < 3) {
            answer = true;
        } else if (gpa >= 3) {
            answer = false;
        }
        return answer;
    }

    //добавление предметов и оценок
//    void appendSubjectAndGrade() {
//        gradesForSubjects.put("Math", 5);
//        gradesForSubjects.put("Phis", 4);
//        gradesForSubjects.put("Geo", 5);
//
//        int gpa = 0;
//        for (int value: gradesForSubjects.values()) {
//            gpa += value / gradesForSubjects.size();
//        }
//        System.out.println(gpa);
//    }

    //переписать под словарь
    // метод принимает словарь и суммирует его значения потом делит на количество = средний балл

    Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

}
