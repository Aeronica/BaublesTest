package net.aeronica.mods.bbtest.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

@Optional.Interface(iface = "baubles.api.IBauble", modid = "Baubles", striprefs = true)
public class ItemRing extends ItemBase implements IBauble
{

    public ItemRing(String itemName)
    {
        super(itemName);
        setHasSubtypes(false);
        setMaxStackSize(1);
    }

    @Optional.Method(modid = "Baubles")
    @Override
    public BaubleType getBaubleType(ItemStack itemstack)
    {
        return BaubleType.RING;
    }

}
