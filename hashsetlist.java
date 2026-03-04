import java.util.HashSet;
public class hashsetlist {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");  // Duplicated values stored in this
    cars.add("Mazda");
    cars.remove("Volvo");
    System.out.println(cars.contains("Maaza"));
    System.out.println(cars);
  }
}