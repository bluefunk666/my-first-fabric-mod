package org.sgx.sanboi;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import org.sgx.sanboi.block.ModBlocks;

public class sanboiClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
    //    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HOP_CROP, RenderLayer.getCutout());
    }
}
