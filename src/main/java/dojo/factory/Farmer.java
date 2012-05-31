package dojo.factory;

public class Farmer
{
  private final ApplicationFactory factory;
  
  public static void main(final String... args)
  {
    final Farmer farmer = new Farmer(new ApplicationFactory());
    System.out.println("Harvested " + farmer.work(5).weight()
        + " tons in 5 days");
  }
  
  public Farmer(final ApplicationFactory factory)
  {
    this.factory = factory;
  }
  
  public Crop work(final int i)
  {
    final Farm farm = factory.createFarm();
    return farm.harvest(i);
  }
}
