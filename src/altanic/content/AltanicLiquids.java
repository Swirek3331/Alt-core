package altanic.content;

import arc.graphics.Color;
//import mindustry.content.Liquids;
import mindustry.type.Liquid;

public class AltLibLiquids
{
    public static Liquid
    //region alcochols
    methanol, ethanol, glycerol,

    //region acids
    sulfuricAcid, nitricAcid, hydrogenChloride, fattyAcid,

    //region gases
    oxygen, deuterium, tritium, hellium, helliumThree, chlorine, steam,

    //region oils aka fuels
    lightOil, heavyOil, refinedFuel, naturalGas, petroleumGas, plantOil, biogas, biofuel,

    //region coolants
    liquidNitrogen, liquidHelliumm,

    //region other
    lava, nitroglycerin, creosoteOil;

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

            fattyAcid = new Liquid("fatty-acid", Color.valueOf("0f0f00"))
            {{  

            }};

        //gases
            
            oxygen = new Liquid("oxygen", Color.valueOf("ffffff"))
            {{

            }};

            deuterium = new Liquid("deuterium", Color.valueOf("0000ff"))
            {{

            }};

            tritium = new Liquid("tritium", Color.valueOf("ff00ff"))
            {{

            }};

            hellium = new Liquid("hellium", Color.valueOf("ffffff"))
            {{

            }};

            helliumThree = new Liquid("hellium-three", Color.valueOf("ffffff"))
            {{

            }};

            chlorine = new Liquid("chlorine", Color.valueOf("ffffff"))
            {{

            }};

            steam = new Liquid("steam", Color.valueOf("ffffff"))
            {{  
                alwaysUnlocked = true;

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

            }};

            petroleumGas = new Liquid("petroleum-gas", Color.valueOf("ffffff"))
            {{  

            }};

            plantOil = new Liquid("plant-oil", Color.valueOf("ffffff"))
            {{

            }};

            biogas = new Liquid("biogas", Color.valueOf("ffffff"))
            {{

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

            creosoteOil = new Liquid("creosote-oil", Color.valueOf("ffffff"))
            {{  

            }};
    }
}