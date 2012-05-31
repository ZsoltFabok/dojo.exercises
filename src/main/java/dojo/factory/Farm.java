package dojo.factory;

public class Farm {
    private final CornField cornField;
	private final WheatField wheatField;

	public Farm(CornField cornField, WheatField wheatField) {
		this.cornField = cornField;
		this.wheatField = wheatField;
	}

	public Crop harvest() {
        return new Crop(cornField.harvest().weight() + wheatField.harvest().weight());
    }
}
