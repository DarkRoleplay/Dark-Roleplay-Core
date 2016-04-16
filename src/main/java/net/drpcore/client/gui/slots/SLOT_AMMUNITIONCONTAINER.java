package net.drpcore.client.gui.slots;

import net.drpcore.common.DarkRoleplayCore;
import net.drpcore.common.items.templates.AmmunitionBase;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SLOT_AMMUNITIONCONTAINER extends Slot{
	
	public SLOT_AMMUNITIONCONTAINER(IInventory inventory, int par2, int par3, int par4){
		super(inventory, par2, par3, par4);
		//this.setBackgroundLocation(new ResourceLocation(DarkRoleplayCore.MODID, "textures/items/empty_slot_ammunitioncontainer.png"));
	}
	
	@Override
	public boolean isItemValid(ItemStack itemstack){
		return itemstack.getItem() instanceof AmmunitionBase;
	}
	
	@SideOnly(Side.CLIENT)
	public String getSlotTexture() {

		return this.getBackgroundLocation().toString();
		
	}
}
