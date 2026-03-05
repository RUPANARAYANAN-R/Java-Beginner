import java.util.HashMap;
public class hashmap1{
    public static void main(String[] args) {
        HashMap<String, String> war = new HashMap<String, String>();
        war.put("India","Pakistan");
        war.put("Iran","Israel");
        war.put("USA","Greenland");
        war.put("Afganistan","UAE");
        war.put("Qatar","Kuwait");
        war.put("Russia","Ukraine");
        war.put("Africa","Kenya");
        war.put("Nigeria","Zimbabwe");
        war.get("India");
        war.get("USA");
        war.size();
        System.out.println(war);
        war.remove("India");
        for(String i : war.keySet()){
            System.out.println(i);
        }
    }
}