package dev.pepe44.survivalplus.init;

import dev.pepe44.survivalplus.SurvivalPlusConstants;
import dev.pepe44.survivalplus.items.ItemCarbon;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class SurvivalPlusItems {

    public static final ItemCarbon carbon = new ItemCarbon();

    public static void init() {
        setName(carbon, "carbon");
    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(carbon);
    }

    public static void setName(Item item, String name ) {
        item.setRegistryName(new ResourceLocation(SurvivalPlusConstants.MODID, name));
        item.setTranslationKey(name);
    }

}
