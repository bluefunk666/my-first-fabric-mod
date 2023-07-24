package org.sgx.sanboi;

import net.fabricmc.api.ModInitializer;
import org.sgx.sanboi.block.ModBlocks;
import org.sgx.sanboi.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class sanboi implements ModInitializer {
	public static final String MOD_ID ="sanboi";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModBlocks.register();
	}
}
