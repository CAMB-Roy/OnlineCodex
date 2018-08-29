package oc.wh40k.units.cd;

import oc.BuildaHQ;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;
import oc.OptionsZaehlerGruppe;
import oc.RuestkammerStarter;

public class CDHerolddesNurgle extends CDHerold {

	OptionsZaehlerGruppe o1,o2,o3;
	OptionsUpgradeGruppe praesenz, mount;
	RuestkammerStarter artefakte;
	
	public CDHerolddesNurgle() {

		name = "Herold des Nurgle";

		grundkosten = 45;

		this.setEintragsCNT(0.5);

		add(ico = new oc.Picture("oc/wh40k/images/CDHerolddesNurgle.gif"));

		seperator();
		
		ogE.addElement(new OptionsGruppeEintrag("Geringe Belohnungen", 10));
		add(o1 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 5));
		ogE.addElement(new OptionsGruppeEintrag("M�chtige Belohnungen", 20));
		add(o2 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 2));
		ogE.addElement(new OptionsGruppeEintrag("Erhabene Belohnungen", 30));
		add(o3 = new OptionsZaehlerGruppe(ID, randAbstand, cnt, "", ogE, 1));

		seperator();
		
		ogE.addElement(new OptionsGruppeEintrag("Meisterschaftsgrad 1", 25));
		ogE.addElement(new OptionsGruppeEintrag("Meisterschaftsgrad 2", 50));
		add(praesenz = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));
		
		seperator();
		
		ogE.addElement(new OptionsGruppeEintrag("Pr�senz der Virulenz", "Geringe Pr�senz der Virulenz", 10));
		ogE.addElement(new OptionsGruppeEintrag("Pr�senz der Fruchtbarkeit", "M�chtige Pr�senz der Fruchtbarkeit", 25));
		ogE.addElement(new OptionsGruppeEintrag("Pr�senz der Ansteckung", "Erhabene Pr�senz der Ansteckung", 25));
		add(praesenz = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

		seperator();
		
		ogE.addElement(new OptionsGruppeEintrag("S�nfte des Nurgle", 40));
		add(mount = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));
		
		seperator();
		
		//H�llengeschmiedeteArtefakte
		artefakte = new RuestkammerStarter(ID, randAbstand, cnt, "CDArtefakte", "");
		artefakte.initKammer();
		artefakte.setButtonText(BuildaHQ.translate("Artefakte"));
		add(artefakte);

		((CDArtefakte)artefakte.getKammer()).enableEntry(6);
		((CDArtefakte)artefakte.getKammer()).enableEntry(7);
		((CDArtefakte)artefakte.getKammer()).enableEntry(9);
		((CDArtefakte)artefakte.getKammer()).enableEntry(10);
		((CDArtefakte)artefakte.getKammer()).enableEntry(11);
		
		complete();

	}

	@Override
	public void refreshen() {
        super.refreshen();
		int max = 30;
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
