package org.samlouploup.mod.wardenworld.procedures;

import org.samlouploup.mod.wardenworld.network.WardenWorldModVariables;
import org.samlouploup.mod.wardenworld.init.WardenWorldModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class WardenFeverQuandLeffetCommenceEstAppliqueProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:warden_entity")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WardenWorldModMobEffects.WARDEN_FEVER.get());
		} else {
			{
				double _setval = (entity.getCapability(WardenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WardenWorldModVariables.PlayerVariables())).wardenmarker + Mth.nextInt(RandomSource.create(), 1,
						(int) (2 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WardenWorldModMobEffects.WARDEN_FEVER.get()) ? _livEnt.getEffect(WardenWorldModMobEffects.WARDEN_FEVER.get()).getAmplifier() : 0)));
				entity.getCapability(WardenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.wardenmarker = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
