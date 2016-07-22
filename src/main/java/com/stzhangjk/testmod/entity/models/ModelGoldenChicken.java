package com.stzhangjk.testmod.entity.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Grady on 2016.7.22.
 */
@SideOnly(Side.CLIENT)
public class ModelGoldenChicken extends ModelBase {

    public ModelRenderer head;
    public ModelRenderer bill;
    public ModelRenderer chin;
    public ModelRenderer body;
    public ModelRenderer rightLeg;
    public ModelRenderer leftLeg;
    public ModelRenderer rightWing;
    public ModelRenderer leftWing;

    public ModelGoldenChicken() {
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
        this.head.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.bill = new ModelRenderer(this, 14, 0);
        this.bill.addBox(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
        this.bill.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.chin = new ModelRenderer(this, 14, 4);
        this.chin.addBox(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
        this.chin.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.body = new ModelRenderer(this, 0, 9);
        this.body.addBox(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
        this.body.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.rightLeg = new ModelRenderer(this, 26, 0);
        this.rightLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3);
        this.rightLeg.setRotationPoint(-2.0F, 19.0F, 1.0F);
        this.leftLeg = new ModelRenderer(this, 26, 0);
        this.leftLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3);
        this.leftLeg.setRotationPoint(1.0F, 19.0F, 1.0F);
        this.rightWing = new ModelRenderer(this, 24, 13);
        this.rightWing.addBox(-0.5F, -0.5F, -1.5F, 1, 4, 6);
        this.rightWing.setRotationPoint(-3.0F, 15.5F, 0.0F);
        this.leftWing = new ModelRenderer(this, 24, 13);
        this.leftWing.addBox(-0.5F, -0.5F, -1.5F, 1, 4, 6);
        this.leftWing.setRotationPoint(3.0F, 15.5F, 0.0F);
    }

    /**
     * @param entity          实体
     * @param limbSwing       实体生物运动的四肢的量，可以初步理解为和实体运动的路程成正相关，也就是说，这个数字在不断得变大，然而实体的四肢是不断摆动的，所以在这里我们需要使用三角函数来限定一下范围，就可以表现出实体四肢摆动的周期性了
     * @param limbSwingAmount 实体生物运动的四肢的速度，也就是每一个gametick上一个参数变化的量，这个参数可以表征实体生物的运动速度，不过有着一定的滞回性，想象一个在很快速地行走的玩家突然停了下来，他的四肢其实还是在不断地摆动，并且在不断地衰减，所以这个参数可以直接用来限制实体生物四肢摆动的幅度
     * @param rotateFloat     实体四肢的固有摆动，其实这也是一个慢慢增大的量，如果没有特殊处理，其大小上等于实体存活的gametick数，当然因为渲染是单独执行的，这个数不见得是整数，实体四肢的固有摆动包括但不限于恶魂的九个触手的摆动、烈焰人身上的棒的旋转等
     * @param yaw             水平旋转
     * @param pitch           垂直旋转
     * @param scale           实体的尺寸。这个参数几科所有情况下都是1/16，表示实体的一格单位，为方块的一格的十六分之一，所以这里我们暂且不关心它，因为这个尺寸参数其实不常用。
     */
    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float rotateFloat, float yaw, float pitch, float scale) {
        setRotationAngles(limbSwing,limbSwingAmount,rotateFloat,yaw,pitch,scale,entity);
        this.head.render(scale);
        this.bill.render(scale);
        this.chin.render(scale);
        this.body.render(scale);
        this.rightLeg.render(scale);
        this.leftLeg.render(scale);
        this.rightWing.render(scale);
        this.leftWing.render(scale);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float rotateFloat, float yaw, float pitch, float scale, Entity entity) {
        this.head.rotateAngleX = pitch / (180F / (float) Math.PI);
        this.head.rotateAngleY = yaw / (180F / (float) Math.PI);
        this.bill.rotateAngleX = this.head.rotateAngleX;
        this.bill.rotateAngleY = this.head.rotateAngleY;
        this.chin.rotateAngleX = this.head.rotateAngleX;
        this.chin.rotateAngleY = this.head.rotateAngleY;
        this.body.rotateAngleX = (float) (Math.PI / 2.0D);
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLeg.rotateAngleX = -MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.rightWing.rotateAngleZ = 1.5F * rotateFloat;
        this.leftWing.rotateAngleZ = -1.5F * rotateFloat;
    }
}
