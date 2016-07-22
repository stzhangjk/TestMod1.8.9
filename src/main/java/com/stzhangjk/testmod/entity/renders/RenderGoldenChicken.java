package com.stzhangjk.testmod.entity.renders;

import com.stzhangjk.testmod.TestMod;
import com.stzhangjk.testmod.entity.EntityGoldenChicken;
import com.stzhangjk.testmod.entity.models.ModelGoldenChicken;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Grady on 2016.7.22.
 */
@SideOnly(Side.CLIENT)
public class RenderGoldenChicken extends RenderLiving<EntityGoldenChicken>{



    private static final ResourceLocation GOLDEN_CHICKEN_TEXTURE = new ResourceLocation(TestMod.MODID + ":textures/entity/golden_chicken.png");

    public RenderGoldenChicken(RenderManager manager) {
        /**
         * 第一个参数是Minecraft的渲染管理器，这里留作参数传入就可以了，
         * 我们刚刚也注意到了，在注册的时候，这确实作为参数，
         * 把Minecraft.getMinecraft().getRenderManager()传入了这个类的构造方法。
         * 第三个参数是阴影大小，这里用默认的0.5就可以了。
         */
        super(manager,new ModelGoldenChicken(), 0.5f);
    }

    /**
     *
     * @param entity
     * @param partialTickTime
     */
    @Override
    protected void preRenderCallback(EntityGoldenChicken entity, float partialTickTime) {
        GlStateManager.scale(2.5f,2.5f,2.5f);
    }

    /**
     *
     * @param entity 实体
     * @param x x坐标
     * @param y y坐标
     * @param z z坐标
     * @param entityYaw 转动角度
     * @param partialTicks
     */
    @Override
    public void doRender(EntityGoldenChicken entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityGoldenChicken entityGoldenChicken) {
        return GOLDEN_CHICKEN_TEXTURE;
    }


}
