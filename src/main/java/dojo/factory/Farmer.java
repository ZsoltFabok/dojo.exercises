package dojo.factory;

import java.util.Random;

public class Farmer {
	static Random random = new Random();
    public Farmer(Farm farm) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String... args) {
        Earth.getInstance().getWeather().rain(random);

        Farmer farmer = new Farmer(null);
        System.out.println("Harvested " + farmer.work(5).weight() + " tons in 5 days");
    }

    private Crop work(int i) {
    	ApplicationFactory applicationFactory = new ApplicationFactory();
    	Farm farm = applicationFactory.createFarm();

        return farm.harvest();
    }
}
