package net.hyper.chiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hyper.chiseled.registry.ChiseledBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.OAK_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.OAK_PLANKS)
                .input('#', Blocks.OAK_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SPRUCE_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.SPRUCE_PLANKS)
                .input('#', Blocks.SPRUCE_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.BIRCH_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.BIRCH_PLANKS)
                .input('#', Blocks.BIRCH_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.JUNGLE_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.JUNGLE_PLANKS)
                .input('#', Blocks.JUNGLE_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.ACACIA_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.ACACIA_PLANKS)
                .input('#', Blocks.ACACIA_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DARK_OAK_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.DARK_OAK_PLANKS)
                .input('#', Blocks.DARK_OAK_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MANGROVE_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.MANGROVE_PLANKS)
                .input('#', Blocks.MANGROVE_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHERRY_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.CHERRY_PLANKS)
                .input('#', Blocks.CHERRY_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.BAMBOO_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.BAMBOO_PLANKS)
                .input('#', Blocks.BAMBOO_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRIMSON_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.CRIMSON_PLANKS)
                .input('#', Blocks.CRIMSON_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.WARPED_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.WARPED_PLANKS)
                .input('#', Blocks.WARPED_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', Blocks.STONE)
                .criterion(hasItem(ChiseledBlocks.STONE_WALL), conditionsFromItem(ChiseledBlocks.STONE_WALL))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_WALL, Blocks.STONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS, 4)
                .pattern("## ")
                .pattern("## ")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICKS, ChiseledBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_SLAB, ChiseledBlocks.POLISHED_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.STONE_BRICK_WALL, ChiseledBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_STONE_BRICKS, ChiseledBlocks.POLISHED_STONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE, 4)
                .pattern("## ")
                .pattern("## ")
                .pattern("   ")
                .input('#', Blocks.STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE, Blocks.STONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.POLISHED_STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_STAIRS, ChiseledBlocks.POLISHED_STONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, Blocks.STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_SLAB, ChiseledBlocks.POLISHED_STONE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_WALL, ChiseledBlocks.POLISHED_STONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_PRESSURE_PLATE)
                .pattern("   ")
                .pattern("## ")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_STONE_BUTTON)
                .input(ChiseledBlocks.POLISHED_STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE)
                .input(ChiseledBlocks.POLISHED_STONE)
                .input(Blocks.MOSS_BLOCK)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter, "mossy_polished_stone_from_moss");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE)
                .input(ChiseledBlocks.POLISHED_STONE)
                .input(Blocks.VINE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter, "mossy_polished_stone_from_vine");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.MOSSY_POLISHED_STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE_STAIRS, ChiseledBlocks.MOSSY_POLISHED_STONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.MOSSY_POLISHED_STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE_SLAB, ChiseledBlocks.MOSSY_POLISHED_STONE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.MOSSY_POLISHED_STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE_WALL, ChiseledBlocks.MOSSY_POLISHED_STONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE_PRESSURE_PLATE)
                .pattern("   ")
                .pattern("## ")
                .pattern("   ")
                .input('#', ChiseledBlocks.MOSSY_POLISHED_STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_POLISHED_STONE_BUTTON)
                .input(ChiseledBlocks.MOSSY_POLISHED_STONE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);

        offerSmelting(exporter, List.of(Blocks.CHISELED_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_CHISELED_STONE_BRICKS, 0.1f, 200, "cracked_chiseled_stone_bricks");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS)
                .input(Blocks.CHISELED_STONE_BRICKS)
                .input(Blocks.MOSS_BLOCK)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter, "mossy_chiseled_stone_bricks_from_moss");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_CHISELED_STONE_BRICKS)
                .input(Blocks.CHISELED_STONE_BRICKS)
                .input(Blocks.VINE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter, "mossy_chiseled_stone_bricks_from_vine");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES)
                .pattern(" # ")
                .pattern(" # ")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_STONE_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILES, ChiseledBlocks.POLISHED_STONE);
        offerSmelting(exporter, List.of(ChiseledBlocks.STONE_TILES), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_STONE_TILES, 0.1f, 200, "cracked_stone_tiles");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.STONE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, ChiseledBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_STAIRS, ChiseledBlocks.STONE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.STONE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, Blocks.STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, ChiseledBlocks.POLISHED_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_SLAB, ChiseledBlocks.STONE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.STONE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, ChiseledBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TILE_WALL, ChiseledBlocks.STONE_TILES);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILES)
                .input(ChiseledBlocks.STONE_TILES)
                .input(Blocks.MOSS_BLOCK)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter, "mossy_stone_tiles_from_moss");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILES)
                .input(ChiseledBlocks.STONE_TILES)
                .input(Blocks.VINE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter, "mossy_stone_tiles_from_vine");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.MOSSY_STONE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_STAIRS, ChiseledBlocks.MOSSY_STONE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.MOSSY_STONE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_SLAB, ChiseledBlocks.MOSSY_STONE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.MOSSY_STONE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TILE_WALL, ChiseledBlocks.MOSSY_STONE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICKS, 4)
                .pattern("## ")
                .pattern("## ")
                .pattern("   ")
                .input('#', Blocks.STONE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICKS, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICKS, ChiseledBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICKS, Blocks.STONE_BRICKS);
        offerSmelting(exporter, List.of(ChiseledBlocks.SMALL_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_SMALL_STONE_BRICKS, 0.1f, 200, "cracked_small_stone_bricks");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.SMALL_STONE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_STAIRS, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_STAIRS, ChiseledBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_STAIRS, Blocks.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_STAIRS, ChiseledBlocks.SMALL_STONE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.SMALL_STONE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_SLAB, Blocks.STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_SLAB, ChiseledBlocks.POLISHED_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_SLAB, Blocks.STONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_SLAB, ChiseledBlocks.SMALL_STONE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.SMALL_STONE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_WALL, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_WALL, ChiseledBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_WALL, Blocks.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_STONE_BRICK_WALL, ChiseledBlocks.SMALL_STONE_BRICKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_SMALL_STONE_BRICKS)
                .input(ChiseledBlocks.SMALL_STONE_BRICKS)
                .input(Blocks.MOSS_BLOCK)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter, "mossy_small_stone_bricks_from_moss");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_SMALL_STONE_BRICKS)
                .input(ChiseledBlocks.SMALL_STONE_BRICKS)
                .input(Blocks.VINE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter, "mossy_small_stone_bricks_from_vine");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.MOSSY_SMALL_STONE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_SMALL_STONE_BRICK_STAIRS, ChiseledBlocks.MOSSY_SMALL_STONE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_SMALL_STONE_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.MOSSY_SMALL_STONE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_SMALL_STONE_BRICK_SLAB, ChiseledBlocks.MOSSY_SMALL_STONE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_SMALL_STONE_BRICK_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.MOSSY_SMALL_STONE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_SMALL_STONE_BRICK_WALL, ChiseledBlocks.MOSSY_SMALL_STONE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', ChiseledBlocks.SMALL_STONE_BRICKS)
                .input('#', ChiseledBlocks.SMALL_STONE_BRICK_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TRIM, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TRIM, ChiseledBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TRIM, Blocks.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.STONE_TRIM, ChiseledBlocks.SMALL_STONE_BRICKS);
        offerSmelting(exporter, List.of(ChiseledBlocks.STONE_TRIM), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_STONE_TRIM, 0.1f, 200, "cracked_stone_trim");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TRIM)
                .input(ChiseledBlocks.STONE_TRIM)
                .input(Blocks.MOSS_BLOCK)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter, "mossy_stone_trim_from_moss");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MOSSY_STONE_TRIM)
                .input(ChiseledBlocks.STONE_TRIM)
                .input(Blocks.VINE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter, "mossy_stone_trim_from_vine");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILES, 4)
                .pattern("0# ")
                .pattern("#0 ")
                .pattern("   ")
                .input('#', ChiseledBlocks.DEEPSLATE_TILES)
                .input('0', ChiseledBlocks.STONE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILES, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILES, ChiseledBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILES, ChiseledBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILES, Blocks.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILES, Blocks.POLISHED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILES, ChiseledBlocks.DEEPSLATE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.MIXED_STONE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_STAIRS, Blocks.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_STAIRS, ChiseledBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_STAIRS, ChiseledBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_STAIRS, ChiseledBlocks.MIXED_STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_STAIRS, Blocks.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_STAIRS, Blocks.POLISHED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_STAIRS, ChiseledBlocks.DEEPSLATE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.MIXED_STONE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_SLAB, Blocks.STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_SLAB, ChiseledBlocks.POLISHED_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_SLAB, ChiseledBlocks.STONE_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_SLAB, ChiseledBlocks.MIXED_STONE_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_SLAB, Blocks.COBBLED_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_SLAB, Blocks.POLISHED_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.MIXED_STONE_TILE_SLAB, ChiseledBlocks.DEEPSLATE_TILES, 2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE)
                .pattern("   ")
                .pattern("## ")
                .pattern("   ")
                .input('#', Blocks.POLISHED_DEEPSLATE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DEEPSLATE_BUTTON)
                .input(Blocks.POLISHED_DEEPSLATE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILES)
                .pattern(" # ")
                .pattern(" # ")
                .pattern("   ")
                .input('#', Blocks.POLISHED_DEEPSLATE_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILES, Blocks.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILES, Blocks.POLISHED_DEEPSLATE);
        offerSmelting(exporter, List.of(ChiseledBlocks.DEEPSLATE_TILES), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_DEEPSLATE_TILES, 0.1f, 200, "cracked_deepslate_tiles");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.DEEPSLATE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_STAIRS, Blocks.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_STAIRS, Blocks.POLISHED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_STAIRS, ChiseledBlocks.DEEPSLATE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.DEEPSLATE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_SLAB, Blocks.COBBLED_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_SLAB, Blocks.POLISHED_DEEPSLATE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_SLAB, ChiseledBlocks.DEEPSLATE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.DEEPSLATE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_WALL, Blocks.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_WALL, Blocks.POLISHED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TILE_WALL, ChiseledBlocks.DEEPSLATE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', Blocks.DEEPSLATE_TILES)
                .input('#', Blocks.DEEPSLATE_TILE_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TRIM, Blocks.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TRIM, Blocks.POLISHED_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TRIM, Blocks.DEEPSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.DEEPSLATE_TRIM, Blocks.DEEPSLATE_TILES);
        offerSmelting(exporter, List.of(ChiseledBlocks.DEEPSLATE_TRIM), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_DEEPSLATE_TRIM, 0.1f, 200, "cracked_deepslate_trim");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', Blocks.POLISHED_GRANITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_PRESSURE_PLATE)
                .pattern("   ")
                .pattern("## ")
                .pattern("   ")
                .input('#', Blocks.POLISHED_GRANITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BUTTON)
                .input(Blocks.POLISHED_GRANITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS, 4)
                .pattern("## ")
                .pattern("## ")
                .pattern("   ")
                .input('#', Blocks.POLISHED_GRANITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
        offerSmelting(exporter, List.of(ChiseledBlocks.POLISHED_GRANITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_POLISHED_GRANITE_BRICKS, 0.1f, 200, "cracked_polished_granite_bricks");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.POLISHED_GRANITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_GRANITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB, ChiseledBlocks.POLISHED_GRANITE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_GRANITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_BRICK_WALL, ChiseledBlocks.POLISHED_GRANITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_GRANITE_BRICKS)
                .pattern(" # ")
                .pattern(" # ")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_GRANITE_BRICK_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_GRANITE_BRICKS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_GRANITE_BRICKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILES)
                .pattern(" # ")
                .pattern(" # ")
                .pattern("   ")
                .input('#', Blocks.POLISHED_GRANITE_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILES, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILES, Blocks.POLISHED_GRANITE);
        offerSmelting(exporter, List.of(ChiseledBlocks.POLISHED_GRANITE_TILES), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_POLISHED_GRANITE_TILES, 0.1f, 200, "cracked_polished_granite_tiles");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.POLISHED_GRANITE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_STAIRS, ChiseledBlocks.POLISHED_GRANITE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_GRANITE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, Blocks.GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, Blocks.POLISHED_GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_SLAB, ChiseledBlocks.POLISHED_GRANITE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_GRANITE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TILE_WALL, ChiseledBlocks.POLISHED_GRANITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS, 4)
                .pattern("## ")
                .pattern("## ")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_GRANITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
        offerSmelting(exporter, List.of(ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_SMALL_POLISHED_GRANITE_BRICKS, 0.1f, 200, "cracked_small_polished_granite_bricks");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_STAIRS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_STAIRS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_SLAB, Blocks.GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_SLAB, ChiseledBlocks.POLISHED_GRANITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_SLAB, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_WALL, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_WALL, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_WALL, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS)
                .input('#', ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICK_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TRIM, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TRIM, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TRIM, ChiseledBlocks.POLISHED_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_GRANITE_TRIM, ChiseledBlocks.SMALL_POLISHED_GRANITE_BRICKS);
        offerSmelting(exporter, List.of(ChiseledBlocks.POLISHED_GRANITE_TRIM), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_POLISHED_GRANITE_TRIM, 0.1f, 200, "cracked_polished_granite_trim");
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', Blocks.POLISHED_DIORITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_PRESSURE_PLATE)
                .pattern("   ")
                .pattern("## ")
                .pattern("   ")
                .input('#', Blocks.POLISHED_DIORITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BUTTON)
                .input(Blocks.POLISHED_DIORITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS, 4)
                .pattern("## ")
                .pattern("## ")
                .pattern("   ")
                .input('#', Blocks.POLISHED_DIORITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
        offerSmelting(exporter, List.of(ChiseledBlocks.POLISHED_DIORITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_POLISHED_DIORITE_BRICKS, 0.1f, 200, "cracked_polished_diorite_bricks");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.POLISHED_DIORITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_DIORITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, Blocks.DIORITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB, ChiseledBlocks.POLISHED_DIORITE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_DIORITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_BRICK_WALL, ChiseledBlocks.POLISHED_DIORITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_DIORITE_BRICKS)
                .pattern(" # ")
                .pattern(" # ")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_DIORITE_BRICK_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_DIORITE_BRICKS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_DIORITE_BRICKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILES)
                .pattern(" # ")
                .pattern(" # ")
                .pattern("   ")
                .input('#', Blocks.POLISHED_DIORITE_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILES, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILES, Blocks.POLISHED_DIORITE);
        offerSmelting(exporter, List.of(ChiseledBlocks.POLISHED_DIORITE_TILES), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_POLISHED_DIORITE_TILES, 0.1f, 200, "cracked_polished_diorite_tiles");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.POLISHED_DIORITE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_STAIRS, ChiseledBlocks.POLISHED_DIORITE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_DIORITE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, Blocks.DIORITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, Blocks.POLISHED_DIORITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_SLAB, ChiseledBlocks.POLISHED_DIORITE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_DIORITE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TILE_WALL, ChiseledBlocks.POLISHED_DIORITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS, 4)
                .pattern("## ")
                .pattern("## ")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_DIORITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
        offerSmelting(exporter, List.of(ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_SMALL_POLISHED_DIORITE_BRICKS, 0.1f, 200, "cracked_small_polished_diorite_bricks");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_STAIRS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_STAIRS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_SLAB, Blocks.DIORITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_SLAB, ChiseledBlocks.POLISHED_DIORITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_SLAB, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_WALL, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_WALL, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_WALL, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS)
                .input('#', ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICK_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TRIM, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TRIM, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TRIM, ChiseledBlocks.POLISHED_DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_DIORITE_TRIM, ChiseledBlocks.SMALL_POLISHED_DIORITE_BRICKS);
        offerSmelting(exporter, List.of(ChiseledBlocks.POLISHED_DIORITE_TRIM), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_POLISHED_DIORITE_TRIM, 0.1f, 200, "cracked_polished_diorite_trim");
        
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', Blocks.POLISHED_ANDESITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_PRESSURE_PLATE)
                .pattern("   ")
                .pattern("## ")
                .pattern("   ")
                .input('#', Blocks.POLISHED_ANDESITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BUTTON)
                .input(Blocks.POLISHED_ANDESITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, 4)
                .pattern("## ")
                .pattern("## ")
                .pattern("   ")
                .input('#', Blocks.POLISHED_ANDESITE)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
        offerSmelting(exporter, List.of(ChiseledBlocks.POLISHED_ANDESITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_POLISHED_ANDESITE_BRICKS, 0.1f, 200, "cracked_polished_andesite_bricks");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.POLISHED_ANDESITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_ANDESITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, Blocks.ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_ANDESITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_BRICK_WALL, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_ANDESITE_BRICKS)
                .pattern(" # ")
                .pattern(" # ")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_ANDESITE_BRICK_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_ANDESITE_BRICKS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CHISELED_POLISHED_ANDESITE_BRICKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILES)
                .pattern(" # ")
                .pattern(" # ")
                .pattern("   ")
                .input('#', Blocks.POLISHED_ANDESITE_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILES, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILES, Blocks.POLISHED_ANDESITE);
        offerSmelting(exporter, List.of(ChiseledBlocks.POLISHED_ANDESITE_TILES), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TILES, 0.1f, 200, "cracked_polished_andesite_tiles");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.POLISHED_ANDESITE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_STAIRS, ChiseledBlocks.POLISHED_ANDESITE_TILES);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_ANDESITE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, Blocks.ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, Blocks.POLISHED_ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_SLAB, ChiseledBlocks.POLISHED_ANDESITE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_ANDESITE_TILES)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TILE_WALL, ChiseledBlocks.POLISHED_ANDESITE_TILES);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS, 4)
                .pattern("## ")
                .pattern("## ")
                .pattern("   ")
                .input('#', ChiseledBlocks.POLISHED_ANDESITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
        offerSmelting(exporter, List.of(ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_SMALL_POLISHED_ANDESITE_BRICKS, 0.1f, 200, "cracked_small_polished_andesite_bricks");
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_STAIRS, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_STAIRS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_SLAB, 6)
                .pattern("   ")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_SLAB, Blocks.ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_SLAB, ChiseledBlocks.POLISHED_ANDESITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_SLAB, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_WALL, 6)
                .pattern("###")
                .pattern("###")
                .pattern("   ")
                .input('#', ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_WALL, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_WALL, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TRIM, 2)
                .pattern(" # ")
                .pattern(" 0 ")
                .pattern(" # ")
                .input('0', ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS)
                .input('#', ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICK_SLAB)
                .criterion(hasItem(Blocks.AIR), conditionsFromItem(Blocks.AIR))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TRIM, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TRIM, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TRIM, ChiseledBlocks.POLISHED_ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.POLISHED_ANDESITE_TRIM, ChiseledBlocks.SMALL_POLISHED_ANDESITE_BRICKS);
        offerSmelting(exporter, List.of(ChiseledBlocks.POLISHED_ANDESITE_TRIM), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_POLISHED_ANDESITE_TRIM, 0.1f, 200, "cracked_polished_andesite_trim");

        offerSmelting(exporter, List.of(ChiseledBlocks.SMALL_END_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, ChiseledBlocks.CRACKED_SMALL_END_STONE_BRICKS, 0.1f, 200, "cracked_small_end_stone_bricks");
    }
}