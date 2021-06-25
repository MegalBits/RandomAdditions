package net.mcreator.randomadditions.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.randomadditions.item.VillagerNoseItem;
import net.mcreator.randomadditions.RandomAdditionsMod;

import java.util.Map;

public class VillagerNoseBulletHitsBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure VillagerNoseBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure VillagerNoseBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure VillagerNoseBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RandomAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure VillagerNoseBulletHitsBlock!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(VillagerNoseItem.block, (int) (1)));
			entityToSpawn.setPickupDelay((int) 20);
			world.addEntity(entityToSpawn);
		}
	}
}
