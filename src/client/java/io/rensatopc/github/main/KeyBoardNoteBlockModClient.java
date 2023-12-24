package io.rensatopc.github.main;

import io.rensatopc.github.registers.ModKeyBinds;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Drawable;
import net.minecraft.text.Text;
import org.joml.Matrix4f;

import java.awt.*;
import java.nio.FloatBuffer;

public class KeyBoardNoteBlockModClient implements ClientModInitializer {
    public static MinecraftClient client = MinecraftClient.getInstance();

    @Override
    public void onInitializeClient() {
        ModKeyBinds.register();
    }
}
