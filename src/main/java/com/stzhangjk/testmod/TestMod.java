package com.stzhangjk.testmod;



import com.stzhangjk.testmod.proxy.Proxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = TestMod.MODID, version = TestMod.VERSION,name = TestMod.NAME)
public class TestMod {
    public static final String NAME = "Test Mod";
    public static final String MODID = "testmod";
    public static final String VERSION = "1.0";

    @Mod.Instance
    public static TestMod instance;

    @SidedProxy(
            clientSide = "com.stzhangjk.testmod.proxy.ClientProxy",
            serverSide = "com.stzhangjk.testmod.proxy.CommonProxy",
            modId = TestMod.MODID
    )
    public static Proxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
