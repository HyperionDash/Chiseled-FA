package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool verticalOakPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.VERTICAL_OAK_PLANKS);
        verticalOakPlanksPool.stairs(ChiseledBlocks.VERTICAL_OAK_STAIRS);
        verticalOakPlanksPool.slab(ChiseledBlocks.VERTICAL_OAK_SLAB);

        BlockStateModelGenerator.BlockTexturePool stonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.STONE);
        stonePool.wall(ChiseledBlocks.STONE_WALL);
        BlockStateModelGenerator.BlockTexturePool polishedStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.POLISHED_STONE);
        polishedStonePool.stairs(ChiseledBlocks.POLISHED_STONE_STAIRS);
        polishedStonePool.slab(ChiseledBlocks.POLISHED_STONE_SLAB);
        polishedStonePool.wall(ChiseledBlocks.POLISHED_STONE_WALL);
        polishedStonePool.pressurePlate(ChiseledBlocks.POLISHED_STONE_PRESSURE_PLATE);
        polishedStonePool.button(ChiseledBlocks.POLISHED_STONE_BUTTON);
        BlockStateModelGenerator.BlockTexturePool mossyPolishedStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.MOSSY_POLISHED_STONE);
        mossyPolishedStonePool.stairs(ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS);
        mossyPolishedStonePool.slab(ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB);
        mossyPolishedStonePool.wall(ChiseledBlocks.MOSSY_POLISHED_STONE_WALL);
        mossyPolishedStonePool.pressurePlate(ChiseledBlocks.MOSSY_POLISHED_STONE_PRESSURE_PLATE);
        mossyPolishedStonePool.button(ChiseledBlocks.MOSSY_POLISHED_STONE_BUTTON);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool stoneTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.STONE_TILES);
        stoneTilesPool.stairs(ChiseledBlocks.STONE_TILE_STAIRS);
        stoneTilesPool.slab(ChiseledBlocks.STONE_TILE_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_STONE_TILES);
        BlockStateModelGenerator.BlockTexturePool mossyStoneTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.MOSSY_STONE_TILES);
        mossyStoneTilesPool.stairs(ChiseledBlocks.MOSSY_STONE_TILE_STAIRS);
        mossyStoneTilesPool.slab(ChiseledBlocks.MOSSY_STONE_TILE_SLAB);
        BlockStateModelGenerator.BlockTexturePool smallStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.SMALL_STONE_BRICKS);
        smallStoneBricksPool.stairs(ChiseledBlocks.SMALL_STONE_BRICK_STAIRS);
        smallStoneBricksPool.slab(ChiseledBlocks.SMALL_STONE_BRICK_SLAB);
        smallStoneBricksPool.wall(ChiseledBlocks.SMALL_STONE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_SMALL_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossySmallStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.MOSSY_SMALL_STONE_BRICKS);
        mossySmallStoneBricksPool.stairs(ChiseledBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS);
        mossySmallStoneBricksPool.slab(ChiseledBlocks.MOSSY_SMALL_STONE_BRICK_SLAB);
        mossySmallStoneBricksPool.wall(ChiseledBlocks.MOSSY_SMALL_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool polishedDeepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DEEPSLATE);
        polishedDeepslatePool.pressurePlate(ChiseledBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        polishedDeepslatePool.button(ChiseledBlocks.POLISHED_DEEPSLATE_BUTTON);
        BlockStateModelGenerator.BlockTexturePool deepslateTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.DEEPSLATE_TILES);
        deepslateTilesPool.stairs(ChiseledBlocks.DEEPSLATE_TILE_STAIRS);
        deepslateTilesPool.slab(ChiseledBlocks.DEEPSLATE_TILE_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_DEEPSLATE_TILES);

        BlockStateModelGenerator.BlockTexturePool polishedGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        polishedGranitePool.wall(ChiseledBlocks.POLISHED_GRANITE_WALL);
        polishedGranitePool.pressurePlate(ChiseledBlocks.POLISHED_GRANITE_PRESSURE_PLATE);
        polishedGranitePool.button(ChiseledBlocks.POLISHED_GRANITE_BUTTON);
        BlockStateModelGenerator.BlockTexturePool polishedGraniteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.POLISHED_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_POLISHED_GRANITE_BRICKS);
        polishedGraniteBricksPool.stairs(ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS);
        polishedGraniteBricksPool.slab(ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB);
        polishedGraniteBricksPool.wall(ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CHISELED_POLISHED_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polishedGraniteTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.POLISHED_GRANITE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_POLISHED_GRANITE_TILES);
        polishedGraniteTilesPool.stairs(ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS);
        polishedGraniteTilesPool.slab(ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB);
        BlockStateModelGenerator.BlockTexturePool smallPolishedGraniteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_SMALL_POLISHED_GRANITE_BRICKS);
        smallPolishedGraniteBricksPool.stairs(ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_STAIRS);
        smallPolishedGraniteBricksPool.slab(ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_SLAB);
        smallPolishedGraniteBricksPool.wall(ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool polishedDioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
        polishedDioritePool.wall(ChiseledBlocks.POLISHED_DIORITE_WALL);
        polishedDioritePool.pressurePlate(ChiseledBlocks.POLISHED_DIORITE_PRESSURE_PLATE);
        polishedDioritePool.button(ChiseledBlocks.POLISHED_DIORITE_BUTTON);
        BlockStateModelGenerator.BlockTexturePool polishedDioriteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.POLISHED_DIORITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_POLISHED_DIORITE_BRICKS);
        polishedDioriteBricksPool.stairs(ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS);
        polishedDioriteBricksPool.slab(ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB);
        polishedDioriteBricksPool.wall(ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CHISELED_POLISHED_DIORITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polishedDioriteTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.POLISHED_DIORITE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_POLISHED_DIORITE_TILES);
        polishedDioriteTilesPool.stairs(ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS);
        polishedDioriteTilesPool.slab(ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB);

        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        polishedAndesitePool.wall(ChiseledBlocks.POLISHED_ANDESITE_WALL);
        polishedAndesitePool.pressurePlate(ChiseledBlocks.POLISHED_ANDESITE_PRESSURE_PLATE);
        polishedAndesitePool.button(ChiseledBlocks.POLISHED_ANDESITE_BUTTON);
        BlockStateModelGenerator.BlockTexturePool polishedAndesiteBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_BRICKS);
        polishedAndesiteBricksPool.stairs(ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
        polishedAndesiteBricksPool.slab(ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB);
        polishedAndesiteBricksPool.wall(ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CHISELED_POLISHED_ANDESITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polishedAndesiteTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.POLISHED_ANDESITE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TILES);
        polishedAndesiteTilesPool.stairs(ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS);
        polishedAndesiteTilesPool.slab(ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB);

        BlockStateModelGenerator.BlockTexturePool polishedTuffPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_TUFF);
        polishedTuffPool.pressurePlate(ChiseledBlocks.POLISHED_TUFF_PRESSURE_PLATE);
        polishedTuffPool.button(ChiseledBlocks.POLISHED_TUFF_BUTTON);
        BlockStateModelGenerator.BlockTexturePool mossyPolishedTuffPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.MOSSY_POLISHED_TUFF);
        mossyPolishedTuffPool.stairs(ChiseledBlocks.MOSSY_POLISHED_TUFF_STAIRS);
        mossyPolishedTuffPool.slab(ChiseledBlocks.MOSSY_POLISHED_TUFF_SLAB);
        mossyPolishedTuffPool.wall(ChiseledBlocks.MOSSY_POLISHED_TUFF_WALL);
        mossyPolishedTuffPool.pressurePlate(ChiseledBlocks.MOSSY_POLISHED_TUFF_PRESSURE_PLATE);
        mossyPolishedTuffPool.button(ChiseledBlocks.MOSSY_POLISHED_TUFF_BUTTON);
        BlockStateModelGenerator.BlockTexturePool mossyTuffBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.MOSSY_TUFF_BRICKS);
        mossyTuffBricksPool.stairs(ChiseledBlocks.MOSSY_TUFF_BRICK_STAIRS);
        mossyTuffBricksPool.slab(ChiseledBlocks.MOSSY_TUFF_BRICK_SLAB);
        mossyTuffBricksPool.wall(ChiseledBlocks.MOSSY_TUFF_BRICK_WALL);
        blockStateModelGenerator.registerSingleton(ChiseledBlocks.MOSSY_CHISELED_TUFF_BRICKS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ChiseledBlocks.MOSSY_CHISELED_TUFF, TexturedModel.CUBE_COLUMN);

        BlockStateModelGenerator.BlockTexturePool mossyBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.MOSSY_BRICKS);
        mossyBricksPool.stairs(ChiseledBlocks.MOSSY_BRICK_STAIRS);
        mossyBricksPool.slab(ChiseledBlocks.MOSSY_BRICK_SLAB);
        mossyBricksPool.wall(ChiseledBlocks.MOSSY_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool weatheredBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.WEATHERED_BRICKS);
        weatheredBricksPool.stairs(ChiseledBlocks.WEATHERED_BRICK_STAIRS);
        weatheredBricksPool.slab(ChiseledBlocks.WEATHERED_BRICK_SLAB);
        weatheredBricksPool.wall(ChiseledBlocks.WEATHERED_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool packedMudPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PACKED_MUD);
        packedMudPool.stairs(ChiseledBlocks.PACKED_MUD_STAIRS);
        packedMudPool.slab(ChiseledBlocks.PACKED_MUD_SLAB);
        packedMudPool.wall(ChiseledBlocks.PACKED_MUD_WALL);
        BlockStateModelGenerator.BlockTexturePool mossyMudBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.MOSSY_MUD_BRICKS);
        mossyMudBricksPool.stairs(ChiseledBlocks.MOSSY_MUD_BRICK_STAIRS);
        mossyMudBricksPool.slab(ChiseledBlocks.MOSSY_MUD_BRICK_SLAB);
        mossyMudBricksPool.wall(ChiseledBlocks.MOSSY_MUD_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mudTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.MUD_TILES);
        mudTilesPool.stairs(ChiseledBlocks.MUD_TILE_STAIRS);
        mudTilesPool.slab(ChiseledBlocks.MUD_TILE_SLAB);
        BlockStateModelGenerator.BlockTexturePool mossyMudTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.MOSSY_MUD_TILES);
        mossyMudTilesPool.stairs(ChiseledBlocks.MOSSY_MUD_TILE_STAIRS);
        mossyMudTilesPool.slab(ChiseledBlocks.MOSSY_MUD_TILE_SLAB);
        BlockStateModelGenerator.BlockTexturePool smallMudBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.SMALL_MUD_BRICKS);
        smallMudBricksPool.stairs(ChiseledBlocks.SMALL_MUD_BRICK_STAIRS);
        smallMudBricksPool.slab(ChiseledBlocks.SMALL_MUD_BRICK_SLAB);
        smallMudBricksPool.wall(ChiseledBlocks.SMALL_MUD_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool mossySmallMudBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.MOSSY_SMALL_MUD_BRICKS);
        mossySmallMudBricksPool.stairs(ChiseledBlocks.MOSSY_SMALL_MUD_BRICK_STAIRS);
        mossySmallMudBricksPool.slab(ChiseledBlocks.MOSSY_SMALL_MUD_BRICK_SLAB);
        mossySmallMudBricksPool.wall(ChiseledBlocks.MOSSY_SMALL_MUD_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothSandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_SANDSTONE);
        smoothSandstonePool.wall(ChiseledBlocks.SMOOTH_SANDSTONE_WALL);
        BlockStateModelGenerator.BlockTexturePool sandstoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.SANDSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_SANDSTONE_BRICKS);
        sandstoneBricksPool.stairs(ChiseledBlocks.SANDSTONE_BRICK_STAIRS);
        sandstoneBricksPool.slab(ChiseledBlocks.SANDSTONE_BRICK_SLAB);
        sandstoneBricksPool.wall(ChiseledBlocks.SANDSTONE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool sandstoneTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.SANDSTONE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_SANDSTONE_TILES);
        sandstoneTilesPool.stairs(ChiseledBlocks.SANDSTONE_TILE_STAIRS);
        sandstoneTilesPool.slab(ChiseledBlocks.SANDSTONE_TILE_SLAB);

        BlockStateModelGenerator.BlockTexturePool smoothRed_SandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_RED_SANDSTONE);
        smoothRed_SandstonePool.wall(ChiseledBlocks.SMOOTH_RED_SANDSTONE_WALL);
        BlockStateModelGenerator.BlockTexturePool red_sandstoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.RED_SANDSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_RED_SANDSTONE_BRICKS);
        red_sandstoneBricksPool.stairs(ChiseledBlocks.RED_SANDSTONE_BRICK_STAIRS);
        red_sandstoneBricksPool.slab(ChiseledBlocks.RED_SANDSTONE_BRICK_SLAB);
        red_sandstoneBricksPool.wall(ChiseledBlocks.RED_SANDSTONE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool red_sandstoneTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.RED_SANDSTONE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_RED_SANDSTONE_TILES);
        red_sandstoneTilesPool.stairs(ChiseledBlocks.RED_SANDSTONE_TILE_STAIRS);
        red_sandstoneTilesPool.slab(ChiseledBlocks.RED_SANDSTONE_TILE_SLAB);

        BlockStateModelGenerator.BlockTexturePool polishedPrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.POLISHED_PRISMARINE);
        polishedPrismarinePool.stairs(ChiseledBlocks.POLISHED_PRISMARINE_STAIRS);
        polishedPrismarinePool.slab(ChiseledBlocks.POLISHED_PRISMARINE_SLAB);
        polishedPrismarinePool.wall(ChiseledBlocks.POLISHED_PRISMARINE_WALL);
        BlockStateModelGenerator.BlockTexturePool prismarineBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        prismarineBricksPool.wall(ChiseledBlocks.PRISMARINE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool prismarineTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.PRISMARINE_TILES);
        prismarineTilesPool.stairs(ChiseledBlocks.PRISMARINE_TILE_STAIRS);
        prismarineTilesPool.slab(ChiseledBlocks.PRISMARINE_TILE_SLAB);
        BlockStateModelGenerator.BlockTexturePool darkPrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        darkPrismarinePool.wall(ChiseledBlocks.DARK_PRISMARINE_WALL);
        BlockStateModelGenerator.BlockTexturePool darkPrismarineTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.DARK_PRISMARINE_TILES);
        darkPrismarineTilesPool.stairs(ChiseledBlocks.DARK_PRISMARINE_TILE_STAIRS);
        darkPrismarineTilesPool.slab(ChiseledBlocks.DARK_PRISMARINE_TILE_SLAB);

        BlockStateModelGenerator.BlockTexturePool smoothBasaltPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_BASALT);
        smoothBasaltPool.stairs(ChiseledBlocks.SMOOTH_BASALT_STAIRS);
        smoothBasaltPool.slab(ChiseledBlocks.SMOOTH_BASALT_SLAB);
        smoothBasaltPool.wall(ChiseledBlocks.SMOOTH_BASALT_WALL);

        BlockStateModelGenerator.BlockTexturePool gildedBlackstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GILDED_BLACKSTONE);
        gildedBlackstonePool.stairs(ChiseledBlocks.GILDED_BLACKSTONE_STAIRS);
        gildedBlackstonePool.slab(ChiseledBlocks.GILDED_BLACKSTONE_SLAB);
        gildedBlackstonePool.wall(ChiseledBlocks.GILDED_BLACKSTONE_WALL);
        BlockStateModelGenerator.BlockTexturePool gildedPolishedBlackstoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.GILDED_POLISHED_BLACKSTONE_BRICKS);
        gildedPolishedBlackstoneBricksPool.stairs(ChiseledBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_STAIRS);
        gildedPolishedBlackstoneBricksPool.slab(ChiseledBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_SLAB);
        gildedPolishedBlackstoneBricksPool.wall(ChiseledBlocks.GILDED_POLISHED_BLACKSTONE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool polishedBlackstoneTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.POLISHED_BLACKSTONE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        polishedBlackstoneTilesPool.stairs(ChiseledBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
        polishedBlackstoneTilesPool.slab(ChiseledBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
        BlockStateModelGenerator.BlockTexturePool gildedPolishedBlackstoneTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.GILDED_POLISHED_BLACKSTONE_TILES);
        gildedPolishedBlackstoneTilesPool.stairs(ChiseledBlocks.GILDED_POLISHED_BLACKSTONE_TILE_STAIRS);
        gildedPolishedBlackstoneTilesPool.slab(ChiseledBlocks.GILDED_POLISHED_BLACKSTONE_TILE_SLAB);
        BlockStateModelGenerator.BlockTexturePool smallPolishedBlackstoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.SMALL_POLISHED_BLACKSTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_SMALL_POLISHED_BLACKSTONE_BRICKS);
        smallPolishedBlackstoneBricksPool.stairs(ChiseledBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS);
        smallPolishedBlackstoneBricksPool.slab(ChiseledBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_SLAB);
        smallPolishedBlackstoneBricksPool.wall(ChiseledBlocks.SMALL_POLISHED_BLACKSTONE_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool gildedSmallPolishedBlackstoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICKS);
        gildedSmallPolishedBlackstoneBricksPool.stairs(ChiseledBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_STAIRS);
        gildedSmallPolishedBlackstoneBricksPool.slab(ChiseledBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_SLAB);
        gildedSmallPolishedBlackstoneBricksPool.wall(ChiseledBlocks.GILDED_SMALL_POLISHED_BLACKSTONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool smoothQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_QUARTZ);
        smoothQuartzPool.wall(ChiseledBlocks.SMOOTH_QUARTZ_WALL);
        BlockStateModelGenerator.BlockTexturePool quartzBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
        quartzBricksPool.stairs(ChiseledBlocks.QUARTZ_BRICK_STAIRS);
        quartzBricksPool.slab(ChiseledBlocks.QUARTZ_BRICK_SLAB);
        quartzBricksPool.wall(ChiseledBlocks.QUARTZ_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool quartzTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.QUARTZ_TILES);
        quartzTilesPool.stairs(ChiseledBlocks.QUARTZ_TILE_STAIRS);
        quartzTilesPool.slab(ChiseledBlocks.QUARTZ_TILE_SLAB);

        BlockStateModelGenerator.BlockTexturePool endStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        endStonePool.stairs(ChiseledBlocks.END_STONE_STAIRS);
        endStonePool.slab(ChiseledBlocks.END_STONE_SLAB);
        endStonePool.wall(ChiseledBlocks.END_STONE_WALL);
        BlockStateModelGenerator.BlockTexturePool polishedEndStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.POLISHED_END_STONE);
        polishedEndStonePool.stairs(ChiseledBlocks.POLISHED_END_STONE_STAIRS);
        polishedEndStonePool.slab(ChiseledBlocks.POLISHED_END_STONE_SLAB);
        polishedEndStonePool.wall(ChiseledBlocks.POLISHED_END_STONE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_END_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CHISELED_END_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool endStoneTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.END_STONE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_END_STONE_TILES);
        endStoneTilesPool.stairs(ChiseledBlocks.END_STONE_TILE_STAIRS);
        endStoneTilesPool.slab(ChiseledBlocks.END_STONE_TILE_SLAB);
        BlockStateModelGenerator.BlockTexturePool smallEndStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.SMALL_END_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ChiseledBlocks.CRACKED_SMALL_END_STONE_BRICKS);
        smallEndStoneBricksPool.stairs(ChiseledBlocks.SMALL_END_STONE_BRICK_STAIRS);
        smallEndStoneBricksPool.slab(ChiseledBlocks.SMALL_END_STONE_BRICK_SLAB);
        smallEndStoneBricksPool.wall(ChiseledBlocks.SMALL_END_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool netheritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERITE_BLOCK);
        netheritePool.stairs(ChiseledBlocks.NETHERITE_STAIRS);

        BlockStateModelGenerator.BlockTexturePool amethystPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.AMETHYST_BLOCK);
        amethystPool.stairs(ChiseledBlocks.AMETHYST_STAIRS);
        amethystPool.slab(ChiseledBlocks.AMETHYST_SLAB);
        amethystPool.wall(ChiseledBlocks.AMETHYST_WALL);
        BlockStateModelGenerator.BlockTexturePool amethystBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.AMETHYST_BRICKS);
        amethystBricksPool.stairs(ChiseledBlocks.AMETHYST_BRICK_STAIRS);
        amethystBricksPool.slab(ChiseledBlocks.AMETHYST_BRICK_SLAB);
        amethystBricksPool.wall(ChiseledBlocks.AMETHYST_BRICK_WALL);
        BlockStateModelGenerator.BlockTexturePool amethystTilesPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ChiseledBlocks.AMETHYST_TILES);
        amethystTilesPool.stairs(ChiseledBlocks.AMETHYST_TILE_STAIRS);
        amethystTilesPool.slab(ChiseledBlocks.AMETHYST_TILE_SLAB);

        BlockStateModelGenerator.BlockTexturePool calcitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);
        calcitePool.stairs(ChiseledBlocks.CALCITE_STAIRS);
        calcitePool.slab(ChiseledBlocks.CALCITE_SLAB);
        calcitePool.wall(ChiseledBlocks.CALCITE_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}