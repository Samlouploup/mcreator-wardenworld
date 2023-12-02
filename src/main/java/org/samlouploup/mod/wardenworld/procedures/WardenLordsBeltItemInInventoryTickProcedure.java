package org.samlouploup.mod.wardenworld.procedures;

import org.samlouploup.mod.wardenworld.network.WardenWorldModVariables;
import org.samlouploup.mod.wardenworld.init.WardenWorldModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class WardenLordsBeltItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(WardenWorldModMobEffects.WARDEN_FEVER.get());
		{
			double _setval = 0;
			entity.getCapability(WardenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.wardenmarker = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, false, false));
	}
}
