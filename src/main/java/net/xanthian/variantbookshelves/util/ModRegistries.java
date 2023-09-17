package net.xanthian.variantbookshelves.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;

import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;

import static net.xanthian.variantbookshelves.Initialise.isModVersion;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFuel();
        registerFlammableBlocks();
    }

    private static void registerFlammableBlocks() {

        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(Vanilla.ACACIA_BOOKSHELF, 30, 20);
        registry.add(Vanilla.BAMBOO_BOOKSHELF, 30, 20);
        registry.add(Vanilla.BIRCH_BOOKSHELF, 30, 20);
        registry.add(Vanilla.CHERRY_BOOKSHELF, 30, 20);
        registry.add(Vanilla.DARK_OAK_BOOKSHELF, 30, 20);
        registry.add(Vanilla.JUNGLE_BOOKSHELF, 30, 20);
        registry.add(Vanilla.MANGROVE_BOOKSHELF, 30, 20);
        registry.add(Vanilla.SPRUCE_BOOKSHELF, 30, 20);

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            for (Block block : AdAstra.AA_BOOKSHELVES.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            registry.add(BeachParty.LDBP_PALM_BOOKSHELF, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            registry.add(BetterArcheology.BA_ROTTEN_BOOKSHELF, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            for (Block block : Bewitchment.BW_BOOKSHELVES.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_BOOKSHELF, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("minecells")) {
            registry.add(MineCells.MC_PUTRID_BOOKSHELF, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_BOOKSHELVES.values()) {
                registry.add(block, 30, 20);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_MAPLE_BOOKSHELF, 30, 20);
            registry.add(Promenade.PROM_PALM_BOOKSHELF, 30, 20);
            registry.add(Promenade.PROM_SAKURA_BOOKSHELF, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            registry.add(RegionsUnexplored.RU_ALPHA_OAK_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_BAOBAB_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_CYPRESS_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_EUCALYPTUS_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_GRAY_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_GREEN_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_JOSHUA_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_LARCH_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_LIME_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_MAGENTA_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_MAPLE_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_MAUVE_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_ORANGE_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_PALM_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_PINE_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_PINK_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_PURPLE_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_REDWOOD_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_RED_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_WHITE_PAINTED_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_WILLOW_BOOKSHELF, 30, 20);
            registry.add(RegionsUnexplored.RU_YELLOW_PAINTED_BOOKSHELF, 30, 20);
            if (isModVersion("regions_unexplored", "0.4")) {
                registry.add(RegionsUnexplored.RU_CHERRY_BOOKSHELF, 30, 20);
                registry.add(RegionsUnexplored.RU_SCULKWOOD_BOOKSHELF, 30, 20);
            } else {
                registry.add(RegionsUnexplored.RU_KAPOK_BOOKSHELF, 30, 20);
                registry.add(RegionsUnexplored.RU_MAGNOLIA_BOOKSHELF, 30, 20);
                registry.add(RegionsUnexplored.RU_SOCOTRA_BOOKSHELF, 30, 20);
            }

        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
            registry.add(SnifferPlus.SP_STONE_PINE_BOOKSHELF, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_BOOKSHELF, 30, 20);
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            registry.add(Vinery.LDV_CHERRY_BOOKSHELF, 30, 20);
        }
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Vanilla.ACACIA_BOOKSHELF, 300);
        registry.add(Vanilla.BAMBOO_BOOKSHELF, 300);
        registry.add(Vanilla.BIRCH_BOOKSHELF, 300);
        registry.add(Vanilla.CHERRY_BOOKSHELF, 300);
        registry.add(Vanilla.DARK_OAK_BOOKSHELF, 300);
        registry.add(Vanilla.JUNGLE_BOOKSHELF, 300);
        registry.add(Vanilla.MANGROVE_BOOKSHELF, 300);
        registry.add(Vanilla.SPRUCE_BOOKSHELF, 300);

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            for (Block block : AdAstra.AA_BOOKSHELVES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            registry.add(BeachParty.LDBP_PALM_BOOKSHELF, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            registry.add(BetterArcheology.BA_ROTTEN_BOOKSHELF, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            for (Block block : Bewitchment.BW_BOOKSHELVES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            registry.add(DeeperAndDarker.DAD_ECHO_BOOKSHELF, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("minecells")) {
            registry.add(MineCells.MC_PUTRID_BOOKSHELF, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_BOOKSHELVES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registry.add(Promenade.PROM_MAPLE_BOOKSHELF, 300);
            registry.add(Promenade.PROM_PALM_BOOKSHELF, 300);
            registry.add(Promenade.PROM_SAKURA_BOOKSHELF, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            registry.add(RegionsUnexplored.RU_ALPHA_OAK_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_BAOBAB_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_BLACK_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_BLACKWOOD_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_BLUE_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_BROWN_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_CYAN_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_CYPRESS_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_EUCALYPTUS_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_GRAY_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_GREEN_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_JOSHUA_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_LARCH_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_LIME_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_MAGENTA_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_MAPLE_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_MAUVE_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_ORANGE_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_PALM_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_PINE_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_PINK_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_PURPLE_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_REDWOOD_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_RED_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_WHITE_PAINTED_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_WILLOW_BOOKSHELF, 300);
            registry.add(RegionsUnexplored.RU_YELLOW_PAINTED_BOOKSHELF, 300);
            if (isModVersion("regions_unexplored", "0.4")) {
                registry.add(RegionsUnexplored.RU_CHERRY_BOOKSHELF, 300);
                registry.add(RegionsUnexplored.RU_SCULKWOOD_BOOKSHELF, 300);
            } else {
                registry.add(RegionsUnexplored.RU_KAPOK_BOOKSHELF, 300);
                registry.add(RegionsUnexplored.RU_MAGNOLIA_BOOKSHELF, 300);
                registry.add(RegionsUnexplored.RU_SOCOTRA_BOOKSHELF, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) {
            registry.add(SnifferPlus.SP_STONE_PINE_BOOKSHELF, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_BOOKSHELF, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            registry.add(Vinery.LDV_CHERRY_BOOKSHELF, 300);
        }
    }
}
