package oc.wh40k.armies;

import oc.BuildaVater;
import oc.ChooserGruppe;
import oc.Formation;
import oc.FormationEntry;

public class VOLKAdeptusCustodes extends BuildaVater {

	public VOLKAdeptusCustodes() {
		reflectionKennung = "AC";

		AdditionalInformation = new String[] {""};
		HQeintr�ge = new String[] {""};
		Eliteeintr�ge = new String[] {"", "Custodian Guard Squad"};
		Standardeintr�ge = new String[] {""};
		Sturmeintr�ge = new String[] {""};
		Unterst�tzungeintr�ge = new String[] {""};
		Fliegereintr�ge = new String[] {""};
		Befestigungen = new String[] {""};
		LordofWar = new String[] {""};
		
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, AI, AdditionalInformation));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, HQ, HQeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, TR, Standardeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, EL, Eliteeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, FA, Sturmeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, HS, Unterst�tzungeintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, TR, Transporteintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, FL, Fliegereintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, FORT, Befestigungen));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, LOW, LordofWar));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
        
        cnt += 480;

		nameDerArtDerArmee = "Adeptus Custodes";
		nameDerArtDerArmeeDekliniert = "Adeptus Custodes";
		textAreaUeberschrift = "Adeptus Custodes";
		
		noAllies.clear();
		noAllies.add("AC");

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
		battleBrothers.add("SO");
		battleBrothers.add("CU");
		
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

		//Formationen
		formationen.add("Golden Legion Task Force");
		
		minAuswahlen.put("Golden Legion Task Force",new int[] {0,1,0,0,0,0,0,0});
		maxAuswahlen.put("Golden Legion Task Force",new int[] {0,3,0,0,0,0,0,0});
		
		complete();
	}

	@Override
	protected void finalize() {
		System.out.println("Object gel�scht in " + nameDerArtDerArmee + "Builda !!");
	}
	
	@Override
	public void volkRefresh() {
		
		if(getKontingentTyp().equals("Golden Legion Task Force")){
			
			clearCombo();
			
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(new String[]{"", "Custodian Guard Squad"});
			
			formation=new Formation(this);
			formation.entries.add(new FormationEntry(new String[]{"Custodian Guard Squad"}, 1, 3));
			
			if(!isLoading){
				addUnit(1,"Custodian Guard Squad");
			}
			
		}
	}
}