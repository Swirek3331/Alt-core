package altlib.content;

import mindustry.world.*;
import mindustry.world.blocks.environment.*;

public class AltLibBlocks
{
    public static Block

    //enviroment

        //ores

        oreSulfur, oreQuartz, oreSalt;

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
    }
}
