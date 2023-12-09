package net.thevaliantsquidward.rainbowreef.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.ModEntities;
import net.thevaliantsquidward.rainbowreef.entity.custom.*;

@Mod.EventBusSubscriber(modid = RainbowReef.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GOBY.get(), GobyEntity.setAttributes());
        event.put(ModEntities.TANG.get(), TangEntity.setAttributes());
        event.put(ModEntities.BOXFISH.get(), BoxfishEntity.setAttributes());
        event.put(ModEntities.SMALL_SHARK.get(), SmallSharkEntity.setAttributes());
        event.put(ModEntities.CLOWNFISH.get(), ClownfishEntity.setAttributes());
        event.put(ModEntities.BUTTERFISH.get(), ClownfishEntity.setAttributes());
        event.put(ModEntities.SEAHORSE.get(), SeahorseEntity.setAttributes());
        event.put(ModEntities.DWARFANGEL.get(), DwarfAngelfishEntity.setAttributes());
    }

}