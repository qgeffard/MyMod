package com.example.mymod;

import net.fabricmc.api.ModInitializer;

public class MyMod implements ModInitializer {
    public static final String MOD_ID = "mymod";

    @Override
    public void onInitialize() {
        ModItems.register();
    }
}
