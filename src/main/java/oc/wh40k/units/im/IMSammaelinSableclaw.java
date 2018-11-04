package oc.wh40k.units.im;

import oc.Eintrag;

public class IMSammaelinSableclaw extends Eintrag {

    public IMSammaelinSableclaw() {
        name = "Sammael in Sableclaw";
        grundkosten = getPts("Sammael in Sableclaw");
        power = 11;
        seperator();

        complete();
    }

    @Override
    public void refreshen() {
        setUnikat(true);
    }
}
