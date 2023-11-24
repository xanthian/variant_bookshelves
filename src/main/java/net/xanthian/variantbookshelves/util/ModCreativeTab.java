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

import static net.xanthian.variantbookshelves.Initialise.isModVersion;

public class ModCreativeTab {

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Initialise.MOD_ID, "variantbookshelves"),
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

                        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
                            for (Block block : AdAstra.AA_BOOKSHELVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
                            entries.add(BeachParty.LDBP_PALM_BOOKSHELF);
                        }
                        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
                            entries.add(BetterArcheology.BA_ROTTEN_BOOKSHELF);
                        }
                        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
                            for (Block block : Bewitchment.BW_BOOKSHELVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
                            for (Block block : BiomeMakeover.BM_BOOKSHELVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("blockus")) {
                            for (Block block : Blockus.BLS_BOOKSHELVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
                            entries.add(DeeperAndDarker.DAD_ECHO_BOOKSHELF);
                        }
                        if (FabricLoader.getInstance().isModLoaded("eldritch_end")) {
                            entries.add(EldritchEnd.EE_PRIMORDIAL_BOOKSHELF);
                        }
                        if (FabricLoader.getInstance().isModLoaded("minecells")) {
                            entries.add(MineCells.MC_PUTRID_BOOKSHELF);
                        }
                        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
                            for (Block block : NaturesSpirit.NS_BOOKSHELVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("promenade")) {
                            for (Block block : Promenade.PROM_BOOKSHELVES.values()) {
                                entries.add(block);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
                            entries.add(RegionsUnexplored.RU_ALPHA_OAK_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_BAOBAB_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_BLACK_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_BLACKWOOD_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_BLUE_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_BROWN_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_CYAN_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_CYPRESS_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_DEAD_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_EUCALYPTUS_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_GRAY_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_GREEN_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_JOSHUA_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_LARCH_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_LIME_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_MAGENTA_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_MAPLE_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_MAUVE_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_ORANGE_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_PALM_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_PINE_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_PINK_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_PURPLE_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_REDWOOD_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_RED_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_WHITE_PAINTED_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_WILLOW_BOOKSHELF);
                            entries.add(RegionsUnexplored.RU_YELLOW_PAINTED_BOOKSHELF);
                            if (isModVersion("regions_unexplored", "0.4")) {
                                entries.add(RegionsUnexplored.RU_CHERRY_BOOKSHELF);
                                entries.add(RegionsUnexplored.RU_SCULKWOOD_BOOKSHELF);
                            } else {
                                entries.add(RegionsUnexplored.RU_BRIMWOOD_BOOKSHELF);
                                entries.add(RegionsUnexplored.RU_COBALT_BOOKSHELF);
                                entries.add(RegionsUnexplored.RU_KAPOK_BOOKSHELF);
                                entries.add(RegionsUnexplored.RU_MAGNOLIA_BOOKSHELF);
                                entries.add(RegionsUnexplored.RU_SOCOTRA_BOOKSHELF);
                                entries.add(RegionsUnexplored.RU_YELLOW_BIOSHROOM_BOOKSHELF);
                            }
                        }
                        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
                            entries.add(SnifferPlus.SP_STONE_PINE_BOOKSHELF);
                        }
                        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
                            entries.add(TechReborn.TR_RUBBER_BOOKSHELF);
                        }
                        if (FabricLoader.getInstance().isModLoaded("vinery")) {
                            entries.add(Vinery.LDV_CHERRY_BOOKSHELF);
                        }

                    })
                    .build());

    public static void registerItemGroup() {
    }
}