package net.thevaliantsquidward.rainbowreef.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityTang;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TangRenderer extends GeoEntityRenderer<EntityTang> {
    private static final ResourceLocation TEXTURE_BLUE = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/bluetang.png");
    private static final ResourceLocation TEXTURE_POWDERBLUE = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/powderbluetang.png");
    private static final ResourceLocation TEXTURE_YELLOW = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/yellowtang.png");
    private static final ResourceLocation TEXTURE_UNICORN = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/unicorntang.png");
    private static final ResourceLocation TEXTURE_CONVICT = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/convicttang.png");
    private static final ResourceLocation TEXTURE_CLOWN = new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/clowntang.png");

    public TangRenderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new TangModel());
    }

    protected void scale(EntityTang entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
    }


    public ResourceLocation getTextureLocation(EntityTang entity) {
        return switch (entity.getVariant()) {
            case 1 -> TEXTURE_POWDERBLUE;
            case 2 -> TEXTURE_YELLOW;
            case 3 -> TEXTURE_UNICORN;
            case 4 -> TEXTURE_CONVICT;
            case 5 -> TEXTURE_CLOWN;
            default -> TEXTURE_BLUE;
        };
    }
}
