public class Animal {
  int age;
  float weight;

  public int getAge() {
    return age;
  }

  public float getWeight() {
    return weight;
  }

  public Animal(int age, float weight) {
    this.age = age;
    this.weight = weight;
  }

  void sound() {
    System.out.println("im talking");
  }
}