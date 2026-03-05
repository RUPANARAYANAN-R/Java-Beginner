import java.util.*;
public class treemap{
    public static void main(String[] args) {
        Map<String, String> data = new TreeMap<String,String>();
        data.put("Adam","100");
        data.put("Eve","80");
        data.put("Idrees","19");
        data.put("Enoch","20");
        data.put("Pradeesh","21");
        for(String i : data.keySet()){
            System.out.println("\nName : " + i + "\nAge : " + data.get(i));
        }
    }
}