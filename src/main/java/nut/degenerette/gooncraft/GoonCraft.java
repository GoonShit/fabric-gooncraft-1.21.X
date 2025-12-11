package nut.degenerette.gooncraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//why does kaupenjoe not tell me how to make entities able to have sex with the player
//what a gatekeeper amirite
public class GoonCraft implements ModInitializer {
	public static final String MOD_ID = "gooncraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}