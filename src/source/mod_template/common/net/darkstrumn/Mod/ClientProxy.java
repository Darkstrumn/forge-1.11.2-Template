package net.darkstrumn.Mod;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ClientProxy extends CommonProxy
{
	public ClientProxy()
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
