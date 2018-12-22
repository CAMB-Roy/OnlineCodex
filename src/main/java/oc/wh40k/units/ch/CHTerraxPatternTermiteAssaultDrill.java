//IA Adeptus Astartes

package oc.wh40k.units.ch;



import oc.Eintrag;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;



public class CHTerraxPatternTermiteAssaultDrill extends Eintrag {

    OptionsUpgradeGruppe waffe1;

    public CHTerraxPatternTermiteAssaultDrill() {

        name = "Terrax-Pattern Termite Troops Drill";

        grundkosten = getPts("Terrax-Pattern Termite Troops Drill") + getPts("Melta cutter") + getPts("Termite drill");

        ogE.addElement(new OptionsGruppeEintrag("2 Storm bolter", getPts("Storm bolter")*2));
        ogE.addElement(new OptionsGruppeEintrag("2 Heavy flamer", getPts("Heavy flamer")*2));
        ogE.addElement(new OptionsGruppeEintrag("2 Twin volkite charger", getPts("Twin volkite charger")*2));
        add(waffe1 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE, 1));
        waffe1.setSelected(0, true);
        
        power = 8;



        seperator();



        complete();

    }



    @Override

    public void refreshen() {
    	waffe1.alwaysSelected();
    }

}

