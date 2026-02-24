public class thiskey {
    int x;
    public thiskey(int x){
        this.x = x;
    }
    public static void main(String[] args) {
        thiskey myObj = new thiskey(10);
        System.out.println("Value of thiskey = " + myObj.x);
    }
}
