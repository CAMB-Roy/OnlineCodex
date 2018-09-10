package oc.wh40k.units.kd;

import oc.BuildaHQ;
import oc.Eintrag;
import oc.OptionsGruppeEintrag;
import oc.OptionsUpgradeGruppe;
import oc.RuestkammerStarter;

public class KDHerald extends Eintrag {

	OptionsUpgradeGruppe o1,o2,o3;
	OptionsUpgradeGruppe praesenz, mount;
	RuestkammerStarter chaosBelohnungen;
	RuestkammerStarter waffenUndArtefakte;
	
	public KDHerald() {
		name = "Herald";
		grundkosten = 55;

		add(ico = new oc.Picture("oc/wh40k/images/CDHerolddesKhorne.gif"));

		seperator();
		
		ogE.addElement(new OptionsGruppeEintrag("Pr�senz des Trotzes", "Geringe Pr�senz der Trotzes", 10));
		ogE.addElement(new OptionsGruppeEintrag("Pr�senz der Wut", "M�chtige Pr�senz der Wut", 20));
		ogE.addElement(new OptionsGruppeEintrag("Pr�senz des Zorns", "Erhabene Pr�senz des Zorns", 25));
		add(praesenz = new OptionsUpgradeGruppe(ID, randAbstand, cnt, "", ogE));

		seperator();
		
		// lord, termi, dp, herald, bloodthrone
		chaosBelohnungen = new RuestkammerStarter(ID, randAbstand, cnt, "KDChaosbelohnungen", "");
		chaosBelohnungen.initKammer(false, false, false, true, false);
		chaosBelohnungen.setButtonText(BuildaHQ.translate("Gaben des Chaos"));
		add(chaosBelohnungen);
		
		seperator();
		
		waffenUndArtefakte = new RuestkammerStarter(ID, randAbstand, cnt, "KDWaffenUndArtefakte", "");
		// lord, termi, dp, herald, bloodthrone
		waffenUndArtefakte.initKammer(false, false, false, true, false);
		waffenUndArtefakte.setButtonText(BuildaHQ.translate("Waffen & Artefakte"));
		add(waffenUndArtefakte);
		waffenUndArtefakte.setAbwaehlbar(false);
		
		complete();
	}

	@Override
	public void refreshen() {
        if(((KDWaffenUndArtefakte)waffenUndArtefakte.getKammer()).uniqueError){
			setFehlermeldung("Artefakt doppelt!");
		} else{
			setFehlermeldung("");
		}
	}

}
