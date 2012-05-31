package dojo.factory;

import org.junit.Ignore;
import org.junit.Test;


public class FarmTest {

	@Ignore
	@Test
	public void shouldReturnWithOneAmount() throws Exception {
		Farm farm = new Farm(null, null);
		farm.harvest();
	}
}
