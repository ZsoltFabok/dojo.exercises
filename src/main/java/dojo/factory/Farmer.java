package dojo.factory;


public class Farmer {
	private Farm farm;
	
	public Farmer(Farm farm) {
		this.farm = farm;
	}

	Crop work(int i) {
        return farm.harvest(i);
    }
}
