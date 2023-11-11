package net.thevaliantsquidward.rainbowreef.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityClownfish;
import software.bernie.geckolib.model.GeoModel;

public class ClownfishModel extends GeoModel<EntityClownfish> {
    @Override
    public ResourceLocation getModelResource(EntityClownfish animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "geo/clownfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EntityClownfish animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/clownfish_3.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EntityClownfish animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "animations/clownfish.animation.json");
    }


}