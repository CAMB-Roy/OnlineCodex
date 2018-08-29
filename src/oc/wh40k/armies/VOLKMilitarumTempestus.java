package oc.wh40k.armies;

import oc.BuildaHQ;
import oc.BuildaVater;
import oc.ChooserGruppe;

public class VOLKMilitarumTempestus extends BuildaVater {

  public VOLKMilitarumTempestus() {
    reflectionKennung = "MT";

    HQeintr�ge = new String[] {"", "Lord Commissar", "Commissar", "Militarum Tempestus CommandSquad", "", "Belisarius Cawl", "Celestine", "Inquisitor Greyfax"};
    Eliteeintr�ge = new String[] {"", ""};
    Standardeintr�ge = new String[] {"", "Militarum Tempestus Scions"};
    Sturmeintr�ge = new String[] {"", "Valkyrie Squadron","Taurox Prime"};
    Unterst�tzungeintr�ge = new String[] {""};
    LordofWar = new String[] {""};

    /*LoW
     Reaver Battle Titan WH40K: Apoc
	Warhound Scout Titan WH40K: Apoc
     */
    
    /*
    Heroes of Armageddon
	Commissar Yarrick
	1 Company Command Squad
	High Marshal Helbrecht
	1 Command Squad (Black Templars)
	Captain Tycho
	1 Honour Guard
	
	Armageddon Stompa Hunters
	3-5 Armoured Sentinels
	
	Imperial Vengeance Mechanised Company
	1 Company Command Squad
	3 Infantry Platoons
	Each Infantry Platoon must have one Platoon Command Squad and 2 Infantry
	Squads. All Squads, including the Company Command Squad, must have Chimera
	Dedicated Transport vehicles.
	
	FIRESTORM NEXUS
	3 Firestorm Redoubts
	
	IMPERIAL STRONGHOLD
	1 Macrocannon Aquila Strongpoint or Vortex Missile Aquila Strongpoint
	1 Firestorm Redoubt
	1+ Imperial Defence Lines
	1+ Imperial Defence Emplacements
	1+ Imperial Bunkers
	1 + Vengeance Weapon Batteries

    */
    
    
    adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, 1, HQeintr�ge));
    cnt += CHOOSERGRUPPEN_X_ABSTAND;
    adden(new ChooserGruppe(this,reflectionKennung, outOfPanel, 0, 2, Eliteeintr�ge));
    adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, 3, Standardeintr�ge));
    cnt += CHOOSERGRUPPEN_X_ABSTAND;
    adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, 4, Sturmeintr�ge));
    adden(new ChooserGruppe(this,reflectionKennung, outOfPanel, 0, 5, Unterst�tzungeintr�ge));
    adden(new ChooserGruppe(this,"FO", outOfPanel, 0, 6, Befestigungen));
    adden(new ChooserGruppe(this,"APO", outOfPanel, 0, 7, LordofWar));

    cnt += CHOOSERGRUPPEN_X_ABSTAND;
    cnt += CHOOSERGRUPPEN_TEXTAREA_ZUSATZABSTAND;

    nameDerArtDerArmee = "Militarum Tempestus";
    nameDerArtDerArmeeDekliniert = "Militarum Tempestus";
    textAreaUeberschrift = BuildaHQ.translate("Militarum Tempestus");

    noAllies.clear();
	noAllies.add("MT");
	noAllies.add("AM");
	noAllies.add("ED");
	noAllies.add("AB");
	noAllies.add("DK");
	noAllies.add("DKAB");

	battleBrothers.add("AB");
	battleBrothers.add("AM");
	battleBrothers.add("AS");
	battleBrothers.add("BA");
	battleBrothers.add("CR");
	battleBrothers.add("DA");
	battleBrothers.add("DK");
	battleBrothers.add("DKAB");
	battleBrothers.add("ED");
	battleBrothers.add("GK");
	battleBrothers.add("IN");
	battleBrothers.add("IR");
	battleBrothers.add("MT");
	battleBrothers.add("SF");
	battleBrothers.add("SM");
	battleBrothers.add("TL");
	battleBrothers.add("SK");
	battleBrothers.add("CU");
	battleBrothers.add("DW");
	
	alliesOfConvenience.add("EL");
	alliesOfConvenience.add("HQ");
	
	desperateAllies.add("DE");
	desperateAllies.add("TA");
	desperateAllies.add("FE");
	desperateAllies.add("EC");
	
	comeTheApocalypse.add("BL");
	comeTheApocalypse.add("CD");
	comeTheApocalypse.add("CM");
	comeTheApocalypse.add("CS");
	comeTheApocalypse.add("DH");
	comeTheApocalypse.add("DM");
	comeTheApocalypse.add("NE");
	comeTheApocalypse.add("OR");
	comeTheApocalypse.add("RH");
	comeTheApocalypse.add("TY");
	comeTheApocalypse.add("SY");
	
    complete();
  }

  @Override
  protected void finalize() {
    System.out.println("Object gel�scht in " + nameDerArtDerArmee + "Builda !!");
  }
}
