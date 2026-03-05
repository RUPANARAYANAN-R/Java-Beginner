import java.util.*;

public class collect3{
  public static void main(String[]args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(1);
    numbers.add(7);
    numbers.add(7);
    numbers.add(3);
    numbers.add(9);
    int count = Collections.frequency(numbers,7);
    System.out.println("\nNumber of similar numbers : " + count);
    Collections.shuffle(numbers);
    System.out.println("\nShuffled Order : " + numbers);
    Collections.sort(numbers);
    System.out.println("\nOrdered Order : " + numbers);
    Collections.swap(numbers, 0 ,2);
    System.out.println("\nNumbers being Swapped 1 - 5 : " + numbers);
    Collections.sort(numbers,Collections.reverseOrder());
    System.out.println("\nReversed Order : " + numbers);
    System.out.println("\nMaximum Value in Index : " + Collections.max(numbers));
    System.out.println("\nMinimum Value In Index : " + Collections.min(numbers));
  }
}