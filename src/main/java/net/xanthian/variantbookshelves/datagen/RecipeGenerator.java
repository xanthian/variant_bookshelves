package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;
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

        // Ad Astra (disabled)
        //offerBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("ad_astra")), AdAstra.AA_AERONOS_BOOKSHELF, Registries.ITEM.get(new Identifier("ad_astra:aeronos_planks")));
        //offerBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("ad_astra")), AdAstra.AA_GLACIAN_BOOKSHELF, Registries.ITEM.get(new Identifier("ad_astra:glacian_planks")));
        //offerBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("ad_astra")), AdAstra.AA_STROPHAR_BOOKSHELF, Registries.ITEM.get(new Identifier("ad_astra:strophar_planks")));
        // Beach Party (Lets Do)
        offerBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("beachparty")), BeachParty.LDBP_PALM_BOOKSHELF, Registries.ITEM.get(new Identifier("beachparty:palm_planks")));
        // Better Archeology
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("betterarcheology")), BetterArcheology.BA_ROTTEN_BOOKSHELF, Registries.ITEM.get(new Identifier("betterarcheology:rotten_planks")));
        // Bewitchment
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")), Bewitchment.BW_CYPRESS_BOOKSHELF, Registries.ITEM.get(new Identifier("bewitchment:cypress_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")), Bewitchment.BW_DRAGONS_BLOOD_BOOKSHELF, Registries.ITEM.get(new Identifier("bewitchment:dragons_blood_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")), Bewitchment.BW_ELDER_BOOKSHELF, Registries.ITEM.get(new Identifier("bewitchment:elder_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("bewitchment")), Bewitchment.BW_JUNIPER_BOOKSHELF, Registries.ITEM.get(new Identifier("bewitchment:juniper_planks")));
        // Deeper & Darker (disabled)
        //offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("deeperdarker")),DeeperAndDarker.DAD_ECHO_BOOKSHELF, Registries.ITEM.get(new Identifier("deeperanddarker:echo_planks")));
        // Promenade
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")), Promenade.PROM_DARK_AMARANTH_BOOKSHELF, Registries.ITEM.get(new Identifier("promenade:dark_amaranth_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")), Promenade.PROM_MAPLE_BOOKSHELF, Registries.ITEM.get(new Identifier("promenade:maple_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")), Promenade.PROM_PALM_BOOKSHELF, Registries.ITEM.get(new Identifier("promenade:palm_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("promenade")), Promenade.PROM_SAKURA_BOOKSHELF, Registries.ITEM.get(new Identifier("promenade:sakura_planks")));
        // Regions Unexplored
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_ALPHA_OAK_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:alpha_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_BAOBAB_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:baobab_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_BLACK_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:black_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_BLACKWOOD_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:blackwood_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_BLUE_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:blue_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_BROWN_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:brown_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_CHERRY_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:cherry_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_CYAN_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:cyan_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_CYPRESS_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:cypress_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_DEAD_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:dead_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_EUCALYPTUS_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:eucalyptus_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_GREEN_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:green_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_GRAY_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:gray_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_JOSHUA_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:joshua_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_LARCH_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:larch_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:light_blue_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:light_gray_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_LIME_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:lime_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_MAGENTA_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:magenta_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_MAPLE_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:maple_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_MAUVE_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:mauve_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_ORANGE_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:orange_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_PALM_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:palm_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_PINE_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:pine_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_PINK_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:pink_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_PURPLE_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:purple_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_RED_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:red_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_REDWOOD_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:redwood_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_SCULKWOOD_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:sculkwood_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_WHITE_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:white_painted_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_WILLOW_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:willow_planks")));
        offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("regions_unexplored")), RegionsUnexplored.RU_YELLOW_PAINTED_BOOKSHELF, Registries.ITEM.get(new Identifier("regions_unexplored:yellow_painted_planks")));
        // SnifferPlus (disabled)
        //offerBookshelfRecipe(withConditions(exporter,DefaultResourceConditions.allModsLoaded("snifferplus")), SnifferPlus.SP_STONE_PINE_BOOKSHELF, "snifferplus:stone_pine_planks");
        // Tech Reborn
        offerBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("techreborn")), TechReborn.TR_RUBBER_BOOKSHELF, Registries.ITEM.get(new Identifier("techreborn:rubber_planks")));
        // Vinery (Lets Do)
        offerBookshelfRecipe(withConditions(exporter, DefaultResourceConditions.allModsLoaded("vinery")), Vinery.LDV_CHERRY_BOOKSHELF, Registries.ITEM.get(new Identifier("vinery:cherry_planks")));

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