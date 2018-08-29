package oc.wh40k.units.cd;

import oc.AnzahlPanel;
import oc.BuildaHQ;
import oc.Eintrag;
import oc.OptionsEinzelUpgrade;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;
import oc.OptionsZaehlerGruppe;
import oc.RuestkammerStarter;

public class CDDaemonenprinzdesNurgle extends Eintrag {

	AnzahlPanel CDDaemonenprinzdesChaos;
	OptionsUpgradeGruppe psi;
	OptionsZaehlerGruppe belohnungen;
	OptionsZaehlerGruppe o1,o2,o3;
	OptionsEinzelUpgrade mal;
	RuestkammerStarter artefakte;
	
	boolean nurgleBild;

	public CDDaemonenprinzdesNurgle() {
		name = "D�monenprinz";
		grundkosten = 145;

		add(ico = new oc.Picture("oc/wh40k/images/CDDaemonenprinzdesChaos.gif"));

		add(mal = new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "D�mon des Nurgle", 15));
		
		seperator();

		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "", "D�monischer Flug", 40));
		add(new OptionsEinzelUpgrade(ID, randAbstand, cnt, "Warpgeschmiedete R�stung", "Warpr�stung", 20));

		seperator();
		
		ogE.addElement(new OptionsGruppeEintrag("Geringe Belohnungen", 10));
		add(o1 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 5));
		ogE.addElement(new OptionsGruppeEintrag("M�chtige Belohnungen", 20));
		add(o2 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 2));
		ogE.addElement(new OptionsGruppeEintrag("Erhabene Belohnungen", 30));
		add(o3 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 1));

		seperator();

		
		ogE.addElement(new OptionsGruppeEintrag("Psi-Meisterschaftsgrad 1", 25));
		ogE.addElement(new OptionsGruppeEintrag("Psi-Meisterschaftsgrad 2", 50));
		ogE.addElement(new OptionsGruppeEintrag("Psi-Meisterschaftsgrad 3", 75));
		add(psi = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

		seperator();
		
		//H�llengeschmiedeteArtefakte
		artefakte = new RuestkammerStarter(ID, randAbstand, cnt, "CDArtefakte", "");
		artefakte.initKammer();
		artefakte.setButtonText(BuildaHQ.translate("Artefakte"));
		add(artefakte);

		((CDArtefakte)artefakte.getKammer()).enableEntry(6);
		((CDArtefakte)artefakte.getKammer()).enableEntry(7);
		((CDArtefakte)artefakte.getKammer()).enableEntry(10);
		
		complete();
	}

	@Override
	public void refreshen() {
		mal.setSelected(true);
        
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

}
