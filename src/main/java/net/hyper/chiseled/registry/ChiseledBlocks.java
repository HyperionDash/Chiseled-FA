package net.hyper.chiseled.registry;

import net.hyper.chiseled.Chiseled;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ChiseledBlocks {

    public static final Block OAK_TRIM = registerBlockWithItem("oak_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_OAK_PLANKS = registerBlockWithItem("vertical_oak_planks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_OAK_STAIRS = registerBlockWithItem("vertical_oak_stairs",
            new StairsBlock(ChiseledBlocks.VERTICAL_OAK_PLANKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block VERTICAL_OAK_SLAB = registerBlockWithItem("vertical_oak_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OAK_TAN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block SPRUCE_TRIM = registerBlockWithItem("spruce_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.SPRUCE_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BIRCH_TRIM = registerBlockWithItem("birch_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block JUNGLE_TRIM = registerBlockWithItem("jungle_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block ACACIA_TRIM = registerBlockWithItem("acacia_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block DARK_OAK_TRIM = registerBlockWithItem("dark_oak_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block MANGROVE_TRIM = registerBlockWithItem("mangrove_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block CHERRY_TRIM = registerBlockWithItem("cherry_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()));
    public static final Block BAMBOO_TRIM = registerBlockWithItem("bamboo_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.YELLOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.BAMBOO_WOOD).burnable()));
    public static final Block CRIMSON_TRIM = registerBlockWithItem("crimson_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DULL_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));
    public static final Block WARPED_TRIM = registerBlockWithItem("warped_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DARK_AQUA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sounds(BlockSoundGroup.NETHER_WOOD)));

    public static final Block STONE_WALL = registerBlockWithItem("stone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE = registerBlockWithItem("polished_stone",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE_STAIRS = registerBlockWithItem("polished_stone_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_STONE.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE_SLAB = registerBlockWithItem("polished_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE_WALL = registerBlockWithItem("polished_stone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_STONE_PRESSURE_PLATE = registerBlockWithItem("polished_stone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_STONE_BUTTON = registerBlockWithItem("polished_stone_button",
            new ButtonBlock(BlockSetType.STONE,20,AbstractBlock.Settings.create()
                    .noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MOSSY_POLISHED_STONE = registerBlockWithItem("mossy_polished_stone",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_POLISHED_STONE_STAIRS = registerBlockWithItem("mossy_polished_stone_stairs",
            new StairsBlock(ChiseledBlocks.MOSSY_POLISHED_STONE.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_POLISHED_STONE_SLAB = registerBlockWithItem("mossy_polished_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_POLISHED_STONE_WALL = registerBlockWithItem("mossy_polished_stone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_POLISHED_STONE_PRESSURE_PLATE = registerBlockWithItem("mossy_polished_stone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MOSSY_POLISHED_STONE_BUTTON = registerBlockWithItem("mossy_polished_stone_button",
            new ButtonBlock(BlockSetType.STONE,20,AbstractBlock.Settings.create()
                    .noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CRACKED_CHISELED_STONE_BRICKS = registerBlockWithItem("cracked_chiseled_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_CHISELED_STONE_BRICKS = registerBlockWithItem("mossy_chiseled_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block STONE_TILES = registerBlockWithItem("stone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_STONE_TILES = registerBlockWithItem("cracked_stone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block STONE_TILE_STAIRS = registerBlockWithItem("stone_tile_stairs",
            new StairsBlock(ChiseledBlocks.STONE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block STONE_TILE_SLAB = registerBlockWithItem("stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block STONE_TILE_WALL = registerBlockWithItem("stone_tile_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_STONE_TILES = registerBlockWithItem("mossy_stone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_STONE_TILE_STAIRS = registerBlockWithItem("mossy_stone_tile_stairs",
            new StairsBlock(ChiseledBlocks.MOSSY_STONE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_STONE_TILE_SLAB = registerBlockWithItem("mossy_stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_STONE_TILE_WALL = registerBlockWithItem("mossy_stone_tile_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_STONE_BRICKS = registerBlockWithItem("small_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_SMALL_STONE_BRICKS = registerBlockWithItem("cracked_small_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_STONE_BRICK_STAIRS = registerBlockWithItem("small_stone_brick_stairs",
            new StairsBlock(ChiseledBlocks.SMALL_STONE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_STONE_BRICK_SLAB = registerBlockWithItem("small_stone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_STONE_BRICK_WALL = registerBlockWithItem("small_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block STONE_TRIM = registerBlockWithItem("stone_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_STONE_TRIM = registerBlockWithItem("cracked_stone_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_SMALL_STONE_BRICKS = registerBlockWithItem("mossy_small_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_SMALL_STONE_BRICK_STAIRS = registerBlockWithItem("mossy_small_stone_brick_stairs",
            new StairsBlock(ChiseledBlocks.MOSSY_SMALL_STONE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_SMALL_STONE_BRICK_SLAB = registerBlockWithItem("mossy_small_stone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_SMALL_STONE_BRICK_WALL = registerBlockWithItem("mossy_small_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MOSSY_STONE_TRIM = registerBlockWithItem("mossy_stone_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MIXED_STONE_TILES = registerBlockWithItem("mixed_stone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MIXED_STONE_TILE_STAIRS = registerBlockWithItem("mixed_stone_tile_stairs",
            new StairsBlock(ChiseledBlocks.MIXED_STONE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MIXED_STONE_TILE_SLAB = registerBlockWithItem("mixed_stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));

    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlockWithItem("polished_deepslate_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY).solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlockWithItem("polished_deepslate_button",
            new ButtonBlock(BlockSetType.STONE,20,AbstractBlock.Settings.create()
                    .noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block DEEPSLATE_TILES = registerBlockWithItem("deepslate_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(3.5F, 6.0F)));
    public static final Block CRACKED_DEEPSLATE_TILES = registerBlockWithItem("cracked_deepslate_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(3.5F, 6.0F)));
    public static final Block DEEPSLATE_TILE_STAIRS = registerBlockWithItem("deepslate_tile_stairs",
            new StairsBlock(ChiseledBlocks.DEEPSLATE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(3.5F, 6.0F)));
    public static final Block DEEPSLATE_TILE_SLAB = registerBlockWithItem("deepslate_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(3.5F, 6.0F)));
    public static final Block DEEPSLATE_TILE_WALL = registerBlockWithItem("deepslate_tile_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(3.5F, 6.0F)));
    public static final Block DEEPSLATE_TRIM = registerBlockWithItem("deepslate_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(3.5F, 6.0F)));
    public static final Block CRACKED_DEEPSLATE_TRIM = registerBlockWithItem("cracked_deepslate_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS).strength(3.5F, 6.0F)));

    public static final Block POLISHED_GRANITE_WALL = registerBlockWithItem("polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = registerBlockWithItem("polished_granite_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_GRANITE_BUTTON = registerBlockWithItem("polished_granite_button",
            new ButtonBlock(BlockSetType.STONE,20,AbstractBlock.Settings.create()
                    .noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_GRANITE_BRICKS = registerBlockWithItem("polished_granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_GRANITE_BRICKS = registerBlockWithItem("cracked_polished_granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_BRICK_STAIRS = registerBlockWithItem("polished_granite_brick_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_GRANITE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_BRICK_SLAB = registerBlockWithItem("polished_granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_BRICK_WALL = registerBlockWithItem("polished_granite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CHISELED_POLISHED_GRANITE_BRICKS = registerBlockWithItem("chiseled_polished_granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_TILES = registerBlockWithItem("polished_granite_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_GRANITE_TILES = registerBlockWithItem("cracked_polished_granite_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_TILE_STAIRS = registerBlockWithItem("polished_granite_tile_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_GRANITE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_TILE_SLAB = registerBlockWithItem("polished_granite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_TILE_WALL = registerBlockWithItem("polished_granite_tile_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_GRANITE_BRICKS = registerBlockWithItem("small_polished_granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_SMALL_POLISHED_GRANITE_BRICKS = registerBlockWithItem("cracked_small_polished_granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_GRANITE_BRICK_STAIRS = registerBlockWithItem("small_polished_granite_brick_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_GRANITE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_GRANITE_BRICK_SLAB = registerBlockWithItem("small_polished_granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_GRANITE_BRICK_WALL = registerBlockWithItem("small_polished_granite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_GRANITE_TRIM = registerBlockWithItem("polished_granite_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_GRANITE_TRIM = registerBlockWithItem("cracked_polished_granite_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));

    public static final Block POLISHED_DIORITE_WALL = registerBlockWithItem("polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = registerBlockWithItem("polished_diorite_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_DIORITE_BUTTON = registerBlockWithItem("polished_diorite_button",
            new ButtonBlock(BlockSetType.STONE,20,AbstractBlock.Settings.create()
                    .noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_DIORITE_BRICKS = registerBlockWithItem("polished_diorite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_DIORITE_BRICKS = registerBlockWithItem("cracked_polished_diorite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_BRICK_STAIRS = registerBlockWithItem("polished_diorite_brick_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_DIORITE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_BRICK_SLAB = registerBlockWithItem("polished_diorite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_BRICK_WALL = registerBlockWithItem("polished_diorite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CHISELED_POLISHED_DIORITE_BRICKS = registerBlockWithItem("chiseled_polished_diorite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_TILES = registerBlockWithItem("polished_diorite_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_DIORITE_TILES = registerBlockWithItem("cracked_polished_diorite_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_TILE_STAIRS = registerBlockWithItem("polished_diorite_tile_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_DIORITE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_TILE_SLAB = registerBlockWithItem("polished_diorite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_TILE_WALL = registerBlockWithItem("polished_diorite_tile_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_DIORITE_BRICKS = registerBlockWithItem("small_polished_diorite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_SMALL_POLISHED_DIORITE_BRICKS = registerBlockWithItem("cracked_small_polished_diorite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_DIORITE_BRICK_STAIRS = registerBlockWithItem("small_polished_diorite_brick_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_DIORITE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_DIORITE_BRICK_SLAB = registerBlockWithItem("small_polished_diorite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_DIORITE_BRICK_WALL = registerBlockWithItem("small_polished_diorite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_DIORITE_TRIM = registerBlockWithItem("polished_diorite_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_DIORITE_TRIM = registerBlockWithItem("cracked_polished_diorite_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));

    public static final Block POLISHED_ANDESITE_WALL = registerBlockWithItem("polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = registerBlockWithItem("polished_andesite_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_ANDESITE_BUTTON = registerBlockWithItem("polished_andesite_button",
            new ButtonBlock(BlockSetType.STONE,20,AbstractBlock.Settings.create()
                    .noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POLISHED_ANDESITE_BRICKS = registerBlockWithItem("polished_andesite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_ANDESITE_BRICKS = registerBlockWithItem("cracked_polished_andesite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_BRICK_STAIRS = registerBlockWithItem("polished_andesite_brick_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_ANDESITE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_BRICK_SLAB = registerBlockWithItem("polished_andesite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_BRICK_WALL = registerBlockWithItem("polished_andesite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CHISELED_POLISHED_ANDESITE_BRICKS = registerBlockWithItem("chiseled_polished_andesite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_TILES = registerBlockWithItem("polished_andesite_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_ANDESITE_TILES = registerBlockWithItem("cracked_polished_andesite_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_TILE_STAIRS = registerBlockWithItem("polished_andesite_tile_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_ANDESITE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_TILE_SLAB = registerBlockWithItem("polished_andesite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_TILE_WALL = registerBlockWithItem("polished_andesite_tile_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_ANDESITE_BRICKS = registerBlockWithItem("small_polished_andesite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_SMALL_POLISHED_ANDESITE_BRICKS = registerBlockWithItem("cracked_small_polished_andesite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_ANDESITE_BRICK_STAIRS = registerBlockWithItem("small_polished_andesite_brick_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_ANDESITE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_ANDESITE_BRICK_SLAB = registerBlockWithItem("small_polished_andesite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_ANDESITE_BRICK_WALL = registerBlockWithItem("small_polished_andesite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_ANDESITE_TRIM = registerBlockWithItem("polished_andesite_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_ANDESITE_TRIM = registerBlockWithItem("cracked_polished_andesite_trim",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));

    public static final Block MOSSY_CHISELED_TUFF = registerBlockWithItem("mossy_chiseled_tuff",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF)));
    public static final Block POLISHED_TUFF_PRESSURE_PLATE = registerBlockWithItem("polished_tuff_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.POLISHED_TUFF)));
    public static final Block POLISHED_TUFF_BUTTON = registerBlockWithItem("polished_tuff_button",
            new ButtonBlock(BlockSetType.STONE,20,AbstractBlock.Settings.create()
                    .noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.POLISHED_TUFF)));
    public static final Block MOSSY_POLISHED_TUFF = registerBlockWithItem("mossy_polished_tuff",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.POLISHED_TUFF)));
    public static final Block MOSSY_POLISHED_TUFF_STAIRS = registerBlockWithItem("mossy_polished_tuff_stairs",
            new StairsBlock(ChiseledBlocks.MOSSY_POLISHED_STONE.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.POLISHED_TUFF)));
    public static final Block MOSSY_POLISHED_TUFF_SLAB = registerBlockWithItem("mossy_polished_tuff_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.POLISHED_TUFF)));
    public static final Block MOSSY_POLISHED_TUFF_WALL = registerBlockWithItem("mossy_polished_tuff_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.POLISHED_TUFF)));
    public static final Block MOSSY_POLISHED_TUFF_PRESSURE_PLATE = registerBlockWithItem("mossy_polished_tuff_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).solid().instrument(NoteBlockInstrument.BASEDRUM).requiresTool().noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.POLISHED_TUFF)));
    public static final Block MOSSY_POLISHED_TUFF_BUTTON = registerBlockWithItem("mossy_polished_tuff_button",
            new ButtonBlock(BlockSetType.STONE,20,AbstractBlock.Settings.create()
                    .noCollision().strength(0.5F).pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.POLISHED_TUFF)));
    public static final Block MOSSY_TUFF_BRICKS = registerBlockWithItem("mossy_tuff_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block MOSSY_TUFF_BRICK_STAIRS = registerBlockWithItem("mossy_tuff_brick_stairs",
            new StairsBlock(ChiseledBlocks.MOSSY_POLISHED_STONE.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block MOSSY_TUFF_BRICK_SLAB = registerBlockWithItem("mossy_tuff_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block MOSSY_TUFF_BRICK_WALL = registerBlockWithItem("mossy_tuff_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));
    public static final Block MOSSY_CHISELED_TUFF_BRICKS = registerBlockWithItem("mossy_chiseled_tuff_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.TUFF_BRICKS)));

    public static final Block MOSSY_BRICKS = registerBlockWithItem("mossy_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MOSSY_BRICK_STAIRS = registerBlockWithItem("mossy_brick_stairs",
            new StairsBlock(ChiseledBlocks.MOSSY_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MOSSY_BRICK_SLAB = registerBlockWithItem("mossy_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MOSSY_BRICK_WALL = registerBlockWithItem("mossy_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block WEATHERED_BRICKS = registerBlockWithItem("weathered_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block WEATHERED_BRICK_STAIRS = registerBlockWithItem("weathered_brick_stairs",
            new StairsBlock(ChiseledBlocks.WEATHERED_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block WEATHERED_BRICK_SLAB = registerBlockWithItem("weathered_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block WEATHERED_BRICK_WALL = registerBlockWithItem("weathered_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    
    public static final Block PACKED_MUD_STAIRS = registerBlockWithItem("packed_mud_stairs",
            new StairsBlock(Blocks.PACKED_MUD.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)));
    public static final Block PACKED_MUD_SLAB = registerBlockWithItem("packed_mud_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)));
    public static final Block PACKED_MUD_WALL = registerBlockWithItem("packed_mud_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIRT_BROWN).strength(1.0F, 3.0F).sounds(BlockSoundGroup.PACKED_MUD)));
    public static final Block MOSSY_MUD_BRICKS = registerBlockWithItem("mossy_mud_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_STAIRS = registerBlockWithItem("mossy_mud_brick_stairs",
            new StairsBlock(ChiseledBlocks.MOSSY_MUD_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_SLAB = registerBlockWithItem("mossy_mud_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_MUD_BRICK_WALL = registerBlockWithItem("mossy_mud_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MUD_TILES = registerBlockWithItem("mud_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MUD_TILE_STAIRS = registerBlockWithItem("mud_tile_stairs",
            new StairsBlock(ChiseledBlocks.MUD_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MUD_TILE_SLAB = registerBlockWithItem("mud_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MUD_TILE_WALL = registerBlockWithItem("mud_tile_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_MUD_TILES = registerBlockWithItem("mossy_mud_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_MUD_TILE_STAIRS = registerBlockWithItem("mossy_mud_tile_stairs",
            new StairsBlock(ChiseledBlocks.MOSSY_MUD_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_MUD_TILE_SLAB = registerBlockWithItem("mossy_mud_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_MUD_TILE_WALL = registerBlockWithItem("mossy_mud_tile_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block SMALL_MUD_BRICKS = registerBlockWithItem("small_mud_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block SMALL_MUD_BRICK_STAIRS = registerBlockWithItem("small_mud_brick_stairs",
            new StairsBlock(ChiseledBlocks.SMALL_MUD_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block SMALL_MUD_BRICK_SLAB = registerBlockWithItem("small_mud_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block SMALL_MUD_BRICK_WALL = registerBlockWithItem("small_mud_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_SMALL_MUD_BRICKS = registerBlockWithItem("mossy_small_mud_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_SMALL_MUD_BRICK_STAIRS = registerBlockWithItem("mossy_small_mud_brick_stairs",
            new StairsBlock(ChiseledBlocks.MOSSY_SMALL_MUD_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_SMALL_MUD_BRICK_SLAB = registerBlockWithItem("mossy_small_mud_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block MOSSY_SMALL_MUD_BRICK_WALL = registerBlockWithItem("mossy_small_mud_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 3.0F).sounds(BlockSoundGroup.MUD_BRICKS)));

    public static final Block SMOOTH_SANDSTONE_WALL = registerBlockWithItem("smooth_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SANDSTONE_BRICKS = registerBlockWithItem("sandstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block CRACKED_SANDSTONE_BRICKS = registerBlockWithItem("cracked_sandstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SANDSTONE_BRICK_STAIRS = registerBlockWithItem("sandstone_brick_stairs",
            new StairsBlock(ChiseledBlocks.SANDSTONE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SANDSTONE_BRICK_SLAB = registerBlockWithItem("sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SANDSTONE_BRICK_WALL = registerBlockWithItem("sandstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SANDSTONE_TILES = registerBlockWithItem("sandstone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block CRACKED_SANDSTONE_TILES = registerBlockWithItem("cracked_sandstone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SANDSTONE_TILE_STAIRS = registerBlockWithItem("sandstone_tile_stairs",
            new StairsBlock(ChiseledBlocks.SANDSTONE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block SANDSTONE_TILE_SLAB = registerBlockWithItem("sandstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    
    public static final Block MIXED_SANDSTONE_TILES = registerBlockWithItem("mixed_sandstone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MIXED_SANDSTONE_TILE_STAIRS = registerBlockWithItem("mixed_sandstone_tile_stairs",
            new StairsBlock(ChiseledBlocks.MIXED_SANDSTONE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block MIXED_SANDSTONE_TILE_SLAB = registerBlockWithItem("mixed_sandstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlockWithItem("smooth_red_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block RED_SANDSTONE_BRICKS = registerBlockWithItem("red_sandstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block CRACKED_RED_SANDSTONE_BRICKS = registerBlockWithItem("cracked_red_sandstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block RED_SANDSTONE_BRICK_STAIRS = registerBlockWithItem("red_sandstone_brick_stairs",
            new StairsBlock(ChiseledBlocks.RED_SANDSTONE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block RED_SANDSTONE_BRICK_SLAB = registerBlockWithItem("red_sandstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block RED_SANDSTONE_BRICK_WALL = registerBlockWithItem("red_sandstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block RED_SANDSTONE_TILES = registerBlockWithItem("red_sandstone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block CRACKED_RED_SANDSTONE_TILES = registerBlockWithItem("cracked_red_sandstone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block RED_SANDSTONE_TILE_STAIRS = registerBlockWithItem("red_sandstone_tile_stairs",
            new StairsBlock(ChiseledBlocks.RED_SANDSTONE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block RED_SANDSTONE_TILE_SLAB = registerBlockWithItem("red_sandstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));

    public static final Block POLISHED_PRISMARINE = registerBlockWithItem("polished_prismarine",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_PRISMARINE_STAIRS = registerBlockWithItem("polished_prismarine_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_PRISMARINE.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_PRISMARINE_SLAB = registerBlockWithItem("polished_prismarine_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_PRISMARINE_WALL = registerBlockWithItem("polished_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block PRISMARINE_BRICK_WALL = registerBlockWithItem("prismarine_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block PRISMARINE_TILES = registerBlockWithItem("prismarine_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block PRISMARINE_TILE_STAIRS = registerBlockWithItem("prismarine_tile_stairs",
            new StairsBlock(ChiseledBlocks.PRISMARINE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block PRISMARINE_TILE_SLAB = registerBlockWithItem("prismarine_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    
    public static final Block MIXED_PRISMARINE_TILES = registerBlockWithItem("mixed_prismarine_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MIXED_PRISMARINE_TILE_STAIRS = registerBlockWithItem("mixed_prismarine_tile_stairs",
            new StairsBlock(ChiseledBlocks.MIXED_PRISMARINE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MIXED_PRISMARINE_TILE_SLAB = registerBlockWithItem("mixed_prismarine_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    
    public static final Block DARK_PRISMARINE_WALL = registerBlockWithItem("dark_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block DARK_PRISMARINE_TILES = registerBlockWithItem("dark_prismarine_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block DARK_PRISMARINE_TILE_STAIRS = registerBlockWithItem("dark_prismarine_tile_stairs",
            new StairsBlock(ChiseledBlocks.DARK_PRISMARINE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block DARK_PRISMARINE_TILE_SLAB = registerBlockWithItem("dark_prismarine_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.DIAMOND_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    
    public static final Block SMOOTH_BASALT_STAIRS = registerBlockWithItem("smooth_basalt_stairs",
            new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_SLAB = registerBlockWithItem("smooth_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.BASALT)));
    public static final Block SMOOTH_BASALT_WALL = registerBlockWithItem("smooth_basalt_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F).sounds(BlockSoundGroup.BASALT)));
    
    public static final Block GILDED_BLACKSTONE_STAIRS = registerBlockWithItem("gilded_blackstone_stairs",
            new StairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_SLAB = registerBlockWithItem("gilded_blackstone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_BLACKSTONE_WALL = registerBlockWithItem("gilded_blackstone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    
    public static final Block GILDED_POLISHED_BLACKSTONE_BRICKS = registerBlockWithItem("gilded_polished_blackstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlockWithItem("gilded_polished_blackstone_brick_stairs",
            new StairsBlock(ChiseledBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlockWithItem("gilded_polished_blackstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlockWithItem("gilded_polished_blackstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlockWithItem("polished_blackstone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_POLISHED_BLACKSTONE_TILES = registerBlockWithItem("cracked_polished_blackstone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlockWithItem("polished_blackstone_tile_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_BLACKSTONE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlockWithItem("polished_blackstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block GILDED_POLISHED_BLACKSTONE_TILES = registerBlockWithItem("gilded_polished_blackstone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_POLISHED_BLACKSTONE_TILE_STAIRS = registerBlockWithItem("gilded_polished_blackstone_tile_stairs",
            new StairsBlock(ChiseledBlocks.GILDED_POLISHED_BLACKSTONE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_POLISHED_BLACKSTONE_TILE_SLAB = registerBlockWithItem("gilded_polished_blackstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlockWithItem("small_polished_blackstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block CRACKED_SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlockWithItem("cracked_small_polished_blackstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlockWithItem("small_polished_blackstone_brick_stairs",
            new StairsBlock(ChiseledBlocks.SMALL_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlockWithItem("small_polished_blackstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block SMALL_POLISHED_BLACKSTONE_BRICK_WALL = registerBlockWithItem("small_polished_blackstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS = registerBlockWithItem("gilded_small_polished_blackstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlockWithItem("gilded_small_polished_blackstone_brick_stairs",
            new StairsBlock(ChiseledBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlockWithItem("gilded_small_polished_blackstone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));
    public static final Block GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_WALL = registerBlockWithItem("gilded_small_polished_blackstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.GILDED_BLACKSTONE)));

    public static final Block MIXED_POLISHED_BLACKSTONE_TILES = registerBlockWithItem("mixed_polished_blackstone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MIXED_POLISHED_BLACKSTONE_TILE_STAIRS = registerBlockWithItem("mixed_polished_blackstone_tile_stairs",
            new StairsBlock(ChiseledBlocks.MIXED_POLISHED_BLACKSTONE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MIXED_POLISHED_BLACKSTONE_TILE_SLAB = registerBlockWithItem("mixed_polished_blackstone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    
    public static final Block QUARTZ_WALL = registerBlockWithItem("quartz_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block SMOOTH_QUARTZ_WALL = registerBlockWithItem("smooth_quartz_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));
    public static final Block QUARTZ_BRICK_STAIRS = registerBlockWithItem("quartz_brick_stairs",
            new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block QUARTZ_BRICK_SLAB = registerBlockWithItem("quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block QUARTZ_BRICK_WALL = registerBlockWithItem("quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block QUARTZ_TILES = registerBlockWithItem("quartz_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block QUARTZ_TILE_STAIRS = registerBlockWithItem("quartz_tile_stairs",
            new StairsBlock(ChiseledBlocks.QUARTZ_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
    public static final Block QUARTZ_TILE_SLAB = registerBlockWithItem("quartz_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));

    public static final Block END_STONE_STAIRS = registerBlockWithItem("end_stone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block END_STONE_SLAB = registerBlockWithItem("end_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block END_STONE_WALL = registerBlockWithItem("end_stone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    
    public static final Block POLISHED_END_STONE = registerBlockWithItem("polished_end_stone",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block POLISHED_END_STONE_STAIRS = registerBlockWithItem("polished_end_stone_stairs",
            new StairsBlock(ChiseledBlocks.POLISHED_END_STONE.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block POLISHED_END_STONE_SLAB = registerBlockWithItem("polished_end_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block POLISHED_END_STONE_WALL = registerBlockWithItem("polished_end_stone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block CRACKED_END_STONE_BRICKS = registerBlockWithItem("cracked_end_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block CHISELED_END_STONE_BRICKS = registerBlockWithItem("chiseled_end_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block END_STONE_TILES = registerBlockWithItem("end_stone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block CRACKED_END_STONE_TILES = registerBlockWithItem("cracked_end_stone_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block END_STONE_TILE_STAIRS = registerBlockWithItem("end_stone_tile_stairs",
            new StairsBlock(ChiseledBlocks.END_STONE_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block END_STONE_TILE_SLAB = registerBlockWithItem("end_stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block SMALL_END_STONE_BRICKS = registerBlockWithItem("small_end_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block CRACKED_SMALL_END_STONE_BRICKS = registerBlockWithItem("cracked_small_end_stone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block SMALL_END_STONE_BRICK_STAIRS = registerBlockWithItem("small_end_stone_brick_stairs",
            new StairsBlock(ChiseledBlocks.SMALL_END_STONE_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block SMALL_END_STONE_BRICK_SLAB = registerBlockWithItem("small_end_stone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));
    public static final Block SMALL_END_STONE_BRICK_WALL = registerBlockWithItem("small_end_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));

    public static final Block MIXED_PURPUR_TILES = registerBlockWithItem("mixed_purpur_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MIXED_PURPUR_TILE_STAIRS = registerBlockWithItem("mixed_purpur_tile_stairs",
            new StairsBlock(ChiseledBlocks.MIXED_PURPUR_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block MIXED_PURPUR_TILE_SLAB = registerBlockWithItem("mixed_purpur_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));

    public static final Block NETHERITE_STAIRS = registerBlockWithItem("netherite_stairs",
            new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK).requiresTool().strength(50.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block AMETHYST_STAIRS = registerBlockWithItem("amethyst_stairs",
            new StairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_SLAB = registerBlockWithItem("amethyst_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_WALL = registerBlockWithItem("amethyst_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_BRICKS = registerBlockWithItem("amethyst_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_BRICK_STAIRS = registerBlockWithItem("amethyst_brick_stairs",
            new StairsBlock(ChiseledBlocks.AMETHYST_BRICKS.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_BRICK_SLAB = registerBlockWithItem("amethyst_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_BRICK_WALL = registerBlockWithItem("amethyst_brick_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_TILES = registerBlockWithItem("amethyst_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_TILE_STAIRS = registerBlockWithItem("amethyst_tile_stairs",
            new StairsBlock(ChiseledBlocks.AMETHYST_TILES.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    public static final Block AMETHYST_TILE_SLAB = registerBlockWithItem("amethyst_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE).strength(1.5F).sounds(BlockSoundGroup.AMETHYST_BLOCK).requiresTool()));
    
    public static final Block TERRACOTTA_STAIRS = registerBlockWithItem("terracotta_stairs",
            new StairsBlock(Blocks.TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_SLAB = registerBlockWithItem("terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block TERRACOTTA_WALL = registerBlockWithItem("terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlockWithItem("white_terracotta_stairs",
            new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(),AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlockWithItem("white_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlockWithItem("white_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlockWithItem("light_gray_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlockWithItem("light_gray_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlockWithItem("light_gray_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlockWithItem("gray_terracotta_stairs",
            new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlockWithItem("gray_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlockWithItem("gray_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlockWithItem("black_terracotta_stairs",
            new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlockWithItem("black_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlockWithItem("black_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlockWithItem("brown_terracotta_stairs",
            new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlockWithItem("brown_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlockWithItem("brown_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_STAIRS = registerBlockWithItem("red_terracotta_stairs",
            new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_SLAB = registerBlockWithItem("red_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block RED_TERRACOTTA_WALL = registerBlockWithItem("red_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlockWithItem("orange_terracotta_stairs",
            new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlockWithItem("orange_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlockWithItem("orange_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlockWithItem("yellow_terracotta_stairs",
            new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlockWithItem("yellow_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlockWithItem("yellow_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlockWithItem("lime_terracotta_stairs",
            new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlockWithItem("lime_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_WALL = registerBlockWithItem("lime_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlockWithItem("green_terracotta_stairs",
            new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlockWithItem("green_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlockWithItem("green_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlockWithItem("cyan_terracotta_stairs",
            new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlockWithItem("cyan_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlockWithItem("cyan_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlockWithItem("light_blue_terracotta_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlockWithItem("light_blue_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlockWithItem("light_blue_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlockWithItem("blue_terracotta_stairs",
            new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlockWithItem("blue_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlockWithItem("blue_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlockWithItem("purple_terracotta_stairs",
            new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlockWithItem("purple_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlockWithItem("purple_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlockWithItem("magenta_terracotta_stairs",
            new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlockWithItem("magenta_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlockWithItem("magenta_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlockWithItem("pink_terracotta_stairs",
            new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlockWithItem("pink_terracotta_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_WALL = registerBlockWithItem("pink_terracotta_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));

    public static final Block WHITE_CONCRETE_STAIRS = registerBlockWithItem("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_SLAB = registerBlockWithItem("white_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CONCRETE_WALL = registerBlockWithItem("white_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlockWithItem("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlockWithItem("light_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlockWithItem("light_gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_STAIRS = registerBlockWithItem("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_SLAB = registerBlockWithItem("gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_WALL = registerBlockWithItem("gray_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Block BLACK_CONCRETE_STAIRS = registerBlockWithItem("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_SLAB = registerBlockWithItem("black_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BLACK_CONCRETE_WALL = registerBlockWithItem("black_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block BROWN_CONCRETE_STAIRS = registerBlockWithItem("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_SLAB = registerBlockWithItem("brown_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block BROWN_CONCRETE_WALL = registerBlockWithItem("brown_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
    public static final Block RED_CONCRETE_STAIRS = registerBlockWithItem("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_SLAB = registerBlockWithItem("red_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block RED_CONCRETE_WALL = registerBlockWithItem("red_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlockWithItem("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlockWithItem("orange_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block ORANGE_CONCRETE_WALL = registerBlockWithItem("orange_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlockWithItem("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlockWithItem("yellow_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block YELLOW_CONCRETE_WALL = registerBlockWithItem("yellow_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_STAIRS = registerBlockWithItem("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_SLAB = registerBlockWithItem("lime_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block LIME_CONCRETE_WALL = registerBlockWithItem("lime_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
    public static final Block GREEN_CONCRETE_STAIRS = registerBlockWithItem("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_SLAB = registerBlockWithItem("green_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block GREEN_CONCRETE_WALL = registerBlockWithItem("green_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
    public static final Block CYAN_CONCRETE_STAIRS = registerBlockWithItem("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_SLAB = registerBlockWithItem("cyan_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block CYAN_CONCRETE_WALL = registerBlockWithItem("cyan_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlockWithItem("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlockWithItem("light_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlockWithItem("light_blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_STAIRS = registerBlockWithItem("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_SLAB = registerBlockWithItem("blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block BLUE_CONCRETE_WALL = registerBlockWithItem("blue_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlockWithItem("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlockWithItem("purple_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_WALL = registerBlockWithItem("purple_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlockWithItem("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlockWithItem("magenta_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlockWithItem("magenta_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
    public static final Block PINK_CONCRETE_STAIRS = registerBlockWithItem("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_SLAB = registerBlockWithItem("pink_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
    public static final Block PINK_CONCRETE_WALL = registerBlockWithItem("pink_concrete_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));

    public static final Block FRAMED_GLASS = registerBlockWithItem("framed_glass",
            new StainedGlassBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.GLASS)));
    public static final Block FRAMED_GLASS_PANE = registerBlockWithItem("framed_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.GLASS)));
    public static final Block FRAMED_WHITE_STAINED_GLASS = registerBlockWithItem("framed_white_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block FRAMED_WHITE_STAINED_GLASS_PANE = registerBlockWithItem("framed_white_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
    public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS = registerBlockWithItem("framed_light_gray_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block FRAMED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlockWithItem("framed_light_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block FRAMED_GRAY_STAINED_GLASS = registerBlockWithItem("framed_gray_stained_glass",
            new StainedGlassBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block FRAMED_GRAY_STAINED_GLASS_PANE = registerBlockWithItem("framed_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
    public static final Block FRAMED_BLACK_STAINED_GLASS = registerBlockWithItem("framed_black_stained_glass",
            new StainedGlassBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block FRAMED_BLACK_STAINED_GLASS_PANE = registerBlockWithItem("framed_black_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
    public static final Block FRAMED_BROWN_STAINED_GLASS = registerBlockWithItem("framed_brown_stained_glass",
            new StainedGlassBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block FRAMED_BROWN_STAINED_GLASS_PANE = registerBlockWithItem("framed_brown_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
    public static final Block FRAMED_RED_STAINED_GLASS = registerBlockWithItem("framed_red_stained_glass",
            new StainedGlassBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block FRAMED_RED_STAINED_GLASS_PANE = registerBlockWithItem("framed_red_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
    public static final Block FRAMED_ORANGE_STAINED_GLASS = registerBlockWithItem("framed_orange_stained_glass",
            new StainedGlassBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block FRAMED_ORANGE_STAINED_GLASS_PANE = registerBlockWithItem("framed_orange_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block FRAMED_YELLOW_STAINED_GLASS = registerBlockWithItem("framed_yellow_stained_glass",
            new StainedGlassBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block FRAMED_YELLOW_STAINED_GLASS_PANE = registerBlockWithItem("framed_yellow_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
    public static final Block FRAMED_LIME_STAINED_GLASS = registerBlockWithItem("framed_lime_stained_glass",
            new StainedGlassBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block FRAMED_LIME_STAINED_GLASS_PANE = registerBlockWithItem("framed_lime_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
    public static final Block FRAMED_GREEN_STAINED_GLASS = registerBlockWithItem("framed_green_stained_glass",
            new StainedGlassBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block FRAMED_GREEN_STAINED_GLASS_PANE = registerBlockWithItem("framed_green_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
    public static final Block FRAMED_CYAN_STAINED_GLASS = registerBlockWithItem("framed_cyan_stained_glass",
            new StainedGlassBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block FRAMED_CYAN_STAINED_GLASS_PANE = registerBlockWithItem("framed_cyan_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
    public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS = registerBlockWithItem("framed_light_blue_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block FRAMED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlockWithItem("framed_light_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block FRAMED_BLUE_STAINED_GLASS = registerBlockWithItem("framed_blue_stained_glass",
            new StainedGlassBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block FRAMED_BLUE_STAINED_GLASS_PANE = registerBlockWithItem("framed_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
    public static final Block FRAMED_PURPLE_STAINED_GLASS = registerBlockWithItem("framed_purple_stained_glass",
            new StainedGlassBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block FRAMED_PURPLE_STAINED_GLASS_PANE = registerBlockWithItem("framed_purple_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block FRAMED_MAGENTA_STAINED_GLASS = registerBlockWithItem("framed_magenta_stained_glass",
            new StainedGlassBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block FRAMED_MAGENTA_STAINED_GLASS_PANE = registerBlockWithItem("framed_magenta_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block FRAMED_PINK_STAINED_GLASS = registerBlockWithItem("framed_pink_stained_glass",
            new StainedGlassBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
    public static final Block FRAMED_PINK_STAINED_GLASS_PANE = registerBlockWithItem("framed_pink_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));

    public static final Block CALCITE_STAIRS = registerBlockWithItem("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(),AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.CALCITE).requiresTool().strength(0.75F)));
    public static final Block CALCITE_SLAB = registerBlockWithItem("calcite_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.CALCITE).requiresTool().strength(0.75F)));
    public static final Block CALCITE_WALL = registerBlockWithItem("calcite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_WHITE).instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.CALCITE).requiresTool().strength(0.75F)));

    private static Block registerBlockWithItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Chiseled.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
        return Registry.register(Registries.BLOCK, Identifier.of(Chiseled.MOD_ID, name), block);
    }

    public static void registerChiseledBlocks() {
        Chiseled.LOGGER.info("Chiseling Bricks");
    }
}