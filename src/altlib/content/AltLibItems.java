package altlib.content;

import arc.graphics.Color;
import mindustry.type.*;
//import mindustry.content.Items;

public class AltLibItems
{
    public static Item

    //region fuels

    coalCoke, petroleumCoke,

    //region minerals

    sulphur, quartz, salt, stone, //yes

    //region metals

    //chyba się w te bawić nie będę

    //region compounds

    cryoCompound, tarryCompound, meltyCompound, wettyCompound,

    //region parts

    //może

    //region ammo

    //zobaczymy

    //organic

    biomass, wood, soil,

    //region radioactive

    uraniumOre, fissileUranium, notFissileUranium, plutonium, moxWaste, moxFuel;

    public static void load()
    {   
        //region fuels

            coalCoke = new Item("coal-coke", Color.valueOf("ffffff"))
            {{

            }};

            petroleumCoke = new Item("petroleum-coke", Color.valueOf("ffffff"))
            {{

            }};

        //region minerals
            
            sulphur = new Item("sulphur", Color.valueOf("ffffff"))
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

            tarryCompound = new Item("tarry-compound", Color.valueOf("ffffff"))
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

        //region organic
            
            biomass = new Item("biomass", Color.valueOf("ffffff"))
            {{
    
            }};  
            wood = new Item("wood", Color.valueOf("ffffff"))
            {{
    
            }};

            soil = new Item("soil", Color.valueOf("ffffff"))
            {{
    
            }};

        //region radioactive

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

            moxWaste = new Item("mox-waste", Color.valueOf("ffffff"))
            {{

            }};

            moxFuel = new Item("mox-fuel", Color.valueOf("ffffff"))
            {{

            }};
    }
}   
