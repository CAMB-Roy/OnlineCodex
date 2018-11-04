//IA Adeptus Astartes
package oc.wh40k.units.im;

import oc.Eintrag;
import oc.OptionsGruppeEintrag;
import oc.OptionsZaehlerGruppe;

public class IMRelicLeviathanDreadnought extends Eintrag {

    OptionsZaehlerGruppe o1;

    public IMRelicLeviathanDreadnought() {
        name = "Relic Leviathan Dreadnought";
        grundkosten = getPts("Relic Leviathan Dreadnought") + 2 * getPts("Heavy flamer");
        power = 16;

        seperator();

        ogE.addElement(new OptionsGruppeEintrag("L. siege claw & meltagun", "Leviathan siege claw & meltagun", getPts("Leviathan siege claw (single)") + getPts("Meltagun")));
        ogE.addElement(new OptionsGruppeEintrag("L. siege drill & meltagun", "Leviathan siege drill & meltagun", getPts("Leviathan siege drill (single)") + getPts("Meltagun")));
        ogE.addElement(new OptionsGruppeEintrag("Storm cannon array", getPts("Storm cannon array")));
        ogE.addElement(new OptionsGruppeEintrag("Cyclonic melta lance", getPts("Cyclonic melta lance")));
        ogE.addElement(new OptionsGruppeEintrag("Grav-flux bombard", getPts("Grav-flux bombard")));
        add(o1 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 2));

        seperator();

        complete();
    }

    @Override
    public void refreshen() {
        int dcw = (o1.getAnzahl("Leviathan siege claw & meltagun"));

        if (dcw == 2) {
            o1.setPreis("Leviathan siege claw & meltagun", getPts("Leviathan siege claw (pair)") / 2 + getPts("Meltagun"));
        } else {
            o1.setPreis("Leviathan siege claw & meltagun", getPts("Leviathan siege claw (single)") + getPts("Meltagun"));
        }

        int cf = (o1.getAnzahl("Leviathan siege drill & meltagun"));

        if (cf == 2) {
            o1.setPreis("Leviathan siege drill & meltagun", getPts("Leviathan siege drill (pair)") / 2 + getPts("Meltagun"));
        } else {
            o1.setPreis("Leviathan siege drill & meltagun", getPts("Leviathan siege drill (single)") + getPts("Meltagun"));
        }
    }
}
