public class Point {
  float x;
  float y;

  public Point(float x, float y) {
    this.x = x;
    this.y = y;
  }

  static int gcd(int p, int q) {
    return q == 0 ? p : gcd(q, p % q);
  }
}
