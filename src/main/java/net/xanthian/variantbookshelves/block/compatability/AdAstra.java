package net.xanthian.variantbookshelves.block.compatability;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.Initialise;
import net.xanthian.variantbookshelves.block.VariantBookshelfBlock;

public class AdAstra {

    public static Block AA_AERONOS_BOOKSHELF;
    public static Block AA_GLACIAN_BOOKSHELF;
    public static Block AA_STROPHAR_BOOKSHELF;

    public static void registerBookshelves() {
        AA_AERONOS_BOOKSHELF = registerBookshelf("aa_aeronos_bookshelf");
        AA_GLACIAN_BOOKSHELF = registerBookshelf("aa_glacian_bookshelf");
        AA_STROPHAR_BOOKSHELF = registerBookshelf("aa_strophar_bookshelf");
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