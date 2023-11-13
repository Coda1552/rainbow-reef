package net.thevaliantsquidward.rainbowreef.event;

import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.ModEntities;
import net.thevaliantsquidward.rainbowreef.entity.custom.*;

@Mod.EventBusSubscriber(modid = RainbowReef.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GOBY.get(), EntityGoby.setAttributes());
        event.put(ModEntities.TANG.get(), EntityTang.setAttributes());
        event.put(ModEntities.BOXFISH.get(), EntityBoxfish.setAttributes());
        event.put(ModEntities.SMALL_SHARK.get(), EntitySmallShark.setAttributes());
        event.put(ModEntities.CLOWNFISH.get(), EntityClownfish.setAttributes());
        event.put(ModEntities.BUTTERFISH.get(), EntityClownfish.setAttributes());
    }

}