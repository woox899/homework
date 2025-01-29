public class Employee {
    String fullName;
    String jobTitle;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fullName, String jobTitle, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("Ф.И.О: " + fullName + ", Профессия: " + jobTitle + ", Email: " + email + ", Телефон: " +
                phoneNumber + ", Зарплата: " + salary + ", Возраст: " + age);
    }
}
