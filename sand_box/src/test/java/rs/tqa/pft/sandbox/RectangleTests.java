package rs.tqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sergey.Ilin on 05.04.2018.
 */
public class RectangleTests {
  @Test
  public void testArea(){
    Rectangle s = new Rectangle(4, 6);
    Assert.assertEquals(s.area(), 24.0);
  }
}
