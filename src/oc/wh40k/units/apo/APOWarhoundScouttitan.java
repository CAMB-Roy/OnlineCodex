package oc.wh40k.units.apo;

import oc.Eintrag;
import oc.OptionsGruppeEintrag;
import oc.OptionsZaehlerGruppe;

public class APOWarhoundScouttitan extends Eintrag {

        OptionsZaehlerGruppe o1;

	public APOWarhoundScouttitan() {
		name = "Warhound-Scouttitan";
		grundkosten = 720;

		add(ico = new oc.Picture("oc/wh40k/images/WarhoundScouttitan.gif"));
		

        seperator();

		ogE.addElement(new OptionsGruppeEintrag("Turbolaser", "Doppell�ufiger Turbolaseer-Annihilator", 0));
		ogE.addElement(new OptionsGruppeEintrag("Plasmagesch�tz", 0));
		ogE.addElement(new OptionsGruppeEintrag("Inferno-Gesch�tz", 0));
		ogE.addElement(new OptionsGruppeEintrag("Vulkan-Megabolter", 0));
		add(o1 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 2));

		complete();

	}

	public void refreshen() {
            o1.setLegal(o1.getAnzahl() == o1.getMaxAnzahl());
	}
}
