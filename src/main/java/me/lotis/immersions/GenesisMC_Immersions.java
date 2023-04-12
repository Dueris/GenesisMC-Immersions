package me.lotis.immersions;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GenesisMC_Immersions implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("genesismc-immersions");

    @Override
    public void onInitialize() {
        LOGGER.info("Starting GenesisMC Immersions");
    }
}
