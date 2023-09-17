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

public class NaturesSpirit {

    public static Map<Identifier, Block> NS_BOOKSHELVES = Maps.newHashMap();

    public static Block NS_ASPEN_BOOKSHELF;
    public static Block NS_CYPRESS_BOOKSHELF;
    public static Block NS_FIR_BOOKSHELF;
    public static Block NS_JOSHUA_BOOKSHELF;
    public static Block NS_MAPLE_BOOKSHELF;
    public static Block NS_OLIVE_BOOKSHELF;
    public static Block NS_REDWOOD_BOOKSHELF;
    public static Block NS_SUGI_BOOKSHELF;
    public static Block NS_WILLOW_BOOKSHELF;
    public static Block NS_WISTERIA_BOOKSHELF;

    public static void registerBookshelves() {
        NS_ASPEN_BOOKSHELF = registerBookshelf("ns_aspen_bookshelf");
        NS_CYPRESS_BOOKSHELF = registerBookshelf("ns_cypress_bookshelf");
        NS_FIR_BOOKSHELF = registerBookshelf("ns_fir_bookshelf");
        NS_JOSHUA_BOOKSHELF = registerBookshelf("ns_joshua_bookshelf");
        NS_MAPLE_BOOKSHELF = registerBookshelf("ns_maple_bookshelf");
        NS_OLIVE_BOOKSHELF = registerBookshelf("ns_olive_bookshelf");
        NS_REDWOOD_BOOKSHELF = registerBookshelf("ns_redwood_bookshelf");
        NS_SUGI_BOOKSHELF = registerBookshelf("ns_sugi_bookshelf");
        NS_WILLOW_BOOKSHELF = registerBookshelf("ns_willow_bookshelf");
        NS_WISTERIA_BOOKSHELF = registerBookshelf("ns_wisteria_bookshelf");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        NS_BOOKSHELVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerBookshelf(String name) {
        return register(name, new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF)));
    }
}