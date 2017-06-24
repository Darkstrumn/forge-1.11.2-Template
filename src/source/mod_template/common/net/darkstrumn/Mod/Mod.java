package net.darkstrumn.Mod;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Mod.MOD_ID, version = Mod.VERSION, name = Mod.MOD_NAME,dependencies = Mod.DEPENDENCIES)
public class Mod {
	//Constants
    public static final String MOD_ID = "mod";
    public static final String MOD_NAME = "Mod";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:forge@[13.20.0.2315]";
    public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":"; //Mod
    
    public static final String MCINFONAME = "Mod";
    
    //Variables
    public static Random random = new Random();
    
    @Mod.Instance(MOD_ID)
    public static Mod instance = new Mod();

    @SidedProxy(clientSide = "net.darkstrumn.mod.ClientProxy", serverSide = "net.darkstrumn.mod.ServerProxy")
    public static CommonProxy proxy;

    //public static CreativeTabMod tabMod;
    
    public void preinit(FMLPreInitializationEvent event)
    {
        System.out.println("Mod\\\\Event::preinit -> [preinit]");
        //tabMod = new CreativeTabMod(CreativeTabs.getNextID(),"tab_mod");
        this.proxy.preinit(event);
    }
    
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Mod\\\\Event::init -> [init]");
        this.proxy.init(event);
    }
    
    public void postinit(FMLPostInitializationEvent event)
    {
        System.out.println("Mod\\\\Event::postinit -> [postinit]");
        this.proxy.postinit(event);
    }
    
}
