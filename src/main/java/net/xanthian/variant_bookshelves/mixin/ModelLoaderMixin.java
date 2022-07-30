package net.xanthian.variant_bookshelves.mixin;

import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(ModelLoader.class)
public class ModelLoaderMixin {

    @Inject(method = "loadModelFromJson",
            at = @At("HEAD"), cancellable = true)
        public void loadModelFromJson(Identifier id, CallbackInfoReturnable<JsonUnbakedModel> cir) {
            //First, we check if the current item model that is being registered is from our mod. If it isn't, we continue.
            if (!"example_mod".equals(id.getNamespace())) return;
            //Here, we can do different checks to see if the current item is a block-item, a tool, or other.
            //This can be done in a lot of different ways, like putting all our items in a Set or a List and checking if the current item is contained inside.
            //For this tutorial, we only have 1 item, so we will not be doing that, and we will be going with "generated" as default item type.
            String modelJson = ExampleMod.createItemModelJson(id, "generated");
            if ("".equals(modelJson)) return;
            //We check if the json string we get is valid before continuing.
            JsonUnbakedModel model = JsonUnbakedModel.deserialize(modelJson);
            model.id = id.toString();
            cir.setReturnValue(model);
        }
    }
}
