package fr.bentur_and_bertatruck.bandb_mod.nature.construction;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ConstructionTreesApple extends WorldGenerator {
	private Block leaves;
	private Block wood;

	public ConstructionTreesApple(boolean gen, Block leaves, Block wood) {
		super(gen);
		this.leaves = leaves;
		this.wood = wood;

	}

	public boolean generate(World world, Random rand, int x, int y, int z) {
		if (world.isAirBlock(x, y + 1, z) && world.isAirBlock(x, y + 2, z)
				&& world.isAirBlock(x, y + 3, z)
				&& world.isAirBlock(x, y + 4, z)
				&& world.isAirBlock(x, y + 5, z)

				&& world.isAirBlock(x + 1, y + 2, z)
				&& world.isAirBlock(x - 1, y + 2, z)
				&& world.isAirBlock(x, y + 2, z + 1)
				&& world.isAirBlock(x, y + 2, z - 1)

				&& world.isAirBlock(x + 1, y + 3, z)
				&& world.isAirBlock(x - 1, y + 3, z)
				&& world.isAirBlock(x, y + 3, z + 1)
				&& world.isAirBlock(x, y + 3, z - 1)

				&& world.isAirBlock(x + 1, y + 4, z)
				&& world.isAirBlock(x - 1, y + 4, z)
				&& world.isAirBlock(x, y + 4, z + 1)
				&& world.isAirBlock(x, y + 4, z - 1)

				&& world.isAirBlock(x + 1, y + 5, z)
				&& world.isAirBlock(x - 1, y + 5, z)
				&& world.isAirBlock(x, y + 5, z + 1)
				&& world.isAirBlock(x, y + 5, z - 1)

				&& world.isAirBlock(x + 1, y + 2, z + 1)
				&& world.isAirBlock(x - 1, y + 2, z + 1)
				&& world.isAirBlock(x - 1, y + 2, z - 1)
				&& world.isAirBlock(x + 1, y + 2, z - 1)

				&& world.isAirBlock(x + 1, y + 1, z + 1)
				&& world.isAirBlock(x - 1, y + 1, z + 1)
				&& world.isAirBlock(x - 1, y + 1, z - 1)
				&& world.isAirBlock(x + 1, y + 1, z - 1)

		) {
			for (int i = 0; i < 5; i++) {
				this.changeBlock(world, x, y + i, z, wood);
			}
			// y == 3
			for (int i = 0; i < 3; i++) {

				this.changeBlock(world, x + i - 1, y + 2, z - 2, leaves);
			}

			for (int i = 0; i < 5; i++) {
				this.changeBlock(world, x + i - 2, y + 2, z - 1, leaves);
			}

			for (int i = 0; i < 5; i++) {
				this.changeBlock(world, x + i - 2, y + 2, z + 1, leaves);
			}

			for (int i = 0; i < 3; i++) {
				this.changeBlock(world, x + i - 1, y + 2, z + 2, leaves);
			}
			this.changeBlock(world, x + 2, y + 2, z, leaves);
			this.changeBlock(world, x - 2, y + 2, z, leaves);
			this.changeBlock(world, x + 1, y + 2, z, leaves);
			this.changeBlock(world, x - 1, y + 2, z, leaves);

			// y == 4

			for (int i = 0; i < 5; i++) {
				this.changeBlock(world, x + i - 2, y + 3, z - 2, leaves);
			}

			for (int i = 0; i < 5; i++) {
				this.changeBlock(world, x + i - 2, y + 3, z - 1, leaves);
			}

			for (int i = 0; i < 5; i++) {
				this.changeBlock(world, x + i - 2, y + 3, z + 1, leaves);
			}

			for (int i = 0; i < 5; i++) {
				this.changeBlock(world, x + i - 2, y + 3, z + 2, leaves);
			}

			this.changeBlock(world, x + 2, y + 3, z, leaves);
			this.changeBlock(world, x - 2, y + 3, z, leaves);
			this.changeBlock(world, x + 1, y + 3, z, leaves);
			this.changeBlock(world, x - 1, y + 3, z, leaves);

			// y == 5
			for (int i = 0; i < 3; i++) {
				this.changeBlock(world, x + i - 1, y + 4, z - 1, leaves);
			}

			for (int i = 0; i < 3; i++) {
				this.changeBlock(world, x + i - 1, y + 4, z + 1, leaves);
			}

			this.changeBlock(world, x + 1, y + 4, z, leaves);
			this.changeBlock(world, x - 1, y + 4, z, leaves);

			// y == 6
			this.changeBlock(world, x + 1, y + 5, z, leaves);
			this.changeBlock(world, x, y + 5, z + 1, leaves);
			this.changeBlock(world, x, y + 5, z, leaves);
			this.changeBlock(world, x, y + 5, z - 1, leaves);
			this.changeBlock(world, x - 1, y + 5, z, leaves);

			return true;
		}
		return false;

	}

	public void changeBlock(World world, int x, int y, int z, Block block) {

		if (world.isAirBlock(x, y, z) || block.isLeaves(world, x, y, z)) {

			world.setBlock(x, y, z, block);

		}
	}
}
