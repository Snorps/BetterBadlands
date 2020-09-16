package com.teamaurora.better_badlands.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Collections;
import java.util.List;
import java.util.Random;

@SuppressWarnings("deprecation")
public class MagicInvisibleLightBlock extends Block {
    public MagicInvisibleLightBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.empty();
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state
     */
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return !stateIn.isValidPosition(worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return type == PathType.AIR && !this.canCollide || super.allowsMovement(state, worldIn, pos, type);
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
        return true;
    }


    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        return Collections.emptyList();
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.empty();
    }

    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!isValidPosition(state, worldIn, pos)) {
            worldIn.destroyBlock(pos, false);
        }
        super.onBlockAdded(state, worldIn, pos, oldState, isMoving);
    }

    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        if (!isValidPosition(state, worldIn, pos)) {
            worldIn.destroyBlock(pos, false);
        }
        super.neighborChanged(state, worldIn, pos, blockIn, fromPos, isMoving);
    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        if (!state.isValidPosition(worldIn, pos)) {
            worldIn.destroyBlock(pos, true);
        }
    }

    /*@Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (!stateIn.isValidPosition(worldIn, currentPos)) {
            return Blocks.AIR.getDefaultState();
        } else {
            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        }
    }*/

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        boolean flag = false;
        for (Direction dir : Direction.values()) {
            if (worldIn.getBlockState(pos.offset(dir)).getBlock() instanceof TerracottaLampBlock) {
                Direction lampDir = worldIn.getBlockState(pos.offset(dir)).get(TerracottaLampBlock.FACING);
                if (dir == lampDir.getOpposite()) flag = true;
            }
        }
        return flag;
    }

    public static boolean isValidPositionFromDir(BlockState state, IWorldReader worldIn, BlockPos pos, Direction dirp) {
        boolean flag = false;
        for (Direction dir : Direction.values()) {
            if (dir != dirp.getOpposite()) {
                if (worldIn.getBlockState(pos.offset(dir)).getBlock() instanceof TerracottaLampBlock) {
                    Direction lampDir = worldIn.getBlockState(pos.offset(dir)).get(TerracottaLampBlock.FACING);
                    if (dir == lampDir.getOpposite()) flag = true;
                }
            }
        }
        return flag;
    }
}
