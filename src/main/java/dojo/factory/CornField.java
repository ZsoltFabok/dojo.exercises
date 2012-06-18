package dojo.factory;

public class CornField {

    public Crop harvest() {
        Water water = Earth.getInstance().getWeather().lastFall();
        Crop crop = new Crop(water.amount() / 5);
        return crop;
    }
}
