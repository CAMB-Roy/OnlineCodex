package oc.wh40k.units.ec;

import oc.AnzahlPanel;
import oc.Eintrag;
import oc.OptionsEinzelUpgrade;
import oc.OptionsGruppeEintrag;
import oc.OptionsZaehlerGruppe;
import oc.RuestkammerStarter;

public class ECCorsairReaverBand extends Eintrag {

    AnzahlPanel squad;
    OptionsZaehlerGruppe o1, o1x;
    OptionsZaehlerGruppe o2;
    OptionsEinzelUpgrade jetpacks;
    RuestkammerStarter rkBoss;
    RuestkammerStarter rkFalcon;
    RuestkammerStarter rkVenom;
    
    OptionsEinzelUpgrade armour;
    OptionsEinzelUpgrade drugs;
    OptionsEinzelUpgrade rage;

    public ECCorsairReaverBand() {
        name = "Corsair Reaver Band\n";
        grundkosten = 0;
        überschriftSetzen = true;

        squad = new AnzahlPanel(ID, randAbstand, cnt, "Corsairs", 5, 20, 10);
        add(squad);

        add(ico = new oc.Picture("oc/wh40k/images/ECCorsairSquad.jpg"));
        
        seperator();

        add(jetpacks = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Corsair Jet Packs", 5));
        
        seperator();
        
        add(armour = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Heavy mesh armour", 5));
        
        seperator();

		ogE.addElement(new OptionsGruppeEintrag("Lasblaster", 0));
		add(o1x = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 0));
		ogE.addElement(new OptionsGruppeEintrag("Splinter rifle", 0));
		ogE.addElement(new OptionsGruppeEintrag("Shuriken catapult", 0));
		ogE.addElement(new OptionsGruppeEintrag("Ccw + pistols", "Close combat weapon + a brace of pistols", 0));
		add(o1 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 0));
        
        seperator();

		ogE.addElement(new OptionsGruppeEintrag("Flamer", 5));
		ogE.addElement(new OptionsGruppeEintrag("Fusion gun", 10));
		ogE.addElement(new OptionsGruppeEintrag("Shredder", 5));
		ogE.addElement(new OptionsGruppeEintrag("Blaster", 10));
		add(o2 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 0));
        
		seperator();
		
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Haywire Grenades", 25));
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Tanglefield Grenades", 10));
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Void hardened armour", 10));
        
        seperator();

		seperator();
		
		add(drugs = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Combat drugs", 15));
		add(rage = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "Rage SR", 0));

		rkBoss = new RuestkammerStarter(ID, randAbstand, cnt, "ECCorsairFelarchKammer", "Upgrade to Felarch");
		rkBoss.initKammer(true);
		add(rkBoss);
        
        seperator();
        
		rkVenom = new RuestkammerStarter(ID, randAbstand, cnt, "ECCorsairVenomKammer", "Corsair Venom");
		rkVenom.initKammer();
		add(rkVenom);

		rkFalcon = new RuestkammerStarter(ID, randAbstand, cnt, "ECCorsairFalconKammer", "Corsair Falcon");
		rkFalcon.initKammer();
		add(rkFalcon);
        
        complete();
    }

    @Override
    public void refreshen() {
    	
    	armour.setModelle(squad.getModelle());
    	jetpacks.setModelle(squad.getModelle());
    	o1x.setMaxAnzahl(squad.getModelle()-o1.getAnzahl()-o2.getAnzahl()-(rkBoss.isSelected()?1:0));
    	o1x.setAnzahl(0,squad.getModelle()-o1.getAnzahl()-o2.getAnzahl()-(rkBoss.isSelected()?1:0));
        o1.setMaxAnzahl( squad.getModelle()-o2.getAnzahl()-(rkBoss.isSelected()?1:0));
        int o2max=squad.getModelle() / 5 * 2;
        int oSel=squad.getModelle()-o1.getAnzahl()-(rkBoss.isSelected()?1:0);
        o2.setMaxAnzahl( oSel<o2max?oSel:o2max );
        
        drugs.setAktiv(getCountFromInformationVector("ECPrinceTrait")==0);
        rage.setAktiv(getCountFromInformationVector("ECPrinceTrait")==3);
        
        rkFalcon.setAktiv(squad.getModelle() > 5 && !rkVenom.isSelected() && !jetpacks.isSelected());
        rkVenom.setAktiv(squad.getModelle() <= 5 && !rkFalcon.isSelected() && !jetpacks.isSelected());
    }
    
}
