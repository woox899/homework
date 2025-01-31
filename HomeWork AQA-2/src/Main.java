import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        Employee employee = new Employee(
                "Иванов Иван Иванович",
                "AQA Engineer",
                "Ivanov@gmail.com",
                "89128887665",
                100000,
                30);
        employee.printEmployeeInfo();
//2
        Employee[] personArray = new Employee[5];
        personArray[0] = new Employee(
                "Петров Сергей Михайлович",
                "Сварщик",
                "Petrov@gmail.com",
                "89771234544",
                120000,
                25);

        personArray[1] = new Employee(
                "Сидоров Евгений Александрович",
                "Хирург",
                "Sidorov@gmail.com",
                "89881234894",
                200000,
                35);

        personArray[2] = new Employee(
                "Харисов Петр Алексеевич",
                "Космонавт",
                "Kharisov@gmail.com",
                "89123456612",
                1200000,
                38);

        personArray[3] = new Employee(
                "Амирзанов Роберт Альфредович",
                "Продавец",
                "Amirzyanov@gmail.com",
                "89227664544",
                40000,
                46);

        personArray[4] = new Employee(
                "Устинов Сергей Михайлович",
                "Инженер",
                "Ustinov@gmail.com",
                "89634558786",
                90000,
                33);
        //3
        Park.Attraction carousel = new Park.Attraction(
                "carousel",
                "09:00 - 18:00",
                "120");
        Park.Attraction ferrisWheel = new Park.Attraction(
                "ferrisWheel",
                "10:00 - 22:00",
                "80");
        Park.Attraction trampoline = new Park.Attraction(
                "trampoline",
                "08:00 - 20:00",
                "50");
    }
}















