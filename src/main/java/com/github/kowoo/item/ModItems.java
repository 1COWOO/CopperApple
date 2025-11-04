package com.github.kowoo.item;
import com.github.kowoo.CopperAppleMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier; 
import eu.pb4.polymer.core.api.item.PolymerItem;
import eu.pb4.polymer.core.api.item.SimplePolymerItem;
public class ModItems {

    public static final Item COPPER_APPLE = registerItem(copper_apple, SimplePolymerItem::new, new Item.Settings().food(ModFoodComponent.COPPER_APPLE));
    public static void registerModItems() {
        entries.add(COPPER_APPLE);
    }
}