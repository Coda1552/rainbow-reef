package net.thevaliantsquidward.rainbowreef.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.ModEntities;
import net.thevaliantsquidward.rainbowreef.item.custom.ItemModFishBucket;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RainbowReef.MOD_ID);

    public static final RegistryObject<Item> GOBY_SPAWN_EGG = ITEMS.register("goby_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GOBY, 0xffffff, 0xdb3f1f, new Item.Properties()));

    public static final RegistryObject<Item> TANG_SPAWN_EGG = ITEMS.register("tang_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.TANG, 0x445bca, 0xefb032, new Item.Properties()));


    public static final RegistryObject<Item> BOXFISH_SPAWN_EGG = ITEMS.register("boxfish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BOXFISH, 0xfeda47, 0x62260a, new Item.Properties()));

    public static final RegistryObject<Item> SMALL_SHARK_SPAWN_EGG = ITEMS.register("small_shark_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SMALL_SHARK, 0xe0a33b, 0xa35a1d, new Item.Properties()));

    public static final RegistryObject<Item> CLOWNFISH_SPAWN_EGG = ITEMS.register("clownfish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CLOWNFISH, 0xe55500, 0xe69d7d, new Item.Properties()));

    public static final RegistryObject<Item> GOBY_BUCKET = ITEMS.register("goby_bucket", () -> new ItemModFishBucket(ModEntities.GOBY, Fluids.WATER, new Item.Properties()));

    public static final RegistryObject<Item> TANG_BUCKET = ITEMS.register("tang_bucket", () -> new ItemModFishBucket(ModEntities.TANG, Fluids.WATER, new Item.Properties()));

    public static final RegistryObject<Item> CLOWNFISH_BUCKET = ITEMS.register("clownfish_bucket", () -> new ItemModFishBucket(ModEntities.CLOWNFISH, Fluids.WATER, new Item.Properties()));

    public static final RegistryObject<Item> BOXFISH_BUCKET = ITEMS.register("boxfish_bucket", () -> new ItemModFishBucket(ModEntities.BOXFISH, Fluids.WATER, new Item.Properties()));


    public static final RegistryObject<Item> RAW_GOBY = ITEMS.register("raw_goby", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.4F).meat().build())));

    public static final RegistryObject<Item> RAW_TANG = ITEMS.register("raw_tang", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.4F).meat().build())));

    public static final RegistryObject<Item> RAW_BOXFISH = ITEMS.register("raw_boxfish", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.4F).meat().effect(new MobEffectInstance(MobEffects.WITHER, 140, 2), 1F).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
