import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] goodArray = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][] badSizeArray = {{"1", "2", "3"}, {"5", "6", "7"}, {"9", "10", "11"}};

        String[][] badDataArray = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "Bazz", "11", "12"},
                {"13", "14", "15", "16"}};

        System.out.println(sumElements(goodArray));
//        System.out.println(sumElements(badSizeArray));
//        System.out.println(sumElements(badDataArray));
    }

    public static int sumElements(String[][] inputArray) throws MyArrayDataException, MyArraySizeException {
        if (inputArray.length != 4 || inputArray[0].length != 4) {
            throw new MyArraySizeException(inputArray.length, inputArray[0].length);
        }
        int sum = 0;
        for(int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[0].length; j++) {
                try {
                    sum += Integer.parseInt(inputArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, inputArray[i][j]);
                }
            }
        }
        return sum;
    }
}















