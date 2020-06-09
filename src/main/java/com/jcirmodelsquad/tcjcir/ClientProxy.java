package com.jcirmodelsquad.tcjcir;

import com.jcirmodelsquad.tcjcir.extras.HUDGeometryCar;
import com.jcirmodelsquad.tcjcir.extras.KeyHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import train.common.core.CommonProxy;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerEvents(FMLPreInitializationEvent event) {
        super.registerEvents(event);
        registerEvent(new HUDGeometryCar());
    }

    @Override
    public void registerKeyBindingHandler() {
        FMLCommonHandler.instance().bus().register(new KeyHandler());
    }
}
