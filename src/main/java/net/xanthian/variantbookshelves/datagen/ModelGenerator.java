package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;
import net.xanthian.variantbookshelves.util.ModTextureMap;

import java.util.function.BiFunction;


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

        // Ad Astra (disabled)
        registerNonStandardCube(blockStateModelGenerator, AdAstra.AA_AERONOS_BOOKSHELF,"ad_astra:block/aeronos_planks",ModTextureMap::janky);
        registerNonStandardCube(blockStateModelGenerator, AdAstra.AA_GLACIAN_BOOKSHELF,"ad_astra:block/glacian_planks",ModTextureMap::janky);
        registerNonStandardCube(blockStateModelGenerator, AdAstra.AA_STROPHAR_BOOKSHELF,"ad_astra:block/strophar_planks",ModTextureMap::janky);
        // Beach Party (Lets Do)
        registerNonStandardCube(blockStateModelGenerator,BeachParty.LDBP_PALM_BOOKSHELF,"beachparty:block/palm_planks0",ModTextureMap::janky);
        // Better Archeology
        blockStateModelGenerator.registerCubeWithCustomTextures(BetterArcheology.BA_ROTTEN_BOOKSHELF, Registries.BLOCK.get(new Identifier("betterarcheology:rotten_planks")), ModTextureMap::endside);
        // Bewitchment
        blockStateModelGenerator.registerCubeWithCustomTextures(Bewitchment.BW_CYPRESS_BOOKSHELF, Registries.BLOCK.get(new Identifier("bewitchment:cypress_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bewitchment.BW_DRAGONS_BLOOD_BOOKSHELF, Registries.BLOCK.get(new Identifier("bewitchment:dragons_blood_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bewitchment.BW_ELDER_BOOKSHELF, Registries.BLOCK.get(new Identifier("bewitchment:elder_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bewitchment.BW_JUNIPER_BOOKSHELF, Registries.BLOCK.get(new Identifier("bewitchment:juniper_planks")), ModTextureMap::endside);
        // Promenade
        registerNonStandardCube(blockStateModelGenerator,Promenade.PROM_DARK_AMARANTH_BOOKSHELF, "promenade:block/dark_amaranth/planks", ModTextureMap::janky);
        registerNonStandardCube(blockStateModelGenerator,Promenade.PROM_MAPLE_BOOKSHELF, "promenade:block/maple/planks", ModTextureMap::janky);
        registerNonStandardCube(blockStateModelGenerator,Promenade.PROM_PALM_BOOKSHELF, "promenade:block/palm/planks", ModTextureMap::janky);
        registerNonStandardCube(blockStateModelGenerator,Promenade.PROM_SAKURA_BOOKSHELF, "promenade:block/sakura/planks", ModTextureMap::janky);
        // Regions Unexplored
        registerNonStandardCube(blockStateModelGenerator,RegionsUnexplored.RU_ALPHA_OAK_BOOKSHELF,"regions_unexplored:block/alpha_oak_planks",ModTextureMap::janky);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_BAOBAB_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:baobab_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_BLACK_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:black_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_BLACKWOOD_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:blackwood_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_BLUE_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:blue_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_BROWN_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:brown_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_CHERRY_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:cherry_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_CYAN_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:cyan_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_CYPRESS_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:cypress_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_DEAD_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:dead_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_EUCALYPTUS_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:eucalyptus_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_GREEN_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:green_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_GRAY_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:gray_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_JOSHUA_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:joshua_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_LARCH_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:larch_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:light_blue_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:light_gray_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_LIME_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:lime_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_MAGENTA_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:magenta_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_MAPLE_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:maple_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_MAUVE_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:mauve_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_ORANGE_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:orange_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_PALM_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:palm_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_PINE_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:pine_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_PINK_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:pink_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_PURPLE_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:purple_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_RED_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:red_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_REDWOOD_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:redwood_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_SCULKWOOD_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:sculkwood_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_WHITE_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:white_painted_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_WILLOW_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:willow_planks")), ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(RegionsUnexplored.RU_YELLOW_PAINTED_BOOKSHELF, Registries.BLOCK.get(new Identifier("regions_unexplored:yellow_painted_planks")), ModTextureMap::endside);
        // SnifferPlus (disabled)
        registerNonStandardCube(blockStateModelGenerator,SnifferPlus.SP_STONE_PINE_BOOKSHELF, "snifferplus:block/stone_pine_planks", ModTextureMap::janky);
        // Tech Reborn
        blockStateModelGenerator.registerCubeWithCustomTextures(TechReborn.TR_RUBBER_BOOKSHELF, Registries.BLOCK.get(new Identifier("techreborn:rubber_planks")), ModTextureMap::endside);
        // Vinery (Lets Do)
        blockStateModelGenerator.registerCubeWithCustomTextures(Vinery.LDV_CHERRY_BOOKSHELF, Registries.BLOCK.get(new Identifier("vinery:cherry_planks")), ModTextureMap::endside);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    // Used for those mods that cant follow a standard _planks naming convention or those that don't load via gradle.
    public final void registerNonStandardCube(BlockStateModelGenerator blockStateModelGenerator, Block block, String string, BiFunction<Block, String, TextureMap> texturesFactory) {
        TextureMap textureMap = texturesFactory.apply(block, string);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, Models.CUBE.upload(block, textureMap, blockStateModelGenerator.modelCollector)));
    }
}