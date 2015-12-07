package com.daedad.mhm.blocks;

import com.daedad.mhm.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block mhmEarthCrystalBlock;
	
	public static Block mhmEarthCrystalOre;
	
	public static void createBlocks() {
		GameRegistry.registerBlock(mhmEarthCrystalBlock = new BasicBlock("mhm_earth_crystal_block", Material.rock, 3.0f, 30.0f, "pickaxe", 2), "mhm_earth_crystal_block");
		GameRegistry.registerBlock(mhmEarthCrystalOre = new ModBlockOre("mhm_earth_crystal_ore", Material.rock, ModItems.mhmEarthCrystal, 1, 1, 2), "mhm_earth_crystal_ore");
	}

}