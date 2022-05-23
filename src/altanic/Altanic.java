package altanic;

/* chyba nie jest potrzbne import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;*/
import mindustry.mod.*;
//import mindustry.ui.dialogs.*;

import altanic.content.*;

public class Altanic extends Mod
{
        public Altanic()
        {

        }
        
        @Override

        public void loadContent()
        {
            AltanicBlocks.load();
        }
}

