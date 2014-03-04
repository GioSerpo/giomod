package giomod;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.IPlayerTracker;

public class TPlayerHandler implements IPlayerTracker {
	

	public void onPlayerLogin(EntityPlayer player) {
		NBTTagCompound tags = player.getEntityData();
		if (!tags.hasKey("AGMOD"))
		{
			tags.setTag("AGMOD", new NBTTagCompound());
		}
		TPlayerStats stats = new TPlayerStats();
		stats.money = tags.getCompoundTag("AGMOD").getBoolean("money");
	     if (!stats.money)
	        {
	            stats.money = true;
	            tags.getCompoundTag("AGMOD").setBoolean("money", true);
	            player = ((EntityPlayer)MinecraftServer.getServer().getConfigurationManager().playerEntityList.get(0));
	            player.inventory.addItemStackToInventory(new ItemStack(GioMod.Hundred, 3));
	            player.inventory.addItemStackToInventory(new ItemStack(GioMod.Fifty, 2));
	            player.inventory.addItemStackToInventory(new ItemStack(GioMod.Twenty, 4));
	            player.inventory.addItemStackToInventory(new ItemStack(GioMod.Ten, 1));
	            player.inventory.addItemStackToInventory(new ItemStack(GioMod.Five, 1));
	            player.inventory.addItemStackToInventory(new ItemStack(GioMod.Dollar, 4));
	            player.inventory.addItemStackToInventory(new ItemStack(GioMod.Quarter, 3));
	            player.inventory.addItemStackToInventory(new ItemStack(GioMod.Dime, 1));
	         	player.inventory.addItemStackToInventory(new ItemStack(GioMod.Nickel, 2));
	         	player.inventory.addItemStackToInventory(new ItemStack(GioMod.Penny, 5));
	        }
	            
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		
	}
}