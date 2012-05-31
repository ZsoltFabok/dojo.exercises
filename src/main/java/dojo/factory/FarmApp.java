package dojo.factory;

// fabokzs: I don't see a point in having a separate App.java and a main
public class FarmApp {
    private Farmer farmer;

    public FarmApp(Farmer farmer) {
        this.farmer = farmer;
    }

    // fabokzs: in 5 days, can be a parameter too :-)
    public void run() {
        System.out.println("Harvested " + farmer.work(5).weight() + " tons in 5 days");
    }
}
