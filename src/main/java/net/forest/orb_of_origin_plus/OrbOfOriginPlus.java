package net.forest.orb_of_origin_plus;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrbOfOriginPlus implements ModInitializer {
	public static final String Mod_ID = "orb_of_origin_plus";
    public static final Logger LOGGER = LoggerFactory.getLogger(Mod_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}