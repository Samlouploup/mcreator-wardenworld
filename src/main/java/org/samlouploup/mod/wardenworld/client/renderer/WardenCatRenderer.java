
package org.samlouploup.mod.wardenworld.client.renderer;

import org.samlouploup.mod.wardenworld.entity.WardenCatEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

public class WardenCatRenderer extends MobRenderer<WardenCatEntity, OcelotModel<WardenCatEntity>> {
	public WardenCatRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WardenCatEntity entity) {
		return new ResourceLocation("warden_world:textures/entities/sculk_black_cat.png");
	}
}
