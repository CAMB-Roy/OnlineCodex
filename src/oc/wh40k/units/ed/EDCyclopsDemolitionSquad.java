package oc.wh40k.units.ed;

import oc.AnzahlPanel;
import oc.Eintrag;

public class EDCyclopsDemolitionSquad extends Eintrag {

	AnzahlPanel squad;

	public EDCyclopsDemolitionSquad() {
		name = "Cyclops Demolition Squad";
		grundkosten = 160;
		�berschriftSetzen=true;

		add(ico = new oc.Picture("oc/wh40k/images/IGVendettaGunshipSquadron.jpg"));

        complete();
	}

	@Override
	public void refreshen() {
	}

}
