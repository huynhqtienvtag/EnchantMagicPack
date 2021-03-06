package me.hsgamer.enchantmagicpack.enchants.active;

import com.sucy.enchant.api.Cooldowns;
import com.sucy.enchant.api.CustomEnchantment;
import com.sucy.enchant.api.Tasks;
import me.hsgamer.enchantmagicpack.EnchantMagicPack;
import me.hsgamer.enchantmagicpack.utils.Sound;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;

public class TimeFreezing extends CustomEnchantment {
    private static final String LENGTH = "length";
    private static final String TIME = "time";
    private static final String FREQUENCY = "frequency";
    private static Hashtable<Entity, Vector> vector = new Hashtable<>();
    private static Hashtable<UUID, BukkitTask> tasks = new Hashtable<>();

    public TimeFreezing() {
        super("Time-Freezing", "Make the nearby projectiles stop moving");

        setMaxLevel(5);
        setWeight(1.25);
        Cooldowns.configure(settings, 7, 2);
        settings.set(LENGTH, 2, 1.5);
        settings.set(TIME, 5, 2);
        settings.set(FREQUENCY, 10, -1);

        addNaturalItems(Material.STICK, Material.BLAZE_ROD);
    }

    public void applyInteractBlock(Player user, int level, PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (Cooldowns.onCooldown(this, user, settings, level)) return;
            Cooldowns.start(this, user);
            double length = settings.get(LENGTH, level);
            int time = (int) (settings.get(TIME, level) * 20);
            Location loc = user.getLocation();
            int frequency = (int) settings.get(FREQUENCY, level);
            List<Entity> entities = new ArrayList<>();
            tasks.put(user.getUniqueId(), Tasks.schedule(new BukkitRunnable() {

                @Override
                public void run() {
                    loc.getWorld().spawnParticle(Particle.CRIT_MAGIC, loc, (int) (length * 150), length, length, length, 0.01);
                    loc.getWorld().playSound(loc, Sound.NOTE_PLING.bukkitSound(), 10, 2);
                    for (Entity entity : loc.getNearbyEntities(length, length, length)) {
                        if (entity instanceof Projectile
                                || entity.getType().equals(EntityType.SMALL_FIREBALL) || entity.getType().equals(EntityType.FIREBALL) || entity.getType().equals(EntityType.DRAGON_FIREBALL)) {
                            if (vector.containsKey(entity)) continue;
                            entities.add(entity);
                            vector.put(entity, entity.getVelocity().multiply(entity.getVelocity().length()));
                            entity.setGravity(false);
                            entity.setVelocity(new Vector(0, 0, 0));
                        }
                    }
                }
            }, frequency, frequency));
            new BukkitRunnable() {

                @Override
                public void run() {
                    tasks.remove(user.getUniqueId()).cancel();
                    for (Entity entity : entities) {
                        entity.setGravity(true);
                        entity.setVelocity(vector.get(entity));
                        vector.remove(entity);
                    }
                }
            }.runTaskLater(EnchantMagicPack.getInstace(), time);
        }
    }
}
