package net.xanthian.variantbookshelves.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.Initialise;
import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;

public class ModCreativeTab {

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Initialise.MOD_ID, "variantbookshelves"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("Variant Bookshelves"))
                    .icon(() -> new ItemStack(Vanilla.MANGROVE_BOOKSHELF))
                    .entries((displayContext, entries) -> {
                        entries.add(Vanilla.ACACIA_BOOKSHELF);
                        entries.add(Vanilla.BAMBOO_BOOKSHELF);
                        entries.add(Vanilla.BIRCH_BOOKSHELF);
                        entries.add(Vanilla.CHERRY_BOOKSHELF);
                        entries.add(Vanilla.CRIMSON_BOOKSHELF);
                        entries.add(Vanilla.DARK_OAK_BOOKSHELF);
                        entries.add(Vanilla.JUNGLE_BOOKSHELF);
                        entries.add(Vanilla.MANGROVE_BOOKSHELF);
                        entries.add(Blocks.BOOKSHELF); // Oak
                        entries.add(Vanilla.SPRUCE_BOOKSHELF);
                        entries.add(Vanilla.WARPED_BOOKSHELF);

                        if (FabricLoader.getInstance().isModLoaded("blockus")) {
                            for (Block block : Blockus.BLS_BOOKSHELVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
                            for (Block block : Cinderscapes.CS_BOOKSHELVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
                            for (Block block : NaturesSpirit.NS_BOOKSHELVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
                            entries.add(TechReborn.TR_RUBBER_BOOKSHELF);
                        }
                    })
                    .texture(Identifier.ofVanilla( "textures/gui/container/creative_inventory/tab_variantbookshelves.png")).noRenderedName().build());

    public static void registerItemGroup() {
    }
}