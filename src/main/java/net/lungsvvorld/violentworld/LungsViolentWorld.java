package net.lungsvvorld.violentworld;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LungsViolentWorld implements ModInitializer {

	public static final String MOD_ID = "violent_world";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Violent Worlds Await You!");
	}
}