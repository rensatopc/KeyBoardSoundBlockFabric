package io.rensatopc.github.registers;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class ModKeyBinds {
    public static KeyBinding noteBlockWithKeyBoardKeyBinding = new KeyBinding("key.keyboard-noteblock.keybinding", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_R, "category.keyboard-noteblock.main");

    public static void register() {
        KeyBindingHelper.registerKeyBinding(noteBlockWithKeyBoardKeyBinding);
    }
}
