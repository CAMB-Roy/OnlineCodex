package oc.wh40k.units.da;

import oc.Eintrag;
import oc.OptionsEinzelUpgrade;

public class DALandRaider extends Eintrag {

    OptionsEinzelUpgrade ia2;
    OptionsEinzelUpgrade oe1;
    OptionsEinzelUpgrade oe2;
    OptionsEinzelUpgrade oe3;

	public DALandRaider() {
		name = "Land Raider";
		grundkosten = 250;

		add(ico = new oc.Picture("oc/wh40k/images/DALandRaider.gif"));

        seperator();

		add(oe1 = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Sturmbolter", 5));
		add(oe2 = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Radarsuchkopfrakete", 10));
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Zus�tzliche Panzerung", 10));

		seperator();
		
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Multimelter", 10));
		
		seperator();

		complete();
	}

	@Override
	public void refreshen() {
	}

}
