public class deprecated{
  @Deprecated
  static void oldMethod() {
    System.out.println("This method wont be used in the future updates");
  }
  public static void main(String[] args) {
    oldMethod();
  }
}
