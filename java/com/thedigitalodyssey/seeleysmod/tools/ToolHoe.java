package com.thedigitalodyssey.seeleysmod.tools;

import com.thedigitalodyssey.seeleysmod.Main;
import com.thedigitalodyssey.seeleysmod.init.ModItems;
import com.thedigitalodyssey.seeleysmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {

	public ToolHoe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.seeleys_tab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
