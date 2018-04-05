package rs.qa.pft.redsys;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sergey.Ilin on 05.04.2018.
 */
public class DistanceTests {

  @Test
  public void testArea(){
    Distance s = new Distance(4,4,4,4);
    Assert.assertEquals(s.distance(), 0.0);
  }
}
