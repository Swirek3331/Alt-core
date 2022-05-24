package altanic.content;

import arc.graphics.Color;
import mindustry.type.*;

public class AltanicLiquids
{
    public static Liquid
    //region alcochols
    methanol, ethanol,

    //region acids
    sulfuricAcid, nitrogenAcid, chloricAcid,

    //region gases
    oxygen, deuterium, tritium, hellium, helliumThree, steam,

    //region oils aka fuels
    lightOil, heavyOil, refinedFuel, gas, plantOil, plantGas, biofuel,

    //region colers
    liquidNitrogen, liquidHelliumm, lubricant, coil,

    //region other
    lava;

    static float waterBoilingPoint = 0.5f;

    public static void load()
    {

        //region alcochols

            methanol = new Liquid("methanol", Color.valueOf("ffffff"))
            {{
                heatCapacity = 0.4f;
                boilPoint = waterBoilingPoint - waterBoilingPoint * 0.25f;
                gasColor = Color.valueOf("ffffff");
            }};

            ethanol = new Liquid("ethanol", Color.valueOf("ffffff"))
            {{
                heatCapacity = 0.4f;
                boilPoint = waterBoilingPoint - waterBoilingPoint * 0.25f;
                gasColor = Color.valueOf("ffffff");
            }};
        
        //endregion
    }
}