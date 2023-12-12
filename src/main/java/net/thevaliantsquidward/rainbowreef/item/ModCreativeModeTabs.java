package net.thevaliantsquidward.rainbowreef.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.rainbowreef.RainbowReef;

public class ModCreativeModeTabs {
public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RainbowReef.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RAINBOW_REEF_TAB = CREATIVE_MODE_TABS.register("rainbow_reef_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_TANG.get()))
                    .title(Component.translatable("creativetab.rainbow_reef_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //order:
                        //boxfish
                        //butterfish
                        //clownfish
                        //dwarf angelfish
                        //goby
                        //hogfish
                        //parrotfish
                        //seahorse
                        //small shork
                        //tang

                        pOutput.accept(ModItems.RAW_BOXFISH.get());
                        pOutput.accept(ModItems.RAW_BUTTERFISH.get());
                        pOutput.accept(ModItems.RAW_CLOWNFISH.get());
                        pOutput.accept(ModItems.RAW_DWARF_ANGELFISH.get());
                        pOutput.accept(ModItems.RAW_GOBY.get());
                        pOutput.accept(ModItems.RAW_HOGFISH.get());
                        pOutput.accept(ModItems.RAW_PARROTFISH.get());
                        pOutput.accept(ModItems.RAW_SEAHORSE.get());
                        pOutput.accept(ModItems.RAW_TANG.get());


                        pOutput.accept(ModItems.BOXFISH_BUCKET.get());
                        pOutput.accept(ModItems.BUTTERFISH_BUCKET.get());
                        pOutput.accept(ModItems.CLOWNFISH_BUCKET.get());
                        pOutput.accept(ModItems.DWARF_ANGELFISH_BUCKET.get());
                        pOutput.accept(ModItems.GOBY_BUCKET.get());
                        pOutput.accept(ModItems.HOGFISH_BUCKET.get());
                        pOutput.accept(ModItems.PARROTFISH_BUCKET.get());
                        pOutput.accept(ModItems.SEAHORSE_BUCKET.get());
                        pOutput.accept(ModItems.TANG_BUCKET.get());
                        pOutput.accept(ModItems.SHARK_BUCKET.get());
                        pOutput.accept(ModItems.SPOTTED_EAGLE_RAY_BUCKET.get());


                        pOutput.accept(ModItems.BOXFISH_SPAWN_EGG.get());
                        pOutput.accept(ModItems.BUTTERFISH_SPAWN_EGG.get());
                        pOutput.accept(ModItems.CLOWNFISH_SPAWN_EGG.get());
                        pOutput.accept(ModItems.DWARF_ANGEL_SPAWN_EGG.get());
                        pOutput.accept(ModItems.GOBY_SPAWN_EGG.get());
                        pOutput.accept(ModItems.HOGFISH_SPAWN_EGG.get());
                        pOutput.accept(ModItems.PARROTFISH_SPAWN_EGG.get());
                        pOutput.accept(ModItems.SEAHORSE_SPAWN_EGG.get());
                        pOutput.accept(ModItems.TANG_SPAWN_EGG.get());
                        pOutput.accept(ModItems.SMALL_SHARK_SPAWN_EGG.get());

                        pOutput.accept(ModItems.BOXFISH_BREAD.get());
                        pOutput.accept(ModItems.CLOWNFISH_CUPCAKE.get());
                        pOutput.accept(ModItems.GOBY_GUMMY.get());
                        pOutput.accept(ModItems.DRIED_SEAHORSE.get());
                        pOutput.accept(ModItems.TANGY_SOUP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
