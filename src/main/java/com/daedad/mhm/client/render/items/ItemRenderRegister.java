package com.daedad.mhm.client.render.items;

import com.daedad.mhm.Main;
import com.daedad.mhm.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

	public static void registerItemRenderer() {
		
		//Mining Items
		reg(ModItems.mhmEarthCrystal);
		
		//MonsterDrops
		reg(ModItems.mhmBirdWyvernFang);
		reg(ModItems.mhmJaggiHide);
		reg(ModItems.mhmJaggiScale);
		reg(ModItems.mhmKelbiHorn);
		reg(ModItems.mhmWarmPelt);
		reg(ModItems.mhmMonsterBoneS);
		reg(ModItems.mhmMysteryBone);
		
		//Plants
		reg(ModItems.mhmHuskberry);
	
	}
	
	public static String modid = Main.MODID;
	
	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
