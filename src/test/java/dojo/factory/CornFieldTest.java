package dojo.factory;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class CornFieldTest {

    // fabokzs: what is the benefit of having the factory here? with this approach
    // you have a close coupling between production code and test code
    ApplicationFactory appFactory;

    @Before
    public void setup() {
        appFactory = ApplicationFactory.getInstance();
    }

    // fabokzs: better test case names
    @Test
    public void harvestTest() {
        Random random = new FakeRandom();
        CornField cornField = appFactory.getCornField(new FakeWeather(appFactory.getWater(random
                .nextInt(1000))));

        assertEquals(74, cornField.harvest().weight());

    }

    @Test
    public void equalsTest() {
        Random random = new FakeRandom();
        CornField cornField = appFactory.getCornField(new FakeWeather(appFactory.getWater(random
                .nextInt(1000))));

        Crop crop = new Crop(74);
        assertCropEquals(crop, cornField.harvest());
    }

    // fabokzs: duplication :-)
    private void assertCropEquals(Crop first, Crop second) {
        assertEquals(first.weight(), second.weight());
    }
}
