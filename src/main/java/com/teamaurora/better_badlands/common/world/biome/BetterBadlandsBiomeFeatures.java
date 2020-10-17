package com.teamaurora.better_badlands.common.world.biome;

import com.teamaurora.better_badlands.core.registry.BetterBadlandsFeatures;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;

import java.util.ArrayList;
import java.util.List;

public class BetterBadlandsBiomeFeatures {
    public static BlockState DARK_OAK_LOG = Blocks.DARK_OAK_LOG.getDefaultState();
    public static BlockState DARK_OAK_LEAVES = Blocks.DARK_OAK_LEAVES.getDefaultState();

    public static final BaseTreeFeatureConfig SMALL_DARK_OAK_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(DARK_OAK_LOG), new SimpleBlockStateProvider(DARK_OAK_LEAVES), null, null, null)).func_236700_a_().build();

    public static void addSparseDarkOakTrees(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BetterBadlandsFeatures.SMALL_DARK_OAK_TREE.get().withConfiguration(SMALL_DARK_OAK_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }

    public static void replaceOakTrees(Biome biome) {
        List<ConfiguredFeature<?, ?>> list = biome.getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
        List<ConfiguredFeature<?, ?>> toRemove = new ArrayList<>();
        int listSize = list.size();
        
        if (biome.getRegistryName().toString().equals("minecraft:wooded_badlands_plateau")) {
            int fuck = 0;
        }

        for (int i = 0; i < listSize; i++) {
            ConfiguredFeature<?, ?> configuredFeature = list.get(i);
            if (configuredFeature.config instanceof DecoratedFeatureConfig) {
                DecoratedFeatureConfig decorated = (DecoratedFeatureConfig) configuredFeature.config;
                if (decorated.feature.config instanceof BaseTreeFeatureConfig && decorated.feature.feature instanceof TreeFeature) {
                    BaseTreeFeatureConfig treeCfg = (BaseTreeFeatureConfig) decorated.feature.config;
                    ConfiguredFeature<?, ?> cfgdTree = new ConfiguredFeature<>((TreeFeature)decorated.feature.feature, (BaseTreeFeatureConfig)decorated.feature.config);
                    if (treeCfg == DefaultBiomeFeatures.OAK_TREE_CONFIG) {
                        cfgdTree = BetterBadlandsFeatures.SMALL_DARK_OAK_TREE.get().withConfiguration(SMALL_DARK_OAK_CONFIG);
                    }
                    ConfiguredFeature<DecoratedFeatureConfig, ?> tempFeature = new ConfiguredFeature<DecoratedFeatureConfig, DecoratedFeature>(
                            (DecoratedFeature) configuredFeature.feature, new DecoratedFeatureConfig(
                            cfgdTree, decorated.decorator
                    ));
                    biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, tempFeature);
                    toRemove.add(configuredFeature);
                } else if (decorated.feature.config instanceof MultipleRandomFeatureConfig) {
                    MultipleRandomFeatureConfig tree = (MultipleRandomFeatureConfig) decorated.feature.config;
                    List<ConfiguredRandomFeatureList<?>> tempFeatures = new ArrayList<>();
                    for (ConfiguredRandomFeatureList crfl : tree.features) {
                        if (crfl.feature.feature instanceof TreeFeature) {
                            if (crfl.feature.config == DefaultBiomeFeatures.OAK_TREE_CONFIG) {
                                tempFeatures.add(new ConfiguredRandomFeatureList<BaseTreeFeatureConfig>(BetterBadlandsFeatures.SMALL_DARK_OAK_TREE.get().withConfiguration(SMALL_DARK_OAK_CONFIG), crfl.chance));
                            } else {
                                tempFeatures.add(crfl);
                            }
                        } else {
                            tempFeatures.add(crfl);
                        }
                    }
                    if (tree.defaultFeature.feature instanceof TreeFeature && tree.defaultFeature.config instanceof BaseTreeFeatureConfig) {
                        BaseTreeFeatureConfig tempDefCfg = (BaseTreeFeatureConfig) tree.defaultFeature.config;
                        Feature<BaseTreeFeatureConfig> tempDef2 = (Feature<BaseTreeFeatureConfig>) tree.defaultFeature.feature;
                        //if (((BaseTreeFeatureConfig) tree.defaultFeature.config).leavesProvider.getBlockState(probeRand, probePos).getBlock() == Blocks.OAK_LEAVES) {
                        BaseTreeFeatureConfig treeCfg = (BaseTreeFeatureConfig) tree.defaultFeature.config;
                        if (treeCfg == DefaultBiomeFeatures.OAK_TREE_CONFIG) {
                            tempDefCfg = SMALL_DARK_OAK_CONFIG;
                            tempDef2 = BetterBadlandsFeatures.SMALL_DARK_OAK_TREE.get();
                        }
                        ConfiguredFeature<?, ?> tempDef = new ConfiguredFeature<BaseTreeFeatureConfig, Feature<BaseTreeFeatureConfig>>(tempDef2, tempDefCfg);
                        ConfiguredFeature<DecoratedFeatureConfig, ?> tempFeature = new ConfiguredFeature<DecoratedFeatureConfig, DecoratedFeature>(
                                (DecoratedFeature) configuredFeature.feature, new DecoratedFeatureConfig(
                                new ConfiguredFeature<MultipleRandomFeatureConfig, Feature<MultipleRandomFeatureConfig>>((Feature<MultipleRandomFeatureConfig>) decorated.feature.feature,
                                        new MultipleRandomFeatureConfig(tempFeatures, tempDef)
                                ), decorated.decorator
                        ));
                        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, tempFeature);
                    } else {
                        ConfiguredFeature<DecoratedFeatureConfig, ?> tempFeature = new ConfiguredFeature<DecoratedFeatureConfig, DecoratedFeature>(
                                (DecoratedFeature) configuredFeature.feature, new DecoratedFeatureConfig(
                                new ConfiguredFeature<MultipleRandomFeatureConfig, Feature<MultipleRandomFeatureConfig>>((Feature<MultipleRandomFeatureConfig>) decorated.feature.feature,
                                        new MultipleRandomFeatureConfig(tempFeatures, tree.defaultFeature)
                                ), decorated.decorator
                        ));
                        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, tempFeature);
                    }
                    toRemove.add(configuredFeature);
                }
            }
        }
        for (int i = 0; i < toRemove.size(); i++) {
            list.remove(toRemove.get(i));
        }
    }
}
