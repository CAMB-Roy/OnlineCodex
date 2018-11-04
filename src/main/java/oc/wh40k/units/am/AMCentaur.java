package oc.wh40k.units.am;

import oc.OptionsEinzelUpgrade;
import oc.RuestkammerVater;

public class AMCentaur extends RuestkammerVater {

    boolean grenadiers;
    OptionsEinzelUpgrade oe;

    public AMCentaur() {
        grundkosten = 40;
    }

    public void initButtons(boolean... defaults) {
        add(ico = new oc.Picture("oc/wh40k/images/IGChimera.jpg"));

        try {
            grenadiers = defaults[0];
        } catch (Exception e) {
        }

        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Hunter-killer missile", 10));
        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Dozerblade", 5));
        add(oe = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Extra armour", 10));
        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Camo netting", 20));

        sizeSetzen();
    }

    // @OVERRIDE
    public void refreshen() {
        if (grenadiers) oe.setSelected(true);
    }

}
