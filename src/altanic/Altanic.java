package altanic;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import altanic.content.*;

public class Altanic extends Mod
{
        public Altanic()
        {
            Log.info("Altania");

            //listen for game load event
            Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
                    Time.runTask(10f, () -> {
            BaseDialog dialog = new BaseDialog("Altania");
            dialog.cont.add("Altania").row();
            dialog.cont.button("Guzik", dialog::hide).size(100f, 50f);
            dialog.show();
                 });
            });
        }
        
        @Override

        public void loadContent()
        {
            AltanicBlocks.load();
        }
}
<<<<<<< HEAD:src/altanic/altanic.java
//ściągniete od binary0011
=======
//nie wiem co tu się odjaniepawla, ale będzię dobrze
//ściągniete od binary
>>>>>>> c8316ececcc5d982f1b5f13ba009afb41572b18a:src/altanic/Altanic.java
