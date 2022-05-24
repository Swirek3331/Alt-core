package altanic;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

import altanic.content.*;
import altanic.content.AltanicBlocks.*;
import altanic.content.AltanicLiquids.*;
import altanic.content.AtalnicErekirTechTree.*;

public class Altanic extends Mod
{
    public Altanic()
    {

    }
        
    @Override

    public void loadContent()
    {
        AltanicBlocks.load();
        AltanicLiquids.load();
        AltanicErekirTechTree.load();
    }
}