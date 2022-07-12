package altlib;

import mindustry.mod.*;

import altlib.content.*;

public class AltLib extends Mod
{
    public AltLib()
    {

    }
        
    @Override
    public void loadContent()
    {
        AltLibItems.load();
        AltLibLiquids.load();
        //AltanicErekirTechTree.load();
        //AltanicSerpuloTechTree.load();
    }
}