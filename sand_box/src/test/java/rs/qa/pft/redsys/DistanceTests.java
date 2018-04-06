package rs.qa.pft.redsys;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sergey.Ilin on 05.04.2018.
 */
public class DistanceTests {

  @Test
  public void testArea(){
    Distance s = new Distance(25,36,49,64);
    Assert.assertEquals(s.distance(), 18.601075237738275);
  }
}
