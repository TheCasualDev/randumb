package com.thecasualdev.randumb;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;


@Mod(Randumb.MOD_ID)
public class Randumb {

    public static final String MOD_ID = "randumb";
    private static final Logger LOGGER = LogUtils.getLogger();

    private void commonSetup(final FMLCommonSetupEvent event) {



    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {



    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

        LOGGER.info("HELLO from server starting");

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {



        }
    }
}
