package com.daedad.mhm.client.render.blocks;

import com.daedad.mhm.Main;
import com.daedad.mhm.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {
	
	public static void registerBlockRenderer() {
		reg(ModBlocks.mhmEarthCrystalBlock);
		reg(ModBlocks.mhmEarthCrystalOre);
	}
	
	public static String modid = Main.MODID;
	
	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),  0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}

}
