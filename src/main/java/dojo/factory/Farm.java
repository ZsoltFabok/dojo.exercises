package dojo.factory;

public class Farm
{
  private final CornField cornField;
  private final WheatField wheatField;
  
  public Farm(final CornField cornField, final WheatField wheatField)
  {
    this.cornField = cornField;
    this.wheatField = wheatField;
  }
  
  public Crop harvest(final int i)
  {
    return new Crop(cornField.harvest().weight()
        + wheatField.harvest().weight());
  }
}
