package net.darkhax.leveltextfix.common.impl;


import net.darkhax.bookshelf.common.api.service.Services;
import net.darkhax.pricklemc.common.api.config.ConfigManager;
import org.apache.commons.lang3.StringUtils;

public class LevelTextFixMod {

    private static LevelTextFixMod instance;
    private boolean hasInitialized = false;
    private Config config;

    public void init() {
        if (hasInitialized) {
            throw new IllegalStateException("The " + Constants.MOD_NAME + " has already been initialized.");
        }
        if (Services.PLATFORM.isPhysicalClient()) {
            this.config = ConfigManager.load(Constants.MOD_ID, new Config());
        }
        hasInitialized = true;
    }

    public Config getConfig() {
        return this.config;
    }

    public boolean hasInitialized() {
        return this.hasInitialized;
    }

    public static LevelTextFixMod getInstance() {
        if (instance == null) {
            instance = new LevelTextFixMod();
        }
        return instance;
    }

    public static boolean isNumeric(final CharSequence cs) {
        if (StringUtils.isEmpty(cs)) {
            return false;
        }
        final int sz = cs.length();
        final int start = cs.charAt(0) == '-' || cs.charAt(0) == '+' ? 1 : 0;
        for (int i = start; i < sz; i++) {
            if (!Character.isDigit(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}