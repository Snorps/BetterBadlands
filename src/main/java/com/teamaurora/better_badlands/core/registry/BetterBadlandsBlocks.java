package com.teamaurora.better_badlands.core.registry;

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
}
