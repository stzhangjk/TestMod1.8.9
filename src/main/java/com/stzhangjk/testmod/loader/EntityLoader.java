package com.stzhangjk.testmod.loader;

import com.stzhangjk.testmod.TestMod;
import com.stzhangjk.testmod.entity.EntityGoldenChicken;
import com.stzhangjk.testmod.entity.renders.EntityRenderFactory;
import com.stzhangjk.testmod.entity.renders.RenderGoldenChicken;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Grady on 2016.7.21.
 */
public class EntityLoader {

    /**
     * 实体ID，同一个Mod的每一个实体类型的ID要不同，这里是通过递增处理的
     */
    private static int nextID;

    public static void registerEntities() {
        registerEntity(EntityGoldenChicken.class, EntityGoldenChicken.name, 80, 3, true);
        registerEntityEgg(EntityGoldenChicken.class,0xffff66, 0x660000);
    }

    @SideOnly(Side.CLIENT)
    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(EntityGoldenChicken.class,new EntityRenderFactory<EntityGoldenChicken>(RenderGoldenChicken.class));
    }



    /**
     * 注册实体
     *
     * @param entityClass          实体对应的class实例
     * @param name                 实体的名称，不过这里我们和物品、方块等不一样，实体的名称建议使用大写驼峰式
     * @param trackingRange        实体的跟踪半径，也就是说如果这个实体距离玩家一量超过对应的大小，这个实体就不更新了，一般情况下，生物设置成64格是比较合理的，当然有的实体有特殊需要，这个参数设置得比较大
     * @param updateFrequency      实体的更新频率，对于生物来说，每3 gametick一更新是比较常见的做法，当然有的会设置成特别长，有10 gametick，20 gametick，甚至整数的最大值，也就是不更新
     * @param sendsVelocityUpdates 是否同步实体的速度更新，对于一些实体，比如静止的实体，一些会手动更新数据的BOSS，是没有必要的，但是对于实体生物来说是有必要的
     */
    private static void registerEntity(
            Class<? extends Entity> entityClass,
            String name,
            int trackingRange,
            int updateFrequency,
            boolean sendsVelocityUpdates) {


        EntityRegistry.registerModEntity(
                entityClass,
                name,
                nextID++,
                TestMod.instance,
                trackingRange,
                updateFrequency,
                sendsVelocityUpdates);

    }

    /**
     * 注册刷怪蛋
     *
     * @param entityClass  实体对应的class实例
     * @param eggPrimary   刷怪蛋的主色
     * @param eggSecondary 刷怪蛋的副色
     */
    private static void registerEntityEgg(Class<? extends Entity> entityClass, int eggPrimary, int eggSecondary) {
        EntityRegistry.registerEgg(entityClass, eggPrimary, eggSecondary);
    }

}
