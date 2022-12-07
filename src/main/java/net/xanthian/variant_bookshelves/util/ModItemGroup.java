package net.xanthian.variant_bookshelves.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.variant_bookshelves.Initialise;

import java.util.Comparator;

public class ModItemGroup {

    public static void registerGroup() {
    }

    public static final ItemGroup VARIANT_BOOKSHELVES =
            FabricItemGroup.builder(new Identifier(Initialise.MOD_ID, "variant_bookshelves"))
                    .displayName(Text.literal("Variant Bookshelves"))
                    .icon(() -> new ItemStack(Blocks.BOOKSHELF))
                    .entries((enabledFeatures, entries, operatorEnabled) -> {
                        entries.addAll(Registries.ITEM.getIds().stream()
                                .filter(identifier -> identifier.getNamespace().matches(Initialise.MOD_ID))
                                .sorted(Comparator.comparing(Identifier::getPath))
                                .map(Registries.ITEM::get)
                                .map(ItemStack::new)
                                .filter(input -> !input.isEmpty())
                                .toList());
                    })
                    .build();

}