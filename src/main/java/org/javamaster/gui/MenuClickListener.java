package org.javamaster.gui;

import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

class MenuClickListener implements Listener {

    @EventHandler
    void handleMenuClick(InventoryClickEvent event) {
        if (event.getInventory().getHolder() instanceof MenuInventoryHolder) {
            event.getWhoClicked().sendMessage(Component.text("You clicked me!"));
            event.setCancelled(true);

            event.getWhoClicked().sendMessage(Component.text(event.getSlot()));
        }
    }
}
