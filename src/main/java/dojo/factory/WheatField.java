package dojo.factory;

public class WheatField {
    public Crop harvest() {
        Water water = Earth.getInstance().getWeather().lastFall();
        Crop crop = new Crop(water.amount() / 3);
        return crop;
    }
}
