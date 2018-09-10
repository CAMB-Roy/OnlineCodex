package oc.wh40k.units.cd;

import oc.BuildaHQ;
import oc.Eintrag;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;
import oc.OptionsZaehlerGruppe;
import oc.RuestkammerStarter;

public class CDGrosserVerpester extends Eintrag {

	OptionsZaehlerGruppe o1,o2,o3;
	RuestkammerStarter artefakte;
	
	public CDGrosserVerpester() {

		name = "Gro�er Verpester";

		grundkosten = 190;

		add(ico = new oc.Picture("oc/wh40k/images/CDGrosserVerpester.gif"));
		
		addToInformationVector("CDD�monenprinz", 1);
		BuildaHQ.getChooserGruppe(1).removeSpezialAuswahl("D�monenprinz des Nurgle");
		BuildaHQ.getChooserGruppe(5).addSpezialAuswahl("D�monenprinz des Nurgle");
		
		seperator();

		ogE.addElement(new OptionsGruppeEintrag("Meisterschaftsgrad 2", "Meisterschaftsgrad 2", 25));
		ogE.addElement(new OptionsGruppeEintrag("Meisterschaftsgrad 3", "Meisterschaftsgrad 3", 50));
		add(new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE, 1));
		
		seperator();
		
		ogE.addElement(new OptionsGruppeEintrag("Geringe Belohnungen", 10));
		add(o1 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 5));
		ogE.addElement(new OptionsGruppeEintrag("M�chtige Belohnungen", 20));
		add(o2 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 2));
		ogE.addElement(new OptionsGruppeEintrag("Erhabene Belohnungen", 30));
		add(o3 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 1));
		
		seperator();
		
		//H�llengeschmiedeteArtefakte
		artefakte = new RuestkammerStarter(ID, randAbstand, cnt, "CDArtefakte", "");
		artefakte.initKammer();
		artefakte.setButtonText(BuildaHQ.translate("Artefakte"));
		add(artefakte);

		((CDArtefakte)artefakte.getKammer()).enableEntry(6);
		((CDArtefakte)artefakte.getKammer()).enableEntry(7);
		((CDArtefakte)artefakte.getKammer()).enableEntry(8);
		
		complete();
	}

	@Override
	public void refreshen() {
		int max = 50;
		int geringeBelohnung = 10;
		int m�chtigeBelohnung = 20;
		int erhabeneBelohnung = 30;
		
		int freePoints = max - o1.getAnzahl()*geringeBelohnung - o2.getAnzahl()*m�chtigeBelohnung - o3.getAnzahl()*erhabeneBelohnung;
		if(freePoints < erhabeneBelohnung){
			o3.setMaxAnzahl(o3.getAnzahl());
		} else {
			o3.setMaxAnzahl(freePoints/erhabeneBelohnung);
		}
		if(freePoints < m�chtigeBelohnung){
			o2.setMaxAnzahl(o2.getAnzahl());
		} else {
			o2.setMaxAnzahl(o2.getAnzahl() + freePoints/m�chtigeBelohnung);
		}
		if(freePoints < geringeBelohnung){
			o1.setMaxAnzahl(o1.getAnzahl());
		} else {
			o1.setMaxAnzahl(o1.getAnzahl() + freePoints/geringeBelohnung);
		}
		
		if(((CDArtefakte)artefakte.getKammer()).uniqueError){
			setFehlermeldung("Artefakt doppelt!");
		} else{
			setFehlermeldung("");
		}
	}
	
	@Override
	public void deleteYourself() {
		addToInformationVector("CDD�monenprinz", -1);
		if(getCountFromInformationVector("CDD�monenprinz")<1){
			BuildaHQ.getChooserGruppe(1).addSpezialAuswahl("D�monenprinz des Nurgle");
			BuildaHQ.getChooserGruppe(5).removeSpezialAuswahl("D�monenprinz des Nurgle");
		}
		super.deleteYourself();
	}
}
