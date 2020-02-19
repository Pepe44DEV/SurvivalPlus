package dev.pepe44.survivalplus.init;

import dev.pepe44.survivalplus.SurvivalPlusConstants;
import dev.pepe44.survivalplus.block.CarbonBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class SurvivalPlusBlocks {


    public static final CarbonBlock carbonblock = new CarbonBlock();

    public static void init() {
        setName(carbonblock, "carbonblock");

    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(carbonblock);

    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlock(carbonblock).setRegistryName(carbonblock.getRegistryName()));

    }

    public static void setName(Block block, String name ) {
        block.setRegistryName(new ResourceLocation(SurvivalPlusConstants.MODID, name));
        block.setTranslationKey(name);

    }




}
