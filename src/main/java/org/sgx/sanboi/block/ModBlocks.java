package org.sgx.sanboi.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
//import org.sgx.sanboi.block.custom.HopCropBlock;
import org.sgx.sanboi.item.ModItemGroups;
import org.sgx.sanboi.item.ModItems;
import org.sgx.sanboi.item.custom.sanboiEffBlock;
import org.sgx.sanboi.sanboi;


public class ModBlocks {
    public static final Block NEW_BLOCK = registerBlock(
            "new_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2.0f)),
            ModItemGroups.NEW_GROUP
    );
    public static final Block DOUBLE_BLOCK = registerBlock(
            "double_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(3.0f)),
            ModItemGroups.NEW_GROUP
    );
    public static final Block PLITA_BLOCK = registerBlock(
            "plita_block",
            new sanboiEffBlock(FabricBlockSettings.of(Material.AMETHYST).strength(2.0f).requiresTool().luminance(9)),
            ModItemGroups.NEW_GROUP
    );
  /*  public static final Block HOP_CROP = registerBlockNoItem(
            "hop_crop",
            new HopCropBlock(FabricBlockSettings.copy(Blocks.WHEAT))
    ); */



    private static Block registerBlock(String id, Block block, ItemGroup itemGroup) {
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()), itemGroup);

        return Registry.register(Registries.BLOCK, new Identifier(sanboi.MOD_ID, id), block);
    }

    private static Block registerBlock(String id, Block block) {
        ModItems.registerItem(id, new BlockItem(block, new FabricItemSettings()));

        return Registry.register(Registries.BLOCK, new Identifier(sanboi.MOD_ID, id), block);
    }
    private static Block registerBlockNoItem(String id, Block block, ItemGroup itemGroup) {
        return Registry.register(Registries.BLOCK, new Identifier(sanboi.MOD_ID, id), block);
    }

    public static void register(){
        sanboi.LOGGER.debug("Registering blocks for: " + sanboi.MOD_ID);

    }
}
