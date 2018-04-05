package rs.qa.pft.redsys;

import rs.tqa.pft.sandbox.Rectangle;
import rs.tqa.pft.sandbox.Square;

/**
 * Created by Sergey.Ilin on 30.03.2018.
 */
public class Homework {

  public static void main(String[] args) {

   Distance q = new Distance(25,36,49,64);
    System.out.println("Расстояние между двумя точками " + "A(" + q.a + "," + q.c + ")" + " и B(" + q.b + "," + q.d + ") равно " + q.distance());
  }

}