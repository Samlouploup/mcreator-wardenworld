
package org.samlouploup.mod.wardenworld.client.renderer;

import org.samlouploup.mod.wardenworld.entity.SculkCreeperEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

public class SculkCreeperRenderer extends MobRenderer<SculkCreeperEntity, CreeperModel<SculkCreeperEntity>> {
	public SculkCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SculkCreeperEntity entity) {
		return new ResourceLocation("warden_world:textures/entities/sculk_creeper.png");
	}
}
