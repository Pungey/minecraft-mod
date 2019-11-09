package com.gavin.rp4kmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumPickaxe extends ItemPickaxe {

	protected TitaniumPickaxe(ToolMaterial material) {
		super(material);
		this.setRegistryName(RP4Kmod.MODID, "titaniumPickaxe");
		this.setUnlocalizedName("titaniumPickaxe");
		GameRegistry.register(this);
		// TODO Auto-generated constructor stub
	}

}
