package oc.wh40k.units.im;

import oc.AnzahlPanel;
import oc.Eintrag;
import oc.OptionsUpgradeGruppe;
import oc.OptionsZaehlerGruppe;

public class IMFulguriteElectroPriests extends Eintrag {

    AnzahlPanel squad;
    OptionsUpgradeGruppe o1;
    OptionsZaehlerGruppe o2;

    boolean harkerSelected = false;

    public IMFulguriteElectroPriests() {
        name = "Fulgurite Electro-Priests";
        grundkosten = 0;

        squad = new AnzahlPanel(ID, randAbstand, cnt, "Fulgurite Electro-Priests", 5, 20, getPts("Fulgurite Electro-Priests") + getPts("Electroleech stave"));
        add(squad);

        seperator();

        complete();
    }

    @Override
    public void refreshen() {
        power = 4;
        if (squad.getModelle() > 15) {
            power = 16;
        } else if (squad.getModelle() > 10) {
            power = 12;
        } else if (squad.getModelle() > 5) {
            power = 8;
        }
    }

}
