package dev.pepe44.survivalplus.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class SurvivalPlusTab extends CreativeTabs {

    public SurvivalPlusTab(){
        super("survtab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.FLINT_AND_STEEL);
    }
}
