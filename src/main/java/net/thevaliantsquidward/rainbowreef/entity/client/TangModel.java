package net.thevaliantsquidward.rainbowreef.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityGoby;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityTang;
import software.bernie.geckolib.model.GeoModel;

public class TangModel extends GeoModel<EntityTang> {
    @Override
    public ResourceLocation getModelResource(EntityTang animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "geo/tangfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EntityTang animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/bluetang.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EntityTang animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "animations/tangfish.animation.json");
    }


}
