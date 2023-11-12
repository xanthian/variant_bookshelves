package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;

import java.util.Map;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        for (Block block : Vanilla.VANILLA_BOOKSHELVES.values()) {
            addDrop(block, drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        }

        registerLootTables(AdAstra.AA_BOOKSHELVES, "ad_astra");
        registerLootTables(BeachParty.LDBP_BOOKSHELVES, "beachparty");
        registerLootTables(BetterArcheology.BA_BOOKSHELVES, "betterarcheology");
        registerLootTables(Bewitchment.BW_BOOKSHELVES, "bewitchment");
        registerLootTables(Blockus.BLS_BOOKSHELVES, "blockus");
        registerLootTables(DeeperAndDarker.DAD_BOOKSHELVES, "deeperdarker");
        registerLootTables(EldritchEnd.EE_BOOKSHELVES, "eldritch_end");
        registerLootTables(MineCells.MC_BOOKSHELVES, "minecells");
        registerLootTables(NaturesSpirit.NS_BOOKSHELVES, "natures_spirit");
        registerLootTables(Promenade.PROM_BOOKSHELVES, "promenade");
        registerLootTables(RegionsUnexplored.RU_BOOKSHELVES, "regions_unexplored");
        registerLootTables(SnifferPlus.SP_BOOKSHELVES, "snifferplus");
        registerLootTables(TechReborn.TR_BOOKSHELVES, "techreborn");
        registerLootTables(Vinery.LDV_BOOKSHELVES, "vinery");


        //addDrop(bookshelf, (Block block) -> this.addConditions(drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)), List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));


        // Beach Party (Lets Do)
        //addDrop(BeachParty.LDBP_PALM_BOOKSHELF, addConditions(drops(BeachParty.LDBP_PALM_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("beachparty"))));


    }

    private void registerLootTables(Map<Identifier, Block> blockMap, String modId) {
        for (Block bookshelf : blockMap.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded(modId)).addDrop(bookshelf, drops(bookshelf, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        }
    }
}