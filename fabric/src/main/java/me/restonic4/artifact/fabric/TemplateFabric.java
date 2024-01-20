package me.restonic4.artifact.fabric;

import me.restonic4.artifact.Template;
import net.fabricmc.api.ModInitializer;

public class TemplateFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Template.init();
    }
}