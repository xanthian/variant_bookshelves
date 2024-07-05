package net.xanthian.variantbookshelves.block;

import com.google.common.collect.Maps;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.Initialise;

import java.util.Map;


public class Vanilla {

    public static final Block ACACIA_BOOKSHELF = new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF));
    public static final Block BAMBOO_BOOKSHELF = new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF));
    public static final Block BIRCH_BOOKSHELF = new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF));
    public static final Block CHERRY_BOOKSHELF = new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF));
    public static final Block CRIMSON_BOOKSHELF = new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).instrument(NoteBlockInstrument.BASS).strength(1.5f).sounds(BlockSoundGroup.WOOD));
    public static final Block DARK_OAK_BOOKSHELF = new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF));
    public static final Block JUNGLE_BOOKSHELF = new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF));
    public static final Block MANGROVE_BOOKSHELF = new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF));
    public static final Block SPRUCE_BOOKSHELF = new Block(AbstractBlock.Settings.copy(Blocks.BOOKSHELF));
    public static final Block WARPED_BOOKSHELF = new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_AQUA).instrument(NoteBlockInstrument.BASS).strength(1.5f).sounds(BlockSoundGroup.WOOD));
    public static Map<Identifier, Block> VANILLA_BOOKSHELVES = Maps.newHashMap();

    public static void registerBookshelves() {
        registerBookshelfBlock("acacia_bookshelf", ACACIA_BOOKSHELF);
        registerBookshelfBlock("bamboo_bookshelf", BAMBOO_BOOKSHELF);
        registerBookshelfBlock("birch_bookshelf", BIRCH_BOOKSHELF);
        registerBookshelfBlock("cherry_bookshelf", CHERRY_BOOKSHELF);
        registerBookshelfBlock("dark_oak_bookshelf", DARK_OAK_BOOKSHELF);
        registerBookshelfBlock("jungle_bookshelf", JUNGLE_BOOKSHELF);
        registerBookshelfBlock("mangrove_bookshelf", MANGROVE_BOOKSHELF);
        registerBookshelfBlock("spruce_bookshelf", SPRUCE_BOOKSHELF);
        registerBookshelfBlock("crimson_bookshelf", CRIMSON_BOOKSHELF);
        registerBookshelfBlock("warped_bookshelf", WARPED_BOOKSHELF);
    }

    private static void registerBookshelfBlock(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        VANILLA_BOOKSHELVES.put(identifier, block);
    }
}