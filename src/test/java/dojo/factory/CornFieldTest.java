package dojo.factory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CornFieldTest {
    @Test
    public void shouldHarvertOneCrop() throws Exception {

        CornField cornField = new CornField(new FakeWeather(5));
        assertCropEquals(new Crop(1), cornField.harvest());
    }

    private void assertCropEquals(Crop expected, Crop actual) {
        assertEquals(expected.weight(), actual.weight());
    }
}
class FakeWeather extends Weather{
    private int amount;

    public FakeWeather(int amount) {
        super(null);
        this.amount = amount;
    }
    @Override
    public Water lastFall() {
        return new Water(this.amount);
    }
}