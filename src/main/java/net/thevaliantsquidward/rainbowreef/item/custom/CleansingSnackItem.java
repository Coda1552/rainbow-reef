package net.thevaliantsquidward.rainbowreef.item.custom;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CleansingSnackItem extends Item {
    public CleansingSnackItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack itemStack =  super.finishUsingItem(stack, level, entity);
        if(!level.isClientSide && entity instanceof ServerPlayer serverPlayer){
            Player player = entity instanceof Player ? (Player) entity : null;
            // Cleanse the player of all negative potion effects
            if (player != null) {
                for (MobEffectInstance effect : player.getActiveEffects()) {
                    if (effect.isAmbient() && effect.getEffect().isInstantenous()) {
                        // Skip ambient and instantaneous effects
                        continue;
                    }
                    if (effect.getEffect().isBeneficial()) {
                        // Skip beneficial effects
                        continue;
                    }
                    player.removeEffect(effect.getEffect());
                }
            }

        }
        return itemStack;
    }
}
