package dojo.factory;

public class Farm {
    private CornField cornField;
	private WheatField wheatField;
	
	public Farm(CornField cornField, WheatField wheatField) {
		this.cornField = cornField;
		this.wheatField = wheatField;
	}

	public Crop harvest(int i) {
		return new Crop(cornField.harvest().weight() + wheatField.harvest().weight());
    }
}
