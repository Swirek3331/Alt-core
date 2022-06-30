package altanic.content;

import arc.graphics.Color;
import mindustry.content.Liquids;
import mindustry.type.Liquid;

public class AltanicLiquids
{
    public static Liquid
    //region alcochols
    methanol, ethanol, glycerol,

    //region acids
    sulfuricAcid, nitricAcid, hydrogenChloride, fattyAcid,

    //region gases
    oxygen, deuterium, tritium, hellium, helliumThree, steam,

    //region oils aka fuels
    lightOil, heavyOil, refinedFuel, naturalGas, petroleumGas, plantOil, bioGas, biofuel,

    //region coolants
    liquidNitrogen, liquidHelliumm, lubricant,

    //region other
    lava, nitroglycerin;

    public static void load()
    {

        //alcochols

            methanol = new Liquid("methanol", Color.valueOf("ffffff"))
            {{

            }};

            ethanol = new Liquid("ethanol", Color.valueOf("ffffff"))
            {{

            }};

            glycerol = new Liquid("glycerol", Color.valueOf("ffffff"))
            {{

            }};
        
        //acids
            
            sulfuricAcid = new Liquid("sulfuric-acid", Color.valueOf("bee610"))
            {{

            }};

            nitricAcid = new Liquid("nitric-acid", Color.valueOf("bee610"))
            {{  

            }};

            hydrogenChloride = new Liquid("hydrogen-chloride", Color.valueOf("ffffff"))
            {{  

            }};

            fattyAcid = new Liquid("fatty-acids", Color.valueOf("0f0f00"))
            {{  

            }};

        //gases
            
            oxygen = new Liquid("oxygen", Color.valueOf("ffffff"))
            {{
                gas = true;
            }};

            deuterium = new Liquid("deuterium", Color.valueOf("0000ff"))
            {{
                gas = true;
            }};

            tritium = new Liquid("tritium", Color.valueOf("ff00ff"))
            {{
                gas = true;
            }};

            hellium = new Liquid("hellium", Color.valueOf("ffffff"))
            {{
                gas = true;
            }};

            helliumThree = new Liquid("hellium-three", Color.valueOf("ffffff"))
            {{
                gas = true;
            }};

            steam = new Liquid("steam", Color.valueOf("ffffff"))
            {{  
                alwaysUnlocked = true;
                gas = true;
            }};

        //fuels

            lightOil = new Liquid("light-oil", Color.valueOf("ffffff"))
            {{

            }};

            heavyOil = new Liquid("heavy-oil", Color.valueOf("ffffff"))
            {{

            }};

            refinedFuel = new Liquid("refined-fuel", Color.valueOf("ffffff"))
            {{

            }};

            naturalGas = new Liquid("natural-gas", Color.valueOf("ffffff"))
            {{  
                gas = true;
            }};

            petroleumGas = new Liquid("petroleum-gas", Color.valueOf("ffffff"))
            {{  
                gas = true;
            }};

            plantOil = new Liquid("plant-oil", Color.valueOf("ffffff"))
            {{

            }};

            bioGas = new Liquid("biogas", Color.valueOf("ffffff"))
            {{
                gas = true;
            }};

            biofuel = new Liquid("biofuel", Color.valueOf("ffffff"))
            {{

            }};

        //coolants

            liquidNitrogen = new Liquid("liquid-nitrogen", Color.valueOf("ffffff"))
            {{

            }};

            liquidHelliumm = new Liquid("liquid-hellium", Color.valueOf("ffffff"))
            {{

            }};

        //other

            lava = new Liquid("lava", Color.valueOf("ff0000"))
            {{  

            }};

            nitroglycerin = new Liquid("nitroglycerin", Color.valueOf("ffffff"))
            {{  

            }};
    }
}