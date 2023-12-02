package org.samlouploup.mod.wardenworld.procedures;

import org.samlouploup.mod.wardenworld.init.WardenWorldModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class LittleWardenQuandLentiteMeurtProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(WardenWorldModMobEffects.WARDEN_FEVER.get(), 1000, 0, false, false));
	}
}
