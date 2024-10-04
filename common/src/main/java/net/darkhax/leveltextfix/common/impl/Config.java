package net.darkhax.leveltextfix.common.impl;

import net.darkhax.pricklemc.common.api.annotations.Value;

public class Config {

    @Value(comment = "When enabled roman numerals will be replaced with arabic numerals. For example 4 will be displayed in place of IV.")
    public boolean replace_roman_numerals = false;
}
