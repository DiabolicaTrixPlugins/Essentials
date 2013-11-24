package com.github.DiabolicaTrixPlugins;




import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.DiabolicaTrixPlugins.Events.EventJoin;


public class Essentials extends JavaPlugin{
	
	public Logger log;
	public EventJoin join;
	
	public void onEnable() 
	{
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		this.join = new EventJoin(this);
		getCommand("join").setExecutor(join);
		System.out.println("Start !"); 
		
	}
	
	public void onDisable() 
	{
		System.out.println("Stop !"); 
	}
}
