package io.ncbpfluffybear.fluffymachines.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AutoArmorForge extends AutoCrafter {

    public AutoArmorForge(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&7自动盔甲锻造台", Material.ANVIL, "&7盔甲锻造台", RecipeType.ARMOR_FORGE);
    }
}
