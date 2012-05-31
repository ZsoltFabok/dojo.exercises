package dojo.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class WheatFieldTest {
	@Test
	public void shouldHarvestOneTon() throws Exception {
		Weather weather = new FakeWeather(5);
		WheatField wheatField = new WheatField(weather);
		assertCropEquals(new Crop(1), wheatField.harvest());
	}

	private void assertCropEquals(Crop expected, Crop result) {
		assertEquals(expected.weight(), result.weight());
	}
}

