package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;
import net.xanthian.variantbookshelves.util.ModItemTags;

import java.util.Map;
import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    public static void offerBookshelfRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible bookshelf, ItemConvertible planks) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, bookshelf)
                .input('#', planks)
                .input('X', Items.BOOK)
                .pattern("###").pattern("XXX").pattern("###")
                .criterion("has_book", VanillaRecipeProvider.conditionsFromItem(Items.BOOK)).offerTo(exporter);
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

        registerBookshelfRecipe(exporter, AdAstra.AA_BOOKSHELVES, "ad_astra");
        registerBookshelfRecipe(exporter, BeachParty.LDBP_BOOKSHELVES, "beachparty");
        registerBookshelfRecipe(exporter, BetterArcheology.BA_BOOKSHELVES, "betterarcheology");
        registerBookshelfRecipe(exporter, Bewitchment.BW_BOOKSHELVES, "bewitchment");
        registerBookshelfRecipe(exporter, BiomeMakeover.BM_BOOKSHELVES, "biomemakeover");
        registerBookshelfRecipe(exporter, Blockus.BLS_BOOKSHELVES, "blockus");
        registerBookshelfRecipe(exporter, Botania.BOT_BOOKSHELVES, "botania");
        registerBookshelfRecipe(exporter, Cinderscapes.CS_BOOKSHELVES, "cinderscapes");
        registerBookshelfRecipe(exporter, DeeperAndDarker.DAD_BOOKSHELVES, "deeperdarker");
        registerBookshelfRecipe(exporter, Desolation.DS_BOOKSHELVES, "desolation");
        registerBookshelfRecipe(exporter, EldritchEnd.EE_BOOKSHELVES, "eldritch_end");
        registerBookshelfRecipe(exporter, MineCells.MC_BOOKSHELVES, "minecells");
        registerBookshelfRecipe(exporter, NaturesSpirit.NS_BOOKSHELVES, "natures_spirit");
        registerBookshelfRecipe(exporter, Promenade.PROM_BOOKSHELVES, "promenade");
        registerBookshelfRecipe(exporter, RegionsUnexplored.RU_BOOKSHELVES, "regions_unexplored");
        registerBookshelfRecipe(exporter, SnifferPlus.SP_BOOKSHELVES, "snifferplus");
        registerBookshelfRecipe(exporter, TechReborn.TR_BOOKSHELVES, "techreborn");
        registerBookshelfRecipe(exporter, Vinery.LDV_BOOKSHELVES, "vinery");

        // Uncrafting recipe
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.BOOKSHELF, 1)
                .input(ModItemTags.BOOKSHELVES)
                .criterion("has_bookshelf", InventoryChangedCriterion.Conditions.items(Items.BOOKSHELF))
                .offerTo(exporter, new Identifier("variantbookshelves", "bookshelf"));

        // Lectern recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.LECTERN)
                .input('S', ItemTags.WOODEN_SLABS)
                .input('B', ModItemTags.BOOKSHELVES)
                .pattern("SSS").pattern(" B ").pattern(" S ")
                .criterion("has_book", VanillaRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter);
    }

    public void registerBookshelfRecipe(Consumer<RecipeJsonProvider> exporter, Map<Identifier, Block> bookshelves, String modId) {
        registerBookshelfRecipe(exporter, bookshelves, modId, "_planks");
    }

    public void registerBookshelfRecipe(Consumer<RecipeJsonProvider> exporter, Map<Identifier, Block> bookshelves, String modId, String plankSuffix) {
        for (Map.Entry<Identifier, Block> entry : bookshelves.entrySet()) {
            Identifier bookshelfId = entry.getKey();
            Block bookshelf = entry.getValue();
            String path = bookshelfId.getPath();
            int firstUnderscoreIndex = path.indexOf('_');
            int lastUnderscoreIndex = path.lastIndexOf('_');
            if (firstUnderscoreIndex != -1 && lastUnderscoreIndex != -1 && lastUnderscoreIndex > firstUnderscoreIndex) {
                String plankName = path.substring(firstUnderscoreIndex + 1, lastUnderscoreIndex);
                String plankPath = modId + ":" + plankName + plankSuffix;
                offerBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded(modId),
                        DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier(plankPath))))),
                        bookshelf, Registries.ITEM.get(new Identifier(plankPath)));
            } else {
                System.out.println("Invalid block name format: " + path);
            }
        }
    }
}