package oc.wh40k.units.cd;

import oc.AnzahlPanel;
import oc.BuildaHQ;
import oc.Eintrag;
import oc.OptionsEinzelUpgrade;
import oc.OptionsGruppeEintrag;
import oc.OptionsZaehlerGruppe;

public class CDPinkHorrors extends Eintrag {

	AnzahlPanel CDRosaHorrorsdesTzeentch;
	OptionsEinzelUpgrade Glei�enderHorror, Chaosikone, Standarte;
	OptionsZaehlerGruppe o1,o2;

	boolean WechselbalgSelected = false;

	public CDPinkHorrors() {

		name = "Pink Horrors";

		grundkosten = 0;

		seperator();
		
		CDRosaHorrorsdesTzeentch = new AnzahlPanel(ID, randAbstand, cnt, "Pink Horrors", 10, 20, 9);
		add(CDRosaHorrorsdesTzeentch);
		add(ico = new oc.Picture("oc/wh40k/images/CDRosaHorrorsdesTzeentch.gif"));

		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Instrument des Chaos", 10));
		add(Chaosikone = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Ikone des Chaos", 10));
		add(Standarte  = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "option", "Fluchstandarte", 10));
		
		seperator();

		add(Glei�enderHorror = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Glei�ender Horror", 5));
		
		ogE.addElement(new OptionsGruppeEintrag("Geringe Belohnung", 10));
		add(o1 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "option", ogE, 2));
		ogE.addElement(new OptionsGruppeEintrag("M�chtige Belohnung", 20));
		add(o2 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "option", ogE, 1));

		seperator();

        BuildaHQ.getChooserGruppe(1).addSpezialAuswahl("[Forgeworld] Aetaos'rau'keres - Slayer of Souls");

		complete();

	}

	public void deleteYourself() {  // WICHTIG: wird nicht beim Volkwechseln ausgef�hrt. Daf�r wird BuildaHQ.leereChooserGruppenArray(); aufgerufen, was das ersetzt

        BuildaHQ.getChooserGruppe(1).removeSpezialAuswahl("[Forgeworld] Aetaos'rau'keres - Slayer of Souls");

		super.deleteYourself();

	}

	@Override
	public void refreshen() {
		Standarte.setAktiv(Chaosikone.isSelected());
		o1.setAktiv(Glei�enderHorror.isSelected());
		o2.setAktiv(Glei�enderHorror.isSelected());
		
		if(o1.getAnzahl() > 0) {
			o2.setMaxAnzahl(0);
		} else {
			o2.setMaxAnzahl(1);
		}
		
		if(o2.getAnzahl() > 0) {
			o1.setMaxAnzahl(0);
		} else {
			o1.setMaxAnzahl(2);
		}
	}
}
