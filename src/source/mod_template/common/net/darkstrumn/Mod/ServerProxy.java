package net.darkstrumn.Mod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy
{

	public ServerProxy()
	{
	}

	@Override
    public void preinit(FMLPreInitializationEvent event)
    {
		super.preinit(event);
    }
    
	@Override
    public void init(FMLInitializationEvent event)
    {
		super.init(event);
    }
    
	@Override
    public void postinit(FMLPostInitializationEvent event)
    {
		super.postinit(event);
    }
}

