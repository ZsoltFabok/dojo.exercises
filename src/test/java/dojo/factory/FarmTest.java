package dojo.factory;

import static org.junit.Assert.*;

import org.junit.Test;


public class FarmTest {

    @Test
    public void shouldHarvestOneCrop() throws Exception {
        Weather weather = new FakeWeather(3);
        // fabokzs: we supposed to use mocks/fakes here, not real implementation
        Farm farm = new Farm(new CornField(weather), new WheatField(weather));
        assertCropEquals(new Crop(1), farm.harvest(1));
    }

    // fabokzs: method duplication, check CornFieldTest
    private void assertCropEquals(Crop expected, Crop actual) {
        assertEquals(expected.weight(), actual.weight());
    }

}
