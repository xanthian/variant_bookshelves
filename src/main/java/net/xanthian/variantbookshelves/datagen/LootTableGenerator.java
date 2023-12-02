package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.DefaultResourceConditions;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
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
        registerLootTables(BiomeMakeover.BM_BOOKSHELVES, "biomemakeover");
        registerLootTables(Blockus.BLS_BOOKSHELVES, "blockus");
        registerLootTables(Botania.BOT_BOOKSHELVES, "botania");
        registerLootTables(Cinderscapes.CS_BOOKSHELVES, "cinderscapes");
        registerLootTables(DeeperAndDarker.DAD_BOOKSHELVES, "deeperdarker");
        registerLootTables(Desolation.DS_BOOKSHELVES, "desolation");
        registerLootTables(EldritchEnd.EE_BOOKSHELVES, "eldritch_end");
        registerLootTables(MineCells.MC_BOOKSHELVES, "minecells");
        registerSpecialLootTable(NaturesSpirit.NS_BOOKSHELVES, "natures_spirit");
        registerLootTables(Promenade.PROM_BOOKSHELVES, "promenade");
        registerSpecialLootTable(RegionsUnexplored.RU_BOOKSHELVES, "regions_unexplored");
        registerLootTables(SnifferPlus.SP_BOOKSHELVES, "snifferplus");
        registerLootTables(TechReborn.TR_BOOKSHELVES, "techreborn");
        registerLootTables(Vinery.LDV_BOOKSHELVES, "vinery");

    }

    private void registerLootTables(Map<Identifier, Block> blockMap, String modId) {
        for (Block bookshelf : blockMap.values()) {
            withConditions(DefaultResourceConditions.allModsLoaded(modId)).addDrop(bookshelf, drops(bookshelf, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        }
    }

    public void registerSpecialLootTable(Map<Identifier, Block> bookshelfs, String modId) {
        for (Map.Entry<Identifier, Block> entry : bookshelfs.entrySet()) {
            Identifier bookshelfId = entry.getKey();
            Block bookshelf = entry.getValue();
            String path = bookshelfId.getPath();
            int firstUnderscoreIndex = path.indexOf('_');
            int lastUnderscoreIndex = path.lastIndexOf('_');
            if (firstUnderscoreIndex != -1 && lastUnderscoreIndex != -1 && lastUnderscoreIndex > firstUnderscoreIndex) {
                String plankName = path.substring(firstUnderscoreIndex + 1, lastUnderscoreIndex);
                String plankPath = modId + ":" + plankName + "_planks";
                withConditions(DefaultResourceConditions.and(DefaultResourceConditions.allModsLoaded(modId),
                        DefaultResourceConditions.registryContains(RegistryKey.of(RegistryKeys.BLOCK, new Identifier(plankPath)))))
                        .addDrop(bookshelf, drops(bookshelf, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));

            } else {
                System.out.println("Invalid block name format: " + path);
            }
        }
    }
}