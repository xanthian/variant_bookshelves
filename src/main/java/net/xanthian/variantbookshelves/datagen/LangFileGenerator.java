package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;

import java.util.Map;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    public static String generateBlockDisplayName(Block block) {
        Identifier name = Registries.BLOCK.getId(block);
        String blockName = name.getPath();
        int underscoreIndex = blockName.indexOf('_');
        if (underscoreIndex != -1 && underscoreIndex < blockName.length() - 1) {
            blockName = blockName.substring(underscoreIndex + 1);
        }
        String[] parts = blockName.split("_");
        StringBuilder displayName = new StringBuilder();
        for (String part : parts) {
            displayName.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1)).append(" ");
        }
        return displayName.toString().trim();
    }

    private static void registerTranslations(TranslationBuilder translationBuilder, Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            translationBuilder.add(block, generateBlockDisplayName(block));
        }
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

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

        registerTranslations(translationBuilder, AdAstra.AA_BOOKSHELVES);
        registerTranslations(translationBuilder, BeachParty.LDBP_BOOKSHELVES);
        registerTranslations(translationBuilder, BetterArcheology.BA_BOOKSHELVES);
        registerTranslations(translationBuilder, Bewitchment.BW_BOOKSHELVES);
        registerTranslations(translationBuilder, Blockus.BLS_BOOKSHELVES);
        registerTranslations(translationBuilder, DeeperAndDarker.DAD_BOOKSHELVES);
        registerTranslations(translationBuilder, EldritchEnd.EE_BOOKSHELVES);
        registerTranslations(translationBuilder, MineCells.MC_BOOKSHELVES);
        registerTranslations(translationBuilder, NaturesSpirit.NS_BOOKSHELVES);
        registerTranslations(translationBuilder, Promenade.PROM_BOOKSHELVES);
        registerTranslations(translationBuilder, RegionsUnexplored.RU_BOOKSHELVES);
        registerTranslations(translationBuilder, SnifferPlus.SP_BOOKSHELVES);
        registerTranslations(translationBuilder, TechReborn.TR_BOOKSHELVES);
        registerTranslations(translationBuilder, Vinery.LDV_BOOKSHELVES);
    }
}