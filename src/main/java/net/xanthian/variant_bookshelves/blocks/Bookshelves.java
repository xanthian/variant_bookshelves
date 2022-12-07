package net.xanthian.variant_bookshelves.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

import net.xanthian.variant_bookshelves.Initialise;

public class Bookshelves {


    // Overworld
    public static final VariantBookshelfBlock ACACIA_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock BIRCH_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock DARK_OAK_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock JUNGLE_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock MANGROVE_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock SPRUCE_BOOKSHELF = new VariantBookshelfBlock();
    // Nether
    public static final VariantBookshelfBlock CRIMSON_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock WARPED_BOOKSHELF = new VariantBookshelfBlock();

    public static void registerOverworldBookshelves(){
        registerBookshelfBlock("block/acacia_bookshelf", ACACIA_BOOKSHELF, true);
        registerBookshelfBlock("block/birch_bookshelf", BIRCH_BOOKSHELF, true);
        registerBookshelfBlock("block/dark_oak_bookshelf", DARK_OAK_BOOKSHELF, true);
        registerBookshelfBlock("block/jungle_bookshelf", JUNGLE_BOOKSHELF, true);
        registerBookshelfBlock("block/mangrove_bookshelf", MANGROVE_BOOKSHELF, true);
        registerBookshelfBlock("block/spruce_bookshelf", SPRUCE_BOOKSHELF, true);
    }

    // Nether
    public static void registerNetherBookshelves() {
        registerBookshelfBlock("block/crimson_bookshelf", CRIMSON_BOOKSHELF, false);
        registerBookshelfBlock("block/warped_bookshelf", WARPED_BOOKSHELF, false);
    }

    // Tech Reborn
    public static void registerTRBookshelves() {
        VariantBookshelfBlock RUBBER_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/rubber_bookshelf", RUBBER_BOOKSHELF, true);
    }

    // Bewitchment
    public static void registerBewitchmentBookshelves() {
        VariantBookshelfBlock CYPRESS_BOOKSHELF2 = new VariantBookshelfBlock();
        registerBookshelfBlock("block/cypress_bookshelf2", CYPRESS_BOOKSHELF2, true);
        VariantBookshelfBlock DRAGONS_BLOOD_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/dragons_blood_bookshelf", DRAGONS_BLOOD_BOOKSHELF, true);
        VariantBookshelfBlock ELDER_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/elder_bookshelf", ELDER_BOOKSHELF, true);
        VariantBookshelfBlock JUNIPER_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/juniper_bookshelf", JUNIPER_BOOKSHELF, true);
    }
    // Promenade
    public static void registerPromenadeBookshelves() {
        VariantBookshelfBlock CHERRY_OAK_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/cherry_oak_bookshelf", CHERRY_OAK_BOOKSHELF, true);
        VariantBookshelfBlock DARK_AMARANTH_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/dark_amaranth_bookshelf", DARK_AMARANTH_BOOKSHELF, true);
        VariantBookshelfBlock PALM_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/palm_bookshelf", PALM_BOOKSHELF, true);
    }
    // Blockus
    public static void registerBlockusBookshelves() {
        VariantBookshelfBlock BAMBOO_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/bamboo_bookshelf", BAMBOO_BOOKSHELF, true);
        VariantBookshelfBlock CHARRED_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/charred_bookshelf", CHARRED_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_ACACIA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_acacia_bookshelf", HERRINGBONE_ACACIA_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_BAMBOO_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_bamboo_bookshelf", HERRINGBONE_BAMBOO_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_BIRCH_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_birch_bookshelf", HERRINGBONE_BIRCH_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_CHARRED_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_charred_bookshelf", HERRINGBONE_CHARRED_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_CRIMSON_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_crimson_bookshelf", HERRINGBONE_CRIMSON_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_DARK_OAK_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_dark_oak_bookshelf", HERRINGBONE_DARK_OAK_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_JUNGLE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_jungle_bookshelf", HERRINGBONE_JUNGLE_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_MANGROVE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_mangrove_bookshelf", HERRINGBONE_MANGROVE_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_OAK_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_oak_bookshelf", HERRINGBONE_OAK_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_SPRUCE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_spruce_bookshelf", HERRINGBONE_SPRUCE_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_WARPED_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_warped_bookshelf", HERRINGBONE_WARPED_BOOKSHELF, true);
        VariantBookshelfBlock HERRINGBONE_WHITE_OAK_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/herringbone_white_oak_bookshelf", HERRINGBONE_WHITE_OAK_BOOKSHELF, true);
        VariantBookshelfBlock LEGACY_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/legacy_bookshelf", LEGACY_BOOKSHELF, true);
        VariantBookshelfBlock WHITE_OAK_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/white_oak_bookshelf", WHITE_OAK_BOOKSHELF, true);
    }
    // Botania
    public static void registerBotaniaBookshelves() {
        VariantBookshelfBlock DREAMWOOD_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/dreamwood_bookshelf", DREAMWOOD_BOOKSHELF, true);
        VariantBookshelfBlock LIVINGWOOD_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/livingwood_bookshelf", LIVINGWOOD_BOOKSHELF, true);
        VariantBookshelfBlock MOSSY_DREAMWOOD_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/mossy_dreamwood_bookshelf", MOSSY_DREAMWOOD_BOOKSHELF, true);
        VariantBookshelfBlock MOSSY_LIVINGWOOD_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/mossy_livingwood_bookshelf", MOSSY_LIVINGWOOD_BOOKSHELF, true);
        VariantBookshelfBlock SHIMMERWOOD_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/shimmerwood_bookshelf", SHIMMERWOOD_BOOKSHELF, true);
    }
    // Spectrum
    public static void registerSpectrumBookshelves() {
        VariantBookshelfBlock BLACK_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/black_bookshelf", BLACK_BOOKSHELF, true);
        VariantBookshelfBlock BLUE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/blue_bookshelf", BLUE_BOOKSHELF, true);
        VariantBookshelfBlock BROWN_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/brown_bookshelf", BROWN_BOOKSHELF, true);
        VariantBookshelfBlock CYAN_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/cyan_bookshelf", CYAN_BOOKSHELF, true);
        VariantBookshelfBlock GRAY_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/gray_bookshelf", GRAY_BOOKSHELF, true);
        VariantBookshelfBlock GREEN_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/green_bookshelf", GREEN_BOOKSHELF, true);
        VariantBookshelfBlock LIGHT_BLUE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/light_blue_bookshelf", LIGHT_BLUE_BOOKSHELF, true);
        VariantBookshelfBlock LIGHT_GRAY_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/light_gray_bookshelf", LIGHT_GRAY_BOOKSHELF, true);
        VariantBookshelfBlock LIME_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/lime_bookshelf", LIME_BOOKSHELF, true);
        VariantBookshelfBlock MAGENTA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/magenta_bookshelf", MAGENTA_BOOKSHELF, true);
        VariantBookshelfBlock ORANGE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/orange_bookshelf", ORANGE_BOOKSHELF, true);
        VariantBookshelfBlock PINK_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/pink_bookshelf", PINK_BOOKSHELF, true);
        VariantBookshelfBlock PURPLE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/purple_bookshelf", PURPLE_BOOKSHELF, true);
        VariantBookshelfBlock RED_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/red_bookshelf", RED_BOOKSHELF, true);
        VariantBookshelfBlock WHITE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/white_bookshelf", WHITE_BOOKSHELF, true);
        VariantBookshelfBlock YELLOW_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/yellow_bookshelf", YELLOW_BOOKSHELF, true);
    }
    // Biome Makeover
    public static void registerBiomeMakeoverBookshelves() {
        VariantBookshelfBlock ANCIENT_OAK_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/ancient_oak_bookshelf", ANCIENT_OAK_BOOKSHELF, true);
        VariantBookshelfBlock BLIGHTED_BALSA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/blighted_balsa_bookshelf", BLIGHTED_BALSA_BOOKSHELF, true);
        VariantBookshelfBlock SWAMP_CYPRESS_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/swamp_cypress_bookshelf", SWAMP_CYPRESS_BOOKSHELF, true);
        VariantBookshelfBlock WILLOW_BOOKSHELF2 = new VariantBookshelfBlock();
        registerBookshelfBlock("block/willow_bookshelf2", WILLOW_BOOKSHELF2, true);
    }
    // Simple Mango
    public static void registerSimpleMangoBookshelves() {
        VariantBookshelfBlock MANGO_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/mango_bookshelf", MANGO_BOOKSHELF, true);
    }
    // Wilder World
    public static void registerWilderWorldBookshelves() {
        VariantBookshelfBlock WISTERIA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/wisteria_bookshelf", WISTERIA_BOOKSHELF, true);
    }
    // Enriched
    public static void registerEnrichedBookshelves(){
        VariantBookshelfBlock BAMBOO_BOOKSHELF2 = new VariantBookshelfBlock();
        registerBookshelfBlock("block/bamboo_bookshelf2", BAMBOO_BOOKSHELF2, true);
        VariantBookshelfBlock REDWOOD_BOOKSHELF2 = new VariantBookshelfBlock();
        registerBookshelfBlock("block/redwood_bookshelf2", REDWOOD_BOOKSHELF2, true);
    }
    // Ecologics
    public static void registerEcologicsBookshelves() {
        VariantBookshelfBlock AZALEA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/azalea_bookshelf", AZALEA_BOOKSHELF, true);
        VariantBookshelfBlock COCONUT_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/coconut_bookshelf", COCONUT_BOOKSHELF, true);
        VariantBookshelfBlock FLOWERING_AZALEA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/flowering_azalea_bookshelf", FLOWERING_AZALEA_BOOKSHELF, true);
        VariantBookshelfBlock WALNUT_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/walnut_bookshelf", WALNUT_BOOKSHELF, true);
    }
    // Twigs
    public static void registerTwigsBookshelves() {
        VariantBookshelfBlock STRIPPED_BAMBOO_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/stripped_bamboo_bookshelf", STRIPPED_BAMBOO_BOOKSHELF, true);
    }
    // Paradise Lost
    public static void registerParadiseLostBookshelves() {
        VariantBookshelfBlock CRYSTAL_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/crystal_bookshelf", CRYSTAL_BOOKSHELF, true);
        VariantBookshelfBlock GOLDEN_OAK_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/golden_oak_bookshelf", GOLDEN_OAK_BOOKSHELF, true);
        VariantBookshelfBlock ORANGE_BOOKSHELF2 = new VariantBookshelfBlock();
        registerBookshelfBlock("block/orange_bookshelf2", ORANGE_BOOKSHELF2, true);
        VariantBookshelfBlock SKYROOT_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/skyroot_bookshelf", SKYROOT_BOOKSHELF, true);
        VariantBookshelfBlock WISTERIA_BOOKSHELF2 = new VariantBookshelfBlock();
        registerBookshelfBlock("block/wisteria_bookshelf2", WISTERIA_BOOKSHELF2, true);
    }
    // Croptopia
    public static void registerCroptopiaBookshelves() {
        VariantBookshelfBlock CINNAMON_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/cinnamon_bookshelf", CINNAMON_BOOKSHELF, true);
    }
    // Epic Paladins (arclight)
    public static void registerArclightBookshelves() {
        VariantBookshelfBlock JADE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/jade_bookshelf", JADE_BOOKSHELF, true);
        VariantBookshelfBlock MOON_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/moon_bookshelf", MOON_BOOKSHELF, true);
        VariantBookshelfBlock SHADOW_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/shadow_bookshelf", SHADOW_BOOKSHELF, true);
    }
    // Traverse
    public static void registerTraverseBookshelves() {
        VariantBookshelfBlock FIR_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/fir_bookshelf", FIR_BOOKSHELF, true);
    }
    // Terrestria
    public static void registerTerrestriaBookshelves() {
        VariantBookshelfBlock CYPRESS_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/cypress_bookshelf", CYPRESS_BOOKSHELF, true);
        VariantBookshelfBlock HEMLOCK_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/hemlock_bookshelf", HEMLOCK_BOOKSHELF, true);
        VariantBookshelfBlock JAPANESE_MAPLE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/japanese_maple_bookshelf", JAPANESE_MAPLE_BOOKSHELF, true);
        VariantBookshelfBlock RAINBOW_EUCALYPTUS_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/rainbow_eucalyptus_bookshelf", RAINBOW_EUCALYPTUS_BOOKSHELF, true);
        VariantBookshelfBlock REDWOOD_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/redwood_bookshelf", REDWOOD_BOOKSHELF, true);
        VariantBookshelfBlock RUBBER_BOOKSHELF2 = new VariantBookshelfBlock();
        registerBookshelfBlock("block/rubber_bookshelf2", RUBBER_BOOKSHELF2, true);
        VariantBookshelfBlock SAKURA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/sakura_bookshelf", SAKURA_BOOKSHELF, true);
        VariantBookshelfBlock WILLOW_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/willow_bookshelf", WILLOW_BOOKSHELF, true);
        VariantBookshelfBlock YUCCA_PALM_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/yucca_palm_bookshelf", YUCCA_PALM_BOOKSHELF, true);
    }
    // Cinderscapes
    public static void registerCinderscapesBookshelves() {
        VariantBookshelfBlock SCORCHED_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/scorched_bookshelf", SCORCHED_BOOKSHELF, true);
        VariantBookshelfBlock UMBRAL_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/umbral_bookshelf", UMBRAL_BOOKSHELF, true);
    }
    // Colourful Azalea
    public static void registerColourfulAzaleaBookshelves() {
        VariantBookshelfBlock AZULE_AZALEA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/azule_azalea_bookshelf", AZULE_AZALEA_BOOKSHELF, true);
        VariantBookshelfBlock BRIGHT_AZALEA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/bright_azalea_bookshelf", BRIGHT_AZALEA_BOOKSHELF, true);
        VariantBookshelfBlock FISS_AZALEA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/fiss_azalea_bookshelf", FISS_AZALEA_BOOKSHELF, true);
        VariantBookshelfBlock ROZE_AZALEA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/roze_azalea_bookshelf", ROZE_AZALEA_BOOKSHELF, true);
        VariantBookshelfBlock TECAL_AZALEA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/tecal_azalea_bookshelf", TECAL_AZALEA_BOOKSHELF, true);
        VariantBookshelfBlock TITANIUM_AZALEA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/titanium_azalea_bookshelf", TITANIUM_AZALEA_BOOKSHELF, true);
        VariantBookshelfBlock WALNUT_AZALEA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/walnut_azalea_bookshelf", WALNUT_AZALEA_BOOKSHELF, true);
    }
    // Wilder Wild
    public static void registerWilderWildsBookshelves() {
        VariantBookshelfBlock BAOBAB_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/baobab_bookshelf", BAOBAB_BOOKSHELF, true);
        VariantBookshelfBlock CYPRESS_BOOKSHELF3 = new VariantBookshelfBlock();
        registerBookshelfBlock("block/cypress_bookshelf3", CYPRESS_BOOKSHELF3, true);
    }

        private static void registerBookshelfBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
    }
}