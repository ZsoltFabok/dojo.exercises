package dojo.factory;

import java.util.Random;

public class Weather {
    private Water water;
    private Random random;
    
	public Weather(Random random) {
		this.random = random;
	}
	public void rain() {
        water = new Water(random.nextInt(1000));
    }
    public Water lastFall() {
        return water;
    }
}
