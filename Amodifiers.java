public class Amodifiers{
    private String fname = "John";
    private String lname = "Cena";
    private int age  = 69;
    private String gender = "Male";
    public static void main(String[] args) {
        Amodifiers myObj = new Amodifiers();
        System.out.println("First Name : " + myObj.fname);
        System.out.println("Last Name : " + myObj.lname);
        System.out.println("Age : " + myObj.age);  
        System.out.println("Gender : " + myObj.gender);
    }
}