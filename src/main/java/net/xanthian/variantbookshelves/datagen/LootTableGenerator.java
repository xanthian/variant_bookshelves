package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ConditionJsonProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;

import java.util.List;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        for (Block bookshelf : Vanilla.MOD_BOOKSHELVES.values()) {
            addDrop(bookshelf,(Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        }

        // Ad Astra
        for (Block bookshelf : AdAstra.AA_BOOKSHELVES.values()) {
            addDrop(bookshelf, (Block block) -> this.addConditions(drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)), List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));
        }

        // Beach Party (Lets Do)
        addDrop(BeachParty.LDBP_PALM_BOOKSHELF, addConditions(drops(BeachParty.LDBP_PALM_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("beachparty"))));

        // Better Archeology
        addDrop(BetterArcheology.BA_ROTTEN_BOOKSHELF, addConditions(drops(BetterArcheology.BA_ROTTEN_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("betterarcheology"))));

        // Bewitchment
        for (Block bookshelf : Bewitchment.BW_BOOKSHELVES.values()) {
            addDrop(bookshelf, (Block block) -> this.addConditions(drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)), List.of(DefaultResourceConditions.allModsLoaded("bewitchment"))));
        }

        // Deeper & Darker
        addDrop(DeeperAndDarker.DAD_ECHO_BOOKSHELF, addConditions(drops(DeeperAndDarker.DAD_ECHO_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)), List.of(DefaultResourceConditions.allModsLoaded("deeperdarker"))));

        // Mine Cells
        addDrop(MineCells.MC_PUTRID_BOOKSHELF, addConditions(drops(MineCells.MC_PUTRID_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)), List.of(DefaultResourceConditions.allModsLoaded("minecells"))));

        // Natures Spirit
        for (Block bookshelf : NaturesSpirit.NS_BOOKSHELVES.values()) {
            addDrop(bookshelf, (Block block) -> this.addConditions(drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)), List.of(DefaultResourceConditions.allModsLoaded("natures_spirit"))));
        }

        // Promenade
        for (Block bookshelf : Promenade.PROM_BOOKSHELVES.values()) {
            addDrop(bookshelf, (Block block) -> this.addConditions(drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)), List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        }

        // Regions Unexplored
        for (Block bookshelf : RegionsUnexplored.RU_BOOKSHELVES.values()) {
            addDrop(bookshelf, (Block block) -> this.addConditions(drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)), List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        }

        // SnifferPlus
        addDrop(SnifferPlus.SP_STONE_PINE_BOOKSHELF, addConditions(drops(SnifferPlus.SP_STONE_PINE_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("snifferplus"))));

        // Tech reborn
        addDrop(TechReborn.TR_RUBBER_BOOKSHELF, addConditions(drops(TechReborn.TR_RUBBER_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("techreborn"))));

        // Vinery (Lets Do)
        addDrop(Vinery.LDV_CHERRY_BOOKSHELF, addConditions(drops(Vinery.LDV_CHERRY_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("vinery"))));

    }
    private LootTable.Builder addConditions(LootTable.Builder builder, List<ConditionJsonProvider> conditions) {
        if (!conditions.isEmpty())
            FabricDataGenHelper.addConditions(builder, conditions.toArray(ConditionJsonProvider[]::new));
        return builder;
    }
}