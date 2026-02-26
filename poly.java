public class poly {
    public static void main(String[] args) {
        Method myObj = new Method();
        myObj.display(5);
    }
}
class Method{
    public void display() {
        System.out.println("This is the display method of the Method class.");
    }
    public void display(int a){
        System.out.println("This is the display method with an integer parameter: " + a);
    }
}