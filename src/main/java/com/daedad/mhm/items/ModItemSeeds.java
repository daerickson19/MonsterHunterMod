package com.daedad.mhm.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class ModItemSeeds extends ItemSeeds {

	public ModItemSeeds(String unlocalizedName, Block crops, Block soil) {
		super(crops, soil);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(unlocalizedName);
	}	
}
