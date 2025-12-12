package nut.degenerette.gooncraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nut.degenerette.gooncraft.GoonCraft;
import nut.degenerette.gooncraft.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup GOONCRAFT_THINGS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GoonCraft.MOD_ID, "gooncraft_things"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SEXIUM))
                    .displayName(Text.translatable("itemgroup.gooncraft.gooncraft_things"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SEXIUM_BLOCK);
                        entries.add(ModItems.SEXIUM);
                    }).build());

    public static void registerItemGroups() {
        GoonCraft.LOGGER.info("Segregating items from " + GoonCraft.MOD_ID);
    }
}
