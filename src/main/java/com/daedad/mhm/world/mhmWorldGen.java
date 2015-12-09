package com.daedad.mhm.world;

import java.util.Random;

import com.daedad.mhm.blocks.ModBlocks;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class mhmWorldGen implements IWorldGenerator{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0: //Overworld
			this.runGenerator(this.gen_earth_crystal_ore, world, random, chunkX, chunkZ, 10, 0, 48);
			this.runGenerator(this.gen_huskberry_crop, world, random, chunkX, chunkZ, 1, 0, 256);
			break;
		case -1: //Nether
			break;
		case 1: //End
			break;
		}
	}
	
	private WorldGenerator gen_earth_crystal_ore; //Generates Earth Crystal Ore in the Overworld
	private WorldGenerator gen_huskberry_crop; //Generates huskberry plants in the overworld?
	
	public mhmWorldGen() {
		this.gen_earth_crystal_ore = new WorldGenMinable(ModBlocks.mhmEarthCrystalOre.getDefaultState(), 8);
		this.gen_huskberry_crop = new WorldGenPlant(ModBlocks.mhmHuskberryCrop, 64);
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}

}
