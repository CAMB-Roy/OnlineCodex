
package oc.wh40k.units.or;

import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;
import oc.RuestkammerVater;

public class ORFahrzeugruestkammer extends RuestkammerVater {

	OptionsUpgradeGruppe fahrzeugausruestung;

	public ORFahrzeugruestkammer() {
		grundkosten = 0;
	}

	@Override
	public void initButtons(boolean... defaults) {
		
		ogE.addElement(new OptionsGruppeEintrag("Rote Farb�", 5));
        ogE.addElement(new OptionsGruppeEintrag("Vast�rkt� Ramm�", 5));
        ogE.addElement(new OptionsGruppeEintrag("Stikkbombschlueda", 5));
        ogE.addElement(new OptionsGruppeEintrag("Zus�tzlich Panzerung", 10));
        ogE.addElement(new OptionsGruppeEintrag("Groth�lfaz", 10));
		ogE.addElement(new OptionsGruppeEintrag("Abrizzbirn�", 10));
        ogE.addElement(new OptionsGruppeEintrag("Entaplank�", 15));
        add(fahrzeugausruestung=new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE,9));

		sizeSetzen();
	}

	@Override
	public void refreshen() {
	}

}
