package org.samlouploup.mod.wardenworld.procedures;

import org.samlouploup.mod.wardenworld.init.WardenWorldModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SculkGuardianConditionDapparitionNaturelleDeLentiteProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock() == WardenWorldModBlocks.DEEP_WATER.get()) {
			return true;
		}
		return false;
	}
}
