import java.util.ArrayList;
import java.util.Iterator;
public class iterator{
    public static void main(String[] args) {
        ArrayList<String> bus = new ArrayList<String>();
        bus.add("Double Dakkar");
        bus.add("Single Dakkar");
        bus.add("Dakkar Bakkar");
        bus.add("Bakkar Dakkar");
        Iterator<String> iter = bus.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}