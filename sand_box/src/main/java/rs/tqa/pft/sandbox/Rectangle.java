package rs.tqa.pft.sandbox;

/**
 * Created by Sergey.Ilin on 30.03.2018.
 */
public class Rectangle {

  public double a;
  public double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double area(){
    return this.a*this.b;
  }

}
