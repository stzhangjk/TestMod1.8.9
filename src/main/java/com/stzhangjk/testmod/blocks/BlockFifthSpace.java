package com.stzhangjk.testmod.blocks;

import com.stzhangjk.testmod.TestMod;
import com.stzhangjk.testmod.loader.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Grady on 2016.7.20.
 */
public class BlockFifthSpace extends Block{

    public static String unlocalizedName = "fifthSpaceBlock";
    public static String registerName = "fifth_space_block";

    public BlockFifthSpace() {
        super(Material.ground);
        setUnlocalizedName(unlocalizedName);
        setRegistryName(TestMod.MODID,registerName);
        setCreativeTab(CreativeTabsLoader.testmod);
    }
}
