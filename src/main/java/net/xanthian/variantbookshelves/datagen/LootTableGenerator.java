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

        // Ad Astra
        addDrop(AdAstra.AA_AERONOS_BOOKSHELF, addConditions(drops(AdAstra.AA_AERONOS_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));
        addDrop(AdAstra.AA_GLACIAN_BOOKSHELF, addConditions(drops(AdAstra.AA_GLACIAN_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));
        addDrop(AdAstra.AA_STROPHAR_BOOKSHELF, addConditions(drops(AdAstra.AA_STROPHAR_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("ad_astra"))));
        // Beach Party (Lets Do)
        addDrop(BeachParty.LDBP_PALM_BOOKSHELF, addConditions(drops(BeachParty.LDBP_PALM_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("beachparty"))));
        // Better Archeology
        addDrop(BetterArcheology.BA_ROTTEN_BOOKSHELF, addConditions(drops(BetterArcheology.BA_ROTTEN_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("betterarcheology"))));
        // Bewitchment
        addDrop(Bewitchment.BW_CYPRESS_BOOKSHELF, addConditions(drops(Bewitchment.BW_CYPRESS_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("bewitchment"))));
        addDrop(Bewitchment.BW_DRAGONS_BLOOD_BOOKSHELF, addConditions(drops(Bewitchment.BW_DRAGONS_BLOOD_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("bewitchment"))));
        addDrop(Bewitchment.BW_ELDER_BOOKSHELF, addConditions(drops(Bewitchment.BW_ELDER_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("bewitchment"))));
        addDrop(Bewitchment.BW_JUNIPER_BOOKSHELF, addConditions(drops(Bewitchment.BW_JUNIPER_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("bewitchment"))));
        // Promenade
        addDrop(Promenade.PROM_DARK_AMARANTH_BOOKSHELF, addConditions(drops(Promenade.PROM_DARK_AMARANTH_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        addDrop(Promenade.PROM_MAPLE_BOOKSHELF, addConditions(drops(Promenade.PROM_MAPLE_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        addDrop(Promenade.PROM_PALM_BOOKSHELF, addConditions(drops(Promenade.PROM_PALM_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        addDrop(Promenade.PROM_SAKURA_BOOKSHELF, addConditions(drops(Promenade.PROM_SAKURA_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("promenade"))));
        // Regions Unexplored
        addDrop(RegionsUnexplored.RU_ALPHA_OAK_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_ALPHA_OAK_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BAOBAB_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_BAOBAB_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BLACK_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_BLACK_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BLACKWOOD_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_BLACKWOOD_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BLUE_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_BLUE_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_BROWN_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_BROWN_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_CHERRY_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_CHERRY_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_CYAN_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_CYAN_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_CYPRESS_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_CYPRESS_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_DEAD_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_DEAD_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_EUCALYPTUS_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_EUCALYPTUS_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_GREEN_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_GREEN_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_GRAY_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_GRAY_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_JOSHUA_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_JOSHUA_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LARCH_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_LARCH_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_LIGHT_BLUE_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_LIGHT_GRAY_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_LIME_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_LIME_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_MAGENTA_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_MAGENTA_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_MAPLE_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_MAPLE_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_MAUVE_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_MAUVE_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_ORANGE_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_ORANGE_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PALM_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_PALM_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PINE_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_PINE_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PINK_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_PINK_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_PURPLE_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_PURPLE_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_RED_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_RED_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_REDWOOD_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_REDWOOD_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_SCULKWOOD_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_SCULKWOOD_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_WHITE_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_WHITE_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_WILLOW_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_WILLOW_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
        addDrop(RegionsUnexplored.RU_YELLOW_PAINTED_BOOKSHELF, addConditions(drops(RegionsUnexplored.RU_YELLOW_PAINTED_BOOKSHELF, Items.BOOK, ConstantLootNumberProvider.create(3.0f)),List.of(DefaultResourceConditions.allModsLoaded("regions_unexplored"))));
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