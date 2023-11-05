package net.thevaliantsquidward.rainbowreef.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.rainbowreef.RainbowReef;
import net.thevaliantsquidward.rainbowreef.entity.ModEntities;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RainbowReef.MOD_ID);

    public static final RegistryObject<Item> GOBY_SPAWN_EGG = ITEMS.register("goby_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GOBY, 0xffffff, 0xdb3f1f, new Item.Properties()));

    public static final RegistryObject<Item> TANG_SPAWN_EGG = ITEMS.register("tang_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.TANG, 0x445bca, 0xefb032, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
