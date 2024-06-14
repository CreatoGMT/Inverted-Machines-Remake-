package creato;

import arc.*;
import arc.graphics.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.type.*;
import mindustry.ui.dialogs.*;
import mindustry.world.consumers.*;

public class InvertedMachinesRemakeDepency extends Mod{

    public class ConsumeItemSeperator extends ConsumeItemFilter{
        public class Items{
            public static Item copper, lead, graphite, titanium;
        }}
        public class ConsumeItemDissembler extends ConsumeItemFilter{
        public class Items{
            public static Item sand, graphite, titanium, thorium;
        }}
    }
