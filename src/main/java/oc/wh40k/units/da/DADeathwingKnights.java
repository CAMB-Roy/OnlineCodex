package oc.wh40k.units.da;

import oc.*;

public class DADeathwingKnights extends Eintrag {

    AnzahlPanel squad;
    OptionsZaehlerGruppe o1;
    OptionsEinzelZaehler o1a;
    OptionsZaehlerGruppe o2;
    OptionsZaehlerGruppe o3;
    RuestkammerStarter ot;

    boolean added = false;

    public DADeathwingKnights() {
        name = "Deathwing-Ritter";
        grundkosten = 10;
        überschriftSetzen = true;
        neuzeile = true;


        add(ico = new oc.Picture("oc/wh40k/images/DADeathwingTerminatorSquad.gif"));

        squad = new AnzahlPanel(ID, randAbstand, cnt, "Deathwing-Ritter", 5, 10, 45);
        add(squad);

        seperator();

        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "Düsteres Relikt der alten Legion", "Düsteres Relikt", 15));

        seperator();

        ot = new RuestkammerStarter(ID, randAbstand, cnt, "DATransporterKammer", "Transporter");
        ot.initKammer(false, false, false, true, true, false);
        ot.setButtonText("Transporter");
        add(ot);
    }

    @Override
    public void refreshen() {
    }

    @Override
    public void deleteYourself() {

        super.deleteYourself();
    }
}
