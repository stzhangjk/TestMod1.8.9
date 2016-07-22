package com.stzhangjk.testmod.loader;

import com.stzhangjk.testmod.TestMod;
import com.stzhangjk.testmod.items.ItemGoldenEgg;
import com.stzhangjk.testmod.items.ItemRedStonePickaxe;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Grady on 2016.7.19.
 * Item注册器
 */
public class ItemLoader {

    /**黄金蛋*/
    public static Item itemGoldenEgg= new ItemGoldenEgg();
    /**红石镐*/
    public static Item itemRedStonePickaxe = new ItemRedStonePickaxe();

    /**
     * 注册所有item
     */
    public static void registerItems(){
        registerItems(itemGoldenEgg);
        registerItems(itemRedStonePickaxe);
    }

    /**
     * 注册item
     * @param item
     */
    private static void registerItems(Item item){
        GameRegistry.registerItem(item);
    }

    /**
     * 注册所有Item的模型和材质
     */
    @SideOnly(Side.CLIENT)
    public static void registerRenders(){
        registerRender(itemGoldenEgg);
        registerRender(itemRedStonePickaxe);
    }

    /**
     * 注册item的模型和材质
     * @param item
     */
    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item){
        String name = GameData.getItemRegistry().getNameForObject(item).toString();
        ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(name,"inventory"));
    }
}
