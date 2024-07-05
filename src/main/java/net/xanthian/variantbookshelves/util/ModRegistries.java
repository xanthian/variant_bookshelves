package net.xanthian.variantbookshelves.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;

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


        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registry.add(Blockus.BLS_HERRINGBONE_ACACIA_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_HERRINGBONE_BAMBOO_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_HERRINGBONE_BIRCH_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_HERRINGBONE_CHARRED_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_HERRINGBONE_CHERRY_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_HERRINGBONE_DARK_OAK_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_HERRINGBONE_JUNGLE_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_HERRINGBONE_MANGROVE_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_HERRINGBONE_OAK_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_HERRINGBONE_RAW_BAMBOO_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_HERRINGBONE_SPRUCE_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_HERRINGBONE_WHITE_OAK_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_RAW_BAMBOO_BOOKSHELF, 30, 20);
            registry.add(Blockus.BLS_WHITE_OAK_BOOKSHELF, 30, 20);
        }

        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            for (Block block : Cinderscapes.CS_BOOKSHELVES.values()) {
                registry.add(block, 30, 20);
            }
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

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_BOOKSHELF, 30, 20);
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

        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registry.add(Blockus.BLS_HERRINGBONE_ACACIA_BOOKSHELF, 300);
            registry.add(Blockus.BLS_HERRINGBONE_BAMBOO_BOOKSHELF, 300);
            registry.add(Blockus.BLS_HERRINGBONE_BIRCH_BOOKSHELF, 300);
            registry.add(Blockus.BLS_HERRINGBONE_CHARRED_BOOKSHELF, 300);
            registry.add(Blockus.BLS_HERRINGBONE_CHERRY_BOOKSHELF, 300);
            registry.add(Blockus.BLS_HERRINGBONE_DARK_OAK_BOOKSHELF, 300);
            registry.add(Blockus.BLS_HERRINGBONE_JUNGLE_BOOKSHELF, 300);
            registry.add(Blockus.BLS_HERRINGBONE_MANGROVE_BOOKSHELF, 300);
            registry.add(Blockus.BLS_HERRINGBONE_OAK_BOOKSHELF, 300);
            registry.add(Blockus.BLS_HERRINGBONE_RAW_BAMBOO_BOOKSHELF, 300);
            registry.add(Blockus.BLS_HERRINGBONE_SPRUCE_BOOKSHELF, 300);
            registry.add(Blockus.BLS_HERRINGBONE_WHITE_OAK_BOOKSHELF, 300);
            registry.add(Blockus.BLS_RAW_BAMBOO_BOOKSHELF, 300);
            registry.add(Blockus.BLS_WHITE_OAK_BOOKSHELF, 300);
        }
        if (FabricLoader.getInstance().isModLoaded("cinderscapes")) {
            for (Block block : Cinderscapes.CS_BOOKSHELVES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("natures_spirit")) {
            for (Block block : NaturesSpirit.NS_BOOKSHELVES.values()) {
                registry.add(block, 300);
            }
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registry.add(TechReborn.TR_RUBBER_BOOKSHELF, 300);
        }
    }
}
