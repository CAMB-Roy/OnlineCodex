package oc.wh40k.armies;

import java.io.InputStream;

import oc.BuildaHQ;
import oc.BuildaVater;
import oc.ChooserGruppe;

public class VOLKNecrons extends BuildaVater {
	
	//Vanilla Necrons
	public String[] HQeintr�ge_NE = new String[] {"", "Overlord", "Lord", "Cryptek", "Destroyer Lord", "Catacomb Command Barge",};
	public String[] Standardeintr�ge_NE = new String[] {"", "Necron Warriors", "Immortals",};
	public String[] Eliteeintr�ge_NE = new String[] {"", "Lychguard", "Deathmarks", "Flayed Ones",};
	public String[] Sturmeintr�ge_NE = new String[] {"", "Tomb Blades", "Destroyers",};
	public String[] Unterst�tzungeintr�ge_NE = new String[] {"", "Heavy Destroyers",  "Monolith", "Annihilation Barge", "Doomsday Ark",};
	public String[] Transporteintr�ge_NE = new String[] {"", "Ghost Ark",};
	public String[] Fliegereintr�ge_NE = new String[] {"", "Doom Scythe", "Night Scythe",};
	public String[] LordofWareintr�ge_NE = new String[]{"", "Obelisk",};
	
	//ohne Dynasty
	public String[] HQeintr�ge_Vanilla_only = new String[] {"", "Illuminor Szeras", "Anrakyr the Traveller",};
	public String[] Eliteeintr�ge_Vanilla_only = new String[] {"", "Triarch Praetorians", "Triarch Stalker",};
	
	//Sautekh Dynasty
	public String[] HQeintr�ge_Sautekh = new String[] {"", "Imotekh the Stormlord", "Nemesor Zahndrekh", "Vargard Obyron", "Orikan the Diviner",};
	
	//Nihilakh Dynasty
	public String[] HQeintr�ge_Nihilakh = new String[] {"", "Trazyn the Infinite",};
	
	//C'tan Shards
	public String[] Eliteeintr�ge_Ctan_Shards = new String[] {"", "C'tan Shard of the Deceiver", "C'tan Shard of the Nightbringer",};
	public String[] Unterst�tzungeintr�ge_Ctan_Shards = new String[] {"", "Transcendent C'tan",};
	
	//C'tan Shards & Dynasty
	public String[] LordofWareintr�ge_Ctan_Shards_Dynasty = new String[] {"", "Tesseract Vault",};
	
	//Canoptek
	public String[] Sturmeintr�ge_Canoptek = new String[] {"", "Canoptek Wraiths", "Canoptek Scarabs",};
	public String[] Unterst�tzungeintr�ge_Canoptek = new String[] {"", "Canoptek Spyders",};

	//Imperial Armour Xenos Vanilla
	public String[] Unterst�tzungeintr�ge_IA_NE = new String[] {"", "Sentry Pylon", "Tesseract Ark",};
	public String[] Fliegereintr�ge_IA_NE = new String[] {"", "Night Shroud",};
	public String[] LordofWareintr�ge_IA_NE = new String[]{"", "Gauss Pylon",};
	public String[] Befestigungen_IA_NE = new String[]{"", "Tomb Citadel",};
	
	//Imperial Armour Xenos Maynarkh Dynasty
	public String[] HQeintr�ge_IA_Maynarkh = new String[] {"", "Kutlakh the World Killer", "Toholk the Blinded",};
	
	//Imperial Armour Xenos Canoptek
	public String[] Eliteeintr�ge_IA_Canoptek = new String[] {"", "Canoptek Tomb Stalker",};
	public String[] Sturmeintr�ge_IA_Canoptek = new String[] {"", "Canoptek Acanthrites", "Canoptek Tomb Sentinel",};
	
	public VOLKNecrons() {
		reflectionKennung = "NE";
		InputStream is = this.getClass().getResourceAsStream("/oc/wh40k/indices/ne.csv");
		pointValues = BuildaHQ.loadindexFile(is);
		
		is = this.getClass().getResourceAsStream("/oc/wh40k/indices/iane.csv");
		appendPointList(BuildaHQ.loadindexFile(is));
		
		AdditionalInformation = new String[] {""};
		HQeintr�ge = new String[] {""};
		Eliteeintr�ge = new String[] {"", "Custodian Guard Squad"};
		Standardeintr�ge = new String[] {""};
		Sturmeintr�ge = new String[] {""};
		Unterst�tzungeintr�ge = new String[] {""};
		Transporteintr�ge = new String[] {""};
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
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, DT, Transporteintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, FL, Fliegereintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, FORT, Befestigungen));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, LOW, LordofWar));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		
		cnt += CHOOSERGRUPPEN_TEXTAREA_ZUSATZABSTAND;
		
		//Formationen
		formationen.add("NECRONS");
		formationen.add("");
		formationen.add("Sautekh");
		formationen.add("Nihilakh");
		formationen.add("Novokh");
		formationen.add("Mephrit");
		formationen.add("Nephrekh");
		formationen.add("Maynarkh");
		formationen.add("");
		formationen.add("C'tan Shards");
		formationen.add("Canoptek");
		
		complete();		
	}

	@Override
	public void volkRefresh() {
		
		if(getFormationType().equals("NECRONS")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(uniteUnitList(HQeintr�ge_NE, HQeintr�ge_Vanilla_only, HQeintr�ge_Sautekh, HQeintr�ge_Nihilakh, HQeintr�ge_IA_Maynarkh));
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(uniteUnitList(Standardeintr�ge_NE));
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(uniteUnitList(Eliteeintr�ge_NE, Eliteeintr�ge_Vanilla_only, Eliteeintr�ge_Ctan_Shards, Eliteeintr�ge_IA_Canoptek));
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(uniteUnitList(Sturmeintr�ge_NE, Sturmeintr�ge_Canoptek, Sturmeintr�ge_IA_Canoptek));
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(uniteUnitList(Unterst�tzungeintr�ge_NE, Unterst�tzungeintr�ge_Canoptek, Unterst�tzungeintr�ge_Ctan_Shards, Unterst�tzungeintr�ge_IA_NE));
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(uniteUnitList(Transporteintr�ge_NE));
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(uniteUnitList(Fliegereintr�ge_NE, Fliegereintr�ge_IA_NE));
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(uniteUnitList(Befestigungen, Befestigungen_IA_NE));
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(uniteUnitList(LordofWareintr�ge_NE, LordofWareintr�ge_Ctan_Shards_Dynasty, LordofWareintr�ge_IA_NE));
		} else if(getFormationType().equals("Sautekh")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(uniteUnitList(HQeintr�ge_NE, HQeintr�ge_Vanilla_only, HQeintr�ge_Sautekh));
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_NE);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(uniteUnitList(Eliteeintr�ge_NE, Eliteeintr�ge_Vanilla_only, Eliteeintr�ge_Ctan_Shards, Eliteeintr�ge_IA_Canoptek));
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(uniteUnitList(Sturmeintr�ge_NE, Sturmeintr�ge_Canoptek, Sturmeintr�ge_IA_Canoptek));
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(uniteUnitList(Unterst�tzungeintr�ge_NE, Unterst�tzungeintr�ge_Canoptek, Unterst�tzungeintr�ge_Ctan_Shards, Unterst�tzungeintr�ge_IA_NE));
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_NE);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(uniteUnitList(Fliegereintr�ge_NE, Fliegereintr�ge_IA_NE));
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(uniteUnitList(Befestigungen, Befestigungen_IA_NE));
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(uniteUnitList(LordofWareintr�ge_NE, LordofWareintr�ge_Ctan_Shards_Dynasty, LordofWareintr�ge_IA_NE));
		} else if(getFormationType().equals("Nihilakh")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(uniteUnitList(HQeintr�ge_NE, HQeintr�ge_Vanilla_only, HQeintr�ge_Nihilakh));
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_NE);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(uniteUnitList(Eliteeintr�ge_NE, Eliteeintr�ge_Vanilla_only, Eliteeintr�ge_Ctan_Shards, Eliteeintr�ge_IA_Canoptek));
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(uniteUnitList(Sturmeintr�ge_NE, Sturmeintr�ge_Canoptek, Sturmeintr�ge_IA_Canoptek));
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(uniteUnitList(Unterst�tzungeintr�ge_NE, Unterst�tzungeintr�ge_Canoptek, Unterst�tzungeintr�ge_Ctan_Shards, Unterst�tzungeintr�ge_IA_NE));
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_NE);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(uniteUnitList(Fliegereintr�ge_NE, Fliegereintr�ge_IA_NE));
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(uniteUnitList(Befestigungen, Befestigungen_IA_NE));
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(uniteUnitList(LordofWareintr�ge_NE, LordofWareintr�ge_Ctan_Shards_Dynasty, LordofWareintr�ge_IA_NE));
		} else if(getFormationType().equals("Novokh")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(uniteUnitList(HQeintr�ge_NE, HQeintr�ge_Vanilla_only));
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_NE);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(uniteUnitList(Eliteeintr�ge_NE, Eliteeintr�ge_Vanilla_only, Eliteeintr�ge_Ctan_Shards, Eliteeintr�ge_IA_Canoptek));
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(uniteUnitList(Sturmeintr�ge_NE, Sturmeintr�ge_Canoptek, Sturmeintr�ge_IA_Canoptek));
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(uniteUnitList(Unterst�tzungeintr�ge_NE, Unterst�tzungeintr�ge_Canoptek, Unterst�tzungeintr�ge_Ctan_Shards, Unterst�tzungeintr�ge_IA_NE));
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_NE);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(uniteUnitList(Fliegereintr�ge_NE, Fliegereintr�ge_IA_NE));
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(uniteUnitList(Befestigungen, Befestigungen_IA_NE));
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(uniteUnitList(LordofWareintr�ge_NE, LordofWareintr�ge_Ctan_Shards_Dynasty, LordofWareintr�ge_IA_NE));
		} else if(getFormationType().equals("Mephrit")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(uniteUnitList(HQeintr�ge_NE, HQeintr�ge_Vanilla_only));
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_NE);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(uniteUnitList(Eliteeintr�ge_NE, Eliteeintr�ge_Vanilla_only, Eliteeintr�ge_Ctan_Shards, Eliteeintr�ge_IA_Canoptek));
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(uniteUnitList(Sturmeintr�ge_NE, Sturmeintr�ge_Canoptek, Sturmeintr�ge_IA_Canoptek));
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(uniteUnitList(Unterst�tzungeintr�ge_NE, Unterst�tzungeintr�ge_Canoptek, Unterst�tzungeintr�ge_Ctan_Shards, Unterst�tzungeintr�ge_IA_NE));
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_NE);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(uniteUnitList(Fliegereintr�ge_NE, Fliegereintr�ge_IA_NE));
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(uniteUnitList(Befestigungen, Befestigungen_IA_NE));
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(uniteUnitList(LordofWareintr�ge_NE, LordofWareintr�ge_Ctan_Shards_Dynasty, LordofWareintr�ge_IA_NE));
		} else if(getFormationType().equals("Nephrekh")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(uniteUnitList(HQeintr�ge_NE, HQeintr�ge_Vanilla_only));
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_NE);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(uniteUnitList(Eliteeintr�ge_NE, Eliteeintr�ge_Vanilla_only, Eliteeintr�ge_Ctan_Shards, Eliteeintr�ge_IA_Canoptek));
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(uniteUnitList(Sturmeintr�ge_NE, Sturmeintr�ge_Canoptek, Sturmeintr�ge_IA_Canoptek));
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(uniteUnitList(Unterst�tzungeintr�ge_NE, Unterst�tzungeintr�ge_Canoptek, Unterst�tzungeintr�ge_Ctan_Shards, Unterst�tzungeintr�ge_IA_NE));
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_NE);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(uniteUnitList(Fliegereintr�ge_NE, Fliegereintr�ge_IA_NE));
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(uniteUnitList(Befestigungen, Befestigungen_IA_NE));
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(uniteUnitList(LordofWareintr�ge_NE, LordofWareintr�ge_Ctan_Shards_Dynasty, LordofWareintr�ge_IA_NE));
		} else if(getFormationType().equals("Maynarkh")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(uniteUnitList(HQeintr�ge_NE, HQeintr�ge_Vanilla_only, HQeintr�ge_IA_Maynarkh));
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_NE);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(uniteUnitList(Eliteeintr�ge_NE, Eliteeintr�ge_Vanilla_only, Eliteeintr�ge_Ctan_Shards, Eliteeintr�ge_IA_Canoptek));
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(uniteUnitList(Sturmeintr�ge_NE, Sturmeintr�ge_Canoptek, Sturmeintr�ge_IA_Canoptek));
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(uniteUnitList(Unterst�tzungeintr�ge_NE, Unterst�tzungeintr�ge_Canoptek, Unterst�tzungeintr�ge_Ctan_Shards, Unterst�tzungeintr�ge_IA_NE));
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_NE);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(uniteUnitList(Fliegereintr�ge_NE, Fliegereintr�ge_IA_NE));
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(uniteUnitList(Befestigungen, Befestigungen_IA_NE));
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(uniteUnitList(LordofWareintr�ge_NE, LordofWareintr�ge_Ctan_Shards_Dynasty, LordofWareintr�ge_IA_NE));
		} else if(getFormationType().equals("C'tan Shards")){
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(Eliteeintr�ge_Ctan_Shards);
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(Unterst�tzungeintr�ge_Ctan_Shards);
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(LordofWareintr�ge_Ctan_Shards_Dynasty);
		} else if(getFormationType().equals("Canoptek")){
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(Eliteeintr�ge_IA_Canoptek);
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(uniteUnitList(Sturmeintr�ge_Canoptek, Sturmeintr�ge_IA_Canoptek));
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(Unterst�tzungeintr�ge_Canoptek);
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(Befestigungen);
		}
		
		if(formation!=null){
			formation.refreshControlPanel();
		}
		
		fillChooserSpace();
	}

	@Override
	protected void finalize() {
		System.out.println("Object gel�scht in " + nameDerArtDerArmee + "Builda !!");
	}
}