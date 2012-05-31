package dojo.factory;

public class ApplicationFactory {

    private static ApplicationFactory instance = null;

    /**
     * Azer raktam szingl�tonra mert gondoltam h ha vmi nagy projekt lenne
     * akkor nem kellene 5 millio kulonbozo gyarto peldany.
     */
    private ApplicationFactory() {

    }

    public static ApplicationFactory getInstance() {
        if (instance == null) {
            instance = new ApplicationFactory();
        }
        return instance;
    }

    // fabokzs: do we need a getter for each type?
    public Water getWater(int amount) {
        return new Water(amount);
    }

    public Weather getWeather(Water water) {
        return new Weather(water);
    }

    public CornField getCornField(Weather weather) {
        return new CornField(weather);
    }

    public WheatField getWheatField(Weather weather) {
        return new WheatField(weather);
    }

    public Farm getFarm(CornField cornField, WheatField wheatField) {
        return new Farm(cornField, wheatField);
    }

    public Earth getEarth() {
        return Earth.getInstance();
    }

    public Farmer getFarmer(ApplicationFactory appFactory) {
        return new Farmer(appFactory);
    }
}
