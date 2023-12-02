
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.samlouploup.mod.wardenworld.init;

import org.samlouploup.mod.wardenworld.item.WitherTalismanItem;
import org.samlouploup.mod.wardenworld.item.WardenWorldItem;
import org.samlouploup.mod.wardenworld.item.WardenSkinItem;
import org.samlouploup.mod.wardenworld.item.WardenLordsBeltItem;
import org.samlouploup.mod.wardenworld.item.WardenHideItem;
import org.samlouploup.mod.wardenworld.item.WardenHeartItem;
import org.samlouploup.mod.wardenworld.item.WardenBoneItem;
import org.samlouploup.mod.wardenworld.item.TheLordArmItem;
import org.samlouploup.mod.wardenworld.item.SculkSwordItem;
import org.samlouploup.mod.wardenworld.item.SculkPickaxeItem;
import org.samlouploup.mod.wardenworld.item.SculkOnyxItem;
import org.samlouploup.mod.wardenworld.item.SculkItem;
import org.samlouploup.mod.wardenworld.item.SculkHoeItem;
import org.samlouploup.mod.wardenworld.item.DeepWaterItem;
import org.samlouploup.mod.wardenworld.WardenWorldMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class WardenWorldModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WardenWorldMod.MODID);
	public static final RegistryObject<Item> WARDEN_WORLD = REGISTRY.register("warden_world", () -> new WardenWorldItem());
	public static final RegistryObject<Item> DEEP_WATER_BUCKET = REGISTRY.register("deep_water_bucket", () -> new DeepWaterItem());
	public static final RegistryObject<Item> ITEM_SCULK_CATALYST = block(WardenWorldModBlocks.ITEM_SCULK_CATALYST, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> THE_SCULK_LORD_SPAWN_EGG = REGISTRY.register("the_sculk_lord_spawn_egg",
			() -> new ForgeSpawnEggItem(WardenWorldModEntities.THE_SCULK_LORD, -16776808, -16757573, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LITTLE_WARDEN_SPAWN_EGG = REGISTRY.register("little_warden_spawn_egg",
			() -> new ForgeSpawnEggItem(WardenWorldModEntities.LITTLE_WARDEN, -15530021, -16513287, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCULK_CREEPER_SPAWN_EGG = REGISTRY.register("sculk_creeper_spawn_egg",
			() -> new ForgeSpawnEggItem(WardenWorldModEntities.SCULK_CREEPER, -16775636, -16767745, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> WARDEN_SKIN = REGISTRY.register("warden_skin", () -> new WardenSkinItem());
	public static final RegistryObject<Item> WARDEN_HIDE_HELMET = REGISTRY.register("warden_hide_helmet", () -> new WardenHideItem.Helmet());
	public static final RegistryObject<Item> WARDEN_HIDE_CHESTPLATE = REGISTRY.register("warden_hide_chestplate", () -> new WardenHideItem.Chestplate());
	public static final RegistryObject<Item> WARDEN_HIDE_LEGGINGS = REGISTRY.register("warden_hide_leggings", () -> new WardenHideItem.Leggings());
	public static final RegistryObject<Item> WARDEN_HIDE_BOOTS = REGISTRY.register("warden_hide_boots", () -> new WardenHideItem.Boots());
	public static final RegistryObject<Item> WARDEN_HEART = REGISTRY.register("warden_heart", () -> new WardenHeartItem());
	public static final RegistryObject<Item> WARDEN_BONE = REGISTRY.register("warden_bone", () -> new WardenBoneItem());
	public static final RegistryObject<Item> SCULK_PICKAXE = REGISTRY.register("sculk_pickaxe", () -> new SculkPickaxeItem());
	public static final RegistryObject<Item> SCULK_SWORD = REGISTRY.register("sculk_sword", () -> new SculkSwordItem());
	public static final RegistryObject<Item> SCULK_HOE = REGISTRY.register("sculk_hoe", () -> new SculkHoeItem());
	public static final RegistryObject<Item> SCULK_HELMET = REGISTRY.register("sculk_helmet", () -> new SculkItem.Helmet());
	public static final RegistryObject<Item> SCULK_CHESTPLATE = REGISTRY.register("sculk_chestplate", () -> new SculkItem.Chestplate());
	public static final RegistryObject<Item> SCULK_LEGGINGS = REGISTRY.register("sculk_leggings", () -> new SculkItem.Leggings());
	public static final RegistryObject<Item> SCULK_BOOTS = REGISTRY.register("sculk_boots", () -> new SculkItem.Boots());
	public static final RegistryObject<Item> WARDEN_LORDS_BELT = REGISTRY.register("warden_lords_belt", () -> new WardenLordsBeltItem());
	public static final RegistryObject<Item> WITHER_TALISMAN = REGISTRY.register("wither_talisman", () -> new WitherTalismanItem());
	public static final RegistryObject<Item> THE_LORD_ARM = REGISTRY.register("the_lord_arm", () -> new TheLordArmItem());
	public static final RegistryObject<Item> WARDEN_WITHER_SPAWN_EGG = REGISTRY.register("warden_wither_spawn_egg",
			() -> new ForgeSpawnEggItem(WardenWorldModEntities.WARDEN_WITHER, -16777216, -16773712, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCULK_ONYX_ORE = block(WardenWorldModBlocks.SCULK_ONYX_ORE, null);
	public static final RegistryObject<Item> SCULK_ONYX_BLOCK = block(WardenWorldModBlocks.SCULK_ONYX_BLOCK, null);
	public static final RegistryObject<Item> SCULK_ONYX = REGISTRY.register("sculk_onyx", () -> new SculkOnyxItem());
	public static final RegistryObject<Item> SCULK_SPIDER_SPAWN_EGG = REGISTRY.register("sculk_spider_spawn_egg",
			() -> new ForgeSpawnEggItem(WardenWorldModEntities.SCULK_SPIDER, -16764058, -13421773, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> WARDEN_CAT_SPAWN_EGG = REGISTRY.register("warden_cat_spawn_egg", () -> new ForgeSpawnEggItem(WardenWorldModEntities.WARDEN_CAT, -16777216, -16764109, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCULK_GUARDIAN_SPAWN_EGG = REGISTRY.register("sculk_guardian_spawn_egg",
			() -> new ForgeSpawnEggItem(WardenWorldModEntities.SCULK_GUARDIAN, -16777063, -16777114, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DEEP_WATER_SQUID_SPAWN_EGG = REGISTRY.register("deep_water_squid_spawn_egg",
			() -> new ForgeSpawnEggItem(WardenWorldModEntities.DEEP_WATER_SQUID, -6750055, -3407668, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCULK_BLAZE_SPAWN_EGG = REGISTRY.register("sculk_blaze_spawn_egg",
			() -> new ForgeSpawnEggItem(WardenWorldModEntities.SCULK_BLAZE, -16777063, -13434676, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCULKY_PIG_SPAWN_EGG = REGISTRY.register("sculky_pig_spawn_egg", () -> new ForgeSpawnEggItem(WardenWorldModEntities.SCULKY_PIG, -26113, -16776961, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
