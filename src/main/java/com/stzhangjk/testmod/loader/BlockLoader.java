package com.stzhangjk.testmod.loader;

import com.stzhangjk.testmod.blocks.BlockFifthSpace;
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Grady on 2016.7.19.
 * 方块注册
 */
public class BlockLoader {
    /**第五空间方块*/
    public static Block fifthSpaceBlock = new BlockFifthSpace();


    public static void registerBlocks(){
        registerBlock(fifthSpaceBlock);
    }

    private static void registerBlock(Block block){
        GameRegistry.registerBlock(block);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders(){
        registerRender(fifthSpaceBlock);
    }

    /**
     * 注册方块对应的Item的材质和模型
     * +
     *
     *
     * @param block
     */
    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);   //获取方块对应的物品
        String name = GameData.getBlockRegistry().getNameForObject(block).toString();
        ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(name,"inventory"));
    }
}
