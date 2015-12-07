package com.daedad.mhm;

import com.daedad.mhm.blocks.ModBlocks;
import com.daedad.mhm.crafting.ModCrafting;
import com.daedad.mhm.items.ModItems;
import com.daedad.mhm.world.mhmWorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e){
		
		ModItems.createItems();
		ModBlocks.createBlocks();
		
	}
	
	public void init(FMLInitializationEvent e){
		
		ModCrafting.initCrafting();
		GameRegistry.registerWorldGenerator(new mhmWorldGen(), 0);
		
	}
	
	public void postInit(FMLPostInitializationEvent e){
		
	}

}
