package net.xanthian.variantbookshelves.block.compatability;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.Initialise;
import net.xanthian.variantbookshelves.block.VariantBookshelfBlock;

public class BetterArcheology {
    public static Block BA_ROTTEN_BOOKSHELF;

    public static void registerBookshelves() {
        BA_ROTTEN_BOOKSHELF = registerBookshelf("ba_rotten_bookshelf");
    }

    public static Block register(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerBookshelf(String id) {
        return register(id, new VariantBookshelfBlock());
    }
}