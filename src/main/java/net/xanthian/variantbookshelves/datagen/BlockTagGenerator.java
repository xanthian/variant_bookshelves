package net.xanthian.variantbookshelves.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.Initialise;
import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public static final TagKey<Block> BOOKSHELVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(Initialise.MOD_ID, "bookshelves"));
    private static final TagKey<Block> C_BOOKSHELVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:bookshelves"));

    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
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
        registerTags(Botania.BOT_BOOKSHELVES);
        registerTags(Cinderscapes.CS_BOOKSHELVES);
        registerTags(DeeperAndDarker.DAD_BOOKSHELVES);
        registerTags(Desolation.DS_BOOKSHELVES);
        registerTags(EldritchEnd.EE_BOOKSHELVES);
        registerTags(MineCells.MC_BOOKSHELVES);
        registerTags(NaturesSpirit.NS_BOOKSHELVES);
        registerTags(Promenade.PROM_BOOKSHELVES);
        registerTags(RegionsUnexplored.RU_BOOKSHELVES);
        registerTags(SnifferPlus.SP_BOOKSHELVES);
        registerTags(TechReborn.TR_BOOKSHELVES);
        registerTags(Vinery.LDV_BOOKSHELVES);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .forceAddTag(BOOKSHELVES);

        getOrCreateTagBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .forceAddTag(BOOKSHELVES);

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