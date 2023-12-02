
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.samlouploup.mod.wardenworld.init;

import org.samlouploup.mod.wardenworld.enchantment.WoundOfWardenEnchantment;
import org.samlouploup.mod.wardenworld.WardenWorldMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class WardenWorldModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, WardenWorldMod.MODID);
	public static final RegistryObject<Enchantment> WOUND_OF_WARDEN = REGISTRY.register("wound_of_warden", () -> new WoundOfWardenEnchantment());
}
