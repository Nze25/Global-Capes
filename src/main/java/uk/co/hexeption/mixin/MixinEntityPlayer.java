package uk.co.hexeption.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * Created by Hexeption on 16/03/2017.
 */
@Mixin(EntityPlayer.class)
public abstract class MixinEntityPlayer {

    @Shadow
    public abstract GameProfile getGameProfile();
}
