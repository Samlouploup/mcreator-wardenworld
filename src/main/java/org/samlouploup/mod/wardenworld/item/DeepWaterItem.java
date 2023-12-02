
package org.samlouploup.mod.wardenworld.item;

import org.samlouploup.mod.wardenworld.init.WardenWorldModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

public class DeepWaterItem extends BucketItem {
	public DeepWaterItem() {
		super(WardenWorldModFluids.DEEP_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_TOOLS));
	}
}
