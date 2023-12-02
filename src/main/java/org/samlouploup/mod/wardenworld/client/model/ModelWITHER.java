package org.samlouploup.mod.wardenworld.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelWITHER<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("warden_world", "model_wither"), "main");
	public final ModelPart upperBodyPart1;

	public ModelWITHER(ModelPart root) {
		this.upperBodyPart1 = root.getChild("upperBodyPart1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition upperBodyPart1 = partdefinition.addOrReplaceChild("upperBodyPart1", CubeListBuilder.create().texOffs(0, 16).addBox(-10.0F, -20.1F, -0.5F, 20.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition upperBodyPart2 = upperBodyPart1.addOrReplaceChild("upperBodyPart2",
				CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 22).addBox(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 22)
						.addBox(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 22).addBox(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -17.1F, -0.5F));
		PartDefinition upperBodyPart3 = upperBodyPart2.addOrReplaceChild("upperBodyPart3", CubeListBuilder.create().texOffs(12, 22).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 10.1F, 0.5F, 0.7854F, 0.0F, 0.0F));
		PartDefinition head1 = upperBodyPart1.addOrReplaceChild("head1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, 0.0F));
		PartDefinition head2 = upperBodyPart1.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, -18.0F, -1.0F));
		PartDefinition head3 = upperBodyPart1.addOrReplaceChild("head3", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, -18.0F, -1.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		upperBodyPart1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
