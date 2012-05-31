package dojo.factory;

public class CornField {

	private final Weather weather;

	public CornField(Weather weather) {
		this.weather = weather;
	}

	public Crop harvest() {
		Water water = weather.lastFall();
		Crop crop = new Crop(water.amount() / 5);
		return crop;
	}
}
