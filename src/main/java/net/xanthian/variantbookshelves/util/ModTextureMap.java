package net.xanthian.variantbookshelves.util;

import net.minecraft.block.Block;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;

public class ModTextureMap extends TextureMap {

    // Datagen for the Bookshelf models
    public static TextureMap endside(Block neswBlock, Block updownBlock) {
        return (new ModTextureMap())
                .put(TextureKey.PARTICLE, getId(neswBlock))
                .put(TextureKey.DOWN, getId(updownBlock))
                .put(TextureKey.UP, getId(updownBlock))
                .put(TextureKey.NORTH, getId(neswBlock))
                .put(TextureKey.SOUTH, getId(neswBlock))
                .put(TextureKey.EAST, getId(neswBlock))
                .put(TextureKey.WEST, getId(neswBlock));
    }
    // Used for those mods that cant follow a standard _planks naming convention or those that don't load via gradle.
    public static TextureMap janky(Block neswBlock, String updownBlock) {
        return (new ModTextureMap())
                .put(TextureKey.PARTICLE, getId(neswBlock))
                .put(TextureKey.DOWN, new Identifier(updownBlock))
                .put(TextureKey.UP, new Identifier(updownBlock))
                .put(TextureKey.NORTH, getId(neswBlock))
                .put(TextureKey.SOUTH, getId(neswBlock))
                .put(TextureKey.EAST, getId(neswBlock))
                .put(TextureKey.WEST, getId(neswBlock));
    }
}