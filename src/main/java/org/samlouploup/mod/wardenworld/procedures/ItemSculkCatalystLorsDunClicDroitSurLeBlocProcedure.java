package org.samlouploup.mod.wardenworld.procedures;

import org.samlouploup.mod.wardenworld.init.WardenWorldModItems;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.ParticleTypes;

public class ItemSculkCatalystLorsDunClicDroitSurLeBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= 15) {
			if (Items.GOAT_HORN == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(WardenWorldModItems.WARDEN_WORLD.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (entity instanceof Player _player)
					_player.giveExperienceLevels(-(15));
				for (int index0 = 0; index0 < 20; index0++) {
					world.addParticle(ParticleTypes.SCULK_CHARGE_POP, (Mth.nextDouble(RandomSource.create(), -1, 1) + x), y, (Mth.nextDouble(RandomSource.create(), -1, 1) + z), 0, 0.3, 0);
				}
			} else if (Items.NETHERITE_PICKAXE == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WardenWorldModItems.SCULK_ONYX.get())) : false) {
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(15));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(WardenWorldModItems.SCULK_ONYX.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WardenWorldModItems.SCULK_PICKAXE.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					for (int index1 = 0; index1 < 20; index1++) {
						world.addParticle(ParticleTypes.SCULK_CHARGE_POP, (Mth.nextDouble(RandomSource.create(), -1, 1) + x), y, (Mth.nextDouble(RandomSource.create(), -1, 1) + z), 0, 0.3, 0);
					}
				}
			} else if (Items.NETHERITE_HELMET == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WardenWorldModItems.SCULK_ONYX.get())) : false) {
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(15));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(WardenWorldModItems.SCULK_ONYX.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WardenWorldModItems.SCULK_HELMET.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					for (int index2 = 0; index2 < 20; index2++) {
						world.addParticle(ParticleTypes.SCULK_CHARGE_POP, (Mth.nextDouble(RandomSource.create(), -1, 1) + x), y, (Mth.nextDouble(RandomSource.create(), -1, 1) + z), 0, 0.3, 0);
					}
				}
			} else if (Items.NETHERITE_CHESTPLATE == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WardenWorldModItems.SCULK_ONYX.get())) : false) {
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(15));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(WardenWorldModItems.SCULK_ONYX.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WardenWorldModItems.SCULK_CHESTPLATE.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					for (int index3 = 0; index3 < 20; index3++) {
						world.addParticle(ParticleTypes.SCULK_CHARGE_POP, (Mth.nextDouble(RandomSource.create(), -1, 1) + x), y, (Mth.nextDouble(RandomSource.create(), -1, 1) + z), 0, 0.3, 0);
					}
				}
			} else if (Items.NETHERITE_LEGGINGS == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WardenWorldModItems.SCULK_ONYX.get())) : false) {
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(15));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(WardenWorldModItems.SCULK_ONYX.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WardenWorldModItems.SCULK_LEGGINGS.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					for (int index4 = 0; index4 < 20; index4++) {
						world.addParticle(ParticleTypes.SCULK_CHARGE_POP, (Mth.nextDouble(RandomSource.create(), -1, 1) + x), y, (Mth.nextDouble(RandomSource.create(), -1, 1) + z), 0, 0.3, 0);
					}
				}
			} else if (Items.NETHERITE_BOOTS == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WardenWorldModItems.SCULK_ONYX.get())) : false) {
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(15));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(WardenWorldModItems.SCULK_ONYX.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WardenWorldModItems.SCULK_BOOTS.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					for (int index5 = 0; index5 < 20; index5++) {
						world.addParticle(ParticleTypes.SCULK_CHARGE_POP, (Mth.nextDouble(RandomSource.create(), -1, 1) + x), y, (Mth.nextDouble(RandomSource.create(), -1, 1) + z), 0, 0.3, 0);
					}
				}
			} else if (Items.NETHERITE_SWORD == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WardenWorldModItems.SCULK_ONYX.get())) : false) {
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(15));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(WardenWorldModItems.SCULK_ONYX.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WardenWorldModItems.SCULK_SWORD.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					for (int index6 = 0; index6 < 20; index6++) {
						world.addParticle(ParticleTypes.SCULK_CHARGE_POP, (Mth.nextDouble(RandomSource.create(), -1, 1) + x), y, (Mth.nextDouble(RandomSource.create(), -1, 1) + z), 0, 0.3, 0);
					}
				}
			} else if (Items.NETHERITE_HOE == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WardenWorldModItems.SCULK_ONYX.get())) : false) {
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(15));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(WardenWorldModItems.SCULK_ONYX.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WardenWorldModItems.SCULK_HOE.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					for (int index7 = 0; index7 < 20; index7++) {
						world.addParticle(ParticleTypes.SCULK_CHARGE_POP, (Mth.nextDouble(RandomSource.create(), -1, 1) + x), y, (Mth.nextDouble(RandomSource.create(), -1, 1) + z), 0, 0.3, 0);
					}
				}
			}
		}
	}
}
