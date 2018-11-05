package oc.wh40k.units.as;

import oc.*;

public class ASSororitastrupp extends Eintrag {

    AnzahlPanel squad;
    OptionsUpgradeGruppe o1;
    OptionsUpgradeGruppe o2;
    RuestkammerStarter rkBoss;
    RuestkammerStarter rkTransport;

    public ASSororitastrupp() {
        name = "Sororitastrupp\n";
        grundkosten = 0;
        überschriftSetzen = true;

        squad = new AnzahlPanel(ID, randAbstand, cnt, "Sororitas", 5, 20, 12);
        add(squad);

        add(ico = new oc.Picture("oc/wh40k/images/ASSororitastrupp.jpg"));

        seperator();

        ogE.addElement(new OptionsGruppeEintrag("Sturmbolter", 5));
        ogE.addElement(new OptionsGruppeEintrag("Flammenwerfer", 5));
        ogE.addElement(new OptionsGruppeEintrag("Melter", 10));
        ogE.addElement(new OptionsGruppeEintrag("Schwerer Bolter", 10));
        ogE.addElement(new OptionsGruppeEintrag("Schwerer Flamer", "Schwerer Flammenwerfer", 10));
        ogE.addElement(new OptionsGruppeEintrag("Multimelter", 10));
        add(o1 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

        seperator();

        ogE.addElement(new OptionsGruppeEintrag("Sturmbolter", 5));
        ogE.addElement(new OptionsGruppeEintrag("Flammenwerfer", 5));
        ogE.addElement(new OptionsGruppeEintrag("Melter", 10));
        add(o2 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

        seperator();

        add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Simulacrum Imperialis", 10));

        seperator();

        rkBoss = new RuestkammerStarter(ID, randAbstand, cnt, "ASPrioris", "Upgrade zur Prioris");
        rkBoss.initKammer(true);
        add(rkBoss);
        rkBoss.setAbwaehlbar(false);

        seperator();

        rkTransport = new RuestkammerStarter(ID, randAbstand, cnt, "ASTransporterKammer", "Transporter");
        rkTransport.initKammer(true, true, true);
        rkTransport.setButtonText("Transporter");
        add(rkTransport);

        complete();
    }

    @Override
    public void refreshen() {
        if (!rkBoss.isSelected()) rkBoss.setSelected(true);
    }

}
