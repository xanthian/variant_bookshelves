package net.xanthian.variant_bookshelves.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.variant_bookshelves.Initialise;

public class Bookshelves {

    // Vanilla
    public static void registerVanillaBookshelves() {
        Block ACACIA_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/acacia_bookshelf", ACACIA_BOOKSHELF, true);
        Block BIRCH_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/birch_bookshelf", BIRCH_BOOKSHELF, true);
        Block DARK_OAK_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/dark_oak_bookshelf", DARK_OAK_BOOKSHELF, true);
        Block JUNGLE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/jungle_bookshelf", JUNGLE_BOOKSHELF, true);
        Block MANGROVE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/mangrove_bookshelf", MANGROVE_BOOKSHELF, true);
        Block SPRUCE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/spruce_bookshelf", SPRUCE_BOOKSHELF, true);
    }
    // Nether
    public static void registerNetherBookshelves() {
        Block CRIMSON_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/crimson_bookshelf", CRIMSON_BOOKSHELF, false);
        Block WARPED_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/warped_bookshelf", WARPED_BOOKSHELF, false);
    }

    // Tech Reborn
    public static void registerTRBookshelves() {
        Block RUBBER_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/rubber_bookshelf", RUBBER_BOOKSHELF, true);
    }

    // Ecologics
    public static void registerEcologicsBookshelves() {
        final Block AZALEA_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/azalea_bookshelf", AZALEA_BOOKSHELF, true);
        final Block COCONUT_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/coconut_bookshelf", COCONUT_BOOKSHELF, true);
        final Block FLOWERING_AZALEA_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/flowering_azalea_bookshelf", FLOWERING_AZALEA_BOOKSHELF, true);
        final Block WALNUT_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/walnut_bookshelf", WALNUT_BOOKSHELF, true);
    }

    // Croptopia
    public static void registerCroptopiaBookshelves() {
        final Block CINNAMON_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/cinnamon_bookshelf", CINNAMON_BOOKSHELF, true);
    }

    // Epic Paladins (arclight)
    public static void registerArclightBookshelves() {
        final Block JADE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/jade_bookshelf", JADE_BOOKSHELF, true);
        final Block MOON_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/moon_bookshelf", MOON_BOOKSHELF, true);
        final Block SHADOW_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
        registerBookshelfBlock("block/shadow_bookshelf", SHADOW_BOOKSHELF, true);
    }

    private static void registerBookshelfBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.VARIANT_BOOKSHELVES)));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
    }
}