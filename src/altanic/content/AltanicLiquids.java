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
    lightOil, heavyOil, refinedFuel, naturalGas, petroleumGas, plantOil, plantGas, biofuel,

    //region coolants
    liquidNitrogen, liquidHelliumm, lubricant, coil,

    //region other
    lava;

    public static void load()
    {

        //alcochols

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
        
        //acids
            
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

        //gases
            
            oxygen = new Liquid("oxygen", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            deuterium = new Liquid("deuterium", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            tritium = new Liquid("tritium", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            hellium = new Liquid("hellium", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            helliumThree = new Liquid("hellium-three", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            steam = new Liquid("steam", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

        //fuels

            lightOil = new Liquid("light-oil", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            heavyOil = new Liquid("heavy-oil", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            refinedFuel = new Liquid("refined-fuel", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            naturalGas = new Liquid("natural-gas", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            petroleumGas = new Liquid("petroleum-gas", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            plantOil = new Liquid("plant-oil", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            plantGas = new Liquid("plant-gas", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            biofuel = new Liquid("biofuel", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};
        //coolants

            liquidNitrogen = new Liquid("liquid-nitrogen", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            liquidHelliumm = new Liquid("liquid-hellium", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            lubricant = new Liquid("lubricant", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

            coil = new Liquid("coil", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};

        //other

            lava = new Liquid("lava", Color.valueOf("ffffff"))
            {{
                gasColor = Color.valueOf("ffffff");
            }};
    }
}