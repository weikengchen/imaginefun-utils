package net.imaginefun;

import net.fabricmc.api.ClientModInitializer;
import net.imaginefun.servers.ServerListPopulator;

public class ImagineFunUtilsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
        ServerListPopulator.populate();
	}
}
