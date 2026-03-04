import java.util.ArrayList;
public class arrloop{
    public static void main(String[] args) {
        ArrayList<String> train = new  ArrayList<String>();
        train.add("VAP 64");
        train.add("Bullet Train");
        train.add("Classic Train");
        train.add("Lightning Train");
        for(int i=0 ; i<train.size();i++){
            System.out.println(train.get(i));
        }
        System.out.println(train.size());
    }
}