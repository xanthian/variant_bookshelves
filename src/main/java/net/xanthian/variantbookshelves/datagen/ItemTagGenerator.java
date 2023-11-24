package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantbookshelves.util.ModItemTags.BOOKSHELVES;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    private static final TagKey<Item> C_BOOKSHELVES = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:bookshelves"));

    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        registerTags(Vanilla.VANILLA_BOOKSHELVES);

        registerTags(AdAstra.AA_BOOKSHELVES);
        registerTags(BeachParty.LDBP_BOOKSHELVES);
        registerTags(BetterArcheology.BA_BOOKSHELVES);
        registerTags(Bewitchment.BW_BOOKSHELVES);
        registerTags(BiomeMakeover.BM_BOOKSHELVES);
        registerTags(Blockus.BLS_BOOKSHELVES);
        registerTags(DeeperAndDarker.DAD_BOOKSHELVES);
        registerTags(EldritchEnd.EE_BOOKSHELVES);
        registerTags(MineCells.MC_BOOKSHELVES);
        registerTags(NaturesSpirit.NS_BOOKSHELVES);
        registerTags(Promenade.PROM_BOOKSHELVES);
        registerTags(RegionsUnexplored.RU_BOOKSHELVES);
        registerTags(SnifferPlus.SP_BOOKSHELVES);
        registerTags(TechReborn.TR_BOOKSHELVES);
        registerTags(Vinery.LDV_BOOKSHELVES);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(Vanilla.CRIMSON_BOOKSHELF.asItem())
                .add(Vanilla.WARPED_BOOKSHELF.asItem())
                .addOptional(new Identifier("variantbookshelves:bls_herringbone_charred_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:bls_herringbone_crimson_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:bls_herringbone_warped_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:prom_dark_amaranth_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_brimwood_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_cobalt_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_dead_bookshelf"))
                .addOptional(new Identifier("variantbookshelves:ru_yellow_bioshroom_bookshelf"));

        getOrCreateTagBuilder(C_BOOKSHELVES)
                .forceAddTag(BOOKSHELVES);

    }

    private void registerTags(Map<Identifier, Block> blockMap) {
        for (Block block : blockMap.values()) {
            Identifier lootTableId = block.getLootTableId();
            String newPath = lootTableId.getPath().replaceFirst("blocks/", "");
            Identifier modifiedId = new Identifier(lootTableId.getNamespace(), newPath);

            getOrCreateTagBuilder(BOOKSHELVES)
                    .addOptional(modifiedId);
        }
    }
}