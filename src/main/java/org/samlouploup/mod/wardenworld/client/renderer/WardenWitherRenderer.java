
package org.samlouploup.mod.wardenworld.client.renderer;

import org.samlouploup.mod.wardenworld.entity.WardenWitherEntity;
import org.samlouploup.mod.wardenworld.client.model.ModelWITHER;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class WardenWitherRenderer extends MobRenderer<WardenWitherEntity, ModelWITHER<WardenWitherEntity>> {
	public WardenWitherRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWITHER(context.bakeLayer(ModelWITHER.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WardenWitherEntity entity) {
		return new ResourceLocation("warden_world:textures/entities/warden_wither.png");
	}
}
