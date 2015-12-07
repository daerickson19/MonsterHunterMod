package com.daedad.mhm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block {
	
	public BasicBlock(String unlocalizedName, Material material, float hardness, float resistance, String toolToHarvest, int toolLevel){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setHarvestLevel(toolToHarvest, toolLevel);
	}
	
	public BasicBlock(String unlocalizedName, float hardness, float resistance){
		this(unlocalizedName, Material.rock, hardness, resistance, "pickaxe", 1);
	}
	
	public BasicBlock(String unlocalizedName){
		this(unlocalizedName, 2.0f, 10.0f);
	}

}
