package dojo.factory;

import java.util.Random;

// fabokzs: first you can have every creation in one single factory
public class AppFactory {
    private static final AppFactory instance = new AppFactory();

    private AppFactory() {
    }

    public static AppFactory getInstance() {
        return instance;
    }

    public FarmApp buildApp(Random random) {

        Weather weather = Earth.getInstance().getWeather(random);
        weather.rain();
        Farmer farmer = FarmerContextFactory.getInstance().createFarmContext(weather);
        return new FarmApp(farmer);

    }
}
