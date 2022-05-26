package altanic.content;

import arc.graphics.Color;
import mindustry.type.*;
//import mindustry.content.Items;

public class AltanicItems
{
    public static Item

    //region fuels

    coalCoke, petroleumCoke, compactedCoal, 

    //region minerals

    sulfur, quartz, salt,

    //region metals

    //chyba się w te bawić nie będę

    //region compounds

    cryoCompound, oilCompound, meltCompound, wetCompound, nukeCompound,

    //region parts

    //może

    //region ammo

    //zobaczymy

    //region other

    uranium235, uranium238, plutonium, nuclearWaste;

    static void load()
    {   
        //region fuels

            coalCoke = new Item("coal-coke", Color.valueOf("ffffff"))
            {{

            }};

            petroleumCoke = new Item("petroleum-coke", Color.valueOf("ffffff"))
            {{

            }};

            compactedCoal = new Item("compacted-coal", Color.valueOf("ffffff"))
            {{

            }};

        //region minerals
            
            sulfur = new Item("sulfur", Color.valueOf("ffffff"))
            {{
    
            }};
    
            quartz = new Item("quartz", Color.valueOf("ffffff"))
            {{
    
            }};
    
            salt = new Item("salt", Color.valueOf("ffffff"))
            {{
    
            }};
        
        //region metals

        //region compounds

            cryoCompound = new Item("cryo-compound", Color.valueOf("ffffff"))
            {{

            }};

            oilCompound = new Item("oil-compound", Color.valueOf("ffffff"))
            {{

            }};

            meltCompound = new Item("melt-compound", Color.valueOf("ffffff"))
            {{

            }};

            wetCompound = new Item("wet-compound", Color.valueOf("ffffff"))
            {{

            }};

            nukeCompound = new Item("nuke-compound", Color.valueOf("ffffff"))
            {{

            }};

        //region parts

        //region ammo

        //region other

            uranium235 = new Item("uranium-235", Color.valueOf("ffffff"))
            {{

            }};

            uranium238 = new Item("uranium-238", Color.valueOf("ffffff"))
            {{

            }};

            plutonium = new Item("plutonium", Color.valueOf("ffffff"))
            {{

            }};

            nuclearWaste = new Item("nuclear-waste", Color.valueOf("ffffff"))
            {{

            }};
    }
}   
