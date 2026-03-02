interface Animal {
  public void animalSound();
  public void sleep();
}
class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: puggy buggyyy");
  }
  public void sleep() {
    System.out.println("sleepyyy");
  }
}