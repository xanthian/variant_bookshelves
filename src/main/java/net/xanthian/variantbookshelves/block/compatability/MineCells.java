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

public class MineCells {

    public static Block MC_PUTRID_BOOKSHELF;

    public static void registerBookshelves() {
        MC_PUTRID_BOOKSHELF = registerBookshelf("mc_putrid_bookshelf");
    }

    private static Block register(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        return block;
    }

    private static Block registerBookshelf(String name) {
        return register(name, new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF)));
    }
}