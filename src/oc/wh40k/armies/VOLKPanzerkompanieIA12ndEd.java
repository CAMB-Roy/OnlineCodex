package oc.wh40k.armies;




import oc.BuildaHQ;
import oc.BuildaVater;
import oc.ChooserGruppe;

public class VOLKPanzerkompanieIA12ndEd extends BuildaVater {

	public VOLKPanzerkompanieIA12ndEd() {

		reflectionKennung = "AB";

		HQeintr�ge = new String[] {"", "Company Command Tank","Armoured Fist Command Squad","Salamander Reconnaisance Commander",
							   "", "Captain Obadiah Schfeer", "General Grizmund"};
		Eliteeintr�ge = new String[] {"", "Commissar Tank", "Destroyer Tank Hunter Squadron", "Atlas Recovery Tank", "Armoured Fist Storm Trooper Squad", "Techpriest Engineseer",};
		Standardeintr�ge = new String[] {"", "Battle Tank Squadron", "Siege Tank Squadron", "Armoured Fist Squad", "Armoured Fist Veterans"};
		Sturmeintr�ge = new String[] {"", "Scout Sentinel Squadron", "Armoured Sentinel Squadron", "Vulture Gunship Squadron", "Vendetta Gunship Squadron", "Tauros Strike Squadron", "Salamander Recon Squadron", "Hellhound Squadron"};
		Unterst�tzungeintr�ge = new String[] {"", "Hydra Flak Tank Battery", "Ordnance Battery","Griffon Strike Battery", "Colossus Bombard Battery","Armoured Fist Heavy Weapon Squad", "Armoured Fist Cyclops Demolition Squad", "Thunderbolt", "Lightning", "Avenger"};
		LordofWar = new String[] {"","[APO2 Armageddon] Reaver Battle Titan", "[APO2 Armageddon] Warhound-Scouttitan", 
				  			  /*"","Baneblade 212 'Arethusa'"*/};
		
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, 1, HQeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, 2, Eliteeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, 3, Standardeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, 4, Sturmeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, 5, Unterst�tzungeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,"FO", cnt, 0, 6, Befestigungen));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,"APO", cnt, 0, 7, LordofWar));
		cnt += 480;

		nameDerArtDerArmee = BuildaHQ.translate("Panzerkompanie");
		nameDerArtDerArmeeDekliniert = BuildaHQ.translate("Panzerkompanie");
		textAreaUeberschrift = BuildaHQ.translate("Meine") + " " + BuildaHQ.translate("Panzerkompanie");

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