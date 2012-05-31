package dojo.factory;

public class CornField
{
  private final Weather weather;
  
  public CornField(final Weather weather)
  {
    this.weather = weather;
  }
  
  public Crop harvest()
  {
    final Water water = weather.lastFall();
    final Crop crop = new Crop(water.amount() / 5);
    return crop;
  }
}
