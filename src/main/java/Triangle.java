public class Triangle {
  Point a;
  Point b;
  Point c;

  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  boolean inside(Point d) {
    return false;
  }

  boolean isRightTriangle() {
    return false;
  }

  boolean isEquilateralTriangle() {
    return false;
  }

  boolean isIsoSceles() {
    return false;
  }
}
