
package net.mcreator.randomadditions.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.randomadditions.item.MelonJuiceItem;
import net.mcreator.randomadditions.RandomAdditionsModElements;

@RandomAdditionsModElements.ModElement.Tag
public class MiscItemGroup extends RandomAdditionsModElements.ModElement {
	public MiscItemGroup(RandomAdditionsModElements instance) {
		super(instance, 53);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmisc") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MelonJuiceItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
