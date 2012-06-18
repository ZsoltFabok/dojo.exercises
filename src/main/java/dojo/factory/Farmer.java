package dojo.factory;

public class Farmer {
    public static void main(String... args) {
        Earth.getInstance().getWeather().rain();

        Farmer farmer = new Farmer();
        System.out.println("Harvested " + farmer.work(5).weight() + " tons in 5 days");
    }

    private Crop work(int i) {
        Farm farm = new Farm();
        return farm.harvest(i);
    }
}
