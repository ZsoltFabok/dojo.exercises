package dojo.factory;

import java.util.Random;

public class Farmer {
    // fabokzs: I've seen a random somewhere else too, I think it is in Earth. Dead code?
    static Random random = new Random();

    // fabokzs: you have a factory in game, haven't you?
    private ApplicationFactory appFactory;

    public Farmer(ApplicationFactory appFactory) {
        this.appFactory = appFactory;
    }

    public Farmer() {

    }

    public void start() {
        System.out.println("Harvested " + work(5).weight() + " tons in 5 days");
    }

    private Crop work(int i) {
        // fabokzs: dead code
//    	Random random = new Random();

        Water water = appFactory.getWater(random.nextInt(1000));
        Weather weather = appFactory.getWeather(water);
        CornField cornField = appFactory.getCornField(weather);
        WheatField wheatField = appFactory.getWheatField(weather);

        Farm farm = appFactory.getFarm(cornField, wheatField);
        return farm.harvest(i);
    }
}
