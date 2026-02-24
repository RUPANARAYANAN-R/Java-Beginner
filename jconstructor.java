public class jconstructor {
    int modelYear;
    String modelName;

    public jconstructor(int year, String name) {
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args) {
        jconstructor myBike = new jconstructor(2000 , "R15");
        System.out.println(myBike.modelYear + " " + myBike.modelName);
    }
}
