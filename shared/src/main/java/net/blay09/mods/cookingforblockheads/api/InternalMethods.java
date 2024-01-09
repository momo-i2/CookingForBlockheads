package net.blay09.mods.cookingforblockheads.api;

import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.Level;

public interface InternalMethods {

    void addOvenFuel(ItemStack fuelItem, int fuelTime);

    Kitchen createKitchen(Level level, BlockPos pos);

    Kitchen createKitchen(ItemStack itemStack);

    void addSortButton(ISortButton button);

    void setFoodStatsProvider(FoodStatsProvider foodStatsProvider);

    FoodStatsProvider getFoodStatsProvider();

    <C extends Container, T extends Recipe<C>> void registerKitchenRecipeHandler(Class<T> recipeClass, KitchenRecipeHandler<T> kitchenRecipeHandler);
}
