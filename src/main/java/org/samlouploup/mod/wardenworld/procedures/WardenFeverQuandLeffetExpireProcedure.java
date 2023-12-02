package org.samlouploup.mod.wardenworld.procedures;

import org.samlouploup.mod.wardenworld.network.WardenWorldModVariables;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class WardenFeverQuandLeffetExpireProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(WardenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WardenWorldModVariables.PlayerVariables())).wardenmarker - Mth.nextInt(RandomSource.create(), -1, 1);
			entity.getCapability(WardenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.wardenmarker = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
