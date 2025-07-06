package com.example.mymod;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static void register() {
        Identifier id    = Identifier.of(MyMod.MOD_ID, "example_item");
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        Item.Settings settings = new Item.Settings()
                .useItemPrefixedTranslationKey()
                .registryKey(key);

        Item exampleItem = new Item(settings);
        Registry.register(Registries.ITEM, key, exampleItem);
    }
}