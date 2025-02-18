public class MyArraySizeException extends Exception {
   public MyArraySizeException(int rows, int cols) {
       super(String.format("Неверный размер массива: Ожидается 4х4, получен %dx%d", rows, cols));
   }
}
