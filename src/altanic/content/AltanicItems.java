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

    cryoCompound, oilCompound, meltyCompound, wettyCompound,

    //region parts

    //może

    //region ammo

    //zobaczymy

    //region other

    uraniumOre, fissileUranium, notFissileUranium, plutonium, moxFuel;

    public static void load()
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

            meltyCompound = new Item("melty-compound", Color.valueOf("ffffff"))
            {{

            }};

            wettyCompound = new Item("wetty-compound", Color.valueOf("ffffff"))
            {{

            }};

        //region parts

        //region ammo

        //region other

            uraniumOre = new Item("uranium-ore", Color.valueOf("ffffff"))
            {{

            }};

            fissileUranium = new Item("uranium-235", Color.valueOf("ffffff"))
            {{

            }};

            notFissileUranium = new Item("uranium-238", Color.valueOf("ffffff"))
            {{

            }};

            plutonium = new Item("plutonium", Color.valueOf("ffffff"))
            {{

            }};

            moxFuel = new Item("MOX-fuel", Color.valueOf("ffffff"))
            {{

            }};
    }
}   
