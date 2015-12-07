package com.daedad.mhm.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item mhmEarthCrystal;
	
	public static void createItems(){
		
		GameRegistry.registerItem(mhmEarthCrystal = new BasicItem("mhm_earth_crystal"), "mhm_earth_crystal");
		
	}

}
