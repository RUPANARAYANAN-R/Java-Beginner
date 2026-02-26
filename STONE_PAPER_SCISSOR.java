import java.util.*;
public class STONE_PAPER_SCISSOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user= sc.next().toLowerCase();
        String [] arr = {"stone","paper","scissor"};
        String comp = arr[(int)(Math.random()*3)];
        if(user.equals(comp)){
            System.out.print("Draw");
        }
            else if ((user.equals("stone") && comp.equals("scissor")) || (user.equals("paper") && comp.equals("stone")) || (user.equals("scissor") && comp.equals("paper"))){
                System.out.println("You Win :" +  user);
                System.out.println("Computer Lose :" + comp);
            }
            if(!user.equals("stone") &&
               !user.equals("paper") &&
               !user.equals("scissor")){
                System.err.println("Input is Invalid");
           }
    }
}