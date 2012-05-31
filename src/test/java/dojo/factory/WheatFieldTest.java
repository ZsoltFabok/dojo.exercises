package dojo.factory;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class WheatFieldTest {

	@Test
	public void harvestTest() {
		Random random = new FakeRandom();
		WheatField wheatField = new WheatField(new FakeWeather(new Water(random
				.nextInt(1000))));

		assertEquals(124, wheatField.harvest().weight());

	}
	@Test
	public void equalsTest() {
		Random random = new FakeRandom();
		WheatField wheatField = new WheatField(new FakeWeather(new Water(random
				.nextInt(1000))));

		Crop crop = new Crop(124);
		assertCropEquals(crop, wheatField.harvest());
	}

	private void assertCropEquals(Crop first, Crop second) {
		assertEquals(first.weight(), second.weight());
	}

}
