package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

import net.xanthian.variantbookshelves.block.Vanilla;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(Vanilla.ACACIA_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Vanilla.BAMBOO_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Vanilla.BIRCH_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Vanilla.CHERRY_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Vanilla.DARK_OAK_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Vanilla.JUNGLE_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Vanilla.MANGROVE_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Vanilla.SPRUCE_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Vanilla.CRIMSON_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Vanilla.WARPED_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Vanilla.MANGROVE_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));

    }
}