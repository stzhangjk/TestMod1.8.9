package com.stzhangjk.testmod.entity;

import com.stzhangjk.testmod.loader.ItemLoader;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;

/**
 * Created by Grady on 2016.7.21.
 * 金鸡
 */
public class EntityGoldenChicken extends EntityChicken{

    public static final String name = "GoldenChicken";

    /**
     * 如果希望这个实体生物可以在世界自然生成，这一个传入世界参数的构造函数是必要的。
     * @param world 世界
     */
    public EntityGoldenChicken(World world) {
        super(world);
    }

    /**
     * 用于对实体生物的更新，包括更新实体的AI等。若干gametick更新一次，也就是这个方法被调用一次
     */
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }


    /**
     * 掉落物品
     * @param arg1 该实体生物是被玩家攻击致死，还是由于自然原因等而死
     * @param arg2 玩家攻击生物致死时的使用的武器的抢夺等级
     */
    @Override
    protected void dropFewItems(boolean arg1, int arg2) {
        this.dropItem(ItemLoader.itemGoldenEgg,1);
        super.dropFewItems(arg1, arg2);
    }
}
