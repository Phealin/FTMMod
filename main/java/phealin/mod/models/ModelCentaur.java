package phealin.mod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.util.math.MathHelper;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelCentaur extends ModelBase {
    public ModelRenderer tailBase;
    public ModelRenderer frontLeftHoof;
    public ModelRenderer tailMiddle;
    public ModelRenderer backRightShin;
    public ModelRenderer body;
    public ModelRenderer frontRightLeg;
    public ModelRenderer backLeftShin;
    public ModelRenderer backLeftLeg;
    public ModelRenderer frontRightHoof;
    public ModelRenderer backLeftHoof;
    public ModelRenderer backRightLeg;
    public ModelRenderer backRightHoof;
    public ModelRenderer frontLeftLeg;
    public ModelRenderer tailTip;
    public ModelRenderer frontRightShin;
    public ModelRenderer frontLeftShin;
    public ModelRenderer villagerBody1;
    public ModelRenderer villagerHead;
    public ModelRenderer villagerArms0;
    public ModelRenderer villagerArms0_1;
    public ModelRenderer villagerArms2;
    public ModelRenderer villagerBody0;
    public ModelRenderer villagerHeadChild;
    protected float childYOffset = 18.0F;
    protected float childZOffset = 4.0F;

    public ModelCentaur() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.frontRightLeg = new ModelRenderer(this, 60, 29);
        this.frontRightLeg.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.frontRightLeg.addBox(-1.100000023841858F, -1.0F, -2.0999999046325684F, 3, 8, 4, 0.0F);
        this.backRightHoof = new ModelRenderer(this, 96, 51);
        this.backRightHoof.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.backRightHoof.addBox(-1.5F, 5.099999904632568F, -2.0F, 4, 3, 4, 2.384185791015625E-7F);
        this.villagerArms0 = new ModelRenderer(this, 0, 116);
        this.villagerArms0.setRotationPoint(-8.0F, -9.0F, -8.0F);
        this.villagerArms0.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(villagerArms0, -0.7330382858376184F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 34);
        this.body.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.body.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.villagerBody0 = new ModelRenderer(this, 30, 90);
        this.villagerBody0.setRotationPoint(-4.0F, -9.5F, -9.5F);
        this.villagerBody0.addBox(0.0F, 0.0F, 0.0F, 8, 12, 6, 0.0F);
        this.villagerHeadChild = new ModelRenderer(this, 24, 68);
        this.villagerHeadChild.setRotationPoint(4.0F, 7.0F, 4.0F);
        this.villagerHeadChild.addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);
        this.frontLeftHoof = new ModelRenderer(this, 44, 51);
        this.frontLeftHoof.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.frontLeftHoof.addBox(-2.4000000953674316F, 5.099999904632568F, -2.0999999046325684F, 4, 3, 4, 2.384185791015625E-7F);
        this.backLeftLeg = new ModelRenderer(this, 78, 29);
        this.backLeftLeg.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.backLeftLeg.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.frontRightShin = new ModelRenderer(this, 60, 41);
        this.frontRightShin.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.frontRightShin.addBox(-1.100000023841858F, 0.0F, -1.600000023841858F, 3, 5, 3, 0.0F);
        this.tailBase = new ModelRenderer(this, 44, 0);
        this.tailBase.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tailBase.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tailBase, -1.3089969158172607F, 0.0F, 0.0F);
        this.frontRightHoof = new ModelRenderer(this, 60, 51);
        this.frontRightHoof.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.frontRightHoof.addBox(-1.600000023841858F, 5.099999904632568F, -2.0999999046325684F, 4, 3, 4, 2.384185791015625E-7F);
        this.tailTip = new ModelRenderer(this, 24, 3);
        this.tailTip.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tailTip.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(tailTip, -1.570796251296997F, 0.0F, 0.0F);
        this.backLeftHoof = new ModelRenderer(this, 78, 51);
        this.backLeftHoof.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.backLeftHoof.addBox(-2.5F, 5.099999904632568F, -2.0F, 4, 3, 4, 2.384185791015625E-7F);
        this.villagerHead = new ModelRenderer(this, 0, 68);
        this.villagerHead.setRotationPoint(-4.0F, -19.5F, -10.5F);
        this.villagerHead.addBox(0.0F, 0.0F, 0.0F, 8, 10, 8, 0.0F);
        this.villagerArms2 = new ModelRenderer(this, 40, 120);
        this.villagerArms2.setRotationPoint(-4.0F, -6.0F, -11.0F);
        this.villagerArms2.addBox(0.0F, 0.0F, 0.0F, 8, 4, 4, 0.0F);
        this.setRotateAngle(villagerArms2, -0.7330382858376184F, 0.0F, 0.0F);
        this.backLeftShin = new ModelRenderer(this, 78, 43);
        this.backLeftShin.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.backLeftShin.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.villagerBody1 = new ModelRenderer(this, 0, 90);
        this.villagerBody1.setRotationPoint(-4.0F, -9.5F, -9.5F);
        this.villagerBody1.addBox(0.0F, 0.0F, 0.0F, 8, 12, 6, 0.5F);
        this.backRightShin = new ModelRenderer(this, 96, 43);
        this.backRightShin.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.backRightShin.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.backRightLeg = new ModelRenderer(this, 96, 29);
        this.backRightLeg.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.backRightLeg.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.frontLeftLeg = new ModelRenderer(this, 44, 29);
        this.frontLeftLeg.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.frontLeftLeg.addBox(-1.899999976158142F, -1.0F, -2.0999999046325684F, 3, 8, 4, 0.0F);
        this.frontLeftShin = new ModelRenderer(this, 44, 41);
        this.frontLeftShin.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.frontLeftShin.addBox(-1.899999976158142F, 0.0F, -1.600000023841858F, 3, 5, 3, 0.0F);
        this.tailMiddle = new ModelRenderer(this, 38, 7);
        this.tailMiddle.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tailMiddle.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(tailMiddle, -1.3089969158172607F, 0.0F, 0.0F);
        this.villagerArms0_1 = new ModelRenderer(this, 20, 116);
        this.villagerArms0_1.setRotationPoint(4.0F, -9.0F, -8.0F);
        this.villagerArms0_1.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(villagerArms0_1, -0.7330382858376184F, 0.0F, 0.0F);
        this.villagerHead.addChild(this.villagerHeadChild);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) { 
    	this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);

        if (this.isChild)
        {
            float f = 2.0F;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0F, this.childYOffset * scale, this.childZOffset * scale);
            
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
            this.villagerHead.render(scale);
            this.body.render(scale);
            this.villagerBody0.render(scale);
            this.villagerBody1.render(scale);
            this.villagerArms0.render(scale);
            this.villagerArms0_1.render(scale);
            this.villagerArms2.render(scale);
            this.frontRightLeg.render(scale);
            this.frontLeftLeg.render(scale);
            this.backRightLeg.render(scale);
            this.backLeftLeg.render(scale);
            this.frontRightShin.render(scale);
            this.frontLeftShin.render(scale);
            this.backRightShin.render(scale);
            this.backLeftShin.render(scale);
            this.frontRightHoof.render(scale);
            this.frontLeftHoof.render(scale);
            this.backRightHoof.render(scale);
            this.backLeftHoof.render(scale);
            GlStateManager.popMatrix();
        }
        else
        {
            this.villagerHead.render(scale);
            this.body.render(scale);
            this.villagerBody0.render(scale);
            this.villagerBody1.render(scale);
            this.villagerArms0.render(scale);
            this.villagerArms0_1.render(scale);
            this.villagerArms2.render(scale);
            this.frontRightLeg.render(scale);
            this.frontLeftLeg.render(scale);
            this.backRightLeg.render(scale);
            this.backLeftLeg.render(scale);
            this.frontRightShin.render(scale);
            this.frontLeftShin.render(scale);
            this.backRightShin.render(scale);
            this.backLeftShin.render(scale);
            this.frontRightHoof.render(scale);
            this.frontLeftHoof.render(scale);
            this.backRightHoof.render(scale);
            this.backLeftHoof.render(scale);
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {    	
    	AbstractHorse abstracthorse = (AbstractHorse)entityIn;
    	float f6 = abstracthorse.getRearingAmount(ageInTicks);
        float f7 = 1.0F - f6;
    	float f9 = (float)entityIn.ticksExisted + ageInTicks;
        float f10 = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI);
        float f11 = f10 * 0.8F * limbSwingAmount;
    	float f12 = 0.2617994F * f6;
        float f13 = MathHelper.cos(f9 * 0.6F + (float)Math.PI);
    	float f14 = (-1.0471976F + f13) * f6 + f11 * f7;
        float f15 = (-1.0471976F - f13) * f6 + -f11 * f7;
    	
        this.frontLeftLeg.rotationPointY = -2.0F * f6 + 9.0F * f7;
        this.frontLeftLeg.rotationPointZ = -2.0F * f6 + -8.0F * f7;
        this.frontRightLeg.rotationPointY = this.frontLeftLeg.rotationPointY;
        this.frontRightLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ;
        this.backLeftShin.rotationPointY = this.backLeftLeg.rotationPointY + MathHelper.sin(((float)Math.PI / 2F) + f12 + f7 * -f10 * 0.5F * limbSwingAmount) * 7.0F;
        this.backLeftShin.rotationPointZ = this.backLeftLeg.rotationPointZ + MathHelper.cos(-((float)Math.PI / 2F) + f12 + f7 * -f10 * 0.5F * limbSwingAmount) * 7.0F;
        this.backRightShin.rotationPointY = this.backRightLeg.rotationPointY + MathHelper.sin(((float)Math.PI / 2F) + f12 + f7 * f10 * 0.5F * limbSwingAmount) * 7.0F;
        this.backRightShin.rotationPointZ = this.backRightLeg.rotationPointZ + MathHelper.cos(-((float)Math.PI / 2F) + f12 + f7 * f10 * 0.5F * limbSwingAmount) * 7.0F;
        this.frontLeftShin.rotationPointY = this.frontLeftLeg.rotationPointY + MathHelper.sin(((float)Math.PI / 2F) + f14) * 7.0F;
        this.frontLeftShin.rotationPointZ = this.frontLeftLeg.rotationPointZ + MathHelper.cos(-((float)Math.PI / 2F) + f14) * 7.0F;
        this.frontRightShin.rotationPointY = this.frontRightLeg.rotationPointY + MathHelper.sin(((float)Math.PI / 2F) + f15) * 7.0F;
        this.frontRightShin.rotationPointZ = this.frontRightLeg.rotationPointZ + MathHelper.cos(-((float)Math.PI / 2F) + f15) * 7.0F;
        this.backLeftLeg.rotateAngleX = f12 + -f10 * 0.5F * limbSwingAmount * f7;
        this.backLeftShin.rotateAngleX = -0.08726646F * f6 + (-f10 * 0.5F * limbSwingAmount - Math.max(0.0F, f10 * 0.5F * limbSwingAmount)) * f7;
        this.backLeftHoof.rotateAngleX = this.backLeftShin.rotateAngleX;
        this.backRightLeg.rotateAngleX = f12 + f10 * 0.5F * limbSwingAmount * f7;
        this.backRightShin.rotateAngleX = -0.08726646F * f6 + (f10 * 0.5F * limbSwingAmount - Math.max(0.0F, -f10 * 0.5F * limbSwingAmount)) * f7;
        this.backRightHoof.rotateAngleX = this.backRightShin.rotateAngleX;
        this.frontLeftLeg.rotateAngleX = f14;
        this.frontLeftShin.rotateAngleX = (this.frontLeftLeg.rotateAngleX + (float)Math.PI * Math.max(0.0F, 0.2F + f13 * 0.2F)) * f6 + (f11 + Math.max(0.0F, f10 * 0.5F * limbSwingAmount)) * f7;
        this.frontLeftHoof.rotateAngleX = this.frontLeftShin.rotateAngleX;
        this.frontRightLeg.rotateAngleX = f15;
        this.frontRightShin.rotateAngleX = (this.frontRightLeg.rotateAngleX + (float)Math.PI * Math.max(0.0F, 0.2F - f13 * 0.2F)) * f6 + (-f11 + Math.max(0.0F, -f10 * 0.5F * limbSwingAmount)) * f7;
        this.frontRightHoof.rotateAngleX = this.frontRightShin.rotateAngleX;
        this.backLeftHoof.rotationPointY = this.backLeftShin.rotationPointY;
        this.backLeftHoof.rotationPointZ = this.backLeftShin.rotationPointZ;
        this.backRightHoof.rotationPointY = this.backRightShin.rotationPointY;
        this.backRightHoof.rotationPointZ = this.backRightShin.rotationPointZ;
        this.frontLeftHoof.rotationPointY = this.frontLeftShin.rotationPointY;
        this.frontLeftHoof.rotationPointZ = this.frontLeftShin.rotationPointZ;
        this.frontRightHoof.rotationPointY = this.frontRightShin.rotationPointY;
        this.frontRightHoof.rotationPointZ = this.frontRightShin.rotationPointZ;
    }
}
