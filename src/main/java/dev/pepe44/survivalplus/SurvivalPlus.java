package dev.pepe44.survivalplus;

import static dev.pepe44.survivalplus.SurvivalPlusConstants.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MODID, name = NAME, version = VERSION)
public class SurvivalPlus {

    @Mod.Instance
    public static SurvivalPlus instance;

    public static SurvivalPlus getInstance() {
        return instance;
    }

    public static CreativeTabs creativeTab = new CreativeTabs("Survival Plus") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.FLINT_AND_STEEL);
        }
    };


}
