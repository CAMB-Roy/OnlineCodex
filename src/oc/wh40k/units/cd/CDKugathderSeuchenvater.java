package oc.wh40k.units.cd;

import oc.BuildaHQ;
import oc.Eintrag;

public class CDKugathderSeuchenvater extends Eintrag {

	public CDKugathderSeuchenvater() {

		name = "Ku'gath, der Seuchenvater";
		grundkosten = 260;

		add(ico = new oc.Picture("oc/wh40k/images/CDKugathderSeuchenvater.gif"));

		addToInformationVector("CDD�monenprinz", 1);
		BuildaHQ.getChooserGruppe(1).removeSpezialAuswahl("D�monenprinz des Nurgle");
		BuildaHQ.getChooserGruppe(5).addSpezialAuswahl("D�monenprinz des Nurgle");
		
		seperator();
		complete();

	}

	@Override
	public void refreshen() {
        setUnikat(true);
	}
	
	@Override
	public void deleteYourself() {
		addToInformationVector("CDD�monenprinz", -1);
		if(getCountFromInformationVector("CDD�monenprinz")<1){
			BuildaHQ.getChooserGruppe(1).addSpezialAuswahl("D�monenprinz des Nurgle");
			BuildaHQ.getChooserGruppe(5).removeSpezialAuswahl("D�monenprinz des Nurgle");
		}
		super.deleteYourself();
	}
}
