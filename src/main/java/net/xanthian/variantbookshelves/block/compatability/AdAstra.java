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

public class AdAstra {

    public static Map<Identifier, Block> AA_BOOKSHELVES = Maps.newHashMap();

    public static Block AA_AERONOS_BOOKSHELF;
    public static Block AA_GLACIAN_BOOKSHELF;
    public static Block AA_STROPHAR_BOOKSHELF;

    public static void registerBookshelves() {
        AA_AERONOS_BOOKSHELF = registerBookshelf("aa_aeronos_bookshelf");
        AA_GLACIAN_BOOKSHELF = registerBookshelf("aa_glacian_bookshelf");
        AA_STROPHAR_BOOKSHELF = registerBookshelf("aa_strophar_bookshelf");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        AA_BOOKSHELVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerBookshelf(String name) {
        return register(name, new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF)));
    }
}