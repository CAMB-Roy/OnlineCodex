package oc.wh40k.units.ae;



import oc.BuildaVater;

import oc.OptionsGruppeEintrag;

import oc.RuestkammerElement;



import java.util.Vector;



public class AEAutarchWeapons extends RuestkammerElement {



    static public Vector<OptionsGruppeEintrag> createRK(String defaultWeapon, String defaultWeaponCost, BuildaVater bv) {

        Vector<OptionsGruppeEintrag> ogE = new Vector<OptionsGruppeEintrag>();

        addDefault(defaultWeapon, defaultWeaponCost, ogE, bv);

        addElement("Avenger shuriken catapult", "Avenger shuriken catapult", defaultWeapon, ogE, bv);

        addElement("Death spinner", "Death spinner", defaultWeapon, ogE, bv);

        addElement("Fusion gun", "Fusion gun", defaultWeapon, ogE, bv);

        addElement("Lasblaster", "Lasblaster", defaultWeapon, ogE, bv);

        addElement("Power sword", "Power sword", defaultWeapon, ogE, bv);

        addElement("Reaper launcher", "Reaper launcher", defaultWeapon, ogE, bv);

        addElement("Scorpion chainsword", "Scorpion chainsword", defaultWeapon, ogE, bv);

        return ogE;

    }

}





