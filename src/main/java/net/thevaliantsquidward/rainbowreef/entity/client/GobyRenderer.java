package net.thevaliantsquidward.rainbowreef.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityGoby;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GobyRenderer extends GeoEntityRenderer<EntityGoby> {
    private static final ResourceLocation TEXTURE_FIRE = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/firegoby.png");
    private static final ResourceLocation TEXTURE_PURPLE = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/purplefiregoby.png");
    private static final ResourceLocation TEXTURE_CANDYCANE = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/candycanegoby.png");
    private static final ResourceLocation TEXTURE_MANDARIN = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/mandaringoby.png");
    private static final ResourceLocation TEXTURE_YELLOWWATCH = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/yellowwatchmangoby.png");
   
    public GobyRenderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new GobyModel());
    }

    protected void scale(EntityGoby entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
    }


    public ResourceLocation getTextureLocation(EntityGoby entity) {
        return switch (entity.getVariant()) {
            case 1 -> TEXTURE_PURPLE;
            case 2 -> TEXTURE_CANDYCANE;
            case 3 -> TEXTURE_MANDARIN;
            case 4 -> TEXTURE_YELLOWWATCH;
            default -> TEXTURE_FIRE;
        };
    }
}