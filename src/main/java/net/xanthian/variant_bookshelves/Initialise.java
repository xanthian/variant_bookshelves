package net.xanthian.variant_bookshelves;

import com.google.common.collect.Lists;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import net.xanthian.variant_bookshelves.blocks.Bookshelves;

import org.apache.commons.lang3.tuple.Pair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variant_bookshelves";

    public static Identifier ID(String path) {
        return new Identifier(MOD_ID, path);
    }

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ItemGroup VARIANT_BOOKSHELVES = FabricItemGroupBuilder.build(new Identifier(Initialise.MOD_ID, "variant_bookshelves"),
            () -> new ItemStack(Blocks.BOOKSHELF));
    public static List<Pair<String, String[]>> woodTypes = Lists.newArrayList();

    @Override
    public void onInitialize() {

        Bookshelves.registerVanillaBookshelves();
        woodTypes.add(Pair.of("acacia", new String[0]));
        woodTypes.add(Pair.of("birch", new String[0]));
        woodTypes.add(Pair.of("dark_oak", new String[0]));
        woodTypes.add(Pair.of("jungle", new String[0]));
        woodTypes.add(Pair.of("mangrove", new String[0]));
        woodTypes.add(Pair.of("spruce", new String[0]));

        if (!FabricLoader.getInstance().isModLoaded("betternether")) {
            Bookshelves.registerNetherBookshelves();
            woodTypes.add(Pair.of("crimson", new String[0]));
            woodTypes.add(Pair.of("warped", new String[0]));
        }

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            woodTypes.add(Pair.of("rubber", new String[]{"techreborn"}));
            Bookshelves.registerTRBookshelves();
        }

        if (FabricLoader.getInstance().isModLoaded("ecologics")) {
            woodTypes.add(Pair.of("azalea", new String[]{"ecologics"}));
            woodTypes.add(Pair.of("coconut", new String[]{"ecologics"}));
            woodTypes.add(Pair.of("flowering_azalea", new String[]{"ecologics"}));
            woodTypes.add(Pair.of("walnut", new String[]{"ecologics"}));
            Bookshelves.registerEcologicsBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("croptopia")) {
            woodTypes.add(Pair.of("cinnamon", new String[]{"croptopia"}));
            Bookshelves.registerCroptopiaBookshelves();
        }

        if (FabricLoader.getInstance().isModLoaded("arclight")) {
            woodTypes.add(Pair.of("jade", new String[]{"arclight"}));
            woodTypes.add(Pair.of("moon", new String[]{"arclight"}));
            woodTypes.add(Pair.of("shadow", new String[]{"arclight"}));
            Bookshelves.registerArclightBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("simplemango")) {
            woodTypes.add(Pair.of("mango", new String[]{"simplemango"}));
            Bookshelves.registerSimpleMangoBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("traverse")) {
            woodTypes.add(Pair.of("fir", new String[]{"traverse"}));
            Bookshelves.registerTraverseBookshelves();
        }
        if (FabricLoader.getInstance().isModLoaded("terrestria")) {
            woodTypes.add(Pair.of("cypress", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("hemlock", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("japanese_maple", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("rainbow_eucalyptus", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("redwood", new String[]{"terrestria"}));
            //woodTypes.add(Pair.of("rubber", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("sakura", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("willow", new String[]{"terrestria"}));
            woodTypes.add(Pair.of("yucca_palm", new String[]{"terrestria"}));
            Bookshelves.registerTerrestriaBookshelves();

        }
    }
}