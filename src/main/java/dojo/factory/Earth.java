package dojo.factory;

import java.util.Random;

// fabokzs: There is no need for an earth singleton
public class Earth {
    private static final Earth instance = new Earth();
    private Earth() {
    }

    public static Earth getInstance() {
        return instance;
    }

    public Weather getWeather(Random random) {
        return new Weather(random);
    }
}
