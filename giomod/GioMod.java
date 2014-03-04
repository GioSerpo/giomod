package giomod;

import giomod.money.ItemDime;
import giomod.money.ItemNickel;
import giomod.money.ItemPenny;
import giomod.money.ItemQuarter;
import giomod.money.ItemDollar;
import giomod.money.ItemFifty;
import giomod.money.ItemFive;
import giomod.money.ItemHundred;
import giomod.money.ItemTen;
import giomod.money.ItemTwenty;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IPlayerTracker;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class GioMod {

	@Instance("giomod")
	public static GioMod instance;
	public static CreativeTabs MoneyTab;
	public static Item MoneyTabIcon;
	
	
	public static Item Dollar;
	public static Item Five;
	public static Item Ten;
	public static Item Twenty;
	public static Item Fifty;
	public static Item Hundred;
	
	public static Item Penny;
	public static Item Nickel;
	public static Item Dime;
	public static Item Quarter;
	public static TPlayerHandler playerTracker;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		playerTracker = new TPlayerHandler();
		GameRegistry.registerPlayerTracker(playerTracker);
	}

	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	
		MoneyTab = (new tabMoneyTab(CreativeTabs.getNextID(), "Money Mod"));
		MoneyTabIcon = (new ItemMoneyTabIcon(3000).setUnlocalizedName("afflouhaumoneymod"));
		
		Dollar = (new ItemDollar(1013).setUnlocalizedName("oneDollar"));
		Five = (new ItemFive(1014).setUnlocalizedName("fiveDollar"));
		Ten = (new ItemTen(1015).setUnlocalizedName("tenDollar"));
		Twenty = (new ItemTwenty(1016).setUnlocalizedName("twentyDollar"));
		Fifty = (new ItemFifty(1017).setUnlocalizedName("fiftyDollar"));
		Hundred = (new ItemHundred(1018).setUnlocalizedName("hundredDollar"));
		
		Penny = (new ItemPenny(1019).setUnlocalizedName("penny"));
		Nickel = (new ItemNickel(1020).setUnlocalizedName("nickel"));
		Dime = (new ItemDime(1021).setUnlocalizedName("dime"));
		Quarter = (new ItemQuarter(1022).setUnlocalizedName("quarter"));
	
		LanguageRegistry.addName(MoneyTabIcon, "Afflouhau Money Mod");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Money Mod", "en_US", "Money Mod");
		LanguageRegistry.addName(Dollar, "One Dollar Bill");
		LanguageRegistry.addName(Five, "Five Dollar Bill");
		LanguageRegistry.addName(Ten, "Ten Dollar Bill");
		LanguageRegistry.addName(Twenty, "Twenty Dollar Bill");
		LanguageRegistry.addName(Fifty, "Fifty Dollar Bill");
		LanguageRegistry.addName(Hundred, "Hundred Dollar Bill");
		
		LanguageRegistry.addName(Penny, "Penny");
		LanguageRegistry.addName(Nickel, "Nickel");
		LanguageRegistry.addName(Dime, "Dime");
		LanguageRegistry.addName(Quarter, "Quarter");
	
	}
	
	public GioMod ()
	{
		
	}
}