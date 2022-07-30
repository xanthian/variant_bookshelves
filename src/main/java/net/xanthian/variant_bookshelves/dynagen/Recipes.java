package net.xanthian.variant_bookshelves.dynagen;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import static net.xanthian.variant_bookshelves.Init.*;

public class Recipes {

    // Vanilla
    public static JsonObject createBookshelfRecipeJson(String material, String[] mods) {
        Gson gson = new Gson();
        JsonArray modList = gson.toJsonTree(mods).getAsJsonArray();

        JsonObject json = new JsonObject();
        String modPrefix = "";

        if (modList.size() > 0) {
            modPrefix = mods[0] + ":";
            JsonArray loadConditions = new JsonArray();
            JsonObject loadCondition = new JsonObject();
            loadCondition.addProperty("condition", "fabric:all_mods_loaded");
            loadCondition.add("values", modList);
            loadConditions.add(loadCondition);
            json.add("fabric:load_conditions", loadConditions);
        }

        json.addProperty("type", "minecraft:crafting_shaped");

        JsonArray pattern = new JsonArray();
        pattern.add("PPP");
        pattern.add("BBB");
        pattern.add("PPP");
        json.add("pattern", pattern);

        JsonObject keyList = new JsonObject();
        JsonObject iKey = new JsonObject();
        iKey.addProperty("item",   modPrefix + material + "_planks");
        keyList.add("P", iKey);
        json.add("key", keyList);
        iKey = new JsonObject();
        iKey.addProperty("item",   "minecraft:book");
        keyList.add("B", iKey);
        json.add("key", keyList);

        JsonObject result = new JsonObject();
        result.addProperty("item", MOD_ID + ":block/" + material + "_bookshelf");
        json.add("result", result);
        return json;
    }
}