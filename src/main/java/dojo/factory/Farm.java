package dojo.factory;

public class Farm {
	
	CornField cornField;
	WheatField wheatField;
	
	public Farm(CornField cornField, WheatField wheatField) {
		this.cornField = cornField;
		this.wheatField = wheatField;
	}
	
	public Crop harvest(int i) {
		return new Crop(cornField.harvest().weight()
				+ wheatField.harvest().weight());
	}
}
