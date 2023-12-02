package org.samlouploup.mod.wardenworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

public class SculkCreeperQuandLeJoueurEntreEnCollisionAvecLentiteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING) == false) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 6, Explosion.BlockInteraction.NONE);
		} else {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 6, Explosion.BlockInteraction.DESTROY);
		}
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
