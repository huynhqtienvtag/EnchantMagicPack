package me.hsgamer.enchantmagicpack.enchants.potion;

import org.bukkit.potion.PotionEffectType;

/**
 * Provides access for potion types
 */
public interface PotionEnchantment {

    /**
     * @return potion effect applied by this enchantment
     */
    PotionEffectType type();
}
