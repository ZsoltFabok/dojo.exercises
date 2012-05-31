package dojo.factory;

public class WheatField
{
  private final Weather weather;
  
  public WheatField(final Weather weather)
  {
    this.weather = weather;
  }
  
  public Crop harvest()
  {
    final Water water = weather.lastFall();
    final Crop crop = new Crop(water.amount() / 3);
    return crop;
  }
}
