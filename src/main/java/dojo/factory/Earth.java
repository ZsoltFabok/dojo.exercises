package dojo.factory;

public class Earth {
    private static final Earth instance = new Earth();
    private Weather weather;

    private Earth() {
        weather = new Weather();
    }

    public static Earth getInstance() {
        return instance;
    }

    public Weather getWeather() {
        return weather;
    }
}
