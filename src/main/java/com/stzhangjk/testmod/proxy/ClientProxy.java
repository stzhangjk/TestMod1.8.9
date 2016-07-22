package com.stzhangjk.testmod.proxy;

import com.stzhangjk.testmod.loader.BlockLoader;
import com.stzhangjk.testmod.loader.EntityLoader;
import com.stzhangjk.testmod.loader.ItemLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Grady on 2016.7.19.
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
        EntityLoader.registerEntityRenders();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
