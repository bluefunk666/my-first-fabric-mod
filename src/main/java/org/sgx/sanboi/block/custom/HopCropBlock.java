/* package org.sgx.sanboi.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import org.sgx.sanboi.item.ModItems;

public class HopCropBlock extends CropBlock {
    public static final IntProperty AGE = IntProperty.of("age", 0, 6);

    public HopCropBlock(Settings settings) {
        super(settings);
    }

   // @Override
    protected ItemConvertible getSeedItem() {
        return ModItems.HOP_SEEDS;
    }

    @Override
    public int getMaxAge() {
        return 6;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

   // @Override
   // protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
  //      builder.add(AGE);
  //  }

}
*/