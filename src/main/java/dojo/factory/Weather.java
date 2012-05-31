package dojo.factory;

import java.util.Random;

public class Weather {
    private Water water;
    public void rain(Random random) {
        water = new Water(random.nextInt(1000));
    }
    public Water lastFall() {
        return water;
    }
}
