import java.util.ArrayList;
import java.util.List;

public class BinSearch {
  public static void main(String[] args) {
    /*
    [COMPILE TERMs]
      compilation, syntax error, compile error, execution, runtime error
    [PROGRAMMING TERMs]
      block, scope, statement, expression, implementation, function signature
      arithmetic expression, boolean expression
      declaration, definition, method, variable, local variable, global variable
    [OOP]
      class, instance (of a class), super class, sub class
      properties, attribute, fields, instance field, static field
      method, instance method, static method
      data abstraction:
        encapsulation
        inheritance
        polymorphism , dynamic dispatch
    [PROGRAMMING TECHNIQUE]
      recursive
    [ADVICE]
      - the only way to learn a new programming language, is by programing in it

    [ALGORITHM]
      [sorting algorithm]
        - insertion sort
        - quick sort
      [search algorithm]
        - binary search
        - kms
    [DATA STRUCTURE]
        [tree]
          - binary tree
          - red/black tree
          ....
        - stack
        - queue
    [TOOLS]
      repository: đại diện cho 1 project của mình nằm trên git
      IDE: Intergrated Development Envirorment
     */

    Num num; //declaration
    num = new Num(1,2); //instance
    System.out.println(Num.c);
//    System.out.println(uscln(27, 18));
  }

  static int uscln(int q, int p) {
    while (q * p != 0) {
      if (q > p) {
        q %= p;
      } else {
        p %= q;
      }
    }
    return p + q;
  }

}