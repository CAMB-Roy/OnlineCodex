package oc.wh40k.units.ty;

import oc.Eintrag;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;
import oc.RuestkammerStarter;

public class TYTyrannofex extends Eintrag {

    OptionsUpgradeGruppe o1;
    RuestkammerStarter waffen;

    public TYTyrannofex() {
        name = "Tyrannofex";
        grundkosten = getPts("Tyrannofex") + getPts("Powerful limbs") + getPts("Stinger salvo");
        power = 11;
        add(ico = new oc.Picture("oc/wh40k/images/TYTyrannofex.jpg"));

        seperator();

        ogE.addElement(new OptionsGruppeEintrag("Acid spray", getPts("Acid spray")));
        ogE.addElement(new OptionsGruppeEintrag("Fleshborer hive", getPts("Fleshborer hive")));
        ogE.addElement(new OptionsGruppeEintrag("Rupture cannon", getPts("Rupture cannon")));
        add(o1 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));
        o1.setSelected(0, true);

        complete();
    }

    @Override
    public void refreshen() {
        o1.alwaysSelected();
    }

}
