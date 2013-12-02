package com.github.DiabolicaTrixPlugins.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.DiabolicaTrixPlugins.Essentials;

public class CommandJoin implements CommandExecutor {
	private Essentials plugin;
	public CommandJoin(Essentials plugin) {
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		String help = ChatColor.RED + "Usage: /join <game>";
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("join")){
			if(args.length != 1){
				p.sendMessage("Insuffcient arguments!");
				return true;
			}
			int j = 0;
			try{
				j = Integer.parseInt(args[0]);
			}catch(NumberFormatException e){
				p.sendMessage("Invalid arena ID");
			}
			GameManager.getManager().addPlayer(p, j);

			return true;
		}
		if(cmd.getName().equalsIgnoreCase("leave")){
			GameManager.getManager().removePlayer(p);
			p.sendMessage("You have left the arena!");

			return true;
		}
	}
}
