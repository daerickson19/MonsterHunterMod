package com.daedad.mhm.crafting;

import com.daedad.mhm.blocks.ModBlocks;
import com.daedad.mhm.items.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	
	public static void initCrafting() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.mhmEarthCrystalBlock), "aaa", "aaa", "aaa", 'a', ModItems.mhmEarthCrystal);
	}

}
