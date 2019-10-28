package me.zwoosks;

import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {

	@Override
	public void onEnable() {
		new ListenerClass(this);
	}
	
	
	@Override
	public void onDisable() {
		
	}
	
	
	
}
