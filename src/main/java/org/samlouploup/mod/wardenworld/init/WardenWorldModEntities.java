
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.samlouploup.mod.wardenworld.init;

import org.samlouploup.mod.wardenworld.entity.WardenWitherEntityProjectile;
import org.samlouploup.mod.wardenworld.entity.WardenWitherEntity;
import org.samlouploup.mod.wardenworld.entity.WardenCatEntity;
import org.samlouploup.mod.wardenworld.entity.TheSculkLordEntity;
import org.samlouploup.mod.wardenworld.entity.SculkyPigEntity;
import org.samlouploup.mod.wardenworld.entity.SculkSpiderEntity;
import org.samlouploup.mod.wardenworld.entity.SculkGuardianEntityProjectile;
import org.samlouploup.mod.wardenworld.entity.SculkGuardianEntity;
import org.samlouploup.mod.wardenworld.entity.SculkCreeperEntity;
import org.samlouploup.mod.wardenworld.entity.SculkBlazeEntity;
import org.samlouploup.mod.wardenworld.entity.LittleWardenEntity;
import org.samlouploup.mod.wardenworld.entity.DeepWaterSquidEntityProjectile;
import org.samlouploup.mod.wardenworld.entity.DeepWaterSquidEntity;
import org.samlouploup.mod.wardenworld.WardenWorldMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WardenWorldModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WardenWorldMod.MODID);
	public static final RegistryObject<EntityType<TheSculkLordEntity>> THE_SCULK_LORD = register("the_sculk_lord", EntityType.Builder.<TheSculkLordEntity>of(TheSculkLordEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheSculkLordEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LittleWardenEntity>> LITTLE_WARDEN = register("little_warden",
			EntityType.Builder.<LittleWardenEntity>of(LittleWardenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LittleWardenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SculkCreeperEntity>> SCULK_CREEPER = register("sculk_creeper",
			EntityType.Builder.<SculkCreeperEntity>of(SculkCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SculkCreeperEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<WardenWitherEntity>> WARDEN_WITHER = register("warden_wither", EntityType.Builder.<WardenWitherEntity>of(WardenWitherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(WardenWitherEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WardenWitherEntityProjectile>> WARDEN_WITHER_PROJECTILE = register("projectile_warden_wither", EntityType.Builder.<WardenWitherEntityProjectile>of(WardenWitherEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(WardenWitherEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SculkSpiderEntity>> SCULK_SPIDER = register("sculk_spider",
			EntityType.Builder.<SculkSpiderEntity>of(SculkSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SculkSpiderEntity::new)

					.sized(1.4f, 0.9f));
	public static final RegistryObject<EntityType<WardenCatEntity>> WARDEN_CAT = register("warden_cat",
			EntityType.Builder.<WardenCatEntity>of(WardenCatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WardenCatEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<SculkGuardianEntity>> SCULK_GUARDIAN = register("sculk_guardian", EntityType.Builder.<SculkGuardianEntity>of(SculkGuardianEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SculkGuardianEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SculkGuardianEntityProjectile>> SCULK_GUARDIAN_PROJECTILE = register("projectile_sculk_guardian",
			EntityType.Builder.<SculkGuardianEntityProjectile>of(SculkGuardianEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(SculkGuardianEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DeepWaterSquidEntity>> DEEP_WATER_SQUID = register("deep_water_squid",
			EntityType.Builder.<DeepWaterSquidEntity>of(DeepWaterSquidEntity::new, MobCategory.WATER_AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DeepWaterSquidEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DeepWaterSquidEntityProjectile>> DEEP_WATER_SQUID_PROJECTILE = register("projectile_deep_water_squid",
			EntityType.Builder.<DeepWaterSquidEntityProjectile>of(DeepWaterSquidEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(DeepWaterSquidEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SculkBlazeEntity>> SCULK_BLAZE = register("sculk_blaze", EntityType.Builder.<SculkBlazeEntity>of(SculkBlazeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(SculkBlazeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SculkyPigEntity>> SCULKY_PIG = register("sculky_pig",
			EntityType.Builder.<SculkyPigEntity>of(SculkyPigEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SculkyPigEntity::new)

					.sized(0.9f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheSculkLordEntity.init();
			LittleWardenEntity.init();
			SculkCreeperEntity.init();
			WardenWitherEntity.init();
			SculkSpiderEntity.init();
			WardenCatEntity.init();
			SculkGuardianEntity.init();
			DeepWaterSquidEntity.init();
			SculkBlazeEntity.init();
			SculkyPigEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(THE_SCULK_LORD.get(), TheSculkLordEntity.createAttributes().build());
		event.put(LITTLE_WARDEN.get(), LittleWardenEntity.createAttributes().build());
		event.put(SCULK_CREEPER.get(), SculkCreeperEntity.createAttributes().build());
		event.put(WARDEN_WITHER.get(), WardenWitherEntity.createAttributes().build());
		event.put(SCULK_SPIDER.get(), SculkSpiderEntity.createAttributes().build());
		event.put(WARDEN_CAT.get(), WardenCatEntity.createAttributes().build());
		event.put(SCULK_GUARDIAN.get(), SculkGuardianEntity.createAttributes().build());
		event.put(DEEP_WATER_SQUID.get(), DeepWaterSquidEntity.createAttributes().build());
		event.put(SCULK_BLAZE.get(), SculkBlazeEntity.createAttributes().build());
		event.put(SCULKY_PIG.get(), SculkyPigEntity.createAttributes().build());
	}
}
