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

public class Bewitchment {

    public static Map<Identifier, Block> BW_BOOKSHELVES = Maps.newHashMap();

    public static Block BW_CYPRESS_BOOKSHELF;
    public static Block BW_DRAGONS_BLOOD_BOOKSHELF;
    public static Block BW_ELDER_BOOKSHELF;
    public static Block BW_JUNIPER_BOOKSHELF;

    public static void registerBookshelves() {
        BW_CYPRESS_BOOKSHELF = registerBookshelf("bw_cypress_bookshelf");
        BW_DRAGONS_BLOOD_BOOKSHELF = registerBookshelf("bw_dragons_blood_bookshelf");
        BW_ELDER_BOOKSHELF = registerBookshelf("bw_elder_bookshelf");
        BW_JUNIPER_BOOKSHELF = registerBookshelf("bw_juniper_bookshelf");
    }

    public static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        BW_BOOKSHELVES.put(identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerBookshelf(String name) {
        return register(name, new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF)));
    }
}