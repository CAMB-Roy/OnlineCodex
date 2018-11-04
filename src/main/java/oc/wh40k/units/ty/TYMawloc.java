package oc.wh40k.units.ty;

import oc.Eintrag;
import oc.OptionsUpgradeGruppe;

public class TYMawloc extends Eintrag {

    OptionsUpgradeGruppe o1;

    public TYMawloc() {
        name = "Mawloc";
        grundkosten = getPts("Mawloc") + getPts("Distensible jaws") + getPts("Prehensile pincer tail") + getPts("Scything talons") * 3;
        power = 5;
        add(ico = new oc.Picture("oc/wh40k/images/TYMorgon.jpg"));

        complete();
    }

    @Override
    public void refreshen() {
    }

}
