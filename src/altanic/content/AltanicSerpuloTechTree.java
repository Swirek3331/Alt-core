package altanic.content;

import arc.struct.Seq;
import mindustry.content.*;
import mindustry.content.TechTree.TechNode;
import mindustry.ctype.UnlockableContent;
import mindustry.game.Objectives.*;
import mindustry.type.ItemStack;

public class AltanicSerpuloTechTree
{
    static TechTree.TechNode context = null;
    //zaczerpniętę od dobrodzieja 12three7
    private static void extendNode (UnlockableContent parent, Runnable children)
    {
        context = TechTree.all.find(t -> t.content == parent);children.run();
    }
    private static void node (UnlockableContent content, ItemStack[] requirements, Seq <Objective> objectives, Runnable children)
    {
        TechNode node = new TechNode(context, content, requirements);
        if (objectives != null) node.objectives = objectives;TechNode prev = context;context = node;children.run();
        context = prev;
    }
    /*private static void node (UnlockableContent content, ItemStack[] requirements, Seq <Objective> objectives)
    {
        node(content, requirements, objectives, () -> {});
    }
    private static void node (UnlockableContent content, Seq <Objective> objectives)
    {
        node(content, content.researchRequirements(), objectives, () -> {});
    }
    private static void node (UnlockableContent content, ItemStack[] requirements)
    {
        node(content, requirements, Seq.with(), () -> {});
    }*/
    private static void node (UnlockableContent content, ItemStack[] requirements, Runnable children)
    {
        node(content, requirements, null, children);
    }
    //private static void node (UnlockableContent content, Seq <Objective> objectives, Runnable children)
    //{
    //    node(content, content.researchRequirements(), objectives, children);
    //}
    private static void node (UnlockableContent content, Runnable children)
    {
        node(content, content.researchRequirements(), children);
    }
    private static void node (UnlockableContent block)
    {
        node(block, () -> {});
    }
    /*private static void nodeProduce (UnlockableContent content, Seq <Objective> objectives, Runnable children)
    {
        node(content, content.researchRequirements(), objectives.and(new Produce(content)), children);
    }
    private static void nodeProduce (UnlockableContent content, Seq <Objective> objectives)
    {
        nodeProduce(content, objectives, () -> {});
    }
    private static void nodeProduce (UnlockableContent content, Runnable children)
    {
        nodeProduce(content, Seq.with(), children);
    }
    private static void nodeProduce (UnlockableContent content)
    {
        nodeProduce(content, Seq.with(), () -> {});
    }*/

    public static void load()
    {
        //liquids

            //alcohols

                extendNode(Liquids.water, () -> {
                    node(AltanicLiquids.methanol, () -> {
                        node(AltanicLiquids.ethanol);
                    });
                });
                

            //fuels

                extendNode(Liquids.oil, () -> {
                    node(AltanicLiquids.lightOil, () -> {
                        node(AltanicLiquids.refinedFuel);
                    });
                    node(AltanicLiquids.heavyOil, () -> {
                        node(AltanicLiquids.lubricant);
                    });
                    node(AltanicLiquids.petroleumGas, () -> {
                        node(AltanicLiquids.naturalGas);
                    });
                });
                extendNode(AltanicLiquids.refinedFuel, () -> {
                    node(AltanicLiquids.plantOil, () -> {
                        node(AltanicLiquids.bioGas);
                        node(AltanicLiquids.glycerol, () -> {
                            node(AltanicLiquids.nitroglycerin);
                        });
                        node(AltanicLiquids.fattyAcid);
                    });
                });
            
            //gases

                extendNode(Liquids.water, () -> {
                    node(Liquids.hydrogen, () -> {
                        node(AltanicLiquids.deuterium);
                        node(AltanicLiquids.tritium);
                        node(AltanicLiquids.hellium, () -> {
                            node(AltanicLiquids.helliumThree);
                        });
                    });
                    node(AltanicLiquids.oxygen);
                    node(AltanicLiquids.steam);
                });
        //endregion        
    }
}
