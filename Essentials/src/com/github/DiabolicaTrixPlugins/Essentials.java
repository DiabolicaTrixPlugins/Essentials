package com.github.DiabolicaTrixPlugins;




import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.DiabolicaTrixPlugins.Commands.CommandExit;
import com.github.DiabolicaTrixPlugins.Commands.CommandJoin;
import com.github.DiabolicaTrixPlugins.Commands.CommandJoinFloodEscape;
import com.github.DiabolicaTrixPlugins.Players.Player2;


public class Essentials extends JavaPlugin{
	
	public Logger log;
	public CommandJoin join;
	public CommandJoinFloodEscape joinFE;
	public CommandExit exit;
	
	public void onEnable() 
	{
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		this.join = new CommandJoin(this);
		this.joinFE = new CommandJoinFloodEscape(this);
		this.exit = new CommandExit(this);
		getCommand("join").setExecutor(join);
		getCommand("join").setExecutor(joinFE);
		getCommand("exit").setExecutor(exit);
		System.out.println("Start !"); 
		
	}
	
	public void onDisable() 
	{
		System.out.println("Stop !"); 
	}
}
