package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantbookshelves.Initialise;
import net.xanthian.variantbookshelves.block.*;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Block> BOOKSHELVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(Initialise.MOD_ID,"bookshelves"));
    private static final TagKey<Block> C_BOOKSHELVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:bookshelves"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(BOOKSHELVES)
                .add(Vanilla.ACACIA_BOOKSHELF)
                .add(Vanilla.BAMBOO_BOOKSHELF)
                .add(Vanilla.BIRCH_BOOKSHELF)
                .add(Vanilla.CHERRY_BOOKSHELF)
                .add(Vanilla.CRIMSON_BOOKSHELF)
                .add(Vanilla.DARK_OAK_BOOKSHELF)
                .add(Vanilla.JUNGLE_BOOKSHELF)
                .add(Vanilla.MANGROVE_BOOKSHELF)
                .add(Vanilla.SPRUCE_BOOKSHELF)
                .add(Vanilla.WARPED_BOOKSHELF)
        
                .addOptional(new Identifier("variantbookshelves:aa_aeronos_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:aa_glacian_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:aa_stropar_bookshelf"))

                .addOptional(new Identifier("variantbookshelves:ldbp_palm_bookshelf"))

                .addOptional(new Identifier("variantbookshelves:ba_rotten_bookshelf"))

                .addOptional(new Identifier("variantbookshelves:bw_cypress_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:bw_dragons_blood_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:bw_elder_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:bw_juniper_bookshelf"))

                .addOptional(new Identifier("variantbookshelves:dad_echo_bookshelf"))

                .addOptional(new Identifier("variantbookshelves:mc_putrid_bookshelf"))

                .addOptional(new Identifier("variantbookshelves:ns_aspen_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ns_cypress_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ns_fir_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ns_joshua_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ns_maple_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ns_olive_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ns_redwood_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ns_sugi_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ns_willow_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ns_wisteria_bookshelf"))

                .addOptional(new Identifier("variantbookshelves:prom_dark_amaranth_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:prom_maple_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:prom_palm_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:prom_sakura_bookshelf"))

                .addOptional(new Identifier("variantbookshelves:ru_alpha_oak_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_baobab_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_black_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_blackwood_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_blue_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_brown_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_cherry_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_cyan_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_cypress_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_dead_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_eucalyptus_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_green_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_gray_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_joshua_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_larch_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_light_blue_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_light_gray_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_lime_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_magenta_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_maple_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_mauve_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_orange_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_palm_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_pine_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_pink_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_purple_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_red_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_redwood_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_sculkwood_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_white_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_willow_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_yellow_painted_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_brimwood_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_cobalt_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_kapok_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_magnolia_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_socotra_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_yellow_bioshroom_bookshelf"))

                .addOptional(new Identifier("variantbookshelves:sp_stone_pine_bookshelf"))

                .addOptional(new Identifier("variantbookshelves:tr_rubber_bookshelf"))

                .addOptional(new Identifier("variantbookshelves:ldv_cherry_bookshelf"));

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .forceAddTag(BOOKSHELVES);

        getOrCreateTagBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .forceAddTag(BOOKSHELVES);

        getOrCreateTagBuilder(C_BOOKSHELVES)
                .forceAddTag(BOOKSHELVES);

    }
}