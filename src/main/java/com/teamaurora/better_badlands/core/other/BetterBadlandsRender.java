package com.teamaurora.better_badlands.core.other;

import com.teamaurora.better_badlands.core.registry.BetterBadlandsBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class BetterBadlandsRender {
    public static void setupRenderLayer() {
        RenderTypeLookup.setRenderLayer(BetterBadlandsBlocks.DEAD_BUSH_THATCH.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BetterBadlandsBlocks.DEAD_BUSH_THATCH_SLAB.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BetterBadlandsBlocks.DEAD_BUSH_THATCH_STAIRS.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BetterBadlandsBlocks.DEAD_BUSH_THATCH_VERTICAL_SLAB.get(), RenderType.getCutoutMipped());
    }
}
