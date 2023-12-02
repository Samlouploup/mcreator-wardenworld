package org.samlouploup.mod.wardenworld.procedures;

import org.samlouploup.mod.wardenworld.init.WardenWorldModEntities;
import org.samlouploup.mod.wardenworld.entity.SculkGuardianEntity;
import org.samlouploup.mod.wardenworld.entity.DeepWaterSquidEntity;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

public class DeepWaterMiseAJourDuTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 200) == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new DeepWaterSquidEntity(WardenWorldModEntities.DEEP_WATER_SQUID.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 200) == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new SculkGuardianEntity(WardenWorldModEntities.SCULK_GUARDIAN.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
