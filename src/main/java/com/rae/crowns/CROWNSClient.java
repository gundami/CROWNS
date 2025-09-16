package com.rae.crowns;


import com.rae.crowns.init.client.ParticleTypeInit;

import com.rae.crowns.init.client.PonderInit;
import net.minecraftforge.eventbus.api.IEventBus;

public class CROWNSClient {
    public static void clientRegister(IEventBus eventBus) {
        //PonderIndex.addPlugin(new CROWNSPonderPlugin());
        PonderInit.register();
        eventBus.addListener(ParticleTypeInit::registerFactories);
    }
}
