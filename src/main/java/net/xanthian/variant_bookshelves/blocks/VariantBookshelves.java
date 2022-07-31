package net.xanthian.variant_bookshelves.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.variant_bookshelves.Init;

public class VariantBookshelves {

    public static final Block ACACIA_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block BIRCH_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block CRIMSON_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block DARK_OAK_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block JUNGLE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block MANGROVE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block SPRUCE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block WARPED_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));

    public static void registerBookshelf() {
        registerBookshelfBlock("block/acacia_bookshelf", ACACIA_BOOKSHELF);
        registerBookshelfBlock("block/birch_bookshelf", BIRCH_BOOKSHELF);
        registerBookshelfBlock("block/crimson_bookshelf", CRIMSON_BOOKSHELF);
        registerBookshelfBlock("block/dark_oak_bookshelf", DARK_OAK_BOOKSHELF);
        registerBookshelfBlock("block/jungle_bookshelf", JUNGLE_BOOKSHELF);
        registerBookshelfBlock("block/mangrove_bookshelf", MANGROVE_BOOKSHELF);
        registerBookshelfBlock("block/spruce_bookshelf", SPRUCE_BOOKSHELF);
        registerBookshelfBlock("block/warped_bookshelf", WARPED_BOOKSHELF);
    }

    private static void registerBookshelfBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Init.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Init.VARIANT_BOOKSHELVES)));
    }
}