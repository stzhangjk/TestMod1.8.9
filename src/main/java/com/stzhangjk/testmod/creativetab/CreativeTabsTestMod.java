package com.stzhangjk.testmod.creativetab;

import com.stzhangjk.testmod.TestMod;
import com.stzhangjk.testmod.loader.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Grady on 2016.7.20.
 */
public class CreativeTabsTestMod extends CreativeTabs{
    public CreativeTabsTestMod() {
        super(TestMod.NAME);
        setBackgroundImageName(TestMod.NAME + ".png");
    }

    /**
     * 标签卡片图标
     * @return
     */
    @Override
    public Item getTabIconItem() {
        return ItemLoader.itemGoldenEgg;
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
