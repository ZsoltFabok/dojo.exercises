package dojo.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class WeatherTest {

	@Test
	public void testLastFall() throws Exception {
		ApplicationFactory appFactory = ApplicationFactory.getInstance();
		Water water = appFactory.getWater((new FakeRandom()).nextInt(1000));
		Weather weather = appFactory.getWeather(water);
		assertEquals(373, weather.lastFall().amount());
	}
}
