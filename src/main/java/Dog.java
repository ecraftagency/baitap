public class Dog extends Animal {
  public Dog(int age, float weight) {
    super(age, weight);
  }

  @Override
  void sound() {
    System.out.println("bark bark");
  }
}
