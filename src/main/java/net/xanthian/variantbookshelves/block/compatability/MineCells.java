package net.xanthian.variantbookshelves.block.compatability;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.Initialise;

import java.util.Map;

public class MineCells {

    public static Map<Identifier, Block> MC_BOOKSHELVES = Maps.newHashMap();

    public static Block MC_PUTRID_BOOKSHELF;

    public static void registerBookshelves() {
        MC_PUTRID_BOOKSHELF = registerBookshelf("mc_putrid_bookshelf");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        MC_BOOKSHELVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        return block;
    }

    private static Block registerBookshelf(String name) {
        return register(name, new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF)));
    }
}