package net.xanthian.variant_bookshelves.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.variant_bookshelves.Initialise;

public class Bookshelves {

    // Vanilla
    public static void registerVanillaBookshelves() {
        VariantBookshelfBlock ACACIA_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/acacia_bookshelf", ACACIA_BOOKSHELF, true);
        VariantBookshelfBlock BIRCH_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/birch_bookshelf", BIRCH_BOOKSHELF, true);
        VariantBookshelfBlock DARK_OAK_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/dark_oak_bookshelf", DARK_OAK_BOOKSHELF, true);
        VariantBookshelfBlock JUNGLE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/jungle_bookshelf", JUNGLE_BOOKSHELF, true);
        VariantBookshelfBlock MANGROVE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/mangrove_bookshelf", MANGROVE_BOOKSHELF, true);
        VariantBookshelfBlock SPRUCE_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/spruce_bookshelf", SPRUCE_BOOKSHELF, true);
    }
    // Nether
    public static void registerNetherBookshelves() {
        VariantBookshelfBlock CRIMSON_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/crimson_bookshelf", CRIMSON_BOOKSHELF, false);
        VariantBookshelfBlock WARPED_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/warped_bookshelf", WARPED_BOOKSHELF, false);
    }
    // Tech Reborn
    public static void registerTRBookshelves() {
        VariantBookshelfBlock RUBBER_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/rubber_bookshelf", RUBBER_BOOKSHELF, true);
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
    // Simple Mango
    public static void registerSimpleMangoBookshelves() {
        VariantBookshelfBlock MANGO_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/mango_bookshelf", MANGO_BOOKSHELF, true);
    }
    public static void registerTraverseBookshelves() {
        VariantBookshelfBlock FIR_BOOKSHELF = new VariantBookshelfBlock();
        registerBookshelfBlock("block/fir_bookshelf", FIR_BOOKSHELF, true);
    }

    // To-do : Updated Blockus,Promenade, Bewitchment, Biome Makeover,  Enriched, Twigs, Wilder World
    // Not yet updated : Botania, Spectrum, Paradise Lost

    private static void registerBookshelfBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.VARIANT_BOOKSHELVES)));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
    }
}