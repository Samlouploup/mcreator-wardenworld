package org.samlouploup.mod.wardenworld.procedures;

import org.samlouploup.mod.wardenworld.network.WardenWorldModVariables;
import org.samlouploup.mod.wardenworld.init.WardenWorldModMobEffects;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class WardenFeverTickActifSurEffetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 50) == 1) {
			if (entity instanceof Player _player)
				_player.giveExperienceLevels(-((int) ((entity.getCapability(WardenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WardenWorldModVariables.PlayerVariables())).wardenmarker
						+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WardenWorldModMobEffects.WARDEN_FEVER.get()) ? _livEnt.getEffect(WardenWorldModMobEffects.WARDEN_FEVER.get()).getAmplifier() : 0))));
			entity.hurt(DamageSource.GENERIC, (float) ((entity.getCapability(WardenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WardenWorldModVariables.PlayerVariables())).wardenmarker
					+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WardenWorldModMobEffects.WARDEN_FEVER.get()) ? _livEnt.getEffect(WardenWorldModMobEffects.WARDEN_FEVER.get()).getAmplifier() : 0)));
		}
	}
}
