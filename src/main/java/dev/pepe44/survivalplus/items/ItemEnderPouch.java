package dev.pepe44.survivalplus.items;

import dev.pepe44.survivalplus.SurvivalPlus;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemEnderPouch extends Item {

    public ItemEnderPouch() {
        setTranslationKey("enderpouch");
        setCreativeTab(SurvivalPlus.creativeTab);
    }


    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn) {

        InventoryEnderChest inventoryenderchest = player.getInventoryEnderChest();
        if (!(player.isSneaking())) {
            player.displayGUIChest(inventoryenderchest);
        }else {
        }

        return new ActionResult<ItemStack>(EnumActionResult.FAIL, player.getHeldItem(handIn));

    }


}
