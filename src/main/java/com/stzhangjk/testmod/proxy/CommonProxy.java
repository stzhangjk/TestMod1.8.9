package com.stzhangjk.testmod.proxy;

import com.stzhangjk.testmod.crafting.CraftingLoader;
import com.stzhangjk.testmod.loader.CreativeTabsLoader;
import com.stzhangjk.testmod.loader.BlockLoader;
import com.stzhangjk.testmod.loader.EntityLoader;
import com.stzhangjk.testmod.loader.ItemLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Grady on 2016.7.19.
 */
public class CommonProxy implements Proxy{
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        //在注册Item和Block之前注册
        CreativeTabsLoader.registerCreativeTabs();
        ItemLoader.registerItems();
        BlockLoader.registerBlocks();
        EntityLoader.registerEntities();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        new CraftingLoader();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
