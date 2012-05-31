package dojo.factory;

import java.util.Random;

public class Farmer {
    static Random random = new Random();
    private Farm farm = null;
    public Farmer(Farm farm) {
        this.farm = farm;
    }

    public static void main(String... args) {
        // fabokzs: application factory for earth too ;-)
        Earth.getInstance().getWeather().rain(random);

        ApplicationFactory applicationFactory = new ApplicationFactory();
        Farmer farmer = applicationFactory.createFarmer();
        // fabokzs: in 5 days can be a variable to
        System.out.println("Harvested " + farmer.work(5).weight() + " tons in 5 days");
    }

    // fabokzs: what about the int i parameter?
    private Crop work(int i) {
        return farm.harvest();
    }
}
