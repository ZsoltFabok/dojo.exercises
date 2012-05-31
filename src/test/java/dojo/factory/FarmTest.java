package dojo.factory;

import org.junit.Before;
import org.junit.Test;

public class FarmTest {

	private ApplicationFactory applicationFactory = null;
	
	@Before
	public void Setup() {
		applicationFactory = new ApplicationFactory();
	}
	@Test
	public void shouldReturnWithOneAmount() throws Exception {
		Farm farm = applicationFactory.createFarm();
		Earth.getInstance().getWeather().rain(Farmer.random);
		farm.harvest();
	}
}
