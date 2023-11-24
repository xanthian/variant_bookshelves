package net.xanthian.variantbookshelves;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.metadata.ModMetadata;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.block.compatability.*;
import net.xanthian.variantbookshelves.util.ModCreativeTab;
import net.xanthian.variantbookshelves.util.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantbookshelves";

    public static void ifModLoaded(String modId, Runnable runnable) {
        if (FabricLoader.getInstance().isModLoaded(modId)) {
            runnable.run();
        }
    }

    public static boolean isModVersion(String modId, String ver) {
        return FabricLoader.getInstance()
                .getModContainer(modId)
                .map(ModContainer::getMetadata)
                .map(ModMetadata::getVersion)
                .map(Version::getFriendlyString)
                .filter(version -> version.startsWith(ver))
                .isPresent();
    }

    @Override
    public void onInitialize() {

        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(Initialise.MOD_ID, "3d_bookshelves"),
                FabricLoader.getInstance().getModContainer(Initialise.MOD_ID).orElseThrow(), ResourcePackActivationType.NORMAL);

        Vanilla.registerBookshelves();

        ifModLoaded("ad_astra", AdAstra::registerBookshelves);

        ifModLoaded("beachparty", BeachParty::registerBookshelves);

        ifModLoaded("betterarcheology", BetterArcheology::registerBookshelves);

        ifModLoaded("bewitchment", Bewitchment::registerBookshelves);

        ifModLoaded("biomemakeover", BiomeMakeover::registerBookshelves);

        ifModLoaded("blockus", Blockus::registerBookshelves);

        ifModLoaded("deeperdarker", DeeperAndDarker::registerBookshelves);

        ifModLoaded("eldritch_end", EldritchEnd::registerBookshelves);

        ifModLoaded("minecells", MineCells::registerBookshelves);

        ifModLoaded("natures_spirit", NaturesSpirit::registerBookshelves);

        ifModLoaded("promenade", Promenade::registerBookshelves);

        ifModLoaded("regions_unexplored", () -> {
            RegionsUnexplored.registerBookshelves();
            if (isModVersion("regions_unexplored", "0.4")) {
                RegionsUnexplored.register04Bookshelves();
            } else {
                RegionsUnexplored.register05Bookshelves();
            }
        });

        ifModLoaded("snifferplus", SnifferPlus::registerBookshelves);

        ifModLoaded("techreborn", TechReborn::registerBookshelves);

        ifModLoaded("vinery", Vinery::registerBookshelves);

        ModRegistries.registerFuelandFlammable();
        ModCreativeTab.registerItemGroup();

        //Datagen Block - disable for client run
        //SnifferPlus.registerBookshelves();
        //RegionsUnexplored.register04Bookshelves();
        //NaturesSpirit.registerBookshelves();
        //DeeperAndDarker.registerBookshelves();
        //BiomeMakeover.registerBookshelves();
        //AdAstra.registerBookshelves();

    }
}