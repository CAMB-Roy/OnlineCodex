//IA Adeptus Astartes + FAQ 1.2

package oc.wh40k.units.im;



import oc.Eintrag;

import oc.OptionsEinzelUpgrade;

import oc.OptionsGruppeEintrag;

import oc.OptionsZaehlerGruppe;



public class IMRelicSicaranVenatorTankDestroyer extends Eintrag {



    OptionsEinzelUpgrade oe1, oe2;

    OptionsZaehlerGruppe o1;



    public IMRelicSicaranVenatorTankDestroyer() {

        name = "Relic Sicaran Venator Tank Destroyer";

        grundkosten = getPts("Relic Sicaran Venator Tank Destroyer") + getPts("Neutron pulse cannon") + getPts("Heavy bolter (IA)");

        power = 15;



        seperator();



        ogE.addElement(new OptionsGruppeEintrag("2 Heavy bolters", 2 * getPts("Heavy bolter (IA)")));

        ogE.addElement(new OptionsGruppeEintrag("2 Lascannon", 2 * getPts("Lascannon (IA)")));

        add(o1 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 1));



        seperator();



        add(oe1 = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Hunter-killer missile", getPts("Hunter-killer missile (IA)")));



        seperator();



        add(oe2 = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Storm bolter", getPts("Storm bolter (IA)")));



        complete();

    }



    @Override

    public void refreshen() {

    }

}

