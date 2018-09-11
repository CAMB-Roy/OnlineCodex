package oc.wh40k.units.da;

import oc.Eintrag;
import oc.OptionsEinzelUpgrade;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;

public class DANephilimJetfighter extends Eintrag {

	OptionsUpgradeGruppe o1;

	boolean added = false;

	public DANephilimJetfighter() {
		name = "Nephilim-J�ger";
		grundkosten = 170;
	
		seperator();
        	
		ogE.addElement(new OptionsGruppeEintrag("Megabolter", "R�cher-Megabolter", 0));
		ogE.addElement(new OptionsGruppeEintrag("Sync. Laser", "Synchronisierter Laserkanone", 5));
		add(o1 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE, 1));
		o1.setSelected(0, true);

		seperator();
        
        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Fliegerass", 50));
        
        complete();
	}

	@Override
	public void refreshen() {
	}

	@Override
	public void deleteYourself() {

		super.deleteYourself();
	}

}