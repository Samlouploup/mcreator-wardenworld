
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.samlouploup.mod.wardenworld.init;

import org.samlouploup.mod.wardenworld.client.renderer.WardenWitherRenderer;
import org.samlouploup.mod.wardenworld.client.renderer.WardenCatRenderer;
import org.samlouploup.mod.wardenworld.client.renderer.TheSculkLordRenderer;
import org.samlouploup.mod.wardenworld.client.renderer.SculkyPigRenderer;
import org.samlouploup.mod.wardenworld.client.renderer.SculkSpiderRenderer;
import org.samlouploup.mod.wardenworld.client.renderer.SculkGuardianRenderer;
import org.samlouploup.mod.wardenworld.client.renderer.SculkCreeperRenderer;
import org.samlouploup.mod.wardenworld.client.renderer.SculkBlazeRenderer;
import org.samlouploup.mod.wardenworld.client.renderer.LittleWardenRenderer;
import org.samlouploup.mod.wardenworld.client.renderer.DeepWaterSquidRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WardenWorldModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WardenWorldModEntities.THE_SCULK_LORD.get(), TheSculkLordRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.LITTLE_WARDEN.get(), LittleWardenRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.SCULK_CREEPER.get(), SculkCreeperRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.WARDEN_WITHER.get(), WardenWitherRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.WARDEN_WITHER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.SCULK_SPIDER.get(), SculkSpiderRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.WARDEN_CAT.get(), WardenCatRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.SCULK_GUARDIAN.get(), SculkGuardianRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.SCULK_GUARDIAN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.DEEP_WATER_SQUID.get(), DeepWaterSquidRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.DEEP_WATER_SQUID_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.SCULK_BLAZE.get(), SculkBlazeRenderer::new);
		event.registerEntityRenderer(WardenWorldModEntities.SCULKY_PIG.get(), SculkyPigRenderer::new);
	}
}
