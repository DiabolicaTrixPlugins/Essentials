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
import com.github.DiabolicaTrixPlugins.Players.Player2;


public class CommandExit implements CommandExecutor {
	private Essentials plugin;
	
	Player2 player2 = new Player2(false);

	public CommandExit(Essentials plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		String help = ChatColor.RED + "Usage: /exit";
		try
		{
			if (player2.getInGame() == true) {
				Player p = (Player) sender;
				p.teleport(new Location(Bukkit.getWorld("world"), -580, 4, -199));
				p.setGameMode(GameMode.ADVENTURE);
				sender.sendMessage(ChatColor.GRAY + "You left the game");
				player2.setInGame(false);
			}
			else {
				sender.sendMessage(ChatColor.RED + "You are currently in a game");
			}
		}
		catch (Exception e)
		{
			sender.sendMessage(help);
		}
		return true;
	}
	
}

