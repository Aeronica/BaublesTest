package net.aeronica.mods.bbtest.init;

import net.aeronica.mods.bbtest.items.ItemRing;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Assets
{
    public static ItemRing item_ring;
    
    public static void preInit()
    {
        item_ring = registerItem(new ItemRing("item_ring"));
    }
    
    private static <T extends Item> T registerItem(T item) {
        GameRegistry.register(item);

        return item;
    }
    
    public static void registerRecipes()
    {
        
    }

}
