package com.jcirmodelsquad.tcjcir.extras;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;
import train.client.gui.GuiMTCInfo;

public class KeyHandler {
    public static KeyBinding openGeometryCarGUI;
    public static KeyBinding hideGeometryCarHUD;

    public KeyHandler() {
        openGeometryCarGUI = new KeyBinding("Show Geometry Car GUI", Keyboard.KEY_NUMPAD1,"JCIR-Traincraft");
        ClientRegistry.registerKeyBinding(openGeometryCarGUI);
        hideGeometryCarHUD = new KeyBinding("Hide Geometry Car HUD", Keyboard.KEY_NUMPAD2, "JCIR-Traincraft");
        ClientRegistry.registerKeyBinding(hideGeometryCarHUD);
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (!Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()) {
            if (openGeometryCarGUI.getIsKeyPressed()) {
                Minecraft.getMinecraft().displayGuiScreen(new GuiGeometryCar(Minecraft.getMinecraft().thePlayer));
            }
        }
    }
}
