package dev.pepe44.survivalplus.init;

import dev.pepe44.survivalplus.SurvivalPlus;
import dev.pepe44.survivalplus.SurvivalPlusConstants;
import dev.pepe44.survivalplus.block.CarbonBlock;
import dev.pepe44.survivalplus.block.WaterGeneratorBlock;
import dev.pepe44.survivalplus.items.ItemCarbon;
import dev.pepe44.survivalplus.items.ItemEnderPouch;
import dev.pepe44.survivalplus.items.ItemMasterCrytsal;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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

import static dev.pepe44.survivalplus.init.ObjectHolders.*;

@Mod.EventBusSubscriber
public class RegistryHandler {




    @SubscribeEvent
    public static void addBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new CarbonBlock().setRegistryName(SurvivalPlusConstants.MODID, "carbonblock").setCreativeTab(SurvivalPlus.creativeTab));
        event.getRegistry().register(new WaterGeneratorBlock().setRegistryName(SurvivalPlusConstants.MODID, "fountain").setCreativeTab(SurvivalPlus.creativeTab));
    }

    @SubscribeEvent
    public static void addItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(carbonblock).setRegistryName(SurvivalPlusConstants.MODID, "carbon_block"));
        event.getRegistry().register(new ItemCarbon().setRegistryName(SurvivalPlusConstants.MODID, "carbon"));
        event.getRegistry().register(new ItemBlock(fountain).setRegistryName(SurvivalPlusConstants.MODID, "fountain_block"));
        event.getRegistry().register(new ItemEnderPouch().setRegistryName(SurvivalPlusConstants.MODID, "enderpouch"));
        event.getRegistry().register(new ItemMasterCrytsal().setRegistryName(SurvivalPlusConstants.MODID, "mystercrystal"));



    }



    @SubscribeEvent
    public static void onRegisterModelsEvent(@Nonnull final ModelRegistryEvent event) {
        ForgeRegistries.ITEMS.getValues().stream()
                .filter(item -> item.getRegistryName().getNamespace().equals(SurvivalPlusConstants.MODID))
                .forEach(item -> ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "normal")));



    }





    @SubscribeEvent
    public static void addRecipes(RegistryEvent.Register<IRecipe> event) {
        GameRegistry.addSmelting(Blocks.COAL_BLOCK, new ItemStack(carbon, 1), 1.5f);


    }
}

