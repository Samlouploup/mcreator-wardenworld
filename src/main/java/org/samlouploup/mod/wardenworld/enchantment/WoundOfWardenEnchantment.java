
package org.samlouploup.mod.wardenworld.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

public class WoundOfWardenEnchantment extends Enchantment {
	public WoundOfWardenEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.BANE_OF_ARTHROPODS, Enchantments.VANISHING_CURSE, Enchantments.BINDING_CURSE, Enchantments.SMITE, Enchantments.SHARPNESS).contains(ench);
	}
}
