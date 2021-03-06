package oc.wh40k.units.ch;

import oc.AnzahlPanel;
import oc.Eintrag;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;

public class CHFuries extends Eintrag {

    AnzahlPanel furies;
    OptionsUpgradeGruppe mark;

    public CHFuries() {

        name = "Furies";
        grundkosten = 0;
        power = 3;

        add(furies = new AnzahlPanel(ID, randAbstand, cnt, "Furies", 5, 20, getPts("Furies")));

        seperator();

        ogE.addElement(new OptionsGruppeEintrag("Mark of Khorne", 0));
        ogE.addElement(new OptionsGruppeEintrag("Mark of Nurgle", 0));
        ogE.addElement(new OptionsGruppeEintrag("Mark of Tzeentch", 0));
        ogE.addElement(new OptionsGruppeEintrag("Mark of Slaanesh", 0));
        add(mark = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

        complete();

    }

    public void deleteYourself() {
    }


    @Override
    public void refreshen() {
        power = 3 +
                ((furies.getModelle() == 10) ? 3 : 0) +
                ((furies.getModelle() == 15) ? 6 : 0) +
                ((furies.getModelle() == 20) ? 9 : 0);

        mark.alwaysSelected();
    }
}
