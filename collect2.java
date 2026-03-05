import java.util.*;

public class collect2{
  public static void main(String[]args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(1);
    numbers.add(7);
    numbers.add(3);
    numbers.add(9);
    Collections.sort(numbers);
    System.out.println("\nOrdered Order : " + numbers);
    Collections.sort(numbers,Collections.reverseOrder());
    System.out.println("\nReversed Order : " + numbers);
    System.out.println("\n");
  }
}