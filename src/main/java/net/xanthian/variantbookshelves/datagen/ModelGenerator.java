package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.util.ModTextureMap;


public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}