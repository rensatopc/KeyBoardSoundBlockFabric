package io.rensatopc.github.mixin;

import io.rensatopc.github.main.KeyBoardNoteBlockMod;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.logging.Logger;

@Mixin(MinecraftClient.class)
public abstract class ClientMixin {
    @Inject(method="run", at=@At("HEAD"))
    protected void myRun(CallbackInfo info) {
        KeyBoardNoteBlockMod.logger.debug("Hello Minecraft!");
    }
}
