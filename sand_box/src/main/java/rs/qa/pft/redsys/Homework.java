package rs.qa.pft.redsys;

import rs.tqa.pft.sandbox.Rectangle;
import rs.tqa.pft.sandbox.Square;

/**
 * Created by Sergey.Ilin on 30.03.2018.
 */
public class Homework {

  public static void main(String[] args) {

    distance(25,36,49,64);
  }

  public static void distance (double a, double b, double c, double d) {

    double p = Math.pow((a-b),2) + Math.pow((c-d),2);
    double q = Math.sqrt(p);
    System.out.println("Расстояние между точками = " + q);
  }
}