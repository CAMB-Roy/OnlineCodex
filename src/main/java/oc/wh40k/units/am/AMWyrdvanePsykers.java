package oc.wh40k.units.am;

import oc.AnzahlPanel;
import oc.Eintrag;
import oc.OptionsEinzelUpgrade;
import oc.RuestkammerStarter;

public class AMWyrdvanePsykers extends Eintrag {

	AnzahlPanel squad;
    OptionsEinzelUpgrade oe1;
	RuestkammerStarter rkTransport;
	RuestkammerStarter rkTransport2;
	RuestkammerStarter rkTransport3;

	boolean lastState = false;

	public AMWyrdvanePsykers() {
		name = "Psioniker-Kampftrupp\n";
		grundkosten = 0;
        �berschriftSetzen = true;

		squad = new AnzahlPanel(ID, randAbstand, cnt, "Sanktionierte Psioniker", 5, 10, 12);
		squad.setGrundkosten(0);
		add(squad);

		add(ico = new oc.Picture("oc/wh40k/images/IGPsykerBattleSquad.jpg"));

        seperator();

		rkTransport = new RuestkammerStarter(ID, randAbstand, cnt, "AMChimaere", "Chim�re");
		rkTransport.initKammer(true);
		add(rkTransport);
		
		rkTransport2 = new RuestkammerStarter(ID, randAbstand, cnt, "AMChimaereIA1", "[IA1 2nd Ed] Chim�re");
		rkTransport2.initKammer(true);
		add(rkTransport2);

		rkTransport3 = new RuestkammerStarter(ID, randAbstand, cnt, "AMTaurox", "Taurox");
		rkTransport3.initKammer(true);
		add(rkTransport3);
		
		complete();
	}

	@Override
	public void refreshen() {
		rkTransport.setAktiv(!rkTransport2.isSelected() && !rkTransport3.isSelected());
		rkTransport2.setAktiv(!rkTransport.isSelected() && !rkTransport3.isSelected());
		rkTransport3.setAktiv(!rkTransport2.isSelected() && !rkTransport.isSelected());
	}

}
