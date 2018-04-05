package rs.qa.pft.redsys;

/**
 * Created by Sergey.Ilin on 05.04.2018.
 */
public class Distance {

  public int a;
  public int b;
  public int c;
  public int d;

  public Distance(int a, int b, int c, int d) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
  }

  public double distance () {

    return Math.sqrt(Math.pow((this.a-this.b),2) + Math.pow((this.c-this.d),2));
  }
}
