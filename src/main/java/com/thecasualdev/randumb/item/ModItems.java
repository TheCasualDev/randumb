package com.thecasualdev.randumb.item;

import com.thecasualdev.randumb.Randumb;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Randumb.MOD_ID);

    public static final RegistryObject<Item> BOX_WEETBIX = ITEMS.register("box_weetbix",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WEETBIC = ITEMS.register("weetbic",
            () -> new Item(new Item.Properties().food(ModFoods.WEETBIC)));

    public static final RegistryObject<Item> WEETBIC_RAW = ITEMS.register("weetbic_raw",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOWL_WEETBIX = ITEMS.register("bowl_weetbix",
            () -> new Item(new Item.Properties().food(ModFoods.BOWL_WEETBIX)));

    public static final RegistryObject<Item> SUPER_BOWL_WEETBIX = ITEMS.register("super_bowl_weetbix",
            () -> new Item(new Item.Properties().food(ModFoods.SUPER_BOWL_WEETBIX)));


    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}
