package dojo.factory;

import java.util.Random;

// fabokzs: nice factory, but I don't feel a need for having create for each kind
public class ApplicationFactory
{
  public Earth getEarth()
  {
    return EarthFactory.getEarth();
  }

  public CornField createCornField()
  {
    return new CornField(getEarth().getWeather());
  }

  public WheatField createWheatField()
  {
    return new WheatField(getEarth().getWeather());
  }

  public Weather createWeather()
  {
    final Weather retval = new Weather(new Random());
    // fabokzs: don't call rain in a factory. raining belongs to a business logic
    retval.rain();
    return retval;
  }

  public Farm createFarm()
  {
    return new Farm(createCornField(), createWheatField());
  }

}
