package net.dark_roleplay.drpcore.common.objects.huds;

import java.util.Calendar;

import net.dark_roleplay.drpcore.common.DRPCoreReferences;
import net.dark_roleplay.drpcore.modules.hud.Hud;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class RealTimeClock extends Hud{
	
	public RealTimeClock(ResourceLocation registryName) {
		super(registryName);
	}

	private static Calendar instance = Calendar.getInstance();
	private static ResourceLocation clockTexture = new ResourceLocation(DRPCoreReferences.MODID, "textures/hud/clock.png");
	private static ResourceLocation hourTexture = new ResourceLocation(DRPCoreReferences.MODID, "textures/hud/hour.png");
	private static ResourceLocation minuteTexture = new ResourceLocation(DRPCoreReferences.MODID, "textures/hud/minute.png");
	
	public void render(int width, int height, float partialTicks){
		Minecraft.getMinecraft().renderEngine.bindTexture(clockTexture);
		int baseX = this.alignment.getBaseX(width, 32) + this.posX + 16;
		int baseY = this.alignment.getBaseY(height, 32) + this.posY + 16;
		this.drawTexturedCenteredRect(baseX, baseY, 0F, 0F, 1F, 1F, 16, 0D);

		//Angle
		float hourAngle = 30 * Calendar.getInstance().get(Calendar.HOUR_OF_DAY) - 90;
		float minuteAngle = 6 * Calendar.getInstance().get(Calendar.MINUTE) - 90;

		Minecraft.getMinecraft().renderEngine.bindTexture(minuteTexture);
		this.drawTexturedCenteredRect(baseX, baseY, 0F, 0F, 1F, 1F, 16, minuteAngle);
		Minecraft.getMinecraft().renderEngine.bindTexture(hourTexture);
		this.drawTexturedCenteredRect(baseX, baseY, 0F, 0F, 1F, 1F, 16, hourAngle);
	}

}
