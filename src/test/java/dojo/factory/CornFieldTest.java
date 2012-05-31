package dojo.factory;

import static org.junit.Assert.assertEquals;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;

public class CornFieldTest
{
  private final Mockery context = new JUnit4Mockery() {
    {
      setImposteriser(ClassImposteriser.INSTANCE);
    }
  };
  private Weather weather;
  private Water water;
  private Crop crop;

  @Before
  public void setup()
  {
    weather = context.mock(Weather.class);
    water = context.mock(Water.class);
    crop = new Crop(1);

    // fabokzs: having checking in setup can be confusing,
    // try to use it only in test cases
    context.checking(new Expectations() {
      {
        oneOf(water).amount();
        will(returnValue(5));

        oneOf(weather).lastFall();
        will(returnValue(water));
      }
    });
  }

  @Test
  public void testHarverst()
  {
    final CornField field = new CornField(weather);
    assertCropEquals(crop, field.harvest());
  }

  public void assertCropEquals(final Crop mit, final Crop mihez)
  {
    assertEquals(true, mit.weight() == mihez.weight());
  }
}
