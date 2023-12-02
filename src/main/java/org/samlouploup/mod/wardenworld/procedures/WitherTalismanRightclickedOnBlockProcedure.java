package org.samlouploup.mod.wardenworld.procedures;

import org.samlouploup.mod.wardenworld.init.WardenWorldModEntities;
import org.samlouploup.mod.wardenworld.entity.WardenWitherEntity;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class WitherTalismanRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double ax = 0;
		double ay = 0;
		double az = 0;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SCULK && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SCULK) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.SCULK && (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.SCULK
					|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.SCULK && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.SCULK) {
				if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.WITHER_SKELETON_SKULL && (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.WITHER_SKELETON_SKULL
						|| (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.WITHER_SKELETON_SKULL && (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.WITHER_SKELETON_SKULL) {
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WITHER_SKELETON_SKULL) {
						ax = -1;
						ay = -1;
						az = -1;
						for (int index0 = 0; index0 < 3; index0++) {
							for (int index1 = 0; index1 < 3; index1++) {
								for (int index2 = 0; index2 < 3; index2++) {
									world.setBlock(new BlockPos(x + ax, y + ay, z + az), Blocks.AIR.defaultBlockState(), 3);
									ax = ax + 1;
								}
								az = az + 1;
								ax = -1;
							}
							ax = -1;
							az = -1;
							ay = ay + 1;
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new WardenWitherEntity(WardenWorldModEntities.WARDEN_WITHER.get(), _level);
							entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}
