package dojo.factory;

public class ApplicationFactory {

	public Farm createFarm() {
		Weather weather = Earth.getInstance().getWeather();

    	CornField cornField = new CornField(weather);
    	WheatField wheatField = new WheatField(weather);
        Farm farm = new Farm(cornField, wheatField);
		return farm;
	}

	public Farmer createFarmer() {
		Farm farm = createFarm();
		return new Farmer(farm);
	}
}
