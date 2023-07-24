package org.sgx.sanboi.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.sgx.sanboi.sanboi;

public class ModItemGroups {
    public static final ItemGroup NEW_GROUP = FabricItemGroup.builder(new Identifier(sanboi.MOD_ID, "new_group")).icon(() -> new ItemStack(ModItems.NEW_ITEM)).build();
}
