/* Regeln für Deimos-Lux Pattern Psycannon unter:
 * http://www.forgeworld.co.uk/Downloads/Product/PDF/g/greyknightsupd.pdf
 * nicht mehr existent!
 */

package oc.wh40k.units.gk;

import oc.Eintrag;
import oc.OptionsEinzelUpgrade;
import oc.OptionsUpgradeGruppe;

public class GKLandRaiderCrusader extends Eintrag {
    OptionsUpgradeGruppe o2;

    public GKLandRaiderCrusader() {
        name = "Land Raider Crusader";
        grundkosten = 250;

        add(ico = new oc.Picture("oc/wh40k/images/GKLandRaiderCrusader.jpg"));

//        ogE.addElement(new OptionsGruppeEintrag("Sync. Sturmkanone", "Synchronisierte Sturmkanone", 0));
//        ogE.addElement(new OptionsGruppeEintrag("[FW] Psycannon", "[Forgeworld] Deimos-Lux Pattern Psycannon", 20));
//        add(o2 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

        seperator();

        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Multimelter", 10));
        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Sturmbolter", 5));
        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Suchkopfrakete", 10));
        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Zusätzliche Panzerung", 10));

        complete();
    }

    @Override
    public void refreshen() {
//            o2.alwaysSelected();
    }

}
