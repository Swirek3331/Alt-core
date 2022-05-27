package altanic;

import mindustry.mod.*;

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
        AltanicItems.load();
        AltanicLiquids.load();
        AltanicErekirTechTree.load();
        AltanicSerpuloTechTree.load();
    }
}