package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantbookshelves.block.*;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantbookshelves.util.ModItemTags.BOOKSHELVES;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Item> C_BOOKSHELF = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:bookshelves"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(BOOKSHELVES)
                    .add(Vanilla.ACACIA_BOOKSHELF.asItem())
                    .add(Vanilla.BAMBOO_BOOKSHELF.asItem())
                    .add(Vanilla.BIRCH_BOOKSHELF.asItem())
                    .add(Vanilla.CHERRY_BOOKSHELF.asItem())
                    .add(Vanilla.CRIMSON_BOOKSHELF.asItem())
                    .add(Vanilla.DARK_OAK_BOOKSHELF.asItem())
                    .add(Vanilla.JUNGLE_BOOKSHELF.asItem())
                    .add(Vanilla.MANGROVE_BOOKSHELF.asItem())
                    .add(Vanilla.SPRUCE_BOOKSHELF.asItem())
                    .add(Vanilla.WARPED_BOOKSHELF.asItem())

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

                    .addOptional(new Identifier("variantbookshelves:sp_stone_pine_bookshelf"))

                    .addOptional(new Identifier("variantbookshelves:tr_rubber_bookshelf"))

                    .addOptional(new Identifier("variantbookshelves:ldv_cherry_bookshelf"));

            getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                    .add(Vanilla.CRIMSON_BOOKSHELF.asItem())
                    .add(Vanilla.WARPED_BOOKSHELF.asItem());

            getOrCreateTagBuilder(C_BOOKSHELF)
                    .forceAddTag(BOOKSHELVES);

        }
    }