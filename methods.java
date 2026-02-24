public class methods{
    public void exam(){
        System.out.println("Passed Successfully");
    }
    public void score(int mark){
        System.out.println("Max mark is : " + mark);
    }
    public static void main(String[]args){
        methods Clg = new methods();
        Clg.exam();
        Clg.score(100);
    }
}
