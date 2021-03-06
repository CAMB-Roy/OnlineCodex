package oc.wh40k.units.im;

import oc.Eintrag;
import oc.OptionsEinzelUpgrade;
import oc.OptionsUpgradeGruppe;

public class IMRhino extends Eintrag {

    OptionsUpgradeGruppe o1;

    public IMRhino() {
        name = "Rhino";
        grundkosten = getPts("Rhino") + getPts("Storm bolter (SM)");
        power = 4;

        seperator();

        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Hunter-killer missile", getPts("Hunter-killer missile (SM)")));
        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Storm bolter", getPts("Storm bolter (SM)")));

        complete();
    }

    @Override
    public void refreshen() {
    }
}
