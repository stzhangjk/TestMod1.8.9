package com.stzhangjk.testmod.entity.renders;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;

/**
 * Created by Grady on 2016.7.22.
 */
public class EntityRenderFactory <E extends Entity> implements IRenderFactory<E> {

    private final Class<? extends Render<E>> renderClass;

    public EntityRenderFactory(Class<? extends Render<E>> renderClass) {
        this.renderClass = renderClass;
    }

    @Override
    public Render<? super E> createRenderFor(RenderManager renderManager) {
        try{
            return renderClass.getConstructor(RenderManager.class).newInstance(renderManager);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
