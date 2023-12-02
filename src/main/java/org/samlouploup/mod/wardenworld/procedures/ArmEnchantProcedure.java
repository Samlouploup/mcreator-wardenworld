package org.samlouploup.mod.wardenworld.procedures;

import org.samlouploup.mod.wardenworld.init.WardenWorldModItems;
import org.samlouploup.mod.wardenworld.init.WardenWorldModEnchantments;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class ArmEnchantProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getItem().getItem());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getItem() == WardenWorldModItems.THE_LORD_ARM.get()) {
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(WardenWorldModEnchantments.WOUND_OF_WARDEN.get())) {
					_enchantments.remove(WardenWorldModEnchantments.WOUND_OF_WARDEN.get());
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
			(itemstack).enchant(WardenWorldModEnchantments.WOUND_OF_WARDEN.get(), 7);
		}
	}
}
