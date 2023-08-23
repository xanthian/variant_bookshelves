package net.xanthian.variantbookshelves.block.compatability;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.Initialise;
import net.xanthian.variantbookshelves.block.VariantBookshelfBlock;

public class Promenade {

    public static Block PROM_DARK_AMARANTH_BOOKSHELF;
    public static Block PROM_MAPLE_BOOKSHELF;
    public static Block PROM_PALM_BOOKSHELF;
    public static Block PROM_SAKURA_BOOKSHELF;

    public static void registerBookshelves() {
        PROM_DARK_AMARANTH_BOOKSHELF = registerBookshelf("prom_dark_amaranth_bookshelf");
        PROM_MAPLE_BOOKSHELF = registerBookshelf("prom_maple_bookshelf");
        PROM_PALM_BOOKSHELF = registerBookshelf("prom_palm_bookshelf");
        PROM_SAKURA_BOOKSHELF = registerBookshelf("prom_sakura_bookshelf");
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