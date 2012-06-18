package dojo.factory;

public class Farm {
    public Crop harvest(int i) {
        CornField cornField = new CornField();
        WheatField wheatField = new WheatField();

        return new Crop(cornField.harvest().weight() + wheatField.harvest().weight());
    }
}
