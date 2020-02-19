package dev.pepe44.survivalplus.block;

import dev.pepe44.survivalplus.init.SurvivalPlusCreativeTabs;
import dev.pepe44.survivalplus.tab.SurvivalPlusTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CarbonBlock extends Block {
    public CarbonBlock() {
        super(Material.ROCK);
        setCreativeTab(SurvivalPlusCreativeTabs.tab);
    }
}
