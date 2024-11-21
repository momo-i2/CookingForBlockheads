package net.blay09.mods.cookingforblockheads.registry.recipe;

import net.blay09.mods.cookingforblockheads.registry.FoodRecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;

public class SmeltingFood extends FoodRecipe {

    public SmeltingFood(Recipe<?> recipe, ItemStack outputItem) {
        this.outputItem = outputItem;

        fillCraftMatrix(recipe);
    }

    @Override
    public FoodRecipeType getType() {
        return FoodRecipeType.SMELTING;
    }

}