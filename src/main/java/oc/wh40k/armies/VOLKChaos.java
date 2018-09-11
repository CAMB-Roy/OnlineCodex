package oc.wh40k.armies;

import java.io.InputStream;

import oc.BuildaHQ;
import oc.BuildaVater;
import oc.ChooserGruppe;
import oc.Formation;
import oc.FormationEntry;
import oc.RefreshListener;
import oc.Superformation;

public class VOLKChaos extends BuildaVater {


	/*
	 * Chaos Space Marines
	 */
	
	public String[] HQeintr�ge_Chaos_Space_Marines = new String[]{"", "Legion", "", "Abaddon the Despoiler", "Huron Blackheart", "Cypher", "Fabius Bile", "Kharn the Betrayer",
				"Lucius the Eternal", "Chaos Lord", "Chaos Lord in Terminator Armour", "Chaos Lord on Bike", "Chaos Lord on Juggernaut of Khorne", "Chaos Lord on Disc of Tzeentch",
				"Chaos Lord on Palanquin of Nurgle", "Chaos Lord on Steed of Slaanesh", "Dark Apostle", "Exalted Champion", "Daemon Prince of Chaos CSM", "Daemon Prince of Chaos with Wings CSM",
				"Sorcerer", "Sorcerer in Terminator Armour", "Sorcerer on Bike", "Sorcerer on Disc of Tzeentch", "Sorcerer on Palanquin of Nurgle", "Sorcerer on Steed of Slaanesh", 
				"Warpsmith", "Lord of Contagion", "Malignant Plaguecaster", "", "Zhufor The Impaler", "Lord Arkos", "Chaos Hellwright", "Chaos Hellwright On Dark Abeyant", "Uraka The Warfiend", "Samus", "Mamon Transfigured", "Corbax Utterblight"};
	public String[] Eliteeintr�ge_Chaos_Space_Marines = new String[]{"", "Fallen", "Chaos Terminators", "Khorne Berzerkers", "Rubric Marines", "Plague Marines CSM", "Noise Marines", "Chosen", "Possessed", "Helbrute", "Mutilators", "", "Chaos Decimator", "Hellforged Contemptor Dreadnought"};
	public String[] Standardeintr�ge_Chaos_Space_Marines = new String[]{"", "Chaos Space Marines", "Chaos Cultists", "Tzaangors", "Poxwalkers", "Bloodletters", "Horrors", "Plaguebearers", "Daemonettes"};
	public String[] Sturmeintr�ge_Chaos_Space_Marines = new String[]{"", "Chaos Bikers", "Raptors", "Warp Talons", "Chaos Spawn", "", "Blood Slaughterer of Khorne", "Greater Blight Drone", "Hellforged Dreadclaw Drop Pod", "Hellforged Kharybdis Assault Claw", "Plague Toads Of Nurgle", "Pox Riders Of Nurgle"};
	public String[] Unterst�tzungseintr�ge_Chaos_Space_Marines = new String[]{"", "Chaos Land Raider", "Chaos Predator", "Chaos Vindicator", "Obliterators", "Havocs", "Forgefiend", "Maulerfiend", "Defiler", "", "Plague Hulk Of Nurgle", 
			"Hellforged Land Raider Proteus", "Hellforged Land Raider Achilles", "Hellforged Predator", "Hellforged Scorpius", "Hellforged Sicarian", "Hellforged Sicarian Venator", "Hellforged Deredeo Dreadnought", "Hellforged Rapier Battery", "Hellforged Leviathan Dreadnought", "Spined Chaos Beast"};
	public String[] Transporteintr�ge_Chaos_Space_Marines = new String[]{"", "Chaos Rhino"};
	public String[] Fliegereintr�ge_Chaos_Space_Marines = new String[]{"", "Heldrake", "", "Chaos Hell Blade", "Chaos Hell Talon", "Chaos Storm Eagle Assault Gunship", "Chaos Fire Raptor Assault Gunship", "Chaos Xiphon Interceptor"};
	public String[] Befestigungseintr�ge_Chaos_Space_Marines = new String[]{"", "Chaos Bastions"};
	public String[] LOWeintr�ge_Chaos_Space_Marines = new String[]{"", "Khorne Lord of Skulls", "", "Kytan Ravager", "Greater Brass Scorpion Of Khorne", "Hellforged Spartan Assault Tank", "Hellforged Cerberus Heavy Destroyer", "Hellforged Typhon Heavy Siege Tank", "Hellforged Fellblade", 
			"Hellforged Falchion", "Hellforged Mastodon", "Chaos Thunderhawk Assault Gunship", "Chaos Sokar Pattern Stormbird Gunship", "Anggrath The Unbound", "Zarakynel", "Aetaos'rau'keres", "Scabeiathrax The Bloated",
			"Renegade Knight Acheron", "Renegade Knight Lancer", "Renegade Knight Castigator", "Renegade Knight Atropos", "Renegade Knight Magaera", "Renegade Knight Porphyrion", "Renegade Knight Styrix", "", "Chaos Warlord Battle Titan", "Chaos Reaver Battle Titan", "Chaos Warhound Scout Titan"};

	/*
	 * World Eaters
	 */
	
	public String[] HQeintr�ge_World_Eaters = new String[]{"", "Kharn the Betrayer", "Chaos Lord", "Chaos Lord in Terminator Armour", "Chaos Lord on Bike", "Chaos Lord on Juggernaut of Khorne", "Exalted Champion", 
				"Dark Apostle", "Daemon Prince of Chaos", "Daemon Prince of Chaos with Wings", 
				"Warpsmith"};
	public String[] Eliteeintr�ge_World_Eaters = new String[]{"", "Fallen", "Plague Marines", "Noise Marines", "Rubric Marines", "Chaos Terminators", "Chosen", "Possessed", "Helbrute", "Mutilators"};
	public String[] Standardeintr�ge_World_Eaters = new String[]{"", "Khorne Berzerkers", "Chaos Space Marines", "Chaos Cultists"};
	public String[] Sturmeintr�ge_World_Eaters = new String[]{"", "Chaos Bikers", "Raptors", "Warp Talons", "Chaos Spawn"};
	public String[] Unterst�tzungseintr�ge_World_Eaters = new String[]{"", "Chaos Land Raider", "Chaos Predator", "Chaos Vindicator", "Obliterators", "Havocs", "Forgefiend", "Maulerfiend", "Defiler"};
	public String[] Transporteintr�ge_World_Eaters = new String[]{"", "Chaos Rhino"};
	public String[] Fliegereintr�ge_World_Eaters = new String[]{"", "Heldrake"};
	public String[] LOWeintr�ge_World_Eaters = new String[]{"", "Khorne Lord of Skulls"};
	
	/*
	 * Thousand Sons
	 */
	
	public String[] HQeintr�ge_ThousandSons = new String[]{"", "Ahriman", "Ahriman on Disc of Tzeentch", "Daemon Prince of Tzeentch", "Daemon Prince of Tzeentch with Wings",
				"Exalted Sorcerer", "Exalted Sorcerer on Disc of Tzeentch", "Thousand Sons Sorcerer", "TS Sorcerer in Terminator Armour", "Sorcerer on Disc of Tzeentch"};
	public String[] Eliteeintr�ge_ThousandSons = new String[]{"", "Tzaangor Shaman", "Flamers", "Scarab Occult Terminators", "Helbrute"};
	public String[] Standardeintr�ge_ThousandSons = new String[]{"", "TS Rubric Marines", "Tzaangors", "Chaos Cultists", "Horrors"};
	public String[] Sturmeintr�ge_ThousandSons = new String[]{"", "Tzaangor Enlightened", "Screamers", "Chaos Spawn"};
	public String[] Unterst�tzungseintr�ge_ThousandSons = new String[]{"", "Mutalith Vortex Beast", "Chaos Land Raider", "Chaos Predator", "Chaos Vindicator", "Forgefiend", "Maulerfiend", "Defiler"};
	public String[] Transporteintr�ge_ThousandSons = new String[]{"", "Chaos Rhino"};
	public String[] Fliegereintr�ge_ThousandSons = new String[]{"", "Heldrake"};
	public String[] LOWeintr�ge_ThousandSons = new String[]{"", "Magnus the Red"};

	/*
	 * Death Guard
	 */
	public String[] HQeintr�ge_Death_Guard = new String[]{"", "Typhus", "Lord of Contagion", "Malignant Plaguecaster", "Daemon Prince of Nurgle", "Daemon Prince of Nurgle with Wings",
				"Chaos Lord", "Chaos Lord in Terminator Armour", "Sorcerer", "Sorcerer in Terminator Armour", "", "Necrosius the Undying"};
	public String[] Eliteeintr�ge_Death_Guard = new String[]{"", "Noxious Blightbringer", "Foul Blightspawn", "Biologus Putrifier", "Plague Surgeon", "Tallyman", "Deathshroud Terminators", "Blightlord Terminators", "Helbrute", "Beasts of Nurgle", "Possessed"};
	public String[] Standardeintr�ge_Death_Guard = new String[]{"", "Plague Marines", "Poxwalkers", "Chaos Cultists", "Plaguebearers", "Nurglings"};
	public String[] Sturmeintr�ge_Death_Guard = new String[]{"", "Foetid Bloat Drone", "Myphitic Blight-Haulers", "Chaos Spawn", "Plague Drones"};
	public String[] Unterst�tzungseintr�ge_Death_Guard = new String[]{"", "Chaos Land Raider", "Plagueburst Crawler", "Defiler", "Chaos Predator"};
	public String[] Transporteintr�ge_Death_Guard = new String[]{"", "Chaos Rhino"};
	public String[] Fliegereintr�ge_Death_Guard = new String[]{""};
	public String[] LOWeintr�ge_Death_Guard = new String[]{"", "Mortarion"};
	
	/*
	 * Emperors Children
	 */
	
	public String[] HQeintr�ge_Emperors_Children = new String[]{"", "Lucius the Eternal", "Chaos Lord", "Chaos Lord in Terminator Armour", "Chaos Lord on Bike", "Chaos Lord on Juggernaut of Khorne", "Chaos Lord on Disc of Tzeentch",
				"Chaos Lord on Palanquin of Nurgle", "Chaos Lord on Steed of Slaanesh", "Dark Apostle", "Daemon Prince of Chaos", "Daemon Prince of Chaos with Wings",
				"Sorcerer", "Sorcerer in Terminator Armour", "Sorcerer on Bike", "Sorcerer on Disc of Tzeentch", "Sorcerer on Palanquin of Nurgle", "Sorcerer on Steed of Slaanesh", 
				"Warpsmith"};
	public String[] Eliteeintr�ge_Emperors_Children = new String[]{"", "Fallen", "Plague Marines", "Khorne Berzerkers", "Rubric Marines", "Chaos Terminators", "Chosen", "Possessed", "Helbrute", "Mutilators"};
	public String[] Standardeintr�ge_Emperors_Children = new String[]{"", "Noise Marines", "Chaos Space Marines", "Chaos Cultists"};
	public String[] Sturmeintr�ge_Emperors_Children = new String[]{"", "Chaos Bikers", "Raptors", "Warp Talons", "Chaos Spawn"};
	public String[] Unterst�tzungseintr�ge_Emperors_Children = new String[]{"", "Chaos Land Raider", "Chaos Predator", "Chaos Vindicator", "Obliterators", "Havocs", "Forgefiend", "Maulerfiend", "Defiler"};
	public String[] Transporteintr�ge_Emperors_Children = new String[]{"", "Chaos Rhino"};
	public String[] Fliegereintr�ge_Emperors_Children = new String[]{"", "Heldrake"};
	public String[] LOWeintr�ge_Emperors_Children = new String[]{"", "Khorne Lord of Skulls"};
	
	/*
	 * Questor Traitoris
	 */
	
	public String[] HQeintr�ge_Questor_Traitoris = new String[]{""};
	public String[] Eliteeintr�ge_Questor_Traitoris = new String[]{""};
	public String[] Standardeintr�ge_Questor_Traitoris = new String[]{""};
	public String[] Sturmeintr�ge_Questor_Traitoris = new String[]{""};
	public String[] Unterst�zungseintr�ge_Questor_Traitoris = new String[]{""};
	public String[] Fliegereintr�ge_Questor_Traitoris = new String[]{""};
	public String[] Transporteintr�ge_Questor_Traitoris = new String[]{""};
	public String[] Befestigungseintr�ge_Questor_Traitoris = new String[]{""};
	public String[] LOWeintr�ge_Questor_Traitoris = new String[]{"", "Renegade Knight"};
	
	/*
	 * Daemons
	 */
	
	public String[] HQeintr�ge_Daemons = new String[]{
				"", "Skarbrand", "Bloodthirster of Insensate Rage", "Wrath of Khorne Bloodthirster", "Bloodthirster of Unfettered Fury", "Skulltaker", "Bloodmaster", "Skullmaster", "Blood Throne", "Karanak", 
				"", "Kairos Fateweaver", "Lord of Change", "The Changeling", "The Blue Scribes", "Changecaster", "Fateskimmer", "Fluxmaster",
				"", "Rotigus", "Great Unclean One", "Epidemius", "Horticulous Slimux", "Poxbringer", "Sloppity Bilepiper", "Spoilpox Scrivener",
				"", "Keeper of Secrets", "The Masque of Slaanesh", "Herald of Slaanesh", "Herald of Slaanesh on Steed", "Herald of Slaanesh on Seeker Chariot", "Herald of Slaanesh on Exalted Seeker Chariot", 
				"", "Be'Lakor", "Daemon Prince of Chaos", "Daemon Prince of Chaos with Wings"};
	public String[] Eliteeintr�ge_Daemons = new String[]{"", "Bloodcrushers", "", "Flamers", "Exalted Flamer", "", "Beasts of Nurgle", "", "Fiends of Slaanesh"};
	public String[] Standardeintr�ge_Daemons = new String[]{"", "Bloodletters", "", "Horrors", "", "Plaguebearers", "Nurglings", "", "Daemonettes"};
	public String[] Sturmeintr�ge_Daemons = new String[]{"", "Flesh Hounds", "", "Screamers", "", "Plague Drones", "", "Seekers", "Hellflayer", "", "Furies"};
	public String[] Unterst�zungseintr�ge_Daemons = new String[]{"", "Skull Cannon", "", "Burning Chariot", "", "Seeker Chariot", "Exalted Seeker Chariot", "", "Soulgrinder"};
	public String[] Befestigungseintr�ge_Daemons = new String[]{"", "Feculent Gnarlmaws"};
	
	public VOLKChaos() {
		
		reflectionKennung = "CH";
		
		InputStream is = this.getClass().getResourceAsStream("/oc/wh40k/indices/chaos.csv");
		pointValues = BuildaHQ.loadindexFile(is);
		
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
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, TR, Transporteintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, FL, Fliegereintr�ge));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, FORT, Befestigungen));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		adden(new ChooserGruppe(this,reflectionKennung, cnt, 0, LOW, LordofWar));
		cnt += CHOOSERGRUPPEN_X_ABSTAND;
		
		cnt += CHOOSERGRUPPEN_TEXTAREA_ZUSATZABSTAND;

		volk = "CHAOS";
		nameDerArtDerArmee = "CHAOS";
		nameDerArtDerArmeeDekliniert = "CHAOS";

		noAllies.clear();
		noAllies.add("CD");
		noAllies.add("EC");


		battleBrothers.add("CD");
		battleBrothers.add("BL");
		battleBrothers.add("CM");
		battleBrothers.add("CS");
		battleBrothers.add("RH");
		battleBrothers.add("KD");

		desperateAllies.add("DE");
		desperateAllies.add("DM");
		desperateAllies.add("OR");
		
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
		comeTheApocalypse.add("DH");
		comeTheApocalypse.add("EL");
		comeTheApocalypse.add("FE");
		comeTheApocalypse.add("NE");
		comeTheApocalypse.add("TA");
		comeTheApocalypse.add("TY");
		comeTheApocalypse.add("HQ");
		comeTheApocalypse.add("SY");
		comeTheApocalypse.add("DW");
		
		//Verschiedene Spezialkontingente
		kontingente.add("");
		kontingente.add("Daemonic Incursion Detachment (CotW)");
		kontingente.add("Daemon Legions of Tzeentch");
		
		//Formationen
		formationen.add("CHAOS");
		formationen.add("Heretic Astartes");
		formationen.add("Chaos Space Marines");
		formationen.add("Emperor's Children");
		formationen.add("World Eaters");
		formationen.add("Death Guard");
		formationen.add("Thousand Sons");
		formationen.add("Chaosdaemons");
		formationen.add("Questor Traitoris");

		complete();
	}

	public void changeFormations(){
	}
	
	@Override
  	public void volkRefresh() {
		
    	if(getFormationType().equals("CHAOS")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(uniteUnitList(uniteUnitList(uniteUnitList(HQeintr�ge_Chaos_Space_Marines, HQeintr�ge_Death_Guard),HQeintr�ge_ThousandSons), HQeintr�ge_Daemons));
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(uniteUnitList(uniteUnitList(uniteUnitList(Eliteeintr�ge_Chaos_Space_Marines, Eliteeintr�ge_Death_Guard),Eliteeintr�ge_ThousandSons), Eliteeintr�ge_Daemons));
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(uniteUnitList(new String[]{"", "Chaos Space Marines", "Chaos Cultists", "Tzaangors", "Poxwalkers"}, Standardeintr�ge_Daemons));
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(uniteUnitList(uniteUnitList(uniteUnitList(Sturmeintr�ge_Chaos_Space_Marines, Sturmeintr�ge_Death_Guard),Sturmeintr�ge_ThousandSons), Sturmeintr�ge_Daemons));
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(uniteUnitList(uniteUnitList(uniteUnitList(Unterst�tzungseintr�ge_Chaos_Space_Marines, Unterst�tzungseintr�ge_Death_Guard),Unterst�tzungseintr�ge_ThousandSons), Unterst�zungseintr�ge_Daemons));
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(Fliegereintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(uniteUnitList(Befestigungseintr�ge_Chaos_Space_Marines, Befestigungseintr�ge_Daemons));
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(uniteUnitList(uniteUnitList(uniteUnitList(
					LOWeintr�ge_Chaos_Space_Marines, LOWeintr�ge_Death_Guard),LOWeintr�ge_ThousandSons),LOWeintr�ge_Questor_Traitoris));
		}
    	
    	if(getFormationType().equals("Heretic Astartes")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(uniteUnitList(uniteUnitList(HQeintr�ge_Chaos_Space_Marines, HQeintr�ge_Death_Guard),HQeintr�ge_ThousandSons));
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(uniteUnitList(uniteUnitList(Eliteeintr�ge_Chaos_Space_Marines, Eliteeintr�ge_Death_Guard),Eliteeintr�ge_ThousandSons));
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(new String[]{"", "Chaos Space Marines", "Chaos Cultists", "Tzaangors", "Poxwalkers"});
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(uniteUnitList(uniteUnitList(Sturmeintr�ge_Chaos_Space_Marines, Sturmeintr�ge_Death_Guard),Sturmeintr�ge_ThousandSons));
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(uniteUnitList(uniteUnitList(Unterst�tzungseintr�ge_Chaos_Space_Marines, Unterst�tzungseintr�ge_Death_Guard),Unterst�tzungseintr�ge_ThousandSons));
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(Fliegereintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(Befestigungseintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(uniteUnitList(uniteUnitList(uniteUnitList(
					LOWeintr�ge_Chaos_Space_Marines, LOWeintr�ge_Death_Guard),LOWeintr�ge_ThousandSons),LOWeintr�ge_Questor_Traitoris));
		}
		
    	if(getFormationType().equals("Chaos Space Marines")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(HQeintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(Eliteeintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(Sturmeintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(Unterst�tzungseintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(Fliegereintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(Befestigungseintr�ge_Chaos_Space_Marines);
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(LOWeintr�ge_Chaos_Space_Marines);
		}
    	
    	if(getFormationType().equals("World Eaters")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(HQeintr�ge_World_Eaters);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(Eliteeintr�ge_World_Eaters);
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_World_Eaters);
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(Sturmeintr�ge_World_Eaters);
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(Unterst�tzungseintr�ge_World_Eaters);
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_World_Eaters);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(Fliegereintr�ge_World_Eaters);
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(new String[]{""});
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(LOWeintr�ge_World_Eaters);
		}
    	
    	if(getFormationType().equals("Thousand Sons")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(HQeintr�ge_ThousandSons);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(Eliteeintr�ge_ThousandSons);
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_ThousandSons);
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(Sturmeintr�ge_ThousandSons);
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(Unterst�tzungseintr�ge_ThousandSons);
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_ThousandSons);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(Fliegereintr�ge_ThousandSons);
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(new String[]{""});
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(LOWeintr�ge_ThousandSons);
		}
    	
    	if(getFormationType().equals("Death Guard")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(HQeintr�ge_Death_Guard);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(Eliteeintr�ge_Death_Guard);
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_Death_Guard);
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(Sturmeintr�ge_Death_Guard);
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(Unterst�tzungseintr�ge_Death_Guard);
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_Death_Guard);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(Fliegereintr�ge_Death_Guard);
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(new String[]{""});
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(LOWeintr�ge_Death_Guard);
		}
    	
    	if(getFormationType().equals("Emperor's Children")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(HQeintr�ge_Emperors_Children);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(Eliteeintr�ge_Emperors_Children);
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_Emperors_Children);
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(Sturmeintr�ge_Emperors_Children);
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(Unterst�tzungseintr�ge_Emperors_Children);
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_Emperors_Children);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(Fliegereintr�ge_Emperors_Children);
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(new String[]{""});
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(LOWeintr�ge_Emperors_Children);
		}
    	
    	if(getFormationType().equals("Questor Traitoris")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(HQeintr�ge_Questor_Traitoris);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(Eliteeintr�ge_Questor_Traitoris);
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_Questor_Traitoris);
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(Sturmeintr�ge_Questor_Traitoris);
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(Unterst�zungseintr�ge_Questor_Traitoris);
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(Transporteintr�ge_Questor_Traitoris);
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(Fliegereintr�ge_Questor_Traitoris);
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(new String[]{""});
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(LOWeintr�ge_Questor_Traitoris);
		}
    	
    	if(getFormationType().equals("Chaosdaemons")){
			myChooserGruppen.get(HQ).changeComboBoxAuswahlen(HQeintr�ge_Daemons);
			myChooserGruppen.get(EL).changeComboBoxAuswahlen(Eliteeintr�ge_Daemons);
			myChooserGruppen.get(TR).changeComboBoxAuswahlen(Standardeintr�ge_Daemons);
			myChooserGruppen.get(FA).changeComboBoxAuswahlen(Sturmeintr�ge_Daemons);
			myChooserGruppen.get(HS).changeComboBoxAuswahlen(Unterst�zungseintr�ge_Daemons);
			myChooserGruppen.get(DT).changeComboBoxAuswahlen(new String[]{""});
			myChooserGruppen.get(FL).changeComboBoxAuswahlen(new String[]{""});
			myChooserGruppen.get(FORT).changeComboBoxAuswahlen(Befestigungseintr�ge_Daemons);
			myChooserGruppen.get(LOW).changeComboBoxAuswahlen(new String[]{""});
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