package net.norako.arkonia.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.norako.arkonia.Arkonia;

public class ArkoniaCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Arkonia.ID);

    public static final RegistryObject<CreativeModeTab> ARKONIA_TAB = CREATIVE_MODE_TABS.register("arkonia_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ArkoniaItems.RAW_SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.arkonia_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ArkoniaItems.SAPPHIRE.get());
                        output.accept(ArkoniaItems.RAW_SAPPHIRE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
