package net.thevaliantsquidward.rainbowreef.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityGoby;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntitySmallShark;
import software.bernie.geckolib.model.GeoModel;

public class SmallSharkModel extends GeoModel<EntitySmallShark> {
    @Override
    public ResourceLocation getModelResource(EntitySmallShark animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "geo/small_shark.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EntitySmallShark animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/epauletteshark.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EntitySmallShark animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "animations/small_shark.animation.json");
    }


}