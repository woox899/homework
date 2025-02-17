public class MyArraySizeException extends Exception {
   public MyArraySizeException(int rows, int cols) {
       super("Неверный размер массива!");
   }
}
