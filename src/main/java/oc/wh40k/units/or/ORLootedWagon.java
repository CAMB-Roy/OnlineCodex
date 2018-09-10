package oc.wh40k.units.or;


import oc.Eintrag;
import oc.OptionsEinzelUpgrade;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;
import oc.OptionsZaehlerGruppe;

public class ORLootedWagon extends Eintrag {

	
	OptionsUpgradeGruppe FK2;
	OptionsZaehlerGruppe BeutepanzaFK;
	OptionsUpgradeGruppe RammGruppe;

	public ORLootedWagon() {

		name = "Looted Wagon";
		grundkosten = 37;

		add(ico = new oc.Picture("oc/wh40k/images/Beutepanza.gif"));
		

		ogE.addElement(new OptionsGruppeEintrag("Panzakanon�", 30));
		add(FK2 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

		seperator();

		ogE.addElement(new OptionsGruppeEintrag("Fette Wumme", 5));
		ogE.addElement(new OptionsGruppeEintrag("Bazzukka", 5));
		ogE.addElement(new OptionsGruppeEintrag("Gitbrenna", 5));
		add(BeutepanzaFK = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 3));

		seperator();

		ogE.addElement(new OptionsGruppeEintrag("Todeswalz�", 10));
		ogE.addElement(new OptionsGruppeEintrag("Vast�rkt� Ramm�", 5));
		add(RammGruppe = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));
		
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Zugetakkat", 15));
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Megagreifa", 5));
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Rote Farb�", 5));
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Stikkbombschlueda", 5));
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Zus�tzlich Panzerung", 10));
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Groth�lfaz", 10));
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Abrizzbirn�", 10));
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Entaplank�", 15));

		complete();

	}

	//@OVERRIDE
	public void refreshen() {
	}
}
