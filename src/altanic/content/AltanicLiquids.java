package altanic.content;

import arc.graphics.Color;
import mindustry.type.*;
import mindustry.content.Liquids;

public class AltanicLiquids
{
    public static Liquid
    //region alcochols
    methanol, ethanol,

    //region acids
    sulfuricAcid, nitricAcid, hydrogenChloride,

    //region gases
    oxygen, deuterium, tritium, hellium, helliumThree, steam,

    //region oils aka fuels
    lightOil, heavyOil, refinedFuel, gas, plantOil, plantGas, biofuel,

    //region coolants
    liquidNitrogen, liquidHelliumm, lubricant, coil,

    //region other
    lava;

    public static void load()
    {

        //region alcochols

            methanol = new Liquid("methanol", Color.valueOf("ffffff"))
            {{
                heatCapacity = 0.4f;
                boilPoint = Liquids.water.boilPoint * 0.73f;
                flammability = 0.6f;
                gasColor = Color.valueOf("ffffff");
            }};

            ethanol = new Liquid("ethanol", Color.valueOf("ffffff"))
            {{
                heatCapacity = 0.4f;
                flammability = 0.6f;
                boilPoint = Liquids.water.boilPoint * 0.7f;
                gasColor = Color.valueOf("ffffff");
            }};
        
        //endregion

        //region acids
            
            sulfuricAcid = new Liquid("sulfuric-acid", Color.valueOf("bee610"))
            {{
                boilPoint = Liquids.water.boilPoint * 3.1f;
                gasColor = Color.valueOf("bee610");
                //jednka nie będzię statusu żrący;
            }};

            nitricAcid = new Liquid("nitric-acid", Color.valueOf("bee610"))
            {{  
                flammability = 0.2f;
                boilPoint = Liquids.water.boilPoint * 0.83f;
                gasColor = Color.valueOf("bee610");
            }};

            hydrogenChloride = new Liquid("hydrogen-chloride", Color.valueOf("ffffff"))
            {{
                boilPoint = Liquids.water.boilPoint * -0.85f;
                temperature = 0.3f;
                heatCapacity = 0.35f;
                gasColor = Color.valueOf("ffffff");
            }};

        //endregion
    }
}