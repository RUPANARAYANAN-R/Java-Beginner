import java.util.ArrayList;
public class arrlistget{
    public static void main(String[] args) {
        ArrayList<String> actor = new ArrayList<String>();
        actor.add("Surya");
        actor.add("Rajini");
        actor.add("Kamal");
        actor.add("Anil");
        actor.add("Aamai");
        actor.add(0,"Powerstar");
        actor.set(1,"Andrea");
        System.out.println(actor.get(1));
    }
}