package dojo.factory;

import static org.junit.Assert.assertEquals;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;

public class WheatFieldTest
{
    // fabokzs: you have a nice duplication here. It is worth using a fixture
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

    context.checking(new Expectations() {
      {
        oneOf(water).amount();
        will(returnValue(3));

        oneOf(weather).lastFall();
        will(returnValue(water));
      }
    });
  }

  @Test
  public void testHarverst()
  {
    final WheatField field = new WheatField(weather);
    assertCropEquals(crop, field.harvest());
  }

  // fabokzs: duplication :-)
  public void assertCropEquals(final Crop mit, final Crop mihez)
  {
    assertEquals(true, mit.weight() == mihez.weight());
  }
}
