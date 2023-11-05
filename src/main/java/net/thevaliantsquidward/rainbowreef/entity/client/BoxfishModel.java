package net.thevaliantsquidward.rainbowreef.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityBoxfish;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityGoby;
import software.bernie.geckolib.model.GeoModel;

public class BoxfishModel extends GeoModel<EntityBoxfish> {
    @Override
    public ResourceLocation getModelResource(EntityBoxfish animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "geo/boxfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EntityBoxfish animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/yellowboxfish.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EntityBoxfish animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "animations/boxfish.animation.json");
    }


}