package net.thevaliantsquidward.rainbowreef.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.custom.*;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RainbowReef.MOD_ID);

    public static final RegistryObject<EntityType<EntityGoby>> GOBY =
            ENTITY_TYPES.register("goby",
                    () -> EntityType.Builder.of(EntityGoby::new, MobCategory.CREATURE)
                            .sized(0.5f, 0.5f)
                            .build(new ResourceLocation(RainbowReef.MOD_ID, "goby").toString()));

    public static final RegistryObject<EntityType<EntityTang>> TANG =
            ENTITY_TYPES.register("tang",
                    () -> EntityType.Builder.of(EntityTang::new, MobCategory.CREATURE)
                            .sized(0.5f, 0.5f)
                            .build(new ResourceLocation(RainbowReef.MOD_ID, "tang").toString()));


    public static final RegistryObject<EntityType<EntityBoxfish>> BOXFISH =
            ENTITY_TYPES.register("boxfish",
                    () -> EntityType.Builder.of(EntityBoxfish::new, MobCategory.CREATURE)
                            .sized(0.5f, 0.5f)
                            .build(new ResourceLocation(RainbowReef.MOD_ID, "boxfish").toString()));

    public static final RegistryObject<EntityType<EntitySmallShark>> SMALL_SHARK =
            ENTITY_TYPES.register("small_shark",
                    () -> EntityType.Builder.of(EntitySmallShark::new, MobCategory.CREATURE)
                            .sized(0.7f, 0.7f)
                            .build(new ResourceLocation(RainbowReef.MOD_ID, "small_shark").toString()));

    public static final RegistryObject<EntityType<EntityClownfish>> CLOWNFISH =
            ENTITY_TYPES.register("clownfish",
                    () -> EntityType.Builder.of(EntityClownfish::new, MobCategory.CREATURE)
                            .sized(0.5f, 0.5f)
                            .build(new ResourceLocation(RainbowReef.MOD_ID, "clownfish").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
