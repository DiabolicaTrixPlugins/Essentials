package com.github.DiabolicaTrixPlugins;




import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.DiabolicaTrixPlugins.Events.EventJoin;
import com.github.DiabolicaTrixPlugins.Events.EventJoinFloodEscape;


public class Essentials extends JavaPlugin{
	
	public Logger log;
	public EventJoin join;
	public EventJoinFloodEscape joinFE;
	
	public void onEnable() 
	{
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		this.join = new EventJoin(this);
		this.joinFE = new EventJoinFloodEscape(this);
		getCommand("join").setExecutor(join);
		getCommand("join").setExecutor(joinFE);
		System.out.println("Start !"); 
		
	}
	
	public void onDisable() 
	{
		System.out.println("Stop !"); 
	}
}
