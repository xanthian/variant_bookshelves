package net.xanthian.variantbookshelves.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.minecraft.block.FireBlock;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;

import net.xanthian.variantbookshelves.block.Vanilla;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFuel();
        registerFlammableBlocks();
    }

    private static void registerFlammableBlocks() {

        /**
        Copy from {@link FireBlock#registerDefaultFlammables()}
        **/

        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(Vanilla.ACACIA_BOOKSHELF,30, 20);
        registry.add(Vanilla.BAMBOO_BOOKSHELF,30, 20);
        registry.add(Vanilla.BIRCH_BOOKSHELF,30, 20);
        registry.add(Vanilla.CHERRY_BOOKSHELF,30, 20);
        registry.add(Vanilla.DARK_OAK_BOOKSHELF,30, 20);
        registry.add(Vanilla.JUNGLE_BOOKSHELF,30, 20);
        registry.add(Vanilla.MANGROVE_BOOKSHELF,30, 20);
        registry.add(Vanilla.SPRUCE_BOOKSHELF,30, 20);
    }

        private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        /**
        Copy from {@link AbstractFurnaceBlockEntity#createFuelTimeMap()}
        **/

        registry.add(Vanilla.ACACIA_BOOKSHELF,300);
        registry.add(Vanilla.BAMBOO_BOOKSHELF,300);
        registry.add(Vanilla.BIRCH_BOOKSHELF,300);
        registry.add(Vanilla.CHERRY_BOOKSHELF,300);
        registry.add(Vanilla.DARK_OAK_BOOKSHELF,300);
        registry.add(Vanilla.JUNGLE_BOOKSHELF,300);
        registry.add(Vanilla.MANGROVE_BOOKSHELF,300);
        registry.add(Vanilla.SPRUCE_BOOKSHELF,300);
    }
}