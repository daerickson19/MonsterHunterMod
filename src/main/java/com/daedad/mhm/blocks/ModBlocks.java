package com.daedad.mhm.blocks;

import com.daedad.mhm.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	//User created blocks
	public static Block mhmEarthCrystalBlock;
	public static Block mhmMysteryBoneBlock;
	
	//Minable Items
	public static Block mhmEarthCrystalOre;
	
	//Plants
	public static Block mhmHuskberryCrop;
	
	public static void createBlocks() {
		
		//User Created blocks
		GameRegistry.registerBlock(mhmEarthCrystalBlock = new BasicBlock("mhm_earth_crystal_block", Material.rock, 3.0f, 30.0f, "pickaxe", 2), "mhm_earth_crystal_block");
		GameRegistry.registerBlock(mhmMysteryBoneBlock = new BasicBlock("mhm_mystery_bone_block", Material.wood, 2.0f, 10.0f, "axe", 0), "mhm_mystery_bone_block");
		
		//Minable Items
		GameRegistry.registerBlock(mhmEarthCrystalOre = new ModBlockOre("mhm_earth_crystal_ore", Material.rock, ModItems.mhmEarthCrystal, 1, 1, 2), "mhm_earth_crystal_ore");
		
		//Plants
		GameRegistry.registerBlock(mhmHuskberryCrop = new ModBlockHuskberryCrop("mhm_huskberry_crop"), "mhm_huskberry_crop");

	}

}