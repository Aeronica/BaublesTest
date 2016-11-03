package net.aeronica.mods.bbtest.items;

import net.aeronica.mods.bbtest.Main;
import net.minecraft.item.Item;

public class ItemBase extends Item
{

	public ItemBase(String itemName) {
		setItemName(this, itemName);
		setCreativeTab(Main.MODTAB);
	}

	public static void setItemName(Item item, String itemName) {
		item.setRegistryName(itemName);
		item.setUnlocalizedName(item.getRegistryName().toString());
	}
}
