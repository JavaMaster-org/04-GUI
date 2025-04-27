package org.javamaster.gui;

import org.bukkit.plugin.java.JavaPlugin;

public final class GUI extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("menu").setExecutor(new MenuCommand());
        getServer().getPluginManager().registerEvents(new MenuClickListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
