import java.util.*;

public class collect1 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Liam");
    names.add("Jenny");
    names.add("Kasper");
    names.add("Angie");
    Collections.sort(names);
    System.out.println(names);
    int finder = Collections.binarySearch(names, "Angie");
    System.out.println("Angie is at index: " + finder);
  }
}