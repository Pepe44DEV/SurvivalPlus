package dev.pepe44.survivalplus.block;

import dev.pepe44.survivalplus.SurvivalPlus;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class WaterGeneratorBlock extends Block {


    public final AxisAlignedBB FOUNTAIN = new AxisAlignedBB(0.1875D, 0, 0.1875D, 0.1825D, 0.8125D, 0.8125D);


    public WaterGeneratorBlock() {
        super(Material.WATER);
        setTranslationKey("fountain");
        setCreativeTab(SurvivalPlus.creativeTab);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){


        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {

        return false;

    }

    //@Override
    public AxisAlignedBB getBountingBox(IBlockState state, IBlockAccess source, BlockPos pos){
        return FOUNTAIN;
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (world.isRemote){
            return true;
        }


        if (!(player.isSneaking())) {
            player.sendMessage(new TextComponentString("debug"));

        }

        return true;

    }


}
