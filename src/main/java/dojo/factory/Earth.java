package dojo.factory;

import java.util.Random;

// fabokzs: there is no need for an Earth singleton
public class Earth {
    private static final Earth instance = new Earth(ApplicationFactory
            .getInstance().getWater(new Random().nextInt(1000)));
    private Weather weather;

    private Earth(Water water) {
        weather = ApplicationFactory.getInstance().getWeather(water);
    }

    public static Earth getInstance() {
        return instance;
    }

    public Weather getWeather() {
        return weather;
    }
}
