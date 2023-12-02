package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;
import net.xanthian.variantbookshelves.util.ModTextureMap;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;


public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    // Used for those mods that cant follow a standard _planks naming convention or those that don't load via gradle.
    public static void registerNonStandardCube(BlockStateModelGenerator blockStateModelGenerator, Block block, String string, BiFunction<Block, String, TextureMap> texturesFactory) {
        TextureMap textureMap = texturesFactory.apply(block, string);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, Models.CUBE.upload(block, textureMap, blockStateModelGenerator.modelCollector)));
    }

    // Allows to loop through the blocks in each class and extract the block name without using registry
    public static void registerModel(BlockStateModelGenerator blockStateModelGenerator, Map<Identifier, Block> blockMap, String modId, Function<String, String> modelPathGenerator) {
        for (Block bookshelf : blockMap.values()) {
            String blockName = bookshelf.getTranslationKey();
            int firstUnderscoreIndex = blockName.indexOf('_');
            if (firstUnderscoreIndex != -1) {
                String plankName = blockName.substring(firstUnderscoreIndex + 1, blockName.lastIndexOf("_bookshelf"));
                String modelPath = modId + ":block/" + modelPathGenerator.apply(plankName);
                registerNonStandardCube(blockStateModelGenerator, bookshelf, modelPath, ModTextureMap::bookshelf);
            } else {
                System.out.println("Invalid block name format: " + blockName);
            }
        }
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.ACACIA_BOOKSHELF, Blocks.ACACIA_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.BAMBOO_BOOKSHELF, Blocks.BAMBOO_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.BIRCH_BOOKSHELF, Blocks.BIRCH_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.CHERRY_BOOKSHELF, Blocks.CHERRY_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.DARK_OAK_BOOKSHELF, Blocks.DARK_OAK_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.JUNGLE_BOOKSHELF, Blocks.JUNGLE_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.MANGROVE_BOOKSHELF, Blocks.MANGROVE_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.SPRUCE_BOOKSHELF, Blocks.SPRUCE_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.CRIMSON_BOOKSHELF, Blocks.CRIMSON_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Vanilla.WARPED_BOOKSHELF, Blocks.WARPED_PLANKS, ModTextureMap::endside);

        registerModel(blockStateModelGenerator, AdAstra.AA_BOOKSHELVES, "ad_astra", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, BeachParty.LDBP_BOOKSHELVES, "beachparty", plankName -> plankName + "_planks0");
        registerModel(blockStateModelGenerator, BetterArcheology.BA_BOOKSHELVES, "betterarcheology", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Bewitchment.BW_BOOKSHELVES, "bewitchment", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, BiomeMakeover.BM_BOOKSHELVES, "biomemakeover", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Blockus.BLS_BOOKSHELVES, "blockus", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Botania.BOT_BOOKSHELVES, "botania", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Cinderscapes.CS_BOOKSHELVES, "cinderscapes", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, DeeperAndDarker.DAD_BOOKSHELVES, "deeperdarker", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Desolation.DS_BOOKSHELVES, "desolation", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, EldritchEnd.EE_BOOKSHELVES, "eldritch_end", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, MineCells.MC_BOOKSHELVES, "minecells", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, NaturesSpirit.NS_BOOKSHELVES, "natures_spirit", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Promenade.PROM_BOOKSHELVES, "promenade", plankName -> plankName + "/planks");
        registerModel(blockStateModelGenerator, RegionsUnexplored.RU_BOOKSHELVES, "regions_unexplored", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, SnifferPlus.SP_BOOKSHELVES, "snifferplus", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, TechReborn.TR_BOOKSHELVES, "techreborn", plankName -> plankName + "_planks");
        registerModel(blockStateModelGenerator, Vinery.LDV_BOOKSHELVES, "vinery", plankName -> plankName + "_planks");
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}