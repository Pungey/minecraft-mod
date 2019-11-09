package com.gavin.rp4kmod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.common.util.EnumHelper;
@Mod(modid = RP4Kmod.MODID, version = RP4Kmod.VERSION)

public class RP4Kmod {




    public static final String MODID = "com.gavin.rp4kmod";
    public static final String VERSION = "1.0";
    public static Item titaniumPickaxe;
    public static ToolMaterial titaniumMaterial;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        titaniumMaterial=EnumHelper.addToolMaterial("Titanium", 3, 1561, 20f, 10f, 10);

    	titaniumPickaxe = new TitaniumPickaxe(titaniumMaterial);

    	if(event.getSide() == Side.CLIENT) {
    	ModelLoader.setCustomModelResourceLocation(titaniumPickaxe, 0,
    			new ModelResourceLocation(titaniumPickaxe.getRegistryName(), "inventory"));
    	 
       
    	}
    	 GameRegistry.addRecipe(new ItemStack(titaniumPickaxe, 1), new Object[] {
    			 "ttt", " s ", " s ", 
    			 Character.valueOf('t'), Blocks.DIRT,
    			 Character.valueOf('s'), Items.STICK
    	 });
        // some example code
    	
    	 
    }

}

