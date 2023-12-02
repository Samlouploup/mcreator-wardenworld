
package org.samlouploup.mod.wardenworld.client.renderer;

import org.samlouploup.mod.wardenworld.entity.SculkSpiderEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

public class SculkSpiderRenderer extends MobRenderer<SculkSpiderEntity, SpiderModel<SculkSpiderEntity>> {
	public SculkSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SculkSpiderEntity entity) {
		return new ResourceLocation("warden_world:textures/entities/sculk_spider.png");
	}
}
