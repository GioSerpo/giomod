package giomod.money;

import giomod.GioMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemDollar extends Item
{
	public ItemDollar(int par1)
	{
		super(par1);
		setCreativeTab(GioMod.MoneyTab);
	}
	public void registerIcons(IconRegister Par1)
	{
		itemIcon = Par1.registerIcon("giomod:" + (this.getUnlocalizedName().substring(5)));
	}
}