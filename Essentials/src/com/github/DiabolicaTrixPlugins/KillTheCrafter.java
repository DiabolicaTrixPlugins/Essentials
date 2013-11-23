package com.github.DiabolicaTrixPlugins;




import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;


public class KillTheCrafter extends JavaPlugin{
	
	public Logger log;
	
	public void onEnable() 
	{
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		System.out.println("Start !"); 
		
	}
	
	public void onDisable() 
	{
		System.out.println("Stop !"); 
	}
}
