package altanic.content;

import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.power.*;
import mindustry.content.Items;
import static mindustry.type.ItemStack.*;

//narazie chyba tyle potrzeba

public class AltanicBlocks
{
    public static Block

    //power
    erekirSolarPanel;

    public static void load()
    {
        //region power

        erekirSolarPanel = new SolarGenerator("Solar Panel"){{
            requirements(Category.power, with(Items.graphite, 50, Items.silicon, 25, Items.beryllium, 20));
            size = 2;
            powerProduction = 2f;
            health = 400;
        }};
    }
}
