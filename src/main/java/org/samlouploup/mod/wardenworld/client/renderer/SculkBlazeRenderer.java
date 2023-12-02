
package org.samlouploup.mod.wardenworld.client.renderer;

import org.samlouploup.mod.wardenworld.entity.SculkBlazeEntity;
import org.samlouploup.mod.wardenworld.client.model.Modelcustom_model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SculkBlazeRenderer extends MobRenderer<SculkBlazeEntity, Modelcustom_model<SculkBlazeEntity>> {
	public SculkBlazeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SculkBlazeEntity entity) {
		return new ResourceLocation("warden_world:textures/entities/sculk_blaze.png");
	}
}
