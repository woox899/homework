import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        printThreeWords();
//        checkSumSign();
//        printColor();
//        compareNumbers();
//        checkAmount(10, 9);
//        positiveOrNegative(-1);
//        positiveOrNegativeBoolean(1);
//        howManyTimesWillItPrint(3, "Hello");
//        whatYear(404);
//        reverseNumbers();
//        arrayOfLength100();
//        lessThan6MultiplyBy2();
//        squareTwoDimensionalArray();
//        twoArguments(3, 18);
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

    // 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //2
    public static void checkSumSign() {
        int a = 2;
        int b = 2;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //3
    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //4
    public static void compareNumbers() {
        int a = 3;
        int b = 2;

        if (a >= b) {
            System.out.println("a >= b");
        } else if (a < b) {
            System.out.println("a < b");
        }
    }

    //5
    public static boolean checkAmount(int a, int b) {
        boolean answer = false;
        int sum = 0;
        sum = a + b;
        if (sum >= 10 && sum <= 20) answer = true;
        else answer = false;
        System.out.println(answer);
        return answer;
    }

    //6
    public static void positiveOrNegative(int someInt) {
        if (someInt < 0) {
            System.out.println("Число отрицательное");
        } else if (someInt >= 0) {
            System.out.println("Число положительное");
        }
    }

    //7
    public static boolean positiveOrNegativeBoolean(int someInt) {
        boolean answer = false;
        if (someInt >= 0) answer = false;
        else answer = true;
        System.out.println(answer);
        return answer;
    }

    //8
    public static void howManyTimesWillItPrint(int numberOfIterations, String someString) {
        for (int i = 0; i < numberOfIterations; i++) {
            System.out.println(someString);
        }
    }

    //9
    public static boolean whatYear(int year) {
        boolean answer = false;
        if (year % 400 == 0) {
            answer = true;
        } else if (year % 100 == 0) {
            answer = false;
        } else if (year % 4 == 0) {
            answer = true;
        }
        System.out.println(answer);
        return answer;
    }

    //10
    public static void reverseNumbers() {
        int[] myArray = {0, 0, 1, 1};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else if (myArray[i] == 1) {
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }

    //11
    public static void arrayOfLength100() {
        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArray));
    }

    //12
    public static void lessThan6MultiplyBy2() {
        int[] myArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < 6) {
                myArray[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
    //13
    public static void squareTwoDimensionalArray() {
        int[][] myArray = new int[5][5];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i] == myArray[j]) {
                    myArray[i][j] = 1;
                }
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    //14
    public static int[] twoArguments(int len, int initialValue) {
        int[] myArray = new int[len];
        for (int i = 0; i < len; i++) {
            myArray[i] = initialValue;
        }
        System.out.println(Arrays.toString(myArray));
        return myArray;
    }
}















