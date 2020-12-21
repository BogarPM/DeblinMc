/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;

/**
 *
 * @author Bogar
 */
public class Debugger {
    public static void log(String msg){
        Bukkit.getConsoleSender().sendMessage(format(msg));
    }
    
    public static String format(String msg){
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
