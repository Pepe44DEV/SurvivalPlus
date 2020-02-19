package dev.pepe44.survivalplus.init;

import dev.pepe44.survivalplus.SurvivalPlusConstants;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nonnull;
import java.util.Objects;

@Mod.EventBusSubscriber
public class RegistryHandler {




    @SubscribeEvent
    public static void addBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(SurvivalPlusBlocks.carbonblock);
    }





    @SubscribeEvent
    public static void onRegisterModelsEvent(@Nonnull final ModelRegistryEvent event) {
        ForgeRegistries.ITEMS.getValues().stream()
                .filter(item -> item.getRegistryName().getNamespace().equals(SurvivalPlusConstants.MODID))
                .forEach(item -> ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "normal")));



    }

    @SubscribeEvent
    public static void addRecipes(RegistryEvent.Register<IRecipe> event) {
        GameRegistry.addSmelting(Blocks.COAL_BLOCK, new ItemStack(SurvivalPlusItems.carbon, 1), 1f);


    }
}

