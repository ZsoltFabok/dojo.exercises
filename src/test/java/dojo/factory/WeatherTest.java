package dojo.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class WeatherTest {

	@Test
	public void shouldReturnOneAmountOfWater() throws Exception {
		Weather weather = new Weather();
		weather.rain(new FakeRandom(1));
		assertWaterEquals(new Water(1), weather.lastFall());
	}

	private void assertWaterEquals(Water expected, Water actual) {
		assertEquals(expected.amount(), actual.amount());

	}
}
