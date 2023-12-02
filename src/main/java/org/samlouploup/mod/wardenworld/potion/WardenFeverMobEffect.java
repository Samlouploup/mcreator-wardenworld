
package org.samlouploup.mod.wardenworld.potion;

import org.samlouploup.mod.wardenworld.procedures.WardenFeverTickActifSurEffetProcedure;
import org.samlouploup.mod.wardenworld.procedures.WardenFeverQuandLeffetExpireProcedure;
import org.samlouploup.mod.wardenworld.procedures.WardenFeverQuandLeffetCommenceEstAppliqueProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WardenFeverMobEffect extends MobEffect {
	public WardenFeverMobEffect() {
		super(MobEffectCategory.HARMFUL, -16773266);
	}

	@Override
	public String getDescriptionId() {
		return "effect.warden_world.warden_fever";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		WardenFeverQuandLeffetCommenceEstAppliqueProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		WardenFeverTickActifSurEffetProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		WardenFeverQuandLeffetExpireProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
