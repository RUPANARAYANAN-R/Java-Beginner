import java.util.HashSet;
public class hashset{
    public static void main(String[] args) {
        HashSet<String> bikes = new HashSet<String>();
        bikes.add("RX100");
        bikes.add("RE650");
        bikes.add("KTM");
        bikes.add("Bicycle");
        bikes.add("HelicopterBike");
        bikes.add("KTM");
        System.err.println(bikes);
    }
}
