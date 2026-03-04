import java.util.ArrayList;
import java.util.Collections;
public class arrsort{
    public static void main(String[] args) {
        ArrayList<String> tables = new ArrayList<String>();
        tables.add("CTable");
        tables.add("BTable");
        tables.add("DTable");
        tables.add("ATable");
        Collections.sort(tables);
        for(String i: tables){
        System.out.println(i);
        }
    }
}