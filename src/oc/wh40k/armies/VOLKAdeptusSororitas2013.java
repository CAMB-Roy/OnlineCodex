package oc.wh40k.armies;

import oc.BuildaVater;
import oc.ChooserGruppe;

public class VOLKAdeptusSororitas2013 extends BuildaVater {

	public VOLKAdeptusSororitas2013() {
		reflectionKennung = "AS";

		HQeintr�ge = new String[] {"", "Sankt Celestine", "Uriah Jacobus", "", "Principalis", "Ekklesiarchie KampfKonklave", "Ministorum Priest", "Kommandotrupp", "","Belisarius Cawl", "Celestine", "Inquisitor Greyfax"};
		Eliteeintr�ge = new String[] {"", "Celestiatrupp", "Repentiatrupp"};
		Standardeintr�ge = new String[] {"", "Sororitastrupp"};
		Sturmeintr�ge = new String[] {"", "Seraphimtrupp", "Dominatortrupp",
								  "", "[IA Aeronautica] Aquila Lander", "[IA Aeronautica] Arvus Lighter"};
		Unterst�tzungeintr�ge = new String[] {"", "Exorzist", "L�uterer", "Retributortrupp",
										  "", "[IA Aeronautica] Avenger Strike Fighter"};
		LordofWar = new String[] {"","[APO2 Armageddon] Reaver Battle Titan", "[APO2 Armageddon] Warhound-Scouttitan"};
		
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, HQ, HQeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, EL, Eliteeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, TR, Standardeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, FA, Sturmeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, HS, Unterst�tzungeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,"FO", cnt, 0, FORT, Befestigungen));
    	cnt += CHOOSERGRUPPEN_X_ABSTAND;
        adden(new ChooserGruppe(this,"APO", cnt, 0, LOW, LordofWar));
        
        cnt += 480;

		nameDerArtDerArmee = "Adeptus Sororitas";
		nameDerArtDerArmeeDekliniert = "Adeptus Sororitas";
		textAreaUeberschrift = "Adeptus Sororitas";
		
		noAllies.clear();
		noAllies.add("AS");

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