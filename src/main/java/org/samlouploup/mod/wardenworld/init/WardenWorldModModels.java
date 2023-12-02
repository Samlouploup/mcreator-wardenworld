
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.samlouploup.mod.wardenworld.init;

import org.samlouploup.mod.wardenworld.client.model.Modelsquid;
import org.samlouploup.mod.wardenworld.client.model.Modelguardian;
import org.samlouploup.mod.wardenworld.client.model.Modelcustom_model;
import org.samlouploup.mod.wardenworld.client.model.ModelWITHER;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WardenWorldModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelWITHER.LAYER_LOCATION, ModelWITHER::createBodyLayer);
		event.registerLayerDefinition(Modelguardian.LAYER_LOCATION, Modelguardian::createBodyLayer);
		event.registerLayerDefinition(Modelsquid.LAYER_LOCATION, Modelsquid::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
