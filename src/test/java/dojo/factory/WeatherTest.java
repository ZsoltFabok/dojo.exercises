package dojo.factory;

import static org.junit.Assert.*;

import org.junit.Test;


public class WeatherTest {

	@Test
	public void shouldOneAmountOfWater() throws Exception {
		Weather weather = new FakeWeather(1);
		assertWaterEquals(new Water(1), weather.lastFall());
	}

	private void assertWaterEquals(Water expected, Water actual) {
		assertEquals(expected.amount(), actual.amount());
	}
	
	
}
