
package org.samlouploup.mod.wardenworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class WardenSkinItem extends Item {
	public WardenSkinItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(32).rarity(Rarity.COMMON));
	}
}
