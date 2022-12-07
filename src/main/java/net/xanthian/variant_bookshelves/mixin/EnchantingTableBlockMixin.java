package net.xanthian.variant_bookshelves.mixin;

import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantingTableBlock.class)
public class EnchantingTableBlockMixin {
    @Inject(at = @At("HEAD"), method = "canAccessBookshelf", cancellable = true)
    private static void canAccessBookshelf(World world, BlockPos tablePos, BlockPos bookshelfOffset, CallbackInfoReturnable<Boolean> cir)
    {
        if (world.getBlockState(tablePos.add(bookshelfOffset)).isIn(TagKey.of(Registries.BLOCK.getKey(),
                new Identifier("variant_bookshelves", "bookshelves")))
                && world.isAir(tablePos.add(bookshelfOffset.getX() / 2, bookshelfOffset.getY(), bookshelfOffset.getZ() / 2)))
        {
            cir.setReturnValue(true);
        }
    }
}