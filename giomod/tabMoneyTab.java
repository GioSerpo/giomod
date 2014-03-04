package giomod;

import giomod.GioMod;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public final class tabMoneyTab extends CreativeTabs 
{

	public tabMoneyTab(int par1, String par2str)
	{
		super(par1, par2str);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return GioMod.MoneyTabIcon.itemID;
	}
	public String getTranslateTabLabel()
	{
		return "Afflouhau Mods";
	}
}
