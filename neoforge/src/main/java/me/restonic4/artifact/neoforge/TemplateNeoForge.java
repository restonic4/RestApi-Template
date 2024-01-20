package me.restonic4.artifact.neoforge;

import me.restonic4.artifact.Template;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Template.MOD_ID)
public class TemplateNeoForge {
	public TemplateNeoForge(IEventBus modEventBus) {
		Template.init();
	}
}
