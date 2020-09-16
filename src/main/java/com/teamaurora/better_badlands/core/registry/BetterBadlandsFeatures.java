package com.teamaurora.better_badlands.core.registry;

import com.teamaurora.better_badlands.common.world.biome.BetterBadlandsBiomeFeatures;
import com.teamaurora.better_badlands.common.world.gen.feature.SmallDarkOakFeature;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.registries.ForgeRegistries;

public class BetterBadlandsFeatures {
    public static final Feature<BaseTreeFeatureConfig> SMALL_DARK_OAK_TREE = new SmallDarkOakFeature(BaseTreeFeatureConfig.field_236676_a_);

    public static void generateFeatures() {
        ForgeRegistries.BIOMES.getValues().forEach(BetterBadlandsFeatures::generate);
    }

    public static void generate(Biome biome) {
        if (biome == Biomes.WOODED_BADLANDS_PLATEAU || biome == Biomes.MODIFIED_BADLANDS_PLATEAU || biome == Biomes.DARK_FOREST || biome == Biomes.DARK_FOREST_HILLS) {
            BetterBadlandsBiomeFeatures.replaceOakTrees(biome);
        }
        if (biome == Biomes.WOODED_BADLANDS_PLATEAU || biome == Biomes.MODIFIED_BADLANDS_PLATEAU) {
            BetterBadlandsBiomeFeatures.addSparseDarkOakTrees(biome);
        }
    }
}
