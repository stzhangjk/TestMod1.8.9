package com.stzhangjk.testmod.items;

import com.stzhangjk.testmod.loader.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Grady on 2016.7.21.
 */
public class ItemRedStonePickaxe extends ItemPickaxe{

    public static final Item.ToolMaterial REDSTONE = EnumHelper.addToolMaterial("REDSTONE",3, 16, 16.0F, 0.0F, 10);

    public ItemRedStonePickaxe() {
        super(REDSTONE);
        setUnlocalizedName("redStonePickaxe");
        setRegistryName("redstone_pickaxe");
        setCreativeTab(CreativeTabsLoader.testmod);
    }
}
