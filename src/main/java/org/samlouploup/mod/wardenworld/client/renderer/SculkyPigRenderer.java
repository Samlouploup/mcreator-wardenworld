
package org.samlouploup.mod.wardenworld.client.renderer;

import org.samlouploup.mod.wardenworld.entity.SculkyPigEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

public class SculkyPigRenderer extends MobRenderer<SculkyPigEntity, PigModel<SculkyPigEntity>> {
	public SculkyPigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SculkyPigEntity entity) {
		return new ResourceLocation("warden_world:textures/entities/warden_pig.png");
	}
}
