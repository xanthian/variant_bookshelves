package net.xanthian.variantbookshelves.block.compatability;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.Initialise;

public class BeachParty {
    public static Block LDBP_PALM_BOOKSHELF;

    public static void registerBookshelves() {
        LDBP_PALM_BOOKSHELF = registerBookshelf("ldbp_palm_bookshelf");
    }

    public static Block register(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    public static Block registerBookshelf(String id) {
        return register(id, new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF)));
    }
}