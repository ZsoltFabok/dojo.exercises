package dojo.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class FarmTest {

    ApplicationFactory appFactory;
    @Before
    public void setUp() {
        appFactory = ApplicationFactory.getInstance();
    }

    // fabokzs: again, coupling between the test case and production code
    @Test
    public void testHarvest() throws Exception {
        Water water = appFactory.getWater(new FakeRandom().nextInt(1000));
        Weather weather = appFactory.getWeather(water);
        CornField cornField = appFactory.getCornField(weather);
        WheatField wheatField = appFactory.getWheatField(weather);
        Farm farm = appFactory.getFarm(cornField, wheatField);
        Crop cropToWatch = farm.harvest(100);
        assertEquals(198, cropToWatch.weight());
    }
}
