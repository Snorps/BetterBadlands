package com.teamaurora.better_badlands.common.block;

import com.teamabnormals.abnormals_core.common.blocks.thatch.ThatchBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

@SuppressWarnings("deprecated")
public class BrittleThatchBlock extends ThatchBlock {
    public BrittleThatchBlock (Properties properties) {
        super(properties);
    }

    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        boolean flag = false;
        for (Direction dir : Direction.values()) {
            if (worldIn.getBlockState(pos.offset(dir)).getBlock() == Blocks.LAVA) {
                flag = true;
            }
        }
        if (flag) {
            worldIn.destroyBlock(pos, false);
        }
        super.onBlockAdded(state, worldIn, pos, oldState, isMoving);
    }

    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        boolean flag = false;
        for (Direction dir : Direction.values()) {
            if (worldIn.getBlockState(pos.offset(dir)).getBlock() == Blocks.LAVA) {
                flag = true;
            }
        }
        if (flag) {
            worldIn.destroyBlock(pos, false);
        }
        super.neighborChanged(state, worldIn, pos, blockIn, fromPos, isMoving);
    }
}
