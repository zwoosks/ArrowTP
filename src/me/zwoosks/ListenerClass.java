package me.zwoosks;

import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ListenerClass implements Listener {
	
	public ListenerClass(MainClass plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	
	@EventHandler
	public void onEvent(ProjectileHitEvent e) {
		
		
		
		if(e.getEntity().getShooter() instanceof Player && e.getEntity() instanceof Arrow) {
			
			Player shooter = (Player) e.getEntity().getShooter();
			Entity arrow = e.getEntity();
			Location arrowLocation = arrow.getLocation();
			
			shooter.teleport(arrowLocation);
			
			
			
		}
		
	}

}
