package com.teamaurora.better_badlands.core.registry;

import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.teamabnormals.abnormals_core.common.blocks.thatch.ThatchBlock;
import com.teamabnormals.abnormals_core.common.blocks.thatch.ThatchSlabBlock;
import com.teamabnormals.abnormals_core.common.blocks.thatch.ThatchStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.thatch.ThatchVerticalSlabBlock;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;
import com.teamaurora.better_badlands.common.block.*;
import com.teamaurora.better_badlands.core.BetterBadlands;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("deprecation")
@Mod.EventBusSubscriber(modid = BetterBadlands.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterBadlandsBlocks {
    public static final RegistryHelper HELPER = BetterBadlands.REGISTRY_HELPER;

    public static final RegistryObject<Block> DEAD_BUSH_THATCH = HELPER.createBlock("dead_bush_thatch", () -> new BrittleThatchBlock(AbstractBlock.Properties.from(Blocks.HAY_BLOCK).notSolid().harvestTool(ToolType.HOE)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_BUSH_THATCH_SLAB = HELPER.createBlock("dead_bush_thatch_slab", () -> new BrittleThatchSlabBlock(AbstractBlock.Properties.from(Blocks.HAY_BLOCK).notSolid().harvestTool(ToolType.HOE)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_BUSH_THATCH_STAIRS = HELPER.createBlock("dead_bush_thatch_stairs", () -> new BrittleThatchStairsBlock(DEAD_BUSH_THATCH.get().getDefaultState(), AbstractBlock.Properties.from(Blocks.HAY_BLOCK).notSolid().harvestTool(ToolType.HOE)), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> DEAD_BUSH_THATCH_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "dead_bush_thatch_vertical_slab", () -> new BrittleThatchVerticalSlabBlock(AbstractBlock.Properties.from(DEAD_BUSH_THATCH.get()).notSolid()), ItemGroup.BUILDING_BLOCKS);

    // brother may i have L A M P
    public static final RegistryObject<Block> TERRACOTTA_LAMP_LIGHT_SOURCE = HELPER.createBlock("light_source", ()->new MagicInvisibleLightBlock(AbstractBlock.Properties.create(Material.AIR).setLightLevel((a)->{return 13;})), null);

    public static final RegistryObject<Block> TERRACOTTA_LAMP = HELPER.createBlock("terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BLACK_TERRACOTTA_LAMP = HELPER.createBlock("black_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> RED_TERRACOTTA_LAMP = HELPER.createBlock("red_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_LAMP = HELPER.createBlock("green_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_LAMP = HELPER.createBlock("brown_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_LAMP = HELPER.createBlock("blue_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_LAMP = HELPER.createBlock("purple_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_LAMP = HELPER.createBlock("cyan_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_LAMP = HELPER.createBlock("light_gray_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_LAMP = HELPER.createBlock("gray_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> PINK_TERRACOTTA_LAMP = HELPER.createBlock("pink_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> LIME_TERRACOTTA_LAMP = HELPER.createBlock("lime_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_LAMP = HELPER.createBlock("yellow_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_LAMP = HELPER.createBlock("light_blue_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_LAMP = HELPER.createBlock("magenta_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_LAMP = HELPER.createBlock("orange_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_LAMP = HELPER.createBlock("white_terracotta_lamp", ()->new TerracottaLampBlock(AbstractBlock.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);
}
