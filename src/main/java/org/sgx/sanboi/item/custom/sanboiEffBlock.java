package org.sgx.sanboi.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class sanboiEffBlock extends Block {
    public sanboiEffBlock(Settings settings) {
        super(settings);
    }


    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        entity.setCustomName(Text.literal("sanboiPlita"));


        if(entity.isLiving()) {
            LivingEntity livingEntity = (LivingEntity) entity;
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 500, 2));
        }

    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100, 1));


        super.onBreak(world, pos, state, player);

        }
}
