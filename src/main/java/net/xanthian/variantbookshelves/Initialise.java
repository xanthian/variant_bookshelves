package net.xanthian.variantbookshelves;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.util.Identifier;

import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.util.ModCreativeTab;
import net.xanthian.variantbookshelves.util.ModRegistries;
import net.xanthian.variantbookshelves.block.compatability.*;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantbookshelves";

    @Override
    public void onInitialize() {

        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(Initialise.MOD_ID, "3d_bookshelves"),
                FabricLoader.getInstance().getModContainer(Initialise.MOD_ID).orElseThrow(), ResourcePackActivationType.NORMAL);


        Vanilla.registerBookshelves();

        if (FabricLoader.getInstance().isModLoaded("ad_astra")) { // DISABLE FOR DATAGEN
            AdAstra.registerBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("beachparty")) {
            BeachParty.registerBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("betterarcheology")) {
            BetterArcheology.registerBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            Bewitchment.registerBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            Promenade.registerBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("regions_unexplored")) {
            RegionsUnexplored.registerBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("snifferplus")) { // DISABLE FOR DATAGEN
            SnifferPlus.registerBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            TechReborn.registerBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("vinery")) {
            Vinery.registerBookshelves();
        }

        ModRegistries.registerFuelandFlammable();
        ModCreativeTab.registerItemGroup();
    }
}