package oc.wh40k.units.cs;

import oc.Eintrag;
import oc.OptionsEinzelUpgrade;
import oc.RuestkammerStarter;

public class CSChaosVindicator extends Eintrag {

    RuestkammerStarter ausruestung;

    public CSChaosVindicator() {
        name = "Chaos-Vindicator";
        grundkosten = 120;

        add(ico = new oc.Picture("oc/wh40k/images/ChaosVindicator.gif"));

        seperator();

        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Belagerungsschild", 10));

        seperator();

        ausruestung = new RuestkammerStarter(ID, randAbstand, cnt, "CSFahrzeugruestkammer", "Ausrüstung");
        ausruestung.initKammer(true);
        ausruestung.setButtonText("Ausrüstung");
        add(ausruestung);

        complete();
    }

    @Override
    public void refreshen() {
    }

}
