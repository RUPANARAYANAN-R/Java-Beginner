import java.util.Collections;
import java.util.LinkedList;
public class linkadd{
    public static void main(String[] args) {
        LinkedList<String> airways = new LinkedList<String>();
        airways.add("Helicopter");
        airways.add("B2-Bomber");
        airways.add("Powing");
        airways.add("Jetpack");
        airways.add("Aeroplane");
        airways.addFirst("A-Plane");
        airways.addLast("Z-Plane");
        Collections.sort(airways);
        System.out.println(airways);
        for(int i=0;i<airways.size();i++){
            System.out.println(airways.get(i));
        }
        System.out.println("First element added :" + airways.getFirst());
        System.out.println("Last element added :" + airways.getLast());
    }
}