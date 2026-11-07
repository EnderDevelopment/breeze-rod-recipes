package com.enderdevelopment.plugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        NamespacedKey recipeKey = new NamespacedKey(this, "breeze_rods_from_lapis");
        ItemStack result = new ItemStack(Material.BREEZE_ROD, 4);
        ShapedRecipe recipe = new ShapedRecipe(recipeKey, result);
        recipe.shape("LLL", "LLL", "LLL");
        recipe.setIngredient('L', Material.LAPIS_LAZULI);
        Bukkit.addRecipe(recipe);
    }

    @Override
    public void onDisable() {
    }
}
