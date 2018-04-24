package net.dark_roleplay.drpcore.common.handler;

import java.util.concurrent.Callable;

import net.dark_roleplay.drpcore.api.old.modules.crops.CropStorage;
import net.dark_roleplay.drpcore.api.old.modules.crops.ICropHandler;
import net.dark_roleplay.drpcore.api.old.modules.locks.ILockHandler;
import net.dark_roleplay.drpcore.api.old.modules.locks.LockStorage;
import net.dark_roleplay.drpcore.api.old.modules.time.DateStorage;
import net.dark_roleplay.drpcore.api.old.modules.time.IDateHandler;
import net.dark_roleplay.drpcore.testing.skills.SkillHandler;
import net.dark_roleplay.drpcore.testing.skills.SkillStorage;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class DRPCoreCapabilities {
	
	@CapabilityInject(ICropHandler.class)
	public static final Capability<ICropHandler> CROP_HANDLER = null;
	
	@CapabilityInject(IDateHandler.class)
	public static final Capability<IDateHandler> DATE_HANDLER = null;
	
	@CapabilityInject(ILockHandler.class)
	public static final Capability<ILockHandler> LOCK_HANDLER = null;
	
	/**
	 * TODO Move to Interface
	 */
	@CapabilityInject(SkillHandler.class)
	public static final Capability<SkillHandler> SKILL_HANDLER = null;
	
	public static void preInit(){
	}
	
	public static final void init(FMLInitializationEvent event) {
//		CapabilityManager.INSTANCE.register(IRecipeController.class, new RecipeControllerStorage(), (Callable<IRecipeController>)() -> {return new RecipeControllerDefault();});;
//		CapabilityManager.INSTANCE.register(ISkillController.class, new SkillControllerStorage(), (Callable<ISkillController>)() -> {return new ISkillController.Impl();});

		CapabilityManager.INSTANCE.register(ICropHandler.class, new CropStorage(), (Callable<ICropHandler>)() -> {return new ICropHandler.Impl();});
		CapabilityManager.INSTANCE.register(IDateHandler.class, new DateStorage(), (Callable<IDateHandler>)() -> {return new IDateHandler.Impl();});
		CapabilityManager.INSTANCE.register(ILockHandler.class, new LockStorage(), (Callable<ILockHandler>)() -> {return new ILockHandler.Impl();});
		CapabilityManager.INSTANCE.register(SkillHandler.class, new SkillStorage(), (Callable<SkillHandler>)() -> {return new SkillHandler();});

	}
}
