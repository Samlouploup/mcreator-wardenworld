
package org.samlouploup.mod.wardenworld.client.renderer;

import org.samlouploup.mod.wardenworld.entity.LittleWardenEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class LittleWardenRenderer extends HumanoidMobRenderer<LittleWardenEntity, HumanoidModel<LittleWardenEntity>> {
	public LittleWardenRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(LittleWardenEntity entity) {
		return new ResourceLocation("warden_world:textures/entities/warden.png");
	}
}
