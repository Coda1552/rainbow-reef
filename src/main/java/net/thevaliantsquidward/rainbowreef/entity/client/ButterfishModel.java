package net.thevaliantsquidward.rainbowreef.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityButterfish;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityClownfish;
import software.bernie.geckolib.model.GeoModel;

public class ButterfishModel extends GeoModel<EntityButterfish> {
    @Override
    public ResourceLocation getModelResource(EntityButterfish animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "geo/butterflyfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EntityButterfish animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/copperband.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EntityButterfish animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "animations/butterflyfish.animation.json");
    }


}