package whocraft.tardis_refined.common.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import whocraft.tardis_refined.TardisRefined;
import whocraft.tardis_refined.registry.BlockRegistry;

import java.util.function.Consumer;

public class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider {
    public RecipeProvider(DataGenerator arg) {
        super(arg);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(BlockRegistry.TERRAFORMER_BLOCK.get()).pattern("ISI").pattern("GEG").pattern("IRI").define('I', Items.IRON_INGOT).define('S', Items.DAYLIGHT_DETECTOR).define('G', Items.GLASS_PANE).define('E', Blocks.EMERALD_BLOCK.asItem()).define('R', Blocks.REDSTONE_BLOCK.asItem()).unlockedBy("has_crafting_table", has(Blocks.EMERALD_BLOCK)).save(consumer);
        ShapedRecipeBuilder.shaped(BlockRegistry.CONSOLE_CONFIGURATION_BLOCK.get()).pattern("IOI").pattern("IEI").pattern("IBI").define('I', Items.IRON_INGOT).define('O', Items.OBSERVER).define('E', Items.ENDER_EYE).define('B', Items.STONE_BUTTON).unlockedBy("has_crafting_table", has(Blocks.EMERALD_BLOCK)).save(consumer);
    }
}