package oc.wh40k.units.kd;

import oc.Eintrag;
import oc.RuestkammerStarter;

public class KDChaosLandRaider extends Eintrag {

	RuestkammerStarter ausruestung;
	
	public KDChaosLandRaider() {
		name = "Chaos Land Raider";
		grundkosten = 230;

		add(ico = new oc.Picture("oc/wh40k/images/ChaosLandRaider.gif"));
		
		seperator();
		
		ausruestung = new RuestkammerStarter(ID, randAbstand, cnt, "KDFahrzeugruestkammer", "Ausr�stung");
		ausruestung.initKammer(true);
		ausruestung.setButtonText("Ausr�stung");
		add(ausruestung);
		
		complete();
	}

	@Override
	public void refreshen() {
	}

}
