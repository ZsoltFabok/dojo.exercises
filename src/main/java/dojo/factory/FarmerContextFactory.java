package dojo.factory;


// fabokzs: There is need for so many singletons
public class FarmerContextFactory {
    private static final FarmerContextFactory instance = new FarmerContextFactory();

    private FarmerContextFactory() {
    }

    public static FarmerContextFactory getInstance() {
        return instance;
    }

    public Farmer createFarmContext(Weather weather){
        Farm farm = new Farm(new CornField(weather), new WheatField(weather));
        return new Farmer(farm);
    }
}
