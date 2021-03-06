package oc.wh40k.units.im;

import oc.*;

public class IMArmigerWarglaive extends Eintrag {
    OptionsUpgradeGruppe o1;
    OptionsUpgradeGruppe fk1;
    OptionsZaehlerGruppe fk2;
    AnzahlPanel squad;

    public IMArmigerWarglaive() {
        name = "Armiger Warglaive";
        grundkosten = 0;
        power = 9;

        squad = new AnzahlPanel(ID, randAbstand, cnt, "Armiger Warglaive", 1, 3, getPts("Armiger Warglaive"));
        add(squad);

        seperator();

        ogE.addElement(new OptionsGruppeEintrag("Thermal Spear", getPts("Thermal Spear")));
        add(fk1 = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE, 1));

        seperator();

        ogE.addElement(new OptionsGruppeEintrag("Heavy stubber", getPts("Heavy stubber (QI)")));
        ogE.addElement(new OptionsGruppeEintrag("Melta gun", getPts("Melta gun (QI)")));
        add(fk2 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 1));
        fk2.setAnzahl(0, 1);

        setInformationVectorValue("Armiger selected", getCountFromInformationVector("Armiger selected") + 1);

        complete();
    }

    //@OVERRIDE
    public void refreshen() {
        fk1.alwaysSelected();
        fk2.setMaxAnzahl(squad.getModelle());
        fk2.setLegal(fk2.getAnzahl() == squad.getModelle());

        power = 9 * squad.getModelle();
    }

    //@OVERRIDE
    public void deleteYourself() {
        super.deleteYourself();

        setInformationVectorValue("Armiger selected", getCountFromInformationVector("Armiger selected") - 1);
    }
}
