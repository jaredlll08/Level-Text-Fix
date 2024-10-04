package net.darkhax.leveltextfix.forge;

import net.darkhax.leveltextfix.common.impl.LevelTextFixMod;
import net.darkhax.leveltextfix.common.impl.Constants;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

@Mod(Constants.MOD_ID)
public class ForgeMod {

    public ForgeMod() {
        LevelTextFixMod.getInstance().init();
    }
}