public class Duck extends Animal {
  public Duck(int age, float weight) {
    super(age, weight);
  }

  @Override
  void sound() {
    System.out.println("quark quark");
  }
}
