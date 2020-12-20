/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Bogar
 */
public class DeblinMc extends JavaPlugin{
    protected String[] files = {"dbCon.txt"};

    @Override
    public void onEnable() {
        Bukkit.broadcastMessage("Server enabled!");
    }

    @Override
    public void onDisable() {
        super.onDisable(); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void initFiles(){
        
    }
}
