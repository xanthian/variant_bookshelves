package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;


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
            withConditions(DefaultResourceConditions.allModsLoaded("ad_astra")).addDrop(bookshelf, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        }

        // Beach Party (Lets Do)
        withConditions(DefaultResourceConditions.allModsLoaded("beachparty")).addDrop(BeachParty.LDBP_PALM_BOOKSHELF, drops(BeachParty.LDBP_PALM_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));

        // Better Archeology
        withConditions(DefaultResourceConditions.allModsLoaded("betterarcheology")).addDrop(BetterArcheology.BA_ROTTEN_BOOKSHELF, drops(BetterArcheology.BA_ROTTEN_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));

        // Bewitchment
        for (Block bookshelf : Bewitchment.BW_BOOKSHELVES.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("bewitchment")).addDrop(bookshelf, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        }

        // Deeper & Darker
        withConditions(DefaultResourceConditions.allModsLoaded("deeperdarker")).addDrop(DeeperAndDarker.DAD_ECHO_BOOKSHELF, drops(DeeperAndDarker.DAD_ECHO_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));

        // Mine Cells
        withConditions(DefaultResourceConditions.allModsLoaded("minecells")).addDrop(MineCells.MC_PUTRID_BOOKSHELF, drops(MineCells.MC_PUTRID_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));

        // Natures Spirit
        for (Block bookshelf : NaturesSpirit.NS_BOOKSHELVES.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("natures_spirit")).addDrop(bookshelf, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        }

        // Promenade
        for (Block bookshelf : Promenade.PROM_BOOKSHELVES.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("promenade")).addDrop(bookshelf, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        }

        // Regions Unexplored
        for (Block bookshelf : RegionsUnexplored.RU_BOOKSHELVES.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded("regions_unexplored")).addDrop(bookshelf, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        }

        // SnifferPlus
        withConditions(DefaultResourceConditions.allModsLoaded("snifferplus")).addDrop(SnifferPlus.SP_STONE_PINE_BOOKSHELF, drops(SnifferPlus.SP_STONE_PINE_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));

        // Tech reborn
        withConditions(DefaultResourceConditions.allModsLoaded("techreborn")).addDrop(TechReborn.TR_RUBBER_BOOKSHELF, drops(TechReborn.TR_RUBBER_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));

        // Vinery (Lets Do)
        withConditions(DefaultResourceConditions.allModsLoaded("vinery")).addDrop(Vinery.LDV_CHERRY_BOOKSHELF, drops(Vinery.LDV_CHERRY_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));

    }
}