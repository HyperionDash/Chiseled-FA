package net.hyper.chiseled;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.hyper.chiseled.registry.*;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chiseled implements ModInitializer {
    public static final String MOD_ID = "chiseled";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ChiseledBlocks.registerChiseledBlocks();
        ChiseledItemGroups.registerChiseledItemGroups();

        FuelRegistry.INSTANCE.add(ChiseledBlocks.OAK_TRIM, 300);
        FuelRegistry.INSTANCE.add(ChiseledBlocks.VERTICAL_OAK_PLANKS, 300);
        FuelRegistry.INSTANCE.add(ChiseledBlocks.VERTICAL_OAK_STAIRS, 300);
        FuelRegistry.INSTANCE.add(ChiseledBlocks.VERTICAL_OAK_SLAB, 300);
        FuelRegistry.INSTANCE.add(ChiseledBlocks.SPRUCE_TRIM, 300);
        FuelRegistry.INSTANCE.add(ChiseledBlocks.BIRCH_TRIM, 300);
        FuelRegistry.INSTANCE.add(ChiseledBlocks.JUNGLE_TRIM, 300);
        FuelRegistry.INSTANCE.add(ChiseledBlocks.ACACIA_TRIM, 300);
        FuelRegistry.INSTANCE.add(ChiseledBlocks.DARK_OAK_TRIM, 300);
        FuelRegistry.INSTANCE.add(ChiseledBlocks.MANGROVE_TRIM, 300);
        FuelRegistry.INSTANCE.add(ChiseledBlocks.CHERRY_TRIM, 300);
        FuelRegistry.INSTANCE.add(ChiseledBlocks.BAMBOO_TRIM, 300);

        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.OAK_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_OAK_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_OAK_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.VERTICAL_OAK_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.SPRUCE_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.BIRCH_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.JUNGLE_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.ACACIA_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.DARK_OAK_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.MANGROVE_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.CHERRY_TRIM, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ChiseledBlocks.BAMBOO_TRIM, 5, 20);

        FabricLoader.getInstance().getModContainer(Chiseled.MOD_ID).ifPresent(modContainer -> {
            ResourceManagerHelper.registerBuiltinResourcePack(Identifier.of(Chiseled.MOD_ID, "recipe_overrides"), modContainer,
                    ResourcePackActivationType.DEFAULT_ENABLED);
        });
    }
}