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
//ściągniete od binary0011

