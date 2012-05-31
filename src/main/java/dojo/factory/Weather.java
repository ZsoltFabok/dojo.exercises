package dojo.factory;

public class Weather {
    private Water water;

    public Weather(Water water) {
    	this.water = water;
    }
    
    public Water lastFall() {
        return water;
    }
}
