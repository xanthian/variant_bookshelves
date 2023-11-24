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

public class BiomeMakeover {

    public static Map<Identifier, Block> BM_BOOKSHELVES = Maps.newHashMap();

    public static Block BM_ANCIENT_OAK_BOOKSHELF;
    public static Block BM_BLIGHTED_BALSA_BOOKSHELF;
    public static Block BM_SWAMP_CYPRESS_BOOKSHELF;
    public static Block BM_WILLOW_BOOKSHELF;

    public static void registerBookshelves() {
        BM_ANCIENT_OAK_BOOKSHELF = registerBookshelf("bm_ancient_oak_bookshelf");
        BM_BLIGHTED_BALSA_BOOKSHELF = registerBookshelf("bm_blighted_balsa_bookshelf");
        BM_SWAMP_CYPRESS_BOOKSHELF = registerBookshelf("bm_swamp_cypress_bookshelf");
        BM_WILLOW_BOOKSHELF = registerBookshelf("bm_willow_bookshelf");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BM_BOOKSHELVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerBookshelf(String name) {
        return register(name, new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF)));
    }
}