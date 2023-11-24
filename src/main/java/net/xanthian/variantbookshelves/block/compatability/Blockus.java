package net.xanthian.variantbookshelves.block.compatability;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.Initialise;

import java.util.Map;

public class Blockus {

    public static Map<Identifier, Block> BLS_BOOKSHELVES = Maps.newHashMap();

    public static Block BLS_CHARRED_BOOKSHELF;
    public static Block BLS_HERRINGBONE_ACACIA_BOOKSHELF;
    public static Block BLS_HERRINGBONE_BAMBOO_BOOKSHELF;
    public static Block BLS_HERRINGBONE_BIRCH_BOOKSHELF;
    public static Block BLS_HERRINGBONE_CHARRED_BOOKSHELF;
    public static Block BLS_HERRINGBONE_CHERRY_BOOKSHELF;
    public static Block BLS_HERRINGBONE_CRIMSON_BOOKSHELF;
    public static Block BLS_HERRINGBONE_DARK_OAK_BOOKSHELF;
    public static Block BLS_HERRINGBONE_JUNGLE_BOOKSHELF;
    public static Block BLS_HERRINGBONE_MANGROVE_BOOKSHELF;
    public static Block BLS_HERRINGBONE_OAK_BOOKSHELF;
    public static Block BLS_HERRINGBONE_RAW_BAMBOO_BOOKSHELF;
    public static Block BLS_HERRINGBONE_SPRUCE_BOOKSHELF;
    public static Block BLS_HERRINGBONE_WARPED_BOOKSHELF;
    public static Block BLS_HERRINGBONE_WHITE_OAK_BOOKSHELF;
    public static Block BLS_RAW_BAMBOO_BOOKSHELF;
    public static Block BLS_WHITE_OAK_BOOKSHELF;

    public static void registerBookshelves() {

        BLS_CHARRED_BOOKSHELF = registerBookshelf("bls_charred_bookshelf");
        BLS_HERRINGBONE_ACACIA_BOOKSHELF = registerBookshelf("bls_herringbone_acacia_bookshelf");
        BLS_HERRINGBONE_BAMBOO_BOOKSHELF = registerBookshelf("bls_herringbone_bamboo_bookshelf");
        BLS_HERRINGBONE_BIRCH_BOOKSHELF = registerBookshelf("bls_herringbone_birch_bookshelf");
        BLS_HERRINGBONE_CHARRED_BOOKSHELF = registerBookshelf("bls_herringbone_charred_bookshelf");
        BLS_HERRINGBONE_CHERRY_BOOKSHELF = registerBookshelf("bls_herringbone_cherry_bookshelf");
        BLS_HERRINGBONE_CRIMSON_BOOKSHELF = registerBookshelf("bls_herringbone_crimson_bookshelf");
        BLS_HERRINGBONE_DARK_OAK_BOOKSHELF = registerBookshelf("bls_herringbone_dark_oak_bookshelf");
        BLS_HERRINGBONE_JUNGLE_BOOKSHELF = registerBookshelf("bls_herringbone_jungle_bookshelf");
        BLS_HERRINGBONE_MANGROVE_BOOKSHELF = registerBookshelf("bls_herringbone_mangrove_bookshelf");
        BLS_HERRINGBONE_OAK_BOOKSHELF = registerBookshelf("bls_herringbone_oak_bookshelf");
        BLS_HERRINGBONE_RAW_BAMBOO_BOOKSHELF = registerBookshelf("bls_herringbone_raw_bamboo_bookshelf");
        BLS_HERRINGBONE_SPRUCE_BOOKSHELF = registerBookshelf("bls_herringbone_spruce_bookshelf");
        BLS_HERRINGBONE_WARPED_BOOKSHELF = registerBookshelf("bls_herringbone_warped_bookshelf");
        BLS_HERRINGBONE_WHITE_OAK_BOOKSHELF = registerBookshelf("bls_herringbone_white_oak_bookshelf");
        BLS_RAW_BAMBOO_BOOKSHELF = registerBookshelf("bls_raw_bamboo_bookshelf");
        BLS_WHITE_OAK_BOOKSHELF = registerBookshelf("bls_white_oak_bookshelf");

    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BLS_BOOKSHELVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerBookshelf(String name) {
        return register(name, new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF)));
    }
}