package net.darkhax.leveltextfix.fabric.impl;

import net.darkhax.leveltextfix.common.impl.LevelTextFixMod;
import net.fabricmc.api.ClientModInitializer;

public class FabricModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        LevelTextFixMod.getInstance().init();
    }
}