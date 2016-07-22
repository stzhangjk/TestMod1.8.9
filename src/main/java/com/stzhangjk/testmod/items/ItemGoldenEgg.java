package com.stzhangjk.testmod.items;

import com.stzhangjk.testmod.TestMod;
import com.stzhangjk.testmod.loader.CreativeTabsLoader;
import net.minecraft.item.Item;

/**
 * Created by Grady on 2016.7.19.
 */
public class ItemGoldenEgg extends Item{

    public static String unlocalizedName = "goldenEgg";
    public static String registerName = "golden_egg";

    public ItemGoldenEgg() {
        setUnlocalizedName(unlocalizedName);
        setRegistryName(TestMod.MODID,registerName);
        setCreativeTab(CreativeTabsLoader.testmod);
    }
}
