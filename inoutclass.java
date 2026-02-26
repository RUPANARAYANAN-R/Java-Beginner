public class inoutclass {
    public static void main(String[] args) {
        OuterClass myObj = new OuterClass();
        System.out.println(myObj.y);
        InnerClass myObj2 = new InnerClass();
        System.out.println(myObj2.x);
    }
}
class InnerClass{
    int x = 10;
}
class OuterClass{
    int y = 20;
}