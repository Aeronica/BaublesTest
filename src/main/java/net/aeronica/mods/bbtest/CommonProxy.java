package net.aeronica.mods.bbtest;

import net.aeronica.mods.bbtest.init.Assets;
import net.aeronica.mods.bbtest.init.Models;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{

    public void preInit(FMLPreInitializationEvent event)
    {
        Assets.preInit();
    }

    public void init(FMLInitializationEvent event) {}

    public void postInit(FMLPostInitializationEvent event) {}
    
    public void registerRenderers() {
        Models.register();
    }

    public void registerRecipes()
    {
        Assets.registerRecipes();
    }
    
}