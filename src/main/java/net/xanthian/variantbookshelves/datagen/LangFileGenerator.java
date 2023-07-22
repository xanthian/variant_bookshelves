package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.block.Blocks;

import net.xanthian.variantbookshelves.Initialise;
import net.xanthian.variantbookshelves.block.*;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        // Item group
        translationBuilder.add(Initialise.ITEM_GROUP, "Variant Bookshelves");
        //Vanilla
        translationBuilder.add(Vanilla.ACACIA_BOOKSHELF, "Acacia Bookshelf");
        translationBuilder.add(Vanilla.BAMBOO_BOOKSHELF, "Bamboo Bookshelf");
        translationBuilder.add(Vanilla.BIRCH_BOOKSHELF, "Birch Bookshelf");
        translationBuilder.add(Vanilla.CHERRY_BOOKSHELF, "Cherry Bookshelf");
        translationBuilder.add(Vanilla.CRIMSON_BOOKSHELF, "Crimson Bookshelf");
        translationBuilder.add(Vanilla.DARK_OAK_BOOKSHELF, "Dark Oak Bookshelf");
        translationBuilder.add(Vanilla.JUNGLE_BOOKSHELF, "Jungle Bookshelf");
        translationBuilder.add(Vanilla.MANGROVE_BOOKSHELF, "Mangrove Bookshelf");
        translationBuilder.add(Blocks.BOOKSHELF, "Oak Bookshelf");
        translationBuilder.add(Vanilla.SPRUCE_BOOKSHELF, "Spruce Bookshelf");
        translationBuilder.add(Vanilla.WARPED_BOOKSHELF, "Warped Bookshelf");
    }
}