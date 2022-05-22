package altanic;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import altanic.content.*;

public class altanic extends Mod
{
        public altanic()
        {
            Log.info("0011.");

            //listen for game load event
            Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
                    Time.runTask(10f, () -> {
            BaseDialog dialog = new BaseDialog("test.");
            dialog.cont.add("test.").row();
            dialog.cont.button("Chyba działa", dialog::hide).size(100f, 50f);
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
//nie wiem co tu się odjaniepawla, ale będzię dobrze