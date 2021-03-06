package oc.wh40k.units.im;

import oc.Eintrag;
import oc.OptionsEinzelUpgrade;
import oc.OptionsUpgradeGruppe;

public class IMStalker extends Eintrag {

    OptionsUpgradeGruppe o1;

    public IMStalker() {
        name = "Stalker";
        grundkosten = getPts("Stalker") + getPts("Icarus stormcannon") * 2;
        power = 6;

        seperator();

        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Hunter-killer missile", getPts("Hunter-killer missile (SM)")));
        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Storm bolter", getPts("Storm bolter (SM)")));

        complete();
    }

    @Override
    public void refreshen() {
    }
}
