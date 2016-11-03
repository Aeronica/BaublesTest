package net.aeronica.mods.bbtest.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class Models
{
 
    private static final int DEFAULT_ITEM_SUBTYPE = 0;
    
    public static void register()
    {
        simpleItemModelRegister(Assets.item_ring);
    }

    private static void simpleItemModelRegister(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, DEFAULT_ITEM_SUBTYPE,
                new ModelResourceLocation(new ResourceLocation(item.getRegistryName().toString()), "inventory"));
    }

}
