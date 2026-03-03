public class exception{
    public static void main(String[]args){
        try {
            int i = 10/0;
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
