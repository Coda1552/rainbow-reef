package net.thevaliantsquidward.rainbowreef.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityBoxfish;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntitySmallShark;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class SmallSharkRenderer extends GeoEntityRenderer<EntitySmallShark> {
    private static final ResourceLocation TEXTURE_EPAULETTE = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/epauletteshark.png");
    private static final ResourceLocation TEXTURE_ZEBRA = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/zebrashark.png");

    public SmallSharkRenderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new SmallSharkModel());
    }

    protected void scale(EntitySmallShark entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
    }


    public ResourceLocation getTextureLocation(EntitySmallShark entity) {
        return switch (entity.getVariant()) {
            case 1 -> TEXTURE_ZEBRA;
            default -> TEXTURE_EPAULETTE;
        };
    }
}