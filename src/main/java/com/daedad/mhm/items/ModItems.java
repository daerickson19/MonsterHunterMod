package com.daedad.mhm.items;

import com.daedad.mhm.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Mining Items
	public static Item mhmEarthCrystal;
	
	//Monster Drops
	public static Item mhmBirdWyvernFang;
	public static Item mhmJaggiHide;
	public static Item mhmJaggiScale;
	public static Item mhmKelbiHorn;
	public static Item mhmWarmPelt;
	public static Item mhmMonsterBoneS;
	public static Item mhmMysteryBone;
	
	//Plants
	public static Item mhmHuskberry;
	
	public static void createItems(){
		
		//Mining Items
		GameRegistry.registerItem(mhmEarthCrystal = new BasicItem("mhm_earth_crystal"), "mhm_earth_crystal");
		
		//Monster Drops
		GameRegistry.registerItem(mhmBirdWyvernFang = new BasicItem("mhm_bird_wyvern_fang"), "mhm_bird_wyvern_fang");
		GameRegistry.registerItem(mhmJaggiHide = new BasicItem("mhm_jaggi_hide"), "mhm_jaggi_hide");
		GameRegistry.registerItem(mhmJaggiScale = new BasicItem("mhm_jaggi_scale"), "mhm_jaggi_scale");
		GameRegistry.registerItem(mhmKelbiHorn = new BasicItem("mhm_kelbi_horn"), "mhm_kelbi_horn");
		GameRegistry.registerItem(mhmWarmPelt = new BasicItem("mhm_warm_pelt"), "mhm_warm_pelt");
		GameRegistry.registerItem(mhmMonsterBoneS = new BasicItem("mhm_monster_bone_s"), "mhm_monster_bone_s");
		GameRegistry.registerItem(mhmMysteryBone = new BasicItem("mhm_mystery_bone"), "mhm_mystery_bone");
		
		//Plants
		GameRegistry.registerItem(mhmHuskberry = new ModItemSeeds("mhm_huskberry", ModBlocks.mhmHuskberryCrop, Blocks.farmland), "mhm_huskberry");
	}

}
