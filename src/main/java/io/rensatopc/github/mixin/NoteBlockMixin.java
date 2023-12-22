package io.rensatopc.github.mixin;

import io.rensatopc.github.util.INoteBlockPlayNote;
import io.rensatopc.github.util.ModLogger;
import net.minecraft.block.BlockState;
import net.minecraft.block.NoteBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NoteBlock.class)
public abstract class NoteBlockMixin implements INoteBlockPlayNote {
    @Override
    public void playNoteWithKeyboard() {

    }

    @Inject(method="onUse", at=@At("HEAD"))
    protected void myOnUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit, CallbackInfoReturnable<ActionResult> info) {
        player.sendMessage(Text.literal("fewf"), true);
        ModLogger.getLogger().info("uwu");
    }
}
