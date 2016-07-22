package com.stzhangjk.testmod.loader;

import com.stzhangjk.testmod.creativetab.CreativeTabsTestMod;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Grady on 2016.7.20.
 */
public class CreativeTabsLoader {
    public static CreativeTabs testmod;

    public static void registerCreativeTabs() {
        testmod = new CreativeTabsTestMod();
    }
}
