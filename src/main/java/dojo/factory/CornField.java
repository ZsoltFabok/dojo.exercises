package dojo.factory;

public class CornField {
	
	private Weather weather;

	public CornField(Weather weather){
		this.weather = weather;
	}
	
	public Crop harvest(){
    	Crop crop = new Crop(weather.lastFall().amount() / 5);
        return crop;
    }
}
