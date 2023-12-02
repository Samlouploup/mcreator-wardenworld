package org.samlouploup.mod.wardenworld.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.Entity;

public class SculkSpiderQuandLentiteEstBlesseeProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		for (int index0 = 0; index0 < 5; index0++) {
			sourceentity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
		}
	}
}
