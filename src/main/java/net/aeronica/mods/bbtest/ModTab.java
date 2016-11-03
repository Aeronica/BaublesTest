package net.aeronica.mods.bbtest;


import net.aeronica.mods.bbtest.init.Assets;
import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModTab extends CreativeTabs {

	public ModTab(String name) {
		super(name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel() {
		return I18n.format("creativeTabs.modTab.title", new Object[0]);
	};

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		return new ItemStack(Assets.item_ring, 1, 0);
	}

	@Override
	public Item getTabIconItem() {
		return null;
	}
}
