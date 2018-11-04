package oc.wh40k.units.da;


import oc.*;

public class DASturmtrupp extends Eintrag {

    AnzahlPanel squad;
    OptionsEinzelUpgrade jump;
    RuestkammerStarter rkTransport;
    RuestkammerStarter rkBoss;

    public DASturmtrupp() {
        name = "Sturmtrupp\n";
        grundkosten = 0;
        überschriftSetzen = true;

        add(ico = new oc.Picture("oc/wh40k/images/DAAssaultSquad.gif"));

        squad = new AnzahlPanel(ID, randAbstand, cnt, "Space Marines", 5, 10, 17);
        add(squad);

        seperator(8);

        add(jump = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Sprungmodule", 0));
        jump.setSelected(true);

        seperator(0);

        ogE.addElement(new OptionsGruppeEintrag("Flammenwerfer", 5));
        ogE.addElement(new OptionsGruppeEintrag("Plasmapistole", 15));
        add(new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 2));

        seperator();

        rkBoss = new RuestkammerStarter(ID, randAbstand, cnt, "DASergeant", "Upgrade zum Sergeant");
        rkBoss.initKammer(false, true, false);
        rkBoss.setUeberschriftTrotzNullKostenAusgeben(true);
        add(rkBoss);
        rkBoss.setAbwaehlbar(false);

        seperator();

        rkTransport = new RuestkammerStarter(ID, randAbstand, cnt, "DATransporterKammer", "Transporter");
        rkTransport.initKammer(true, false, true, false, false, true);
        rkTransport.setButtonText("Transporter");
        add(rkTransport);

        complete();
    }

    @Override
    public void refreshen() {
        if (!rkBoss.isSelected()) rkBoss.setSelected(true);

        rkTransport.setAktiv(!jump.isSelected());
    }

}

