package org.samlouploup.mod.wardenworld.procedures;

import org.samlouploup.mod.wardenworld.network.WardenWorldModVariables;
import org.samlouploup.mod.wardenworld.init.WardenWorldModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class TheSculkLordQuandLentiteEstBlesseeProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (1 == Mth.nextInt(RandomSource.create(), 1, 25)) {
			{
				double _setval = (sourceentity.getCapability(WardenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WardenWorldModVariables.PlayerVariables())).wardenmarker + 1;
				sourceentity.getCapability(WardenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.wardenmarker = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			if (sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(WardenWorldModMobEffects.WARDEN_FEVER.get(), 2000, 2, false, false));
		}
	}
}
