package com.teamaurora.better_badlands.core.other;

import com.teamabnormals.abnormals_core.core.utils.DataUtils;
import com.teamaurora.better_badlands.core.registry.BetterBadlandsBlocks;

public class BetterBadlandsData {
    public static void registerFlammables() {
        DataUtils.registerFlammable(BetterBadlandsBlocks.DEAD_BUSH_THATCH.get(), 60, 60);
        DataUtils.registerFlammable(BetterBadlandsBlocks.DEAD_BUSH_THATCH_SLAB.get(), 60, 60);
        DataUtils.registerFlammable(BetterBadlandsBlocks.DEAD_BUSH_THATCH_STAIRS.get(), 60, 60);
        DataUtils.registerFlammable(BetterBadlandsBlocks.DEAD_BUSH_THATCH_VERTICAL_SLAB.get(), 60, 60);
    }
}
