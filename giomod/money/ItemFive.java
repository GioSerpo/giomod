package giomod.money;

import giomod.GioMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemFive extends Item
{
	public ItemFive(int par1)
	{
		super(par1);
		setCreativeTab(GioMod.MoneyTab);
	}
	public void registerIcons(IconRegister Par1)
	{
		itemIcon = Par1.registerIcon("giomod:" + (this.getUnlocalizedName().substring(5)));
	}
}