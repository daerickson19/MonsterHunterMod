package com.daedad.mhm.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenPlant extends WorldGenerator {
	
	// plantBlock is the name of the plant i.e. Modblocks.mhmHuskberryCrop
	private Block plantBlock;
	
	// the base rarity is 64
	private int rarity;
	
	public WorldGenPlant(Block plantBlock, int rarity){
		this.plantBlock = plantBlock;
		this.rarity = rarity;
	}
	
	public boolean generate(World worldIn, Random rand, BlockPos pos){
		
		for (int i = 0; i < rarity; ++i){
			BlockPos blockpos1 = pos.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));
			// This will put a fully grown plant on grass
			if (worldIn.isAirBlock(blockpos1) && worldIn.getBlockState(blockpos1.down()).getBlock() == Blocks.grass) //&& ModBlocks.mhmHuskberryCrop.canPlaceBlockAt(worldIn, blockpos1))
			{	
				worldIn.setBlockState(blockpos1, plantBlock.getDefaultState().withProperty(BlockCrops.AGE, Integer.valueOf(7)));
			}
				
		}
		
		return true;
	}

}
