
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package org.samlouploup.mod.wardenworld.init;

import org.samlouploup.mod.wardenworld.fluid.types.DeepWaterFluidType;
import org.samlouploup.mod.wardenworld.WardenWorldMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class WardenWorldModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, WardenWorldMod.MODID);
	public static final RegistryObject<FluidType> DEEP_WATER_TYPE = REGISTRY.register("deep_water", () -> new DeepWaterFluidType());
}
