package oc.wh40k.units.im;



import oc.AnzahlPanel;

import oc.Eintrag;



public class IMLandSpeederTempest extends Eintrag {



    AnzahlPanel squad;



    public IMLandSpeederTempest() {

        name = "Land Speeder Tempest";



        squad = new AnzahlPanel(ID, randAbstand, cnt, "Land Speeder Tempest", "Land Speeder Tempest", 1, 3, getPts("Land Speeder Tempest") + getPts("Assault cannon") + 2 * getPts("Tempest salvo launcher"));

        add(squad);



        seperator();



        complete();

    }



    @Override

    public void refreshen() {

        power = squad.getModelle() * 8;

    }



}

