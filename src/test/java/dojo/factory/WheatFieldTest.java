package dojo.factory;

import static org.junit.Assert.*;

import org.junit.Test;


public class WheatFieldTest {
    @Test
    public void shouldHarvestOneCrop() throws Exception {
        WheatField wheatField = new WheatField(new FakeWeather(3));
        assertCropEquals(new Crop(1), wheatField.harvest());
    }

    // fabokzs: method duplication, check CornFieldTest
    private void assertCropEquals(Crop expected, Crop actual) {
        assertEquals(expected.weight(), actual.weight());
    }
}
