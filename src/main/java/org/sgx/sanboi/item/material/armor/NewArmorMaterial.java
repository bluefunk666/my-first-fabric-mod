package org.sgx.sanboi.item.material.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import org.sgx.sanboi.item.ModItems;

public class NewArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {4, 7, 8, 3};




    @Override
    public int getDurability(EquipmentSlot slot) { return BASE_DURABILITY[slot.getEntitySlotId()]; }
    @Override
    public int getProtectionAmount(EquipmentSlot slot) { return PROTECTION_VALUES[slot.getEntitySlotId()]; }
    @Override
    public int getEnchantability() { return 4; }
    @Override
    public SoundEvent getEquipSound() { return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND; }
    @Override
    public Ingredient getRepairIngredient() { return Ingredient.ofItems(ModItems.NEW_ITEM); }
    @Override
    public String getName() { return "sanboi_armor"; }
    @Override
    public float getToughness() { return 7.0f; }
    @Override
    public float getKnockbackResistance() { return 0.4f; }
}
