package com.teamaurora.better_badlands.core.registry;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.teamabnormals.abnormals_core.common.blocks.thatch.ThatchBlock;
import com.teamabnormals.abnormals_core.common.blocks.thatch.ThatchSlabBlock;
import com.teamabnormals.abnormals_core.common.blocks.thatch.ThatchStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.thatch.ThatchVerticalSlabBlock;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;
import com.teamaurora.better_badlands.common.block.BrittleThatchBlock;
import com.teamaurora.better_badlands.common.block.BrittleThatchSlabBlock;
import com.teamaurora.better_badlands.common.block.BrittleThatchStairsBlock;
import com.teamaurora.better_badlands.common.block.BrittleThatchVerticalSlabBlock;
import com.teamaurora.better_badlands.core.BetterBadlands;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("deprecation")
@Mod.EventBusSubscriber(modid = BetterBadlands.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterBadlandsBlocks {
    public static final RegistryHelper HELPER = BetterBadlands.REGISTRY_HELPER;

    public static final RegistryObject<Block> DEAD_BUSH_THATCH = HELPER.createBlock("dead_bush_thatch", () -> new BrittleThatchBlock(AbstractBlock.Properties.from(Blocks.HAY_BLOCK).notSolid().harvestTool(ToolType.AXE)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_BUSH_THATCH_SLAB = HELPER.createBlock("dead_bush_thatch_slab", () -> new BrittleThatchSlabBlock(AbstractBlock.Properties.from(Blocks.HAY_BLOCK).notSolid().harvestTool(ToolType.AXE)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_BUSH_THATCH_STAIRS = HELPER.createBlock("dead_bush_thatch_stairs", () -> new BrittleThatchStairsBlock(DEAD_BUSH_THATCH.get().getDefaultState(), AbstractBlock.Properties.from(Blocks.HAY_BLOCK).notSolid().harvestTool(ToolType.AXE)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_BUSH_THATCH_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "dead_bush_thatch_vertical_slab", () -> new BrittleThatchVerticalSlabBlock(AbstractBlock.Properties.from(DEAD_BUSH_THATCH.get()).notSolid()), ItemGroup.BUILDING_BLOCKS);

    // hell
    public static final RegistryObject<Block> TERRACOTTA_SLAB = HELPER.createBlock("terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = HELPER.createBlock("black_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = HELPER.createBlock("red_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = HELPER.createBlock("green_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = HELPER.createBlock("brown_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = HELPER.createBlock("blue_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = HELPER.createBlock("purple_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = HELPER.createBlock("cyan_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = HELPER.createBlock("light_gray_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = HELPER.createBlock("gray_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = HELPER.createBlock("pink_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = HELPER.createBlock("lime_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = HELPER.createBlock("yellow_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = HELPER.createBlock("light_blue_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = HELPER.createBlock("magenta_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = HELPER.createBlock("orange_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = HELPER.createBlock("white_terracotta_slab", () -> new SlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);

    // hell 2
    public static final RegistryObject<Block> TERRACOTTA_STAIRS = HELPER.createBlock("terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = HELPER.createBlock("black_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = HELPER.createBlock("red_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = HELPER.createBlock("green_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = HELPER.createBlock("brown_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = HELPER.createBlock("blue_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = HELPER.createBlock("purple_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = HELPER.createBlock("cyan_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = HELPER.createBlock("light_gray_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_STAIRS = HELPER.createBlock("gray_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = HELPER.createBlock("pink_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = HELPER.createBlock("lime_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = HELPER.createBlock("yellow_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = HELPER.createBlock("light_blue_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = HELPER.createBlock("magenta_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = HELPER.createBlock("orange_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = HELPER.createBlock("white_terracotta_stairs", () -> new AbnormalsStairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);

    // HELL 3: NOW WITH QUARK COMPAT
    public static final RegistryObject<Block> TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "black_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "red_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "green_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "brown_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "blue_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "purple_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "cyan_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "light_gray_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "gray_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "pink_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "lime_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "yellow_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "light_blue_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "magenta_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "orange_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "white_terracotta_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.BUILDING_BLOCKS);
}
