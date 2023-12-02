
package org.samlouploup.mod.wardenworld.client.renderer;

import org.samlouploup.mod.wardenworld.entity.DeepWaterSquidEntity;
import org.samlouploup.mod.wardenworld.client.model.Modelsquid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DeepWaterSquidRenderer extends MobRenderer<DeepWaterSquidEntity, Modelsquid<DeepWaterSquidEntity>> {
	public DeepWaterSquidRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsquid(context.bakeLayer(Modelsquid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DeepWaterSquidEntity entity) {
		return new ResourceLocation("warden_world:textures/entities/deep_water_squid.png");
	}
}
