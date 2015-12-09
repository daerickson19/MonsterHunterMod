package com.daedad.mhm.blocks;

import com.daedad.mhm.items.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class ModBlockHuskberryCrop extends BlockCrops {
	
	public ModBlockHuskberryCrop(String unlocalizedName){
		super();
		this.setUnlocalizedName(unlocalizedName);
	}
	
	protected Item getSeed(){
		return ModItems.mhmHuskberry;
	}
	
	protected Item getCrop(){
		return ModItems.mhmHuskberry;
	}

}
