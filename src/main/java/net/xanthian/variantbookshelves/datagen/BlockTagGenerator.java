package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
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
    private static final TagKey<Block> MINEABLE_AXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/axe"));
    private static final TagKey<Block> ENCHANTMENT_POWER_PROVIDER = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:enchantment_power_provider"));
    private static final TagKey<Block> C_BOOKSHELF = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:bookshelves"));

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
                .add(Vanilla.WARPED_BOOKSHELF);

        getOrCreateTagBuilder(MINEABLE_AXE)
                .forceAddTag(BOOKSHELVES);

        getOrCreateTagBuilder(ENCHANTMENT_POWER_PROVIDER)
                .forceAddTag(BOOKSHELVES);

        getOrCreateTagBuilder(C_BOOKSHELF)
                .forceAddTag(BOOKSHELVES);

    }
}