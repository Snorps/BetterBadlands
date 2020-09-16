package com.teamaurora.better_badlands.common.world.gen.feature;

import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldWriter;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraftforge.common.IPlantable;

import java.util.*;

public class SmallDarkOakFeature extends Feature<BaseTreeFeatureConfig> {
    public SmallDarkOakFeature(Codec<BaseTreeFeatureConfig> config) {
        super(config);
    }

    @Override
    public boolean func_230362_a_(ISeedReader worldIn, StructureManager manager, ChunkGenerator generator, Random rand, BlockPos position, BaseTreeFeatureConfig config) {
        int heightOffset = rand.nextInt(3);
        int i = heightOffset + 4;

        boolean flag = true;
        if (position.getY() >= 1 && position.getY() + i + 1 <= worldIn.getHeight()) {
            for (BlockPos pos : BlockPos.getAllInBoxMutable(position.add(-1, 1, -1), position.add(1, i, 1))) {
                if (!isAirOrLeaves(worldIn, pos)) {
                    flag = false;
                }
            }
            if (!isAirOrLeaves(worldIn, position)) flag = false;
            if (!flag) {
                return false;
            } else if (isValidGround(worldIn, position.down())) {
                List<BlockPos> logPos = new ArrayList<>();
                List<BlockPos> leafPos = new ArrayList<>();

                setDirtAt(worldIn, position.down());

                for (int j = 0; j <= i; j++) {
                    placeLogAt(worldIn, position.up(j), rand, config, logPos);
                }

                placeLeafAt(worldIn, position.add(0, i+1, 0), rand, config, leafPos);
                placeLeafAt(worldIn, position.add(-1, i+1, 0), rand, config, leafPos);
                placeLeafAt(worldIn, position.add(1, i+1, 0), rand, config, leafPos);
                placeLeafAt(worldIn, position.add(0, i+1, -1), rand, config, leafPos);
                placeLeafAt(worldIn, position.add(0, i+1, 1), rand, config, leafPos);

                placeLeafAt(worldIn, position.add(-1, i, 0), rand, config, leafPos);
                placeLeafAt(worldIn, position.add(1, i, 0), rand, config, leafPos);
                placeLeafAt(worldIn, position.add(0, i, -1), rand, config, leafPos);
                placeLeafAt(worldIn, position.add(0, i, 1), rand, config, leafPos);
                placeRandomLeafAt(worldIn, position.add(-1, i, -1), rand, config, leafPos);
                placeRandomLeafAt(worldIn, position.add(-1, i, 1), rand, config, leafPos);
                placeRandomLeafAt(worldIn, position.add(1, i, -1), rand, config, leafPos);
                placeRandomLeafAt(worldIn, position.add(1, i, 1), rand, config, leafPos);

                for (int x = -2; x <= 2; x++) {
                    for (int z = -2; z <= 2; z++) {
                        if (Math.abs(x) != 2 || Math.abs(z) != 2) {
                            placeLeafAt(worldIn, position.add(x, i-1, z), rand, config, leafPos);
                        }
                    }
                }

                for (BlockPos pos : BlockPos.getAllInBoxMutable(position.add(-1, i-2, -1), position.add(1, i-2, 1))) {
                    placeLeafAt(worldIn, pos, rand, config, leafPos);
                }

                if (rand.nextBoolean()) {
                    placeLeafAt(worldIn, position.add(-2, i-2, 0), rand, config, leafPos);
                    placeLeafAt(worldIn, position.add(-2, i-3, 0), rand, config, leafPos);
                } else {
                    placeLeafAt(worldIn, position.add(-1, i-3, 0), rand, config, leafPos);
                }
                if (rand.nextBoolean()) {
                    placeLeafAt(worldIn, position.add(2, i-2, 0), rand, config, leafPos);
                    placeLeafAt(worldIn, position.add(2, i-3, 0), rand, config, leafPos);
                } else {
                    placeLeafAt(worldIn, position.add(1, i-3, 0), rand, config, leafPos);
                }
                if (rand.nextBoolean()) {
                    placeLeafAt(worldIn, position.add(0, i-2, -2), rand, config, leafPos);
                    placeLeafAt(worldIn, position.add(0, i-3, -2), rand, config, leafPos);
                } else {
                    placeLeafAt(worldIn, position.add(0, i-3, -1), rand, config, leafPos);
                }
                if (rand.nextBoolean()) {
                    placeLeafAt(worldIn, position.add(0, i-2, 2), rand, config, leafPos);
                    placeLeafAt(worldIn, position.add(0, i-3, 2), rand, config, leafPos);
                } else {
                    placeLeafAt(worldIn, position.add(0, i-3, 1), rand, config, leafPos);
                }
                placeRandomerLeafAt(worldIn, position.add(-2, i-2, -1), rand, config, leafPos);
                placeRandomerLeafAt(worldIn, position.add(-2, i-2, 1), rand, config, leafPos);
                placeRandomerLeafAt(worldIn, position.add(2, i-2, -1), rand, config, leafPos);
                placeRandomerLeafAt(worldIn, position.add(2, i-2, 1), rand, config, leafPos);
                placeRandomerLeafAt(worldIn, position.add(-1, i-2, -2), rand, config, leafPos);
                placeRandomerLeafAt(worldIn, position.add(1, i-2, -2), rand, config, leafPos);
                placeRandomerLeafAt(worldIn, position.add(-1, i-2, 2), rand, config, leafPos);
                placeRandomerLeafAt(worldIn, position.add(1, i-2, 2), rand, config, leafPos);

                Set<BlockPos> decSet = Sets.newHashSet();
                MutableBoundingBox mutableBoundingBox = MutableBoundingBox.getNewBoundingBox();
                if (!config.decorators.isEmpty()) {
                    logPos.sort(Comparator.comparingInt(Vector3i::getY));
                    leafPos.sort(Comparator.comparingInt(Vector3i::getY));
                    config.decorators.forEach((decorator)->{
                        decorator.func_225576_a_(worldIn, rand, logPos, leafPos, decSet, mutableBoundingBox);
                    });
                }

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private void placeLogAt(IWorldWriter worldIn, BlockPos pos, Random rand, BaseTreeFeatureConfig config, List<BlockPos> log) {
        this.setLogState(worldIn, pos, config.trunkProvider.getBlockState(rand, pos));
        log.add(pos);
    }

    private void placeRandomLeafAt(IWorldGenerationReader world, BlockPos pos, Random rand, BaseTreeFeatureConfig config, List<BlockPos> leaf) {
        if (rand.nextBoolean()) {
            placeLeafAt(world, pos, rand, config, leaf);
        }
    }

    private void placeRandomerLeafAt(IWorldGenerationReader world, BlockPos pos, Random rand, BaseTreeFeatureConfig config, List<BlockPos> leaf) {
        if (rand.nextInt(3) == 0) {
            placeLeafAt(world, pos, rand, config, leaf);
        }
    }

    private void placeLeafAt(IWorldGenerationReader world, BlockPos pos, Random rand, BaseTreeFeatureConfig config, List<BlockPos> leaf)
    {
        if (isAirOrLeaves(world, pos))
        {
            this.setLogState(world, pos, config.leavesProvider.getBlockState(rand, pos).with(LeavesBlock.DISTANCE, 1));
            leaf.add(pos);
        }
    }

    protected final void setLogState(IWorldWriter worldIn, BlockPos pos, BlockState state) {
        worldIn.setBlockState(pos, state, 18);
    }

    public static boolean isAir(IWorldGenerationBaseReader worldIn, BlockPos pos)
    {
        if (!(worldIn instanceof net.minecraft.world.IBlockReader))
        {
            return worldIn.hasBlockState(pos, BlockState::isAir);
        }
        else
        {
            return worldIn.hasBlockState(pos, state -> state.isAir((net.minecraft.world.IBlockReader) worldIn, pos));
        }
    }

    public static boolean isAirOrLeaves(IWorldGenerationBaseReader worldIn, BlockPos pos)
    {
        if (worldIn instanceof net.minecraft.world.IWorldReader)
        {
            return worldIn.hasBlockState(pos, state -> state.canBeReplacedByLeaves((net.minecraft.world.IWorldReader) worldIn, pos));
        }
        return worldIn.hasBlockState(pos, (state) -> {
            return state.isAir() || state.isIn(BlockTags.LEAVES);
        });
    }

    public static void setDirtAt(IWorld worldIn, BlockPos pos)
    {
        Block block = worldIn.getBlockState(pos).getBlock();
        if (block == Blocks.GRASS_BLOCK || block == Blocks.FARMLAND)
        {
            worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState(), 18);
        }
    }

    public static boolean isValidGround(IWorld world, BlockPos pos)
    {
        return world.getBlockState(pos).canSustainPlant(world, pos, Direction.UP, (IPlantable) Blocks.DARK_OAK_SAPLING);
    }
}
