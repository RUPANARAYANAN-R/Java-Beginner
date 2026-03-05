import java.util.Iterator;
import java.util.LinkedHashSet;
public class iterator1{
    public static void main(String[] args) {
        LinkedHashSet<String> bus = new LinkedHashSet<String>();
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