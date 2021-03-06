package oc.wh40k.units.im;

import oc.*;

public class IMTacticalSquad extends Eintrag {

    AnzahlPanel squad;
    OptionsUpgradeGruppe o1;
    OptionsUpgradeGruppe o2;
    RuestkammerStarter rkBoss;

    boolean siegeAssaultForce;

    OptionsEinzelUpgrade mantlets;

    public IMTacticalSquad() {
        name = "Tactical Squad\n";
        grundkosten = 0;
        überschriftSetzen = true;

        squad = new AnzahlPanel(ID, randAbstand, cnt, "Space Marines", 5, 10, getPts("Tactical Squad"));
        add(squad);

        add(ico = new oc.Picture("oc/wh40k/images/SMTaktischerTrupp.jpg"));

        seperator();

        //Special Weapons
        ogE.addElement(new OptionsGruppeEintrag("Flamer", getPts("Flamer (SM)")));
        ogE.addElement(new OptionsGruppeEintrag("Plasma gun", getPts("Plasma gun (SM)")));
        ogE.addElement(new OptionsGruppeEintrag("Meltagun", getPts("Meltagun (SM)")));
        ogE.addElement(new OptionsGruppeEintrag("Grav-gun", getPts("Grav-gun")));
        add(o1 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

        seperator();

        //Heavy Weapons
        if (buildaVater.getFormationType().equals("Blood Angels"))
            ogE.addElement(new OptionsGruppeEintrag("Heavy Flamer", getPts("Heavy Flamer (SM)")));
        ogE.addElement(new OptionsGruppeEintrag("Missile launcher", getPts("Missile launcher (SM)")));
        ogE.addElement(new OptionsGruppeEintrag("Heavy Bolter", getPts("Heavy Bolter (SM)")));
        ogE.addElement(new OptionsGruppeEintrag("Multi-melta", getPts("Multi-melta (SM)")));
        ogE.addElement(new OptionsGruppeEintrag("Lascannon", getPts("Lascannon (SM)")));
        ogE.addElement(new OptionsGruppeEintrag("Gravcannon and grav-amp", getPts("Gravcannon and grav-amp")));
        ogE.addElement(new OptionsGruppeEintrag("Plasma cannon", getPts("Plasma cannon (SM)")));
        add(o2 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

        seperator();

        rkBoss = new RuestkammerStarter(ID, randAbstand, cnt, IMSergeant.class, "Sergeant");
        ((IMSergeant) rkBoss.getKammer()).type = "Tactical Squad";
        rkBoss.initKammer();
        rkBoss.setGrundkosten(getPts("Sergeant"));
        rkBoss.setUeberschriftTrotzNullKostenAusgeben(true);
        add(rkBoss);
        rkBoss.setAbwaehlbar(false);

        complete();
    }

    @Override
    public void refreshen() {

        o1.setAktiv(!o2.isSelected() || squad.getModelle() == 10);
        o2.setAktiv(!o1.isSelected() || squad.getModelle() == 10);

        if (squad.getModelle() < 10 && o1.isSelected() && o2.isSelected()) {
            o2.setSelected(0, false);
        }

        power = 5;
        if (squad.getModelle() > 5) {
            power = 9;
        }
    }

}
