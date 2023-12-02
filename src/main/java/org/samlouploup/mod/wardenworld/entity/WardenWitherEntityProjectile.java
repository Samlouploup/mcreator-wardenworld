
package org.samlouploup.mod.wardenworld.entity;

import org.samlouploup.mod.wardenworld.init.WardenWorldModEntities;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class WardenWitherEntityProjectile extends AbstractArrow implements ItemSupplier {
	public WardenWitherEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(WardenWorldModEntities.WARDEN_WITHER_PROJECTILE.get(), world);
	}

	public WardenWitherEntityProjectile(EntityType<? extends WardenWitherEntityProjectile> type, Level world) {
		super(type, world);
	}

	public WardenWitherEntityProjectile(EntityType<? extends WardenWitherEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public WardenWitherEntityProjectile(EntityType<? extends WardenWitherEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.SCULK);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.SCULK);
	}
}
