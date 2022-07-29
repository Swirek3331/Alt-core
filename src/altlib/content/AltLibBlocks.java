package altlib.content;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.world.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.consumers.*;

import static mindustry.type.ItemStack.*;

public class AltLibBlocks
{
    public static Block

    //enviroment

        //ores

        oreSulfur, oreQuartz, oreSalt, oreUranium,

        //wall ores

        quartzWall,

    public static void load()
    {
        //enviroment

            //ores
            
                oreSulfur = new OreBlock(AltLibItems.sulphur)
                {{
                    oreDefault = true;
                }};

                oreQuartz = new OreBlock(AltLibItems.quartz)
                {{
                    oreDefault = true;
                }};

                oreSalt = new OreBlock(AltLibItems.salt)
                {{
                    oreDefault = true;
                }};

            // wall ores

    }
}
