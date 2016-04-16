package net.drpcore.common.entities.player.advancedInventoryCapabiliy;

import net.drpcore.common.gui.inventories.AdvancedPlayerInventory;
import net.minecraft.entity.player.EntityPlayer;

public interface  IPlayerInventoryAdvanced {
	/**
	 * @return the additional Inventory from the Player
	 */
	public void setInventory(AdvancedPlayerInventory playerInv);
	
	/**
	 * @return the additional Inventory from the Player
	 */
	public AdvancedPlayerInventory getInventory();

}
