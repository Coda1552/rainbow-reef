package net.thevaliantsquidward.rainbowreef.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.ModEntities;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityBoxfish;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityGoby;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityTang;

@Mod.EventBusSubscriber(modid = RainbowReef.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GOBY.get(), EntityGoby.setAttributes());
        event.put(ModEntities.TANG.get(), EntityTang.setAttributes());
        event.put(ModEntities.BOXFISH.get(), EntityBoxfish.setAttributes());
    }
}