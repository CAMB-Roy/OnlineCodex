package oc.wh40k.units.ch;

import oc.Eintrag;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;
import oc.RuestkammerStarter;

public class CHMaulerfiend extends Eintrag {

    OptionsUpgradeGruppe o1;
    RuestkammerStarter ausruestung;
    OptionsUpgradeGruppe mark;

    public CHMaulerfiend() {
        name = "Maulerfiend";
        grundkosten = getPts("Maulerfiend");

        add(ico = new oc.Picture("oc/wh40k/images/Klauenmonstrum.gif"));

        seperator();

        ogE.addElement(new OptionsGruppeEintrag("Magma cutters", getPts("Magma cutter") * 2));
        ogE.addElement(new OptionsGruppeEintrag("Lasher tendrils", getPts("Lasher tendrils")));
        add(o1 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));
        o1.setSelected(0, true);

        seperator();

        ogE.addElement(new OptionsGruppeEintrag("Mark of Khorne", 0));
        ogE.addElement(new OptionsGruppeEintrag("Mark of Nurgle", 0));
        ogE.addElement(new OptionsGruppeEintrag("Mark of Tzeentch", 0));
        ogE.addElement(new OptionsGruppeEintrag("Mark of Slaanesh", 0));
        add(mark = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

        complete();
    }

    @Override
    public void refreshen() {
        if (!o1.isSelected()) o1.setSelected(0, true);

        power = 9;
    }

}
