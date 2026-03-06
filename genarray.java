public class genarray {
    public static <T> void printArray(T[] array) {
    for (T i : array) {
      System.out.println(i);
    }                            
  }
  public static void main(String[] args){
    String[] names = {"Jenny", "Liam"};
    Integer[] numbers = {1, 2, 3};
    printArray(names);
    printArray(numbers);
  }
}
