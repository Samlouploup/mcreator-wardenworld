
package org.samlouploup.mod.wardenworld.fluid;

import org.samlouploup.mod.wardenworld.init.WardenWorldModItems;
import org.samlouploup.mod.wardenworld.init.WardenWorldModFluids;
import org.samlouploup.mod.wardenworld.init.WardenWorldModFluidTypes;
import org.samlouploup.mod.wardenworld.init.WardenWorldModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

public abstract class DeepWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> WardenWorldModFluidTypes.DEEP_WATER_TYPE.get(), () -> WardenWorldModFluids.DEEP_WATER.get(), () -> WardenWorldModFluids.FLOWING_DEEP_WATER.get())
			.explosionResistance(100f).slopeFindDistance(3).bucket(() -> WardenWorldModItems.DEEP_WATER_BUCKET.get()).block(() -> (LiquidBlock) WardenWorldModBlocks.DEEP_WATER.get());

	private DeepWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.FALLING_OBSIDIAN_TEAR;
	}

	public static class Source extends DeepWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends DeepWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
