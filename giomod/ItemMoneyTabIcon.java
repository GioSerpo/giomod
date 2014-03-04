package giomod;


import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMoneyTabIcon extends Item
{
	public ItemMoneyTabIcon(int par1)
	{
		super(par1);
	}
	public void registerIcons(IconRegister Par1)
	{
		itemIcon = Par1.registerIcon("giomod:afflouhaumoneymod");
	}
}
