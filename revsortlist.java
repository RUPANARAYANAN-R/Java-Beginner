import java.util.Collections;
import java.util.LinkedList;
public class revsortlist{
    public static void main(String[] args) {
        LinkedList<String> phone = new  LinkedList<String>();
        phone.add("Nothing");
        phone.add("Samsung");
        phone.add("Apple");
        phone.add("Redmi");
        phone.add("Xioami");
        phone.add("Vivo");
        phone.add("Oppo");
        Collections.sort(phone, Collections.reverseOrder());
        System.out.println(phone);
    }
}