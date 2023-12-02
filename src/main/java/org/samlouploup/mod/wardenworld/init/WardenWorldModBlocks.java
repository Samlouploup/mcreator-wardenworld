
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.samlouploup.mod.wardenworld.init;

import org.samlouploup.mod.wardenworld.block.WardenWorldPortalBlock;
import org.samlouploup.mod.wardenworld.block.SculkOnyxOreBlock;
import org.samlouploup.mod.wardenworld.block.SculkOnyxBlockBlock;
import org.samlouploup.mod.wardenworld.block.ItemSculkCatalystBlock;
import org.samlouploup.mod.wardenworld.block.DeepWaterBlock;
import org.samlouploup.mod.wardenworld.WardenWorldMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class WardenWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WardenWorldMod.MODID);
	public static final RegistryObject<Block> WARDEN_WORLD_PORTAL = REGISTRY.register("warden_world_portal", () -> new WardenWorldPortalBlock());
	public static final RegistryObject<Block> DEEP_WATER = REGISTRY.register("deep_water", () -> new DeepWaterBlock());
	public static final RegistryObject<Block> ITEM_SCULK_CATALYST = REGISTRY.register("item_sculk_catalyst", () -> new ItemSculkCatalystBlock());
	public static final RegistryObject<Block> SCULK_ONYX_ORE = REGISTRY.register("sculk_onyx_ore", () -> new SculkOnyxOreBlock());
	public static final RegistryObject<Block> SCULK_ONYX_BLOCK = REGISTRY.register("sculk_onyx_block", () -> new SculkOnyxBlockBlock());
}
