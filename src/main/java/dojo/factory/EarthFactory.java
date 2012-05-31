package dojo.factory;

// fabokzs: nice! :-)
public class EarthFactory
{
    // fabokzs: we don't need a separate weather factory
  private static Earth instance = new Earth(new ApplicationFactory()
      .createWeather());

  public static Earth getEarth()
  {
    return instance;
  }
}
