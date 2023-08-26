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

public class RegionsUnexplored {
    public static Block RU_ALPHA_OAK_BOOKSHELF;
    public static Block RU_BAOBAB_BOOKSHELF;
    public static Block RU_BLACK_PAINTED_BOOKSHELF;
    public static Block RU_BLACKWOOD_BOOKSHELF;
    public static Block RU_BLUE_PAINTED_BOOKSHELF;
    public static Block RU_BROWN_PAINTED_BOOKSHELF;
    public static Block RU_CHERRY_BOOKSHELF;
    public static Block RU_CYAN_PAINTED_BOOKSHELF;
    public static Block RU_CYPRESS_BOOKSHELF;
    public static Block RU_DEAD_BOOKSHELF;
    public static Block RU_EUCALYPTUS_BOOKSHELF;
    public static Block RU_GRAY_PAINTED_BOOKSHELF;
    public static Block RU_GREEN_PAINTED_BOOKSHELF;
    public static Block RU_JOSHUA_BOOKSHELF;
    public static Block RU_LARCH_BOOKSHELF;
    public static Block RU_LIGHT_BLUE_PAINTED_BOOKSHELF;
    public static Block RU_LIGHT_GRAY_PAINTED_BOOKSHELF;
    public static Block RU_LIME_PAINTED_BOOKSHELF;
    public static Block RU_MAGENTA_PAINTED_BOOKSHELF;
    public static Block RU_MAPLE_BOOKSHELF;
    public static Block RU_MAUVE_BOOKSHELF;
    public static Block RU_ORANGE_PAINTED_BOOKSHELF;
    public static Block RU_PALM_BOOKSHELF;
    public static Block RU_PINE_BOOKSHELF;
    public static Block RU_PINK_PAINTED_BOOKSHELF;
    public static Block RU_PURPLE_PAINTED_BOOKSHELF;
    public static Block RU_REDWOOD_BOOKSHELF;
    public static Block RU_RED_PAINTED_BOOKSHELF;
    public static Block RU_SCULKWOOD_BOOKSHELF;
    public static Block RU_WHITE_PAINTED_BOOKSHELF;
    public static Block RU_WILLOW_BOOKSHELF;
    public static Block RU_YELLOW_PAINTED_BOOKSHELF;

    public static void registerBookshelves() {
        RU_ALPHA_OAK_BOOKSHELF = registerBookshelf("ru_alpha_oak_bookshelf");
        RU_BAOBAB_BOOKSHELF = registerBookshelf("ru_baobab_bookshelf");
        RU_BLACK_PAINTED_BOOKSHELF = registerBookshelf("ru_black_painted_bookshelf");
        RU_BLACKWOOD_BOOKSHELF = registerBookshelf("ru_blackwood_bookshelf");
        RU_BLUE_PAINTED_BOOKSHELF = registerBookshelf("ru_blue_painted_bookshelf");
        RU_BROWN_PAINTED_BOOKSHELF = registerBookshelf("ru_brown_painted_bookshelf");
        RU_CHERRY_BOOKSHELF = registerBookshelf("ru_cherry_bookshelf");
        RU_CYAN_PAINTED_BOOKSHELF = registerBookshelf("ru_cyan_painted_bookshelf");
        RU_CYPRESS_BOOKSHELF = registerBookshelf("ru_cypress_bookshelf");
        RU_DEAD_BOOKSHELF = registerBookshelf("ru_dead_bookshelf");
        RU_EUCALYPTUS_BOOKSHELF = registerBookshelf("ru_eucalyptus_bookshelf");
        RU_GREEN_PAINTED_BOOKSHELF = registerBookshelf("ru_green_painted_bookshelf");
        RU_GRAY_PAINTED_BOOKSHELF = registerBookshelf("ru_gray_painted_bookshelf");
        RU_JOSHUA_BOOKSHELF = registerBookshelf("ru_joshua_bookshelf");
        RU_LARCH_BOOKSHELF = registerBookshelf("ru_larch_bookshelf");
        RU_LIGHT_BLUE_PAINTED_BOOKSHELF = registerBookshelf("ru_light_blue_painted_bookshelf");
        RU_LIGHT_GRAY_PAINTED_BOOKSHELF = registerBookshelf("ru_light_gray_painted_bookshelf");
        RU_LIME_PAINTED_BOOKSHELF = registerBookshelf("ru_lime_painted_bookshelf");
        RU_MAGENTA_PAINTED_BOOKSHELF = registerBookshelf("ru_magenta_painted_bookshelf");
        RU_MAPLE_BOOKSHELF = registerBookshelf("ru_maple_bookshelf");
        RU_MAUVE_BOOKSHELF = registerBookshelf("ru_mauve_bookshelf");
        RU_ORANGE_PAINTED_BOOKSHELF = registerBookshelf("ru_orange_painted_bookshelf");
        RU_PALM_BOOKSHELF = registerBookshelf("ru_palm_bookshelf");
        RU_PINE_BOOKSHELF = registerBookshelf("ru_pine_bookshelf");
        RU_PINK_PAINTED_BOOKSHELF = registerBookshelf("ru_pink_painted_bookshelf");
        RU_PURPLE_PAINTED_BOOKSHELF = registerBookshelf("ru_purple_painted_bookshelf");
        RU_RED_PAINTED_BOOKSHELF = registerBookshelf("ru_red_painted_bookshelf");
        RU_REDWOOD_BOOKSHELF = registerBookshelf("ru_redwood_bookshelf");
        RU_SCULKWOOD_BOOKSHELF = registerBookshelf("ru_sculkwood_bookshelf");
        RU_WHITE_PAINTED_BOOKSHELF = registerBookshelf("ru_white_painted_bookshelf");
        RU_WILLOW_BOOKSHELF = registerBookshelf("ru_willow_bookshelf");
        RU_YELLOW_PAINTED_BOOKSHELF = registerBookshelf("ru_yellow_painted_bookshelf");
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