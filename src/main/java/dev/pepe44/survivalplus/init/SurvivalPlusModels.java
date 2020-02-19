package dev.pepe44.survivalplus.init;

import dev.pepe44.survivalplus.SurvivalPlus;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;

public class SurvivalPlusModels {

    @SubscribeEvent
    public static void register(ModelRegistryEvent event){
        register(SurvivalPlusItems.carbon);
        register(Item.getItemFromBlock(SurvivalPlusBlocks.carbonblock));
    }

    private static void register(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
