package nut.degenerette.gooncraft.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nut.degenerette.gooncraft.GoonCraft;

public class ModItems {
    public static final Item SEXIUM = registerItem("sexium", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GoonCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        GoonCraft.LOGGER.info("Registering items for " + GoonCraft.MOD_ID);
    }
}
