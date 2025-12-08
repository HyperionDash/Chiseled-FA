package net.hyper.chiseled;

import net.fabricmc.api.ModInitializer;

import net.hyper.chiseled.block.ModBlocks;
import net.hyper.chiseled.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class Chiseled implements ModInitializer {
    public static final String MOD_ID = "chiseled";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();
    }
}