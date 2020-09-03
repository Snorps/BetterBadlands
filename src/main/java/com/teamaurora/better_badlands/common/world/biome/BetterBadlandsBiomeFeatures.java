package com.teamaurora.better_badlands.common.world.biome;

import com.teamaurora.better_badlands.core.registry.BetterBadlandsFeatures;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;

import java.util.ArrayList;
import java.util.List;

public class BetterBadlandsBiomeFeatures {
    public static BlockState DARK_OAK_LOG = Blocks.DARK_OAK_LOG.getDefaultState();
    public static BlockState DARK_OAK_LEAVES = Blocks.DARK_OAK_LEAVES.getDefaultState();

    public static final BaseTreeFeatureConfig SMALL_DARK_OAK_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(DARK_OAK_LOG), new SimpleBlockStateProvider(DARK_OAK_LEAVES), null, null, null)).func_236700_a_().build();

    public static void replaceOakTrees(Biome biome) {
        List<ConfiguredFeature<?, ?>> list = biome.getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
        List<ConfiguredFeature<?, ?>> toRemove = new ArrayList<>();
        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            ConfiguredFeature<?, ?> configuredFeature = list.get(i);
            if (configuredFeature.config instanceof DecoratedFeatureConfig) {
                DecoratedFeatureConfig decorated = (DecoratedFeatureConfig) configuredFeature.config;
                if (decorated.feature.config instanceof BaseTreeFeatureConfig && decorated.feature.feature instanceof TreeFeature) {
                    BaseTreeFeatureConfig treeCfg = (BaseTreeFeatureConfig) decorated.feature.config;
                    ConfiguredFeature<?, ?> cfgdTree = new ConfiguredFeature<>((TreeFeature)decorated.feature.feature, (BaseTreeFeatureConfig)decorated.feature.config);
                    if (treeCfg == DefaultBiomeFeatures.OAK_TREE_CONFIG) {
                        cfgdTree = BetterBadlandsFeatures.SMALL_DARK_OAK_TREE.withConfiguration(SMALL_DARK_OAK_CONFIG);
                    }
                    ConfiguredFeature<DecoratedFeatureConfig, ?> tempFeature = new ConfiguredFeature<DecoratedFeatureConfig, DecoratedFeature>(
                            (DecoratedFeature) configuredFeature.feature, new DecoratedFeatureConfig(
                            cfgdTree, decorated.decorator
                    ));
                    biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, tempFeature);
                    toRemove.add(configuredFeature);
                }
            }
        }
        for (int i = 0; i < toRemove.size(); i++) {
            list.remove(toRemove.get(i));
        }
    }
}
