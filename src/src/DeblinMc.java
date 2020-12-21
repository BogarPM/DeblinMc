/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Bogar
 */
public class DeblinMc extends JavaPlugin{
    protected String[] files = {"dbCon.txt"};

    @Override
    public void onEnable() {
        this.getServer().broadcastMessage(ChatColor.GREEN + "Server enabled!");
        Bukkit.broadcastMessage(ChatColor.GREEN + "Server enabled!");
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Server enabled!");
        initFiles();
        initDb();
    }

    @Override
    public void onDisable() {
        super.onDisable(); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void initFiles(){
        //Default Configuration File
        if(this.getConfig()==null){
            this.getConfig().set("DbName", "");
            this.getConfig().set("pass", "");
        }else{
            if(!this.getConfig().contains("DbName") || !this.getConfig().contains("pass")){
                this.getConfig().set("DbName", "");
                this.getConfig().set("pass", "");
            }
        }
        this.saveConfig();
        //////////////////////////////////////////
    }
    
    private void initDb(){
        String user = this.getConfig().get("DbName").toString();
        String pass = this.getConfig().get("pass").toString();
        try {
            DataBase.init(user, pass);
            Debugger.log("&2Connection successfull!");
        } catch (SQLException ex) {
            Debugger.log("&4" + ex.getMessage() + "    " + ex.getLocalizedMessage());
        }
    }
}
