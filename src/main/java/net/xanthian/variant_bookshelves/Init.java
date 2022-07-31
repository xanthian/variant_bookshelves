package net.xanthian.variant_bookshelves;

import com.google.common.collect.Lists;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import net.xanthian.variant_bookshelves.blocks.VariantBookshelves;

import org.apache.commons.lang3.tuple.Pair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Init implements ModInitializer {

    public static final String MOD_ID = "variant_bookshelves";

    public static Identifier ID(String path) {
        return new Identifier(MOD_ID, path);
    }

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ItemGroup VARIANT_BOOKSHELVES = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "variant_bookshelves"),
            () -> new ItemStack(VariantBookshelves.BIRCH_BOOKSHELF));
    public static List<Pair<String, String[]>> woodTypes = Lists.newArrayList();

    @Override
    public void onInitialize() {

            woodTypes.add(Pair.of("acacia", new String[0]));
            woodTypes.add(Pair.of("birch", new String[0]));
            woodTypes.add(Pair.of("dark_oak", new String[0]));
            woodTypes.add(Pair.of("jungle", new String[0]));
            woodTypes.add(Pair.of("mangrove", new String[0]));
            woodTypes.add(Pair.of("spruce", new String[0]));
            woodTypes.add(Pair.of("crimson", new String[0]));
            woodTypes.add(Pair.of("warped", new String[0]));
            VariantBookshelves.registerBookshelf();
    }
}