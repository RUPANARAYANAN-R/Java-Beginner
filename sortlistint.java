import java.util.Collections;
import java.util.LinkedList;
public class sortlistint{
    public static void main(String[] args) {
        LinkedList<Integer> year = new  LinkedList<Integer>();
        year.add(20);
        year.add(19);
        year.add(98);
        year.add(76);
        year.add(11);
        year.add(03);
        year.add(99);
        Collections.sort(year); //if needed to reverse :-> Collections.sort(year,, Collections.reverseOrder());
        System.out.println(year);
    }
}