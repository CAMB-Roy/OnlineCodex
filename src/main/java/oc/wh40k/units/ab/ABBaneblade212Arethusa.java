package oc.wh40k.units.ab;

import oc.Eintrag;

public class ABBaneblade212Arethusa extends Eintrag {

    

	public ABBaneblade212Arethusa() {
		
		name = "Baneblade 212 'Arethusa'";
		grundkosten = 600;
		�berschriftSetzen=true;

		add(ico = new oc.Picture("oc/wh40k/images/ABArmouredFistPlatoonCommandSquad.jpg"));

		complete();
	}

	@Override
	public void refreshen() {
        
	}

}
