
package org.samlouploup.mod.wardenworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class WardenBoneItem extends Item {
	public WardenBoneItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(16).rarity(Rarity.COMMON));
	}
}
