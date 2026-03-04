import java.util.HashMap;
public class hashmap{
    public static void main(String[] args) {
        HashMap<String, String> nations = new HashMap<String, String>();
        nations.put("India", "Pakistan");
        nations.put("Israil", "Iran");
        nations.put("Russia", "Ukraine");
        nations.put("USA", "Greenlands");
        System.out.println(nations);
    }
}