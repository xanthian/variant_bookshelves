package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.util.ModItemTags;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerBookshelfRecipe(exporter, Vanilla.ACACIA_BOOKSHELF, Items.ACACIA_PLANKS);
        offerBookshelfRecipe(exporter, Vanilla.BAMBOO_BOOKSHELF, Items.BAMBOO_PLANKS);
        offerBookshelfRecipe(exporter, Vanilla.BIRCH_BOOKSHELF, Items.BIRCH_PLANKS);
        offerBookshelfRecipe(exporter, Vanilla.CHERRY_BOOKSHELF, Items.CHERRY_PLANKS);
        offerBookshelfRecipe(exporter, Vanilla.DARK_OAK_BOOKSHELF, Items.DARK_OAK_PLANKS);
        offerBookshelfRecipe(exporter, Vanilla.JUNGLE_BOOKSHELF, Items.JUNGLE_PLANKS);
        offerBookshelfRecipe(exporter, Vanilla.MANGROVE_BOOKSHELF, Items.MANGROVE_PLANKS);
        offerBookshelfRecipe(exporter, Vanilla.SPRUCE_BOOKSHELF, Items.SPRUCE_PLANKS);
        offerBookshelfRecipe(exporter, Vanilla.CRIMSON_BOOKSHELF, Items.CRIMSON_PLANKS);
        offerBookshelfRecipe(exporter, Vanilla.WARPED_BOOKSHELF, Items.WARPED_PLANKS);

        // Uncrafting recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BOOKSHELF,1)
                .input(ModItemTags.BOOKSHELVES)
                .criterion("has_bookshelf",InventoryChangedCriterion.Conditions.items(Items.BOOKSHELF))
                .offerTo(exporter,new Identifier("variantbookshelves", "bookshelf"));

        // Lectern recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.LECTERN)
                .input('S', ItemTags.WOODEN_SLABS)
                .input('B', ModItemTags.BOOKSHELVES)
                .pattern("SSS").pattern(" B ").pattern(" S ")
                .criterion("has_book", VanillaRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter);
    }

    public static void offerBookshelfRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible bookshelf, ItemConvertible planks) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, bookshelf)
                .input('#', planks)
                .input('X', Items.BOOK)
                .pattern("###").pattern("XXX").pattern("###")
                .criterion("has_book", VanillaRecipeProvider.conditionsFromItem(Items.BOOK)).offerTo(exporter);
    }
}