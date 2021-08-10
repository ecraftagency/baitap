public class Line {
  Point a;
  Point b;

  public Line(Point a, Point b) {
    this.a = a;
    this.b = b;
  }

  float length() {
    return (float) Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y));
  }
}