package altanic.content;

import arc.struct.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.Objectives.*;
import mindustry.type.*;
//import mindustry.world.*;
import static mindustry.content.Blocks.*;
//import static mindustry.content.Items.*;
import static mindustry.content.TechTree.*;
//import static mindustry.content.UnitTypes.*;

import static altanic.content.AltanicBlocks.*;

public class ErekirAltanicTechTree
{
    static TechTree.TechNode context = null;

    public static void load()
    {

        //blocks

            //region power
                
            vanillaNode(beamNode, () -> {
                node(erekirSolarPanel);
            });
            //endregion

        //end
    } 

//chuj, może zadziała

    private static void vanillaNode( UnlockableContent parent, Runnable children){
        context = TechTree.all.find(t -> t.content == parent);
        children.run();
    }

    private static void node(UnlockableContent content, ItemStack[] requirements, Seq<Objective> objectives, Runnable children){
        TechNode node = new TechNode(context, content, requirements);
        if(objectives != null) node.objectives = objectives;

        TechNode prev = context;
        context = node;
        children.run();
        context = prev;
    }

    private static void node(UnlockableContent content, ItemStack[] requirements, Runnable children){
        node(content, requirements, null, children);
    }

    private static void node(UnlockableContent content, Runnable children){
        node(content, content.researchRequirements(), children);
    }

    private static void node(UnlockableContent block){
        node(block, () -> {});
    }
}