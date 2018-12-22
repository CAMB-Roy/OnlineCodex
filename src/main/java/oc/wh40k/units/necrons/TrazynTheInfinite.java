package oc.wh40k.units.necrons;

import oc.Eintrag;
import oc.wh40k.units.AOPSlot.Hq;
import oc.wh40k.units.CharacterModel;
import oc.wh40k.units.Source;
import oc.wh40k.units.Unique;
import oc.wh40k.units.UnitType.Infantry;
import oc.wh40k.units.necrons.Necrons.Nihlakh;

import static oc.wh40k.units.Source.SourcePublication.CodexNecrons;

@Source(CodexNecrons)
public class TrazynTheInfinite extends Eintrag<Nihlakh, Hq> implements CharacterModel, Infantry, Necrons.Overlord, Unique<TrazynTheInfinite> {

    public TrazynTheInfinite() {
        name = "Trazyn the Infinite";
        grundkosten = getPts("Trazyn the Infinite");
        power = 5;
        
        seperator();

        addWarlordTraits("Nihilakh: Precognitive Strike", true);

        complete();
    }
}