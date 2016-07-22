package com.stzhangjk.testmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Grady on 2016.7.19.
 */
public interface Proxy {
    /**
     * Registering blocks and items to the GameRegistry
     * Registering tile entities
     * Registering entities
     * Assigning ore dictionary names
     * @param event
     */
    void preInit(FMLPreInitializationEvent event);

    /**
     * Registering world generators
     * Registering recipes
     * Registering event handlers
     * Sending IMC messages
     * @param event
     */
    void init(FMLInitializationEvent event);

    /**
     * Mod compatibility, or anything which depends on other mods’ init phases being finished.
     * @param event
     */
    void postInit(FMLPostInitializationEvent event);
}
