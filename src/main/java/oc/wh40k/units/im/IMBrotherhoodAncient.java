package oc.wh40k.units.im;

import oc.*;
import oc.wh40k.units.PsychicPowers;

public class IMBrotherhoodAncient extends Eintrag {
    //TODO Ausrüstung in eine Kammer verlegen. Artefakte richtig handhaben
    OptionsUpgradeGruppe o1, o1x;
    OptionsUpgradeGruppe o2, reliquien;
    boolean grandmasterBool;
    OptionsEinzelUpgrade grandmaster;
    RuestkammerStarter psychicPowers;

    public IMBrotherhoodAncient() {
        name = "Brotherhood Ancient";
        grundkosten = getPts("Brotherhood Ancient") + getPts("Frag grenades (SM)") + getPts("Krak grenades (SM)") + getPts("Psyk-out grenades (SM)");

        add(ico = new oc.Picture("oc/wh40k/images/GKBruderCaptainderGreyKnights.jpg"));
        seperator();

        ogE.addElement(new OptionsGruppeEintrag("Storm bolter", getPts("Storm bolter (SM)")));
        add(o1 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

        seperator();

        ogE.addElement(new OptionsGruppeEintrag("Nemesis falchion", getPts("Nemesis falchion")));
        add(o2 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

        seperator();

        psychicPowers = new RuestkammerStarter(ID, randAbstand, cnt, "PsychicPowers", "Psychic Powers");
        ((PsychicPowers) psychicPowers.getKammer()).setNumberOfPowers(2);
        ((PsychicPowers) psychicPowers.getKammer()).enableSanctic();
        psychicPowers.initKammer();
        psychicPowers.setUeberschriftTrotzNullKostenAusgeben(true);
        add(psychicPowers);
        psychicPowers.setAbwaehlbar(true);

        complete();
    }

    @Override
    public void refreshen() {
        power = 7;
        if (!o1.isSelected()) o1.setSelected(0, true);
    }
}
