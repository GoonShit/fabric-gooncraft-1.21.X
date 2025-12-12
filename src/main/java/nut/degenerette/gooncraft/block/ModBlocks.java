package nut.degenerette.gooncraft.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import nut.degenerette.gooncraft.GoonCraft;

public class ModBlocks {
    public static final Block SEXIUM_BLOCK = registerBlock("sexium_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
            .requiresTool().sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block){
        registerBlockitem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GoonCraft.MOD_ID, name), block);
    }

    private static void registerBlockitem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GoonCraft.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GoonCraft.LOGGER.info("registering blocks for " + GoonCraft.MOD_ID);
    }
}
