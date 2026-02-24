public class thiskey2{
    int carYear;
    String carModel;
    public thiskey2(int carYear,String carModel){
        this.carYear = carYear;
        this.carModel = carModel;
    }
    public static void main(String[] args) {
        thiskey2 myObj = new thiskey2(2000,"Nizzsaan");
        thiskey2 myObj2 = new thiskey2(2020,"Toyooota");
        thiskey2 myObj3 = new thiskey2(2024,"Chingidichu");
        System.out.println("Car Model : " +myObj.carModel + "\nCar Year : " + myObj.carYear);
        System.out.println("Car Model : " +myObj2.carModel + "\nCar Year : " + myObj2.carYear);
        System.out.println("Car Model : " +myObj3.carModel + "\nCar Year : " + myObj3.carYear);
    }
}