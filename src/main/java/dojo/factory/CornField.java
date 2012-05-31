package dojo.factory;

public class CornField {

    private Water water;
	private final Weather weather;

    public CornField(final Weather weather) {
		this.weather = weather;
	}
	public Crop harvest() {
        water = weather.lastFall();
        Crop crop = new Crop(water.amount() / 5);
        return crop;
    }
}
