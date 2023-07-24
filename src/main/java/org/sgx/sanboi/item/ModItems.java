package org.sgx.sanboi.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.sgx.sanboi.block.ModBlocks;
import org.sgx.sanboi.item.material.armor.NewArmorMaterial;
import org.sgx.sanboi.sanboi;



public class ModItems {
    public static final Item NEW_ITEM = registerItem("new_item", new Item(new FabricItemSettings()), ModItemGroups.NEW_GROUP);
    public static final Item SANBOI_FRAGMENT = registerItem("sanboi_fragment", new Item(new FabricItemSettings()), ModItemGroups.NEW_GROUP);
    public static final Item SANBOI_HELMET = registerItem("sanboi_helmet", new ArmorItem(new NewArmorMaterial(), EquipmentSlot.HEAD, new FabricItemSettings()), ModItemGroups.NEW_GROUP);
    public static final Item SANBOI_CHESTPLATE = registerItem("sanboi_chestplate", new ArmorItem(new NewArmorMaterial(), EquipmentSlot.CHEST, new FabricItemSettings()), ModItemGroups.NEW_GROUP);
    public static final Item SANBOI_LEGGINGS = registerItem("sanboi_leggings", new ArmorItem(new NewArmorMaterial(), EquipmentSlot.LEGS, new FabricItemSettings()), ModItemGroups.NEW_GROUP);
    public static final Item SANBOI_BOOTS = registerItem("sanboi_boots", new ArmorItem(new NewArmorMaterial(), EquipmentSlot.FEET, new FabricItemSettings()), ModItemGroups.NEW_GROUP);
    // public static final Item HOP_SEEDS = registerItem("hop_seeds", new AliasedBlockItem(ModBlocks.HOP_CROP, new FabricItemSettings()), ModItemGroups.NEW_GROUP);
    public static final Item BEER = registerItem("beer", new Item( new FabricItemSettings()), ModItemGroups.NEW_GROUP);



    public static Item registerItem(String id, Item item) { return Registry.register(Registries.ITEM, new Identifier(sanboi.MOD_ID, id),item); }
    public static Item registerItem(String id, Item item, ItemGroup itemGroup) {
       Item returnItem = Registry.register(Registries.ITEM, new Identifier(sanboi.MOD_ID, id), item);
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(returnItem));


        return returnItem;
    }
    public static void register(){ sanboi.LOGGER.debug("Registering items for: " + sanboi.MOD_ID); }

}
