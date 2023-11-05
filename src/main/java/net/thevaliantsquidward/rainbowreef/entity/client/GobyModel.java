package net.thevaliantsquidward.rainbowreef.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityGoby;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class GobyModel extends GeoModel<EntityGoby> {
    @Override
    public ResourceLocation getModelResource(EntityGoby animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "geo/goby.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EntityGoby animatable) {
       return new ResourceLocation(RainbowReef.MOD_ID, "textures/entity/firegoby.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EntityGoby animatable) {
        return new ResourceLocation(RainbowReef.MOD_ID, "animations/goby.animation.json");
    }


}