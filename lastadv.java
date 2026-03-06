import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lastadv{
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("Myschool", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visited Myfschool");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}