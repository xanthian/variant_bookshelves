package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantbookshelves.block.*;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantbookshelves.util.ModItemTags.BOOKSHELVES;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Item> NON_FLAMMABLE_WOOD = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:non_flammable_wood"));
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
                    .add(Vanilla.WARPED_BOOKSHELF.asItem());

            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(Vanilla.CRIMSON_BOOKSHELF.asItem())
                    .add(Vanilla.WARPED_BOOKSHELF.asItem());

            getOrCreateTagBuilder(C_BOOKSHELF)
                    .forceAddTag(BOOKSHELVES);

        }
    }