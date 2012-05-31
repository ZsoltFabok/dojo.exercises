package dojo.factory;

import static org.junit.Assert.assertEquals;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest
{
    // fabokzs: same here, duplication
  private final Mockery context = new JUnit4Mockery() {
    {
      setImposteriser(ClassImposteriser.INSTANCE);
    }
  };
  private ApplicationFactory factory;
  private Farm farm;
  private Crop crop;

  @Before
  public void setup()
  {
    factory = context.mock(ApplicationFactory.class);
    farm = context.mock(Farm.class);
    crop = new Crop(198);

    context.checking(new Expectations() {
      {
        oneOf(factory).createFarm();
        will(returnValue(farm));

        oneOf(farm).harvest(5);
        will(returnValue(crop));
      }
    });
  }

  @Test
  public void testFarmer()
  {
    final Farmer farmer = new Farmer(factory);

    assertEquals(198, farmer.work(5).weight());
  }

}
