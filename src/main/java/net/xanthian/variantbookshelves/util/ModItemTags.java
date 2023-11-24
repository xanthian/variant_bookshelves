package net.xanthian.variantbookshelves.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantbookshelves.Initialise;

public class ModItemTags {

    public static final TagKey<Item> BOOKSHELVES = register();

    private ModItemTags() {
    }

    private static TagKey<Item> register() {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(Initialise.MOD_ID, "bookshelves"));
    }
}
