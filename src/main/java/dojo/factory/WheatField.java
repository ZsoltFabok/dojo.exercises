package dojo.factory;

public class WheatField {

	private final Weather weather;

	public WheatField(Weather weather) {
		this.weather = weather;
	}

	public Crop harvest() {
		Water water = weather.lastFall();
		Crop crop = new Crop(water.amount() / 3);
		return crop;
	}
}
