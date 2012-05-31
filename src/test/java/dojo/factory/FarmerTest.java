package dojo.factory;

import static org.junit.Assert.*;

import org.junit.Test;


public class FarmerTest {
    @Test
    public void shouldHarverstOneCrop() throws Exception {
        Farmer farmer = new Farmer(new FakeFarm(null,null));
        assertCropEquals(new Crop(1), farmer.work(1));
    }

    // fabokzs: method duplication, check CornFieldTest
    private void assertCropEquals(Crop expected, Crop actual) {
        assertEquals(expected.weight(), actual.weight());
    }
}
class FakeFarm extends Farm
{

    public FakeFarm(CornField cornField, WheatField wheatField) {
        super(cornField, wheatField);
    }
    @Override
    public Crop harvest(int i) {
        return new Crop(1);
    }

}
