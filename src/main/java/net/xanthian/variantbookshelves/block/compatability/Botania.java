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

public class Botania {

    public static Map<Identifier, Block> BOT_BOOKSHELVES = Maps.newHashMap();

    public static Block BOT_DREAMWOOD_BOOKSHELF;
    public static Block BOT_LIVINGWOOD_BOOKSHELF;
    public static Block BOT_SHIMMERWOOD_BOOKSHELF;

    public static void registerBookshelves() {
        BOT_DREAMWOOD_BOOKSHELF = registerBookshelf("bot_dreamwood_bookshelf");
        BOT_LIVINGWOOD_BOOKSHELF = registerBookshelf("bot_livingwood_bookshelf");
        BOT_SHIMMERWOOD_BOOKSHELF = registerBookshelf("bot_shimmerwood_bookshelf");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BOT_BOOKSHELVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerBookshelf(String name) {
        return register(name, new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF)));
    }
}