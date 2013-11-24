package com.github.DiabolicaTrixPlugins.Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.DiabolicaTrixPlugins.Essentials;

public class EventJoin implements CommandExecutor {
	private Essentials plugin;

	public EventJoin(Essentials plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender,Command cmd,String label,String[] args) {

		String help = ChatColor.RED + "Error !";
		try
		{
			Player p = (Player) sender;
			p.teleport(new Location(Bukkit.getWorld("world"), -581, 4, -200));
			p.setGameMode(GameMode.ADVENTURE);
			sender.sendMessage(ChatColor.GREEN + "[" + ChatColor.RED + "Flood Escape" + ChatColor.GREEN + "] Welcome to Flood Escape !");
		}
		catch (Exception e)
		{
			sender.sendMessage(help);
		}
		return true;
	}
}
