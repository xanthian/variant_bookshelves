package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.xanthian.variantbookshelves.block.*;
import net.xanthian.variantbookshelves.block.compatability.*;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        //Vanilla
        translationBuilder.add(Vanilla.ACACIA_BOOKSHELF, "Acacia Bookshelf");
        translationBuilder.add(Vanilla.BAMBOO_BOOKSHELF, "Bamboo Bookshelf");
        translationBuilder.add(Vanilla.BIRCH_BOOKSHELF, "Birch Bookshelf");
        translationBuilder.add(Vanilla.CHERRY_BOOKSHELF, "Cherry Bookshelf");
        translationBuilder.add(Vanilla.CRIMSON_BOOKSHELF, "Crimson Bookshelf");
        translationBuilder.add(Vanilla.DARK_OAK_BOOKSHELF, "Dark Oak Bookshelf");
        translationBuilder.add(Vanilla.JUNGLE_BOOKSHELF, "Jungle Bookshelf");
        translationBuilder.add(Vanilla.MANGROVE_BOOKSHELF, "Mangrove Bookshelf");
        //translationBuilder.add(Blocks.BOOKSHELF, "Oak Bookshelf");
        translationBuilder.add(Vanilla.SPRUCE_BOOKSHELF, "Spruce Bookshelf");
        translationBuilder.add(Vanilla.WARPED_BOOKSHELF, "Warped Bookshelf");

        // Ad Astra
        translationBuilder.add(AdAstra.AA_AERONOS_BOOKSHELF, "Aeronos Bookshelf");
        translationBuilder.add(AdAstra.AA_GLACIAN_BOOKSHELF, "Glacian Bookshelf");
        translationBuilder.add(AdAstra.AA_STROPHAR_BOOKSHELF, "Strophar Bookshelf");
        // Beach Party (Lets Do)
        translationBuilder.add(BeachParty.LDBP_PALM_BOOKSHELF, "Palm Bookshelf");
        // Better Archeology
        translationBuilder.add(BetterArcheology.BA_ROTTEN_BOOKSHELF, "Rotten Bookshelf");
        // Bewitchment
        translationBuilder.add(Bewitchment.BW_CYPRESS_BOOKSHELF, "Cypress Bookshelf");
        translationBuilder.add(Bewitchment.BW_DRAGONS_BLOOD_BOOKSHELF, "Dragon's Blood Bookshelf");
        translationBuilder.add(Bewitchment.BW_ELDER_BOOKSHELF, "Elder Bookshelf");
        translationBuilder.add(Bewitchment.BW_JUNIPER_BOOKSHELF, "Juniper Bookshelf");
        // Deeper & Darker
        translationBuilder.add(DeeperAndDarker.DAD_ECHO_BOOKSHELF, "Echo Bookshelf");
        // Promenade
        translationBuilder.add(Promenade.PROM_DARK_AMARANTH_BOOKSHELF, "Dark Amaranth Bookshelf");
        translationBuilder.add(Promenade.PROM_MAPLE_BOOKSHELF, "Maple Bookshelf");
        translationBuilder.add(Promenade.PROM_PALM_BOOKSHELF, "Palm Bookshelf");
        translationBuilder.add(Promenade.PROM_SAKURA_BOOKSHELF, "Sakura Bookshelf");
        // Regions Unexplored
        translationBuilder.add(RegionsUnexplored.RU_ALPHA_OAK_BOOKSHELF, "Alpha Oak Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_BAOBAB_BOOKSHELF,"Baobab Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_BLACK_PAINTED_BOOKSHELF,"Black Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_BLACKWOOD_BOOKSHELF,"Blackwood Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_BLUE_PAINTED_BOOKSHELF, "Blue Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_BROWN_PAINTED_BOOKSHELF, "Brown Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_CHERRY_BOOKSHELF, "Cherry Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_CYAN_PAINTED_BOOKSHELF, "Cyan Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_CYPRESS_BOOKSHELF, "Cypress Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_DEAD_BOOKSHELF, "Dead Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_EUCALYPTUS_BOOKSHELF, "Eucalyptus Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_GRAY_PAINTED_BOOKSHELF, "Gray Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_GREEN_PAINTED_BOOKSHELF, "Green Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_JOSHUA_BOOKSHELF, "Joshua Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_LARCH_BOOKSHELF, "Larch Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_BOOKSHELF, "Light Blue Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_BOOKSHELF, "Light Gray Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_LIME_PAINTED_BOOKSHELF, "Lime Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_MAGENTA_PAINTED_BOOKSHELF, "Magenta Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_MAPLE_BOOKSHELF, "Maple Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_MAUVE_BOOKSHELF, "Mauve Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_ORANGE_PAINTED_BOOKSHELF, "Orange Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_PALM_BOOKSHELF, "Palm Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_PINE_BOOKSHELF, "Pine Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_PINK_PAINTED_BOOKSHELF, "Pink Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_PURPLE_PAINTED_BOOKSHELF, "Purple Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_REDWOOD_BOOKSHELF, "Redwood Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_RED_PAINTED_BOOKSHELF, "Red Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_SCULKWOOD_BOOKSHELF, "Sculkwood Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_WHITE_PAINTED_BOOKSHELF, "White Painted Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_WILLOW_BOOKSHELF, "Willow Bookshelf");
        translationBuilder.add(RegionsUnexplored.RU_YELLOW_PAINTED_BOOKSHELF, "Yellow Painted Bookshelf");
        // SnifferPlus
        translationBuilder.add(SnifferPlus.SP_STONE_PINE_BOOKSHELF, "Stone Pine Bookshelf");
        // Tech Reborn
        translationBuilder.add(TechReborn.TR_RUBBER_BOOKSHELF, "Rubber Bookshelf");
        // Vinery
        translationBuilder.add(Vinery.LDV_CHERRY_BOOKSHELF,"Cherry Bookshelf");
    }
}