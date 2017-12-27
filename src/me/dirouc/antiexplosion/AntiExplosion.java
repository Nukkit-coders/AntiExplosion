package me.dirouc.antiexplosion;

import cn.nukkit.Server;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityExplodeEvent;
import cn.nukkit.event.entity.ExplosionPrimeEvent;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;

public class AntiExplosion
        extends PluginBase
        implements Listener
{
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onExplosionPrime(ExplosionPrimeEvent event)
    {
        event.setCancelled(true);
    }

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event)
    {
        event.setCancelled(true);
    }
}
