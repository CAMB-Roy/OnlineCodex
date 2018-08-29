package oc.wh40k.units.cd;

import oc.BuildaHQ;
import oc.Eintrag;

public class CDSchicksalsweberOrakeldesTzeentch extends Eintrag {

	public CDSchicksalsweberOrakeldesTzeentch() {

		name = "Schicksalsweber, Orakel des Tzeentch";

		grundkosten = 300;

		add(ico = new oc.Picture("oc/wh40k/images/CDSchicksalsweberOrakeldesTzeentch.gif"));

		addToInformationVector("CDD�monenprinz", 1);
		BuildaHQ.getChooserGruppe(1).removeSpezialAuswahl("D�monenprinz des Tzeentch");
		BuildaHQ.getChooserGruppe(5).addSpezialAuswahl("D�monenprinz des Tzeentch");
		
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
			BuildaHQ.getChooserGruppe(1).addSpezialAuswahl("D�monenprinz des Tzeentch");
			BuildaHQ.getChooserGruppe(5).removeSpezialAuswahl("D�monenprinz des Tzeentch");
		}
		super.deleteYourself();
	}
}
