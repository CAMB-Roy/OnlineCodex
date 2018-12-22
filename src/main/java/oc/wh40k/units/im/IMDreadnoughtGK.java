package oc.wh40k.units.im;

import oc.Eintrag;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;
import oc.RuestkammerStarter;
import oc.wh40k.units.PsychicPowers;

public class IMDreadnoughtGK extends Eintrag {
    OptionsUpgradeGruppe o1, o2;
    RuestkammerStarter psychicPowers;

    public IMDreadnoughtGK() {
        name = "Dreadnought";
        grundkosten = getPts("Dreadnought (GK)");
        power = 8;

        seperator();

        ogE.addAll(IMSpaceMarinesDreadnoughtHeavyWeapons.createRK("Troops cannon", "Troops cannon", buildaVater));
        add(o1 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

        seperator();

        ogE.addElement(new OptionsGruppeEintrag("DCW + Storm bolter", "Dreadnought combat weapon + Storm bolter", getPts("Dreadnought combat weapon (other models)") + getPts("Storm bolter (SM)")));
        ogE.addElement(new OptionsGruppeEintrag("DCW + Heavy flamer", "Dreadnought combat weapon + Heavy flamer", getPts("Dreadnought combat weapon (other models)") + getPts("Heavy flamer (SM)")));
        ogE.addElement(new OptionsGruppeEintrag("Missile launcher", getPts("Missile launcher (SM)")));
        ogE.addElement(new OptionsGruppeEintrag("Twin autocannon", getPts("Twin autocannon")));
        add(o2 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

        seperator();

        psychicPowers = new RuestkammerStarter(ID, randAbstand, cnt, PsychicPowers.class, "Psychic Powers");
        ((PsychicPowers) psychicPowers.getKammer()).setNumberOfPowers(1);
        ((PsychicPowers) psychicPowers.getKammer()).enableSanctic();
        psychicPowers.initKammer();
        psychicPowers.setUeberschriftTrotzNullKostenAusgeben(true);
        add(psychicPowers);
        psychicPowers.setAbwaehlbar(true);

        complete();
    }

    @Override
    public void refreshen() {
        o1.alwaysSelected();
        o2.alwaysSelected();
    }
}
