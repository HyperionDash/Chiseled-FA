package net.hyper.chiseled.block;

import net.hyper.chiseled.Chiseled;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), (AbstractBlock.Settings.copy(Blocks.STONE))));
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block MOSSY_POLISHED_STONE = registerBlock("mossy_polished_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block MOSSY_POLISHED_STONE_STAIRS = registerBlock("mossy_polished_stone_stairs",
            new StairsBlock(ModBlocks.MOSSY_POLISHED_STONE.getDefaultState(), (AbstractBlock.Settings.copy(Blocks.STONE))));
    public static final Block MOSSY_POLISHED_STONE_SLAB = registerBlock("mossy_polished_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block MOSSY_POLISHED_STONE_WALL = registerBlock("mossy_polished_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block CRACKED_CHISELED_STONE_BRICKS = registerBlock("cracked_chiseled_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_CHISELED_STONE_BRICKS = registerBlock("mossy_chiseled_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block STONE_TILE_STAIRS = registerBlock("stone_tile_stairs",
            new StairsBlock(ModBlocks.STONE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block STONE_TILE_SLAB = registerBlock("stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_STONE_TILE_STAIRS = registerBlock("mossy_stone_tile_stairs",
            new StairsBlock(ModBlocks.MOSSY_STONE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_STONE_TILE_SLAB = registerBlock("mossy_stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block SMALL_STONE_BRICKS = registerBlock("small_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_SMALL_STONE_BRICKS = registerBlock("cracked_small_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block SMALL_STONE_BRICK_STAIRS = registerBlock("small_stone_brick_stairs",
            new StairsBlock(ModBlocks.SMALL_STONE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block SMALL_STONE_BRICK_SLAB = registerBlock("small_stone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block SMALL_STONE_BRICK_WALL = registerBlock("small_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_SMALL_STONE_BRICKS = registerBlock("mossy_small_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_SMALL_STONE_BRICK_STAIRS = registerBlock("mossy_small_stone_brick_stairs",
            new StairsBlock(ModBlocks.MOSSY_SMALL_STONE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_SMALL_STONE_BRICK_SLAB = registerBlock("mossy_small_stone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MOSSY_SMALL_STONE_BRICK_WALL = registerBlock("mossy_small_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MIXED_STONE_TILES = registerBlock("mixed_stone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block MIXED_STONE_TILE_SLAB = registerBlock("mixed_stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS)));
    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block CRACKED_POLISHED_GRANITE_BRICKS = registerBlock("cracked_polished_granite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_BRICK_STAIRS = registerBlock("polished_granite_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_GRANITE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_BRICK_SLAB = registerBlock("polished_granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_BRICK_WALL = registerBlock("polished_granite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block CHISELED_POLISHED_GRANITE_BRICKS = registerBlock("chiseled_polished_granite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_TILES = registerBlock("polished_granite_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block CRACKED_POLISHED_GRANITE_TILES = registerBlock("cracked_polished_granite_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_TILE_STAIRS = registerBlock("polished_granite_tile_stairs",
            new StairsBlock(ModBlocks.POLISHED_GRANITE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_TILE_SLAB = registerBlock("polished_granite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE)));
    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block CRACKED_POLISHED_DIORITE_BRICKS = registerBlock("cracked_polished_diorite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_BRICK_STAIRS = registerBlock("polished_diorite_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_DIORITE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_BRICK_SLAB = registerBlock("polished_diorite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_BRICK_WALL = registerBlock("polished_diorite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block CHISELED_POLISHED_DIORITE_BRICKS = registerBlock("chiseled_polished_diorite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_TILES = registerBlock("polished_diorite_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block CRACKED_POLISHED_DIORITE_TILES = registerBlock("cracked_polished_diorite_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_TILE_STAIRS = registerBlock("polished_diorite_tile_stairs",
            new StairsBlock(ModBlocks.POLISHED_DIORITE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_TILE_SLAB = registerBlock("polished_diorite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE)));
    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block CRACKED_POLISHED_ANDESITE_BRICKS = registerBlock("cracked_polished_andesite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_BRICK_STAIRS = registerBlock("polished_andesite_brick_stairs",
            new StairsBlock(ModBlocks.POLISHED_ANDESITE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_BRICK_SLAB = registerBlock("polished_andesite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_BRICK_WALL = registerBlock("polished_andesite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block CHISELED_POLISHED_ANDESITE_BRICKS = registerBlock("chiseled_polished_andesite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_TILES = registerBlock("polished_andesite_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block CRACKED_POLISHED_ANDESITE_TILES = registerBlock("cracked_polished_andesite_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_TILE_STAIRS = registerBlock("polished_andesite_tile_stairs",
            new StairsBlock(ModBlocks.POLISHED_ANDESITE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_TILE_SLAB = registerBlock("polished_andesite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE)));
    public static final Block DEEPSLATE_TILES = registerBlock("deepslate_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block CRACKED_DEEPSLATE_TILES = registerBlock("cracked_deepslate_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_TILE_STAIRS = registerBlock("deepslate_tile_stairs",
            new StairsBlock(ModBlocks.DEEPSLATE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_TILE_SLAB = registerBlock("deepslate_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)));
    public static final Block MOSSY_BRICKS = registerBlock("mossy_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block MOSSY_BRICK_STAIRS = registerBlock("mossy_brick_stairs",
            new StairsBlock(ModBlocks.MOSSY_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block MOSSY_BRICK_SLAB = registerBlock("mossy_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block MOSSY_BRICK_WALL = registerBlock("mossy_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block WEATHERED_BRICKS = registerBlock("weathered_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block WEATHERED_BRICK_STAIRS = registerBlock("weathered_brick_stairs",
            new StairsBlock(ModBlocks.WEATHERED_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block WEATHERED_BRICK_SLAB = registerBlock("weathered_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block WEATHERED_BRICK_WALL = registerBlock("weathered_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(),AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
    public static final Block MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_STAIRS = registerBlock("mossy_mud_brick_stairs",
            new StairsBlock(ModBlocks.MOSSY_MUD_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_SLAB = registerBlock("mossy_mud_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_WALL = registerBlock("mossy_mud_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MUD_TILES = registerBlock("mud_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MUD_TILE_STAIRS = registerBlock("mud_tile_stairs",
            new StairsBlock(ModBlocks.MUD_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MUD_TILE_SLAB = registerBlock("mud_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_MUD_TILES = registerBlock("mossy_mud_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_MUD_TILE_STAIRS = registerBlock("mossy_mud_tile_stairs",
            new StairsBlock(ModBlocks.MOSSY_MUD_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_MUD_TILE_SLAB = registerBlock("mossy_mud_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block SMALL_MUD_BRICKS = registerBlock("small_mud_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block SMALL_MUD_BRICK_STAIRS = registerBlock("small_mud_brick_stairs",
            new StairsBlock(ModBlocks.SMALL_MUD_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block SMALL_MUD_BRICK_SLAB = registerBlock("small_mud_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block SMALL_MUD_BRICK_WALL = registerBlock("small_mud_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_SMALL_MUD_BRICKS = registerBlock("mossy_small_mud_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_SMALL_MUD_BRICK_STAIRS = registerBlock("mossy_small_mud_brick_stairs",
            new StairsBlock(ModBlocks.MOSSY_SMALL_MUD_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_SMALL_MUD_BRICK_SLAB = registerBlock("mossy_small_mud_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block MOSSY_SMALL_MUD_BRICK_WALL = registerBlock("mossy_small_mud_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block CRACKED_SANDSTONE_BRICKS = registerBlock("cracked_sandstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            new StairsBlock(ModBlocks.SANDSTONE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_TILES = registerBlock("sandstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block CRACKED_SANDSTONE_TILES = registerBlock("cracked_sandstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_TILE_STAIRS = registerBlock("sandstone_tile_stairs",
            new StairsBlock(ModBlocks.SANDSTONE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SANDSTONE_TILE_SLAB = registerBlock("sandstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block MIXED_SANDSTONE_TILES = registerBlock("mixed_sandstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block MIXED_SANDSTONE_TILE_SLAB = registerBlock("mixed_sandstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block CRACKED_RED_SANDSTONE_BRICKS = registerBlock("cracked_red_sandstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerBlock("red_sandstone_brick_stairs",
            new StairsBlock(ModBlocks.RED_SANDSTONE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlock("red_sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlock("red_sandstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_TILES = registerBlock("red_sandstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block CRACKED_RED_SANDSTONE_TILES = registerBlock("cracked_red_sandstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_TILE_STAIRS = registerBlock("red_sandstone_tile_stairs",
            new StairsBlock(ModBlocks.RED_SANDSTONE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_TILE_SLAB = registerBlock("red_sandstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE)));
    public static final Block POLISHED_PRISMARINE = registerBlock("polished_prismarine",
            new Block(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block POLISHED_PRISMARINE_STAIRS = registerBlock("polished_prismarine_stairs",
            new StairsBlock(ModBlocks.POLISHED_PRISMARINE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block POLISHED_PRISMARINE_SLAB = registerBlock("polished_prismarine_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block POLISHED_PRISMARINE_WALL = registerBlock("polished_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_TILES = registerBlock("prismarine_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_TILE_STAIRS = registerBlock("prismarine_tile_stairs",
            new StairsBlock(ModBlocks.PRISMARINE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_TILE_SLAB = registerBlock("prismarine_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block MIXED_PRISMARINE_TILES = registerBlock("mixed_prismarine_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block MIXED_PRISMARINE_TILE_SLAB = registerBlock("mixed_prismarine_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS)));
    public static final Block DARK_PRISMARINE_WALL = registerBlock("dark_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TILES = registerBlock("dark_prismarine_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TILE_STAIRS = registerBlock("dark_prismarine_tile_stairs",
            new StairsBlock(ModBlocks.DARK_PRISMARINE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TILE_SLAB = registerBlock("dark_prismarine_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE)));
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(),AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
    public static final Block GILDED_BLACKSTONE_STAIRS = registerBlock("gilded_blackstone_stairs",
            new StairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_SLAB = registerBlock("gilded_blackstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_WALL = registerBlock("gilded_blackstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_POLISHED_BLACKSTONE_BRICKS = registerBlock("gilded_polished_blackstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_polished_blackstone_brick_stairs",
            new StairsBlock(ModBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_polished_blackstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_polished_blackstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlock("polished_blackstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILES = registerBlock("cracked_polished_blackstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("polished_blackstone_tile_stairs",
            new StairsBlock(ModBlocks.POLISHED_BLACKSTONE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("polished_blackstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block GILDED_POLISHED_BLACKSTONE_TILES = registerBlock("gilded_polished_blackstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_POLISHED_BLACKSTONE_TILE_STAIRS = registerBlock("gilded_polished_blackstone_tile_stairs",
            new StairsBlock(ModBlocks.GILDED_POLISHED_BLACKSTONE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("gilded_polished_blackstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlock("small_polished_blackstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlock("cracked_small_polished_blackstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("small_polished_blackstone_brick_stairs",
            new StairsBlock(ModBlocks.SMALL_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block SMALL_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("small_polished_blackstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block SMALL_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("small_polished_blackstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE_BRICKS)));
    public static final Block GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlock("gilded_small_polished_blackstone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock("gilded_small_polished_blackstone_brick_stairs",
            new StairsBlock(ModBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("gilded_small_polished_blackstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
    public static final Block GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("gilded_small_polished_blackstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));

    public static final Block MIXED_POLISHED_BLACKSTONE_TILES = registerBlock("mixed_polished_blackstone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
    public static final Block MIXED_POLISHED_BLACKSTONE_TILE_SLAB = registerBlock("mixed_polished_blackstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE)));
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ)));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_TILES = registerBlock("quartz_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_TILE_STAIRS = registerBlock("quartz_tile_stairs",
            new StairsBlock(ModBlocks.QUARTZ_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
    public static final Block QUARTZ_TILE_SLAB = registerBlock("quartz_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));

    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            new StairsBlock(ModBlocks.POLISHED_END_STONE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
    public static final Block CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_TILES = registerBlock("end_stone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block CRACKED_END_STONE_TILES = registerBlock("cracked_end_stone_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_TILE_STAIRS = registerBlock("end_stone_tile_stairs",
            new StairsBlock(ModBlocks.END_STONE_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block END_STONE_TILE_SLAB = registerBlock("end_stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block SMALL_END_STONE_BRICKS = registerBlock("small_end_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block CRACKED_SMALL_END_STONE_BRICKS = registerBlock("cracked_small_end_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block SMALL_END_STONE_BRICK_STAIRS = registerBlock("small_end_stone_brick_stairs",
            new StairsBlock(ModBlocks.SMALL_END_STONE_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block SMALL_END_STONE_BRICK_SLAB = registerBlock("small_end_stone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));
    public static final Block SMALL_END_STONE_BRICK_WALL = registerBlock("small_end_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS)));

    public static final Block MIXED_PURPUR_TILES = registerBlock("mixed_purpur_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));
    public static final Block MIXED_PURPUR_TILE_SLAB = registerBlock("mixed_purpur_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK)));


    public static final Block NETHERITE_STAIRS = registerBlock("netherite_stairs",
            new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
    public static final Block AMETHYST_STAIRS = registerBlock("amethyst_stairs",
            new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(),AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_SLAB = registerBlock("amethyst_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_WALL = registerBlock("amethyst_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BRICK_STAIRS = registerBlock("amethyst_brick_stairs",
            new StairsBlock(ModBlocks.AMETHYST_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BRICK_SLAB = registerBlock("amethyst_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BRICK_WALL = registerBlock("amethyst_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_TILES = registerBlock("amethyst_tiles",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_TILE_STAIRS = registerBlock("amethyst_tile_stairs",
            new StairsBlock(ModBlocks.AMETHYST_TILES.getDefaultState(),AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_TILE_SLAB = registerBlock("amethyst_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));

    public static final Block FRAMED_GLASS = registerBlock("framed_glass",
            new StainedGlassBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.GLASS)));
    public static final Block FRAMED_GLASS_PANE = registerBlock("framed_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.GLASS)));
    public static final Block FRAMED_WHITE_STAINED_GLASS = registerBlock("framed_white_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block FRAMED_WHITE_STAINED_GLASS_PANE = registerBlock("framed_white_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS = registerBlock("framed_light_gray_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("framed_light_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block FRAMED_GRAY_STAINED_GLASS = registerBlock("framed_gray_stained_glass",
            new StainedGlassBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block FRAMED_GRAY_STAINED_GLASS_PANE = registerBlock("framed_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block FRAMED_BLACK_STAINED_GLASS = registerBlock("framed_black_stained_glass",
            new StainedGlassBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block FRAMED_BLACK_STAINED_GLASS_PANE = registerBlock("framed_black_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block FRAMED_BROWN_STAINED_GLASS = registerBlock("framed_brown_stained_glass",
            new StainedGlassBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block FRAMED_BROWN_STAINED_GLASS_PANE = registerBlock("framed_brown_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block FRAMED_RED_STAINED_GLASS = registerBlock("framed_red_stained_glass",
            new StainedGlassBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block FRAMED_RED_STAINED_GLASS_PANE = registerBlock("framed_red_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block FRAMED_ORANGE_STAINED_GLASS = registerBlock("framed_orange_stained_glass",
            new StainedGlassBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block FRAMED_ORANGE_STAINED_GLASS_PANE = registerBlock("framed_orange_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block FRAMED_YELLOW_STAINED_GLASS = registerBlock("framed_yellow_stained_glass",
            new StainedGlassBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block FRAMED_YELLOW_STAINED_GLASS_PANE = registerBlock("framed_yellow_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block FRAMED_LIME_STAINED_GLASS = registerBlock("framed_lime_stained_glass",
            new StainedGlassBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block FRAMED_LIME_STAINED_GLASS_PANE = registerBlock("framed_lime_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block FRAMED_GREEN_STAINED_GLASS = registerBlock("framed_green_stained_glass",
            new StainedGlassBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block FRAMED_GREEN_STAINED_GLASS_PANE = registerBlock("framed_green_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block FRAMED_CYAN_STAINED_GLASS = registerBlock("framed_cyan_stained_glass",
            new StainedGlassBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block FRAMED_CYAN_STAINED_GLASS_PANE = registerBlock("framed_cyan_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS = registerBlock("framed_light_blue_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("framed_light_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block FRAMED_BLUE_STAINED_GLASS = registerBlock("framed_blue_stained_glass",
            new StainedGlassBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block FRAMED_BLUE_STAINED_GLASS_PANE = registerBlock("framed_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block FRAMED_PURPLE_STAINED_GLASS = registerBlock("framed_purple_stained_glass",
            new StainedGlassBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block FRAMED_PURPLE_STAINED_GLASS_PANE = registerBlock("framed_purple_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block FRAMED_MAGENTA_STAINED_GLASS = registerBlock("framed_magenta_stained_glass",
            new StainedGlassBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block FRAMED_MAGENTA_STAINED_GLASS_PANE = registerBlock("framed_magenta_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block FRAMED_PINK_STAINED_GLASS = registerBlock("framed_pink_stained_glass",
            new StainedGlassBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
    public static final Block FRAMED_PINK_STAINED_GLASS_PANE = registerBlock("framed_pink_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
    
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Chiseled.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Chiseled.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Chiseled.LOGGER.info("Registering Mod Blocks for " + Chiseled.MOD_ID);
    }
}