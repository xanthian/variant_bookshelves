package net.xanthian.variantbookshelves;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.xanthian.variantbookshelves.block.Vanilla;
import net.xanthian.variantbookshelves.util.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantbookshelves";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "variantbookshelves"));


    @Override
    public void onInitialize() {

        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(Initialise.MOD_ID, "3d_bookshelves"),
                FabricLoader.getInstance().getModContainer(Initialise.MOD_ID).orElseThrow(), ResourcePackActivationType.NORMAL);

        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("variantbookshelves.group.variantbookshelves"))
                .icon(() -> new ItemStack(Vanilla.MANGROVE_BOOKSHELF))
                .entries((context, entries) -> {

                    entries.add(Vanilla.ACACIA_BOOKSHELF);
                    entries.add(Vanilla.BAMBOO_BOOKSHELF);
                    entries.add(Vanilla.BIRCH_BOOKSHELF);
                    entries.add(Vanilla.CHERRY_BOOKSHELF);
                    entries.add(Vanilla.CRIMSON_BOOKSHELF);
                    entries.add(Vanilla.DARK_OAK_BOOKSHELF);
                    entries.add(Vanilla.JUNGLE_BOOKSHELF);
                    entries.add(Vanilla.MANGROVE_BOOKSHELF);
                    entries.add(Blocks.BOOKSHELF); // Oak
                    entries.add(Vanilla.SPRUCE_BOOKSHELF);
                    entries.add(Vanilla.WARPED_BOOKSHELF);

                })
                .build());

        Vanilla.registerShelves();
        ModRegistries.registerFuelandFlammable();
    }
}