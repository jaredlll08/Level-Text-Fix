package net.darkhax.leveltextfix.impl;

import net.darkhax.leveltextfix.common.impl.LevelTextFixMod;
import net.darkhax.leveltextfix.common.impl.Constants;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;

@Mod(Constants.MOD_ID)
public class NeoForgeMod {

    public NeoForgeMod() {
        LevelTextFixMod.getInstance().init();
    }
}