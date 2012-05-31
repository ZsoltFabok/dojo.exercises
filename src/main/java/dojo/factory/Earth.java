package dojo.factory;

public class Earth
{
  private final Weather weather;
  
  public Earth(final Weather weather)
  {
    this.weather = weather;
  }
  
  public Weather getWeather()
  {
    return weather;
  }
}
