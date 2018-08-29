package oc.wh40k.armies;




import oc.BuildaVater;
import oc.ChooserGruppe;

public class VOLKRenegadesandHereticsIA13 extends BuildaVater {

	public VOLKRenegadesandHereticsIA13() {
		reflectionKennung = "RH_IA13";

		HQeintr�ge = new String[] {"", "[EDIT] Renegade Command Squad", "Rogue Psykers Coven", "Renegade Enforcers Cadre"};
		Eliteeintr�ge = new String[] {"", "Renegade Disciple Squad", "Renegade Ogryn Brutes"};
		Standardeintr�ge = new String[] {"", "Renegade Infantry Platoon", "Renegade Mutant Rabble", "Renegade Infantry Veterans"};
		Sturmeintr�ge = new String[] {"", "Renegade Hellhound Squadron", "Renegade Sentinel Squadron", "Renegade Salamander Squadron", 
									  "Renegade Arvus Lighter Squadron", "Renegade Valkyrie Squadron"};
		Unterst�tzungeintr�ge = new String[] {"", "Renegade Tank Squadron", "Renegade Artillery Battery", "Renegade Strike Battery", "Renegade Hydra Battery", 
										      "Renegade Bombard Battery", "Renegade Heavy Ordnance Battery", "Renegade Support Squad", 
										      "Renegade Rapier Laser Destroyer Battery", "Renegade Field Artillery Battery"};
		LordofWar = new String[] {"", "Malcador","Malcador Defender","Minotaur","Baneblade"};			
		
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
        adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, 7, LordofWar));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;

		cnt += CHOOSERGRUPPEN_TEXTAREA_ZUSATZABSTAND;

		nameDerArtDerArmee = "Renegades and Heretics";
		nameDerArtDerArmeeDekliniert = "Renegades and Heretics";
		textAreaUeberschrift = "Renegades and Heretics";

		noAllies.clear();
		noAllies.add("RH");
		noAllies.add("CS");
		noAllies.add("CM");
		noAllies.add("BL");
		
		battleBrothers.add("RH");
		battleBrothers.add("CS");
		battleBrothers.add("CM");
		battleBrothers.add("BL");
		battleBrothers.add("CD");
		
		alliesOfConvenience.add("NE");
		alliesOfConvenience.add("OR");
		alliesOfConvenience.add("DM");
		alliesOfConvenience.add("DH");
		
		desperateAllies.add("DE");
		desperateAllies.add("TA");
		desperateAllies.add("FE");
		desperateAllies.add("EC");
		
		comeTheApocalypse.add("AB");
		comeTheApocalypse.add("AM");
		comeTheApocalypse.add("AS");
		comeTheApocalypse.add("BA");
		comeTheApocalypse.add("CR");
		comeTheApocalypse.add("DA");
		comeTheApocalypse.add("DK");
		comeTheApocalypse.add("DKAB");
		comeTheApocalypse.add("ED");
		comeTheApocalypse.add("GK");
		comeTheApocalypse.add("IN");
		comeTheApocalypse.add("IR");
		comeTheApocalypse.add("MT");
		comeTheApocalypse.add("SF");
		comeTheApocalypse.add("SM");
		comeTheApocalypse.add("TL");
		comeTheApocalypse.add("EL");
		comeTheApocalypse.add("TY");
		comeTheApocalypse.add("HQ");
		comeTheApocalypse.add("SY");
		comeTheApocalypse.add("DW");
		
		complete();
	}

	@Override
	protected void finalize() {
		System.out.println("Object gel�scht in " + nameDerArtDerArmee + "Builda !!");
	}
}