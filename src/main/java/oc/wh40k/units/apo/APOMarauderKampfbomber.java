package oc.wh40k.units.apo;

import oc.Eintrag;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;

public class APOMarauderKampfbomber extends Eintrag {

        OptionsUpgradeGruppe o1;

	public APOMarauderKampfbomber() {
		name = "Marauder-Abfangj�ger";
		grundkosten = 400;


		add(ico = new oc.Picture("oc/wh40k/images/MarauderKampfbomber.gif"));
		

                ogE.addElement(new OptionsGruppeEintrag("Bomben","zw�lf Bomben", 0));
		ogE.addElement(new OptionsGruppeEintrag("H�llensturm-Bomben","zwei H�llensturm-Bomben",0));
		add(o1 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE, 1));

		complete();

	}

	public void refreshen() {
            if (!o1.isSelected()) o1.setSelected(0,true);
	}
}
