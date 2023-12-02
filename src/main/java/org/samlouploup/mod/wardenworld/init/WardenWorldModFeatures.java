
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.samlouploup.mod.wardenworld.init;

import org.samlouploup.mod.wardenworld.world.features.ores.SculkOnyxOreFeature;
import org.samlouploup.mod.wardenworld.world.features.LordTempleFeature;
import org.samlouploup.mod.wardenworld.WardenWorldMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class WardenWorldModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WardenWorldMod.MODID);
	public static final RegistryObject<Feature<?>> SCULK_ONYX_ORE = REGISTRY.register("sculk_onyx_ore", SculkOnyxOreFeature::feature);
	public static final RegistryObject<Feature<?>> LORD_TEMPLE = REGISTRY.register("lord_temple", LordTempleFeature::feature);
}
