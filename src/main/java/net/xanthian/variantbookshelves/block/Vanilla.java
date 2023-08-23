package net.xanthian.variantbookshelves.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.variantbookshelves.Initialise;

public class Vanilla {

    public static final VariantBookshelfBlock ACACIA_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock BAMBOO_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock BIRCH_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock CHERRY_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock DARK_OAK_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock JUNGLE_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock MANGROVE_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock SPRUCE_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock WARPED_BOOKSHELF = new VariantBookshelfBlock();
    public static final VariantBookshelfBlock CRIMSON_BOOKSHELF = new VariantBookshelfBlock();

    public static void registerBookshelves() {
        registerBookshelfBlock("acacia_bookshelf", ACACIA_BOOKSHELF);
        registerBookshelfBlock("bamboo_bookshelf", BAMBOO_BOOKSHELF);
        registerBookshelfBlock("birch_bookshelf", BIRCH_BOOKSHELF);
        registerBookshelfBlock("cherry_bookshelf", CHERRY_BOOKSHELF);
        registerBookshelfBlock("dark_oak_bookshelf", DARK_OAK_BOOKSHELF);
        registerBookshelfBlock("jungle_bookshelf", JUNGLE_BOOKSHELF);
        registerBookshelfBlock("mangrove_bookshelf", MANGROVE_BOOKSHELF);
        registerBookshelfBlock("spruce_bookshelf", SPRUCE_BOOKSHELF);
        registerBookshelfBlock("crimson_bookshelf", CRIMSON_BOOKSHELF);
        registerBookshelfBlock("warped_bookshelf", WARPED_BOOKSHELF);
    }

    private static void registerBookshelfBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}