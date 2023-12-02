
package org.samlouploup.mod.wardenworld.client.renderer;

import org.samlouploup.mod.wardenworld.entity.SculkGuardianEntity;
import org.samlouploup.mod.wardenworld.client.model.Modelguardian;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SculkGuardianRenderer extends MobRenderer<SculkGuardianEntity, Modelguardian<SculkGuardianEntity>> {
	public SculkGuardianRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelguardian(context.bakeLayer(Modelguardian.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SculkGuardianEntity entity) {
		return new ResourceLocation("warden_world:textures/entities/sculk_guardian.png");
	}
}
