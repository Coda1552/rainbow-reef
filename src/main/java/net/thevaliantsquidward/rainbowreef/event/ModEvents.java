package net.thevaliantsquidward.rainbowreef.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.ModEntities;
import net.thevaliantsquidward.rainbowreef.entity.custom.EntityGoby;

@Mod.EventBusSubscriber(modid = RainbowReef.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GOBY.get(), EntityGoby.setAttributes());
        event.put(ModEntities.TANG.get(), EntityGoby.setAttributes());
    }
}