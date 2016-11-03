package net.aeronica.mods.bbtest;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, dependencies = Main.DEPEND)
public class Main
{

    public static final String MODID = "bbtest";
    public static final String MODNAME = "Baubles Test";
    public static final String VERSION = "1.10.2-0.1.0-dev";
    
    public static final String BAUBLES_VERSION = "1.3.0";
    public static final String DEPEND = "after:Baubles;";
    
    public static final CreativeTabs MODTAB = new ModTab(MODNAME);
    
    @SidedProxy(clientSide = "net.aeronica.mods.bbtest.ClientProxy", serverSide = "net.aeronica.mods.bbtest.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static Main instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        proxy.registerRenderers();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        proxy.registerRecipes();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

    public static String prependModID(String name) {
        return MODID + ":" + name;
    }

}
