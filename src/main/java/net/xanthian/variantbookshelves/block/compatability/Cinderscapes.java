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

public class Cinderscapes {
    public static Map<Identifier, Block> CS_BOOKSHELVES = Maps.newHashMap();

    public static Block CS_SCORCHED_BOOKSHELF;
    public static Block CS_UMBRAL_BOOKSHELF;

    public static void registerBookshelves() {
        CS_SCORCHED_BOOKSHELF = registerBookshelf("cs_scorched_bookshelf");
        CS_UMBRAL_BOOKSHELF = registerBookshelf("cs_umbral_bookshelf");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        CS_BOOKSHELVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerBookshelf(String name) {
        return register(name, new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF)));
    }
}