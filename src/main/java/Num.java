public class Num {
  int a;
  int b;
  static int c = 3;

  public Num(int a, int b) {
    this.a = a;
    this.b = b;
  }

  //instance method
  public int sum() {
    return a + b;
  }

  static int minus(int a, int b) {
    return a-b;
  }
}
