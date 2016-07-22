package com.stzhangjk.testmod.crafting;

import com.stzhangjk.testmod.loader.BlockLoader;
import com.stzhangjk.testmod.loader.ItemLoader;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Grady on 2016.7.20.
 */
public class CraftingLoader {
    public CraftingLoader() {
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    /**
     * 注册合成表
     */
    private void registerRecipe(){

        //有序合成表
        GameRegistry.addShapedRecipe(
                new ItemStack(ItemLoader.itemGoldenEgg,2),
                "###",
                "#*#",
                "###",
                '*', Items.egg,
                '#', BlockLoader.fifthSpaceBlock
                );
        GameRegistry.addShapedRecipe(
                new ItemStack(ItemLoader.itemRedStonePickaxe,1),
                "###",
                " * ",
                " * ",
                '#',Items.redstone,
                '*',Items.stick
        );
        //无序合成表
        GameRegistry.addShapelessRecipe(
                new ItemStack(BlockLoader.fifthSpaceBlock,10),
                Blocks.grass
                );
    }

    /**
     * 注册烧练规则
     */
    private void registerSmelting(){

    }

    /**
     * 注册燃料
     */
    private void registerFuel(){

    }
}
