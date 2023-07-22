package net.xanthian.variantbookshelves.util;

import net.minecraft.block.Block;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;

public class ModTextureMap extends TextureMap {

    // Datagen for the Bookshelf models
    public static TextureMap endside(Block frontTopSideBlock, Block endBlock) {
        return (new ModTextureMap())
                .put(TextureKey.PARTICLE, getId(frontTopSideBlock))
                .put(TextureKey.DOWN, getId(endBlock))
                .put(TextureKey.UP, getId(endBlock))
                .put(TextureKey.NORTH, getId(frontTopSideBlock))
                .put(TextureKey.SOUTH, getId(frontTopSideBlock))
                .put(TextureKey.EAST, getId(frontTopSideBlock))
                .put(TextureKey.WEST, getId(frontTopSideBlock));
    }
}