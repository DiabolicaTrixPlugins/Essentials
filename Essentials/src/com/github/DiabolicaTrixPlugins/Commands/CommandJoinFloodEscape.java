package com.github.DiabolicaTrixPlugins.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.DiabolicaTrixPlugins.Essentials;


public class CommandJoinFloodEscape implements CommandExecutor {
	private Essentials plugin;

	public CommandJoinFloodEscape(Essentials plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		String help = ChatColor.RED + "Usage: /join floodescape";
		try
		{
			if (args[0].equalsIgnoreCase("floodescape")) {
				Player p = (Player) sender;
				p.teleport(new Location(Bukkit.getWorld("world"), -580, 4, -199));
				p.setGameMode(GameMode.ADVENTURE);
				sender.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "Flood Escape" + ChatColor.GRAY + "]: " + ChatColor.GOLD + "Welcome to Flood Escape !");
			}
		}
		catch (Exception e)
		{
			sender.sendMessage(help);
		}
		return true;
	}

}