package dojo.factory;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CornFieldTest {

	@Test
	public void shouldHarvestOneTon() throws Exception {
		Weather weather = new FakeWeather(5);
		CornField cornField = new CornField(weather);
		assertCropEquals(new Crop(1), cornField.harvest());
	}

	private void assertCropEquals(Crop expected, Crop result) {
		assertEquals(expected.weight(), result.weight());
	}
}

class FakeWeather extends Weather {

	private final int amount;

	public FakeWeather(int amount) {
		this.amount = amount;
	}

	public Water lastFall() {
		return new Water(amount);
	}
}
