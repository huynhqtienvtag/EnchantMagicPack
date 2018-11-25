package me.hsgamer.enchantmagicpack.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToolsUtils {
    public static List<XMaterial> PICKAXES_BLOCKS = new ArrayList<>(Arrays.asList(
            XMaterial.DIAMOND_BLOCK,
            XMaterial.GOLD_BLOCK,
            XMaterial.REDSTONE_BLOCK,
            XMaterial.EMERALD_BLOCK,
            XMaterial.COAL_BLOCK,
            XMaterial.IRON_BLOCK,
            XMaterial.LAPIS_BLOCK,
            XMaterial.DIAMOND_ORE,
            XMaterial.GOLD_ORE,
            XMaterial.REDSTONE_ORE,
            XMaterial.EMERALD_ORE,
            XMaterial.COAL_ORE,
            XMaterial.IRON_ORE,
            XMaterial.LAPIS_ORE,
            XMaterial.ICE,
            XMaterial.FROSTED_ICE,
            XMaterial.PACKED_ICE,
            XMaterial.ANVIL,
            XMaterial.BREWING_STAND,
            XMaterial.CAULDRON,
            XMaterial.IRON_BARS,
            XMaterial.IRON_DOOR,
            XMaterial.IRON_TRAPDOOR,
            XMaterial.HOPPER,
            XMaterial.LIGHT_WEIGHTED_PRESSURE_PLATE,
            XMaterial.HEAVY_WEIGHTED_PRESSURE_PLATE,
            XMaterial.STONE_PRESSURE_PLATE,
            XMaterial.BLACK_SHULKER_BOX,
            XMaterial.BLUE_SHULKER_BOX,
            XMaterial.BROWN_SHULKER_BOX,
            XMaterial.CYAN_SHULKER_BOX,
            XMaterial.GRAY_SHULKER_BOX,
            XMaterial.GREEN_SHULKER_BOX,
            XMaterial.LIGHT_BLUE_SHULKER_BOX,
            XMaterial.LIME_SHULKER_BOX,
            XMaterial.MAGENTA_SHULKER_BOX,
            XMaterial.ORANGE_SHULKER_BOX,
            XMaterial.LIGHT_GRAY_SHULKER_BOX,
            XMaterial.PINK_SHULKER_BOX,
            XMaterial.PURPLE_SHULKER_BOX,
            XMaterial.RED_SHULKER_BOX,
            XMaterial.WHITE_SHULKER_BOX,
            XMaterial.YELLOW_SHULKER_BOX,
            XMaterial.RAIL,
            XMaterial.ACTIVATOR_RAIL,
            XMaterial.DETECTOR_RAIL,
            XMaterial.POWERED_RAIL,
            XMaterial.QUARTZ_BLOCK,
            XMaterial.CLAY,
            XMaterial.NETHER_BRICK,
            XMaterial.RED_NETHER_BRICKS,
            XMaterial.SMOOTH_STONE,
            XMaterial.END_STONE_BRICKS,
            XMaterial.COBBLESTONE,
            XMaterial.COBBLESTONE_WALL,
            XMaterial.MOSSY_COBBLESTONE_WALL,
            XMaterial.BLACK_CONCRETE,
            XMaterial.BLUE_CONCRETE,
            XMaterial.BROWN_CONCRETE,
            XMaterial.CYAN_CONCRETE,
            XMaterial.GRAY_CONCRETE,
            XMaterial.GREEN_CONCRETE,
            XMaterial.LIGHT_BLUE_CONCRETE,
            XMaterial.LIGHT_GRAY_CONCRETE,
            XMaterial.LIME_CONCRETE,
            XMaterial.MAGENTA_CONCRETE,
            XMaterial.ORANGE_CONCRETE,
            XMaterial.PINK_CONCRETE,
            XMaterial.RED_CONCRETE,
            XMaterial.PURPLE_CONCRETE,
            XMaterial.WHITE_CONCRETE,
            XMaterial.YELLOW_CONCRETE,
            XMaterial.PRISMARINE,
            XMaterial.DISPENSER,
            XMaterial.DROPPER,
            XMaterial.ENCHANTING_TABLE,
            XMaterial.END_STONE,
            XMaterial.ENDER_CHEST,
            XMaterial.FURNACE,
            XMaterial.BLACK_GLAZED_TERRACOTTA,
            XMaterial.BLUE_GLAZED_TERRACOTTA,
            XMaterial.BROWN_GLAZED_TERRACOTTA,
            XMaterial.CYAN_GLAZED_TERRACOTTA,
            XMaterial.GRAY_GLAZED_TERRACOTTA,
            XMaterial.GREEN_GLAZED_TERRACOTTA,
            XMaterial.LIGHT_BLUE_GLAZED_TERRACOTTA,
            XMaterial.LIME_GLAZED_TERRACOTTA,
            XMaterial.MAGENTA_GLAZED_TERRACOTTA,
            XMaterial.ORANGE_GLAZED_TERRACOTTA,
            XMaterial.PINK_GLAZED_TERRACOTTA,
            XMaterial.PURPLE_GLAZED_TERRACOTTA,
            XMaterial.RED_GLAZED_TERRACOTTA,
            XMaterial.LIGHT_GRAY_GLAZED_TERRACOTTA,
            XMaterial.WHITE_GLAZED_TERRACOTTA,
            XMaterial.YELLOW_GLAZED_TERRACOTTA,
            XMaterial.SPAWNER,
            XMaterial.MOSSY_COBBLESTONE,
            XMaterial.NETHER_BRICK,
            XMaterial.RED_NETHER_BRICKS,
            XMaterial.NETHER_BRICK_STAIRS,
            XMaterial.NETHER_QUARTZ_ORE,
            XMaterial.NETHERRACK,
            XMaterial.RED_SANDSTONE,
            XMaterial.STONE_SLAB,
            XMaterial.SANDSTONE,
            XMaterial.COBBLESTONE_SLAB,
            XMaterial.BRICK_SLAB,
            XMaterial.PURPUR_SLAB,
            XMaterial.LEGACY_DOUBLE_STEP,
            XMaterial.LEGACY_PURPUR_DOUBLE_SLAB,
            XMaterial.LEGACY_DOUBLE_STONE_SLAB2,
            XMaterial.NETHER_BRICK_STAIRS,
            XMaterial.BRICK_STAIRS,
            XMaterial.COBBLESTONE_STAIRS,
            XMaterial.PURPUR_STAIRS,
            XMaterial.QUARTZ_STAIRS,
            XMaterial.RED_SANDSTONE_STAIRS,
            XMaterial.SANDSTONE_STAIRS,
            XMaterial.LEGACY_SMOOTH_STAIRS,
            XMaterial.STONE,
            XMaterial.BRICK,
            XMaterial.STONE_BUTTON,
            XMaterial.OBSIDIAN,
            XMaterial.OBSERVER,
            XMaterial.CLAY_BLOCK,
            XMaterial.STAINED_CLAY
    ));

    public static List<XMaterial> AXES_BLOCKS = new ArrayList<>(Arrays.asList(
            XMaterial.COCOA,
            XMaterial.JACK_O_LANTERN,
            XMaterial.PUMPKIN,
            XMaterial.VINE,
            XMaterial.MELON,
            XMaterial.requestXMaterial("BANNER", (byte) 0),
            XMaterial.requestXMaterial("BANNER", (byte) 1),
            XMaterial.requestXMaterial("BANNER", (byte) 2),
            XMaterial.requestXMaterial("BANNER", (byte) 3),
            XMaterial.requestXMaterial("BANNER", (byte) 4),
            XMaterial.requestXMaterial("BANNER", (byte) 5),
            XMaterial.requestXMaterial("BANNER", (byte) 6),
            XMaterial.requestXMaterial("BANNER", (byte) 7),
            XMaterial.requestXMaterial("BANNER", (byte) 8),
            XMaterial.requestXMaterial("BANNER", (byte) 9),
            XMaterial.requestXMaterial("BANNER", (byte) 10),
            XMaterial.requestXMaterial("BANNER", (byte) 11),
            XMaterial.requestXMaterial("BANNER", (byte) 12),
            XMaterial.requestXMaterial("BANNER", (byte) 13),
            XMaterial.requestXMaterial("BANNER", (byte) 14),
            XMaterial.requestXMaterial("BANNER", (byte) 15),
            XMaterial.requestXMaterial("WALL_BANNER", (byte) 0),
            XMaterial.BOOKSHELF,
            XMaterial.CHEST,
            XMaterial.CRAFTING_TABLE,
            XMaterial.DAYLIGHT_DETECTOR,
            XMaterial.ACACIA_FENCE,
            XMaterial.BIRCH_FENCE,
            XMaterial.DARK_OAK_FENCE,
            XMaterial.JUNGLE_FENCE,
            XMaterial.OAK_FENCE,
            XMaterial.SPRUCE_FENCE,
            XMaterial.ACACIA_FENCE_GATE,
            XMaterial.BIRCH_FENCE_GATE,
            XMaterial.DARK_OAK_FENCE_GATE,
            XMaterial.JUNGLE_FENCE_GATE,
            XMaterial.OAK_FENCE_GATE,
            XMaterial.SPRUCE_FENCE_GATE,
            XMaterial.BROWN_MUSHROOM_BLOCK,
            XMaterial.RED_MUSHROOM_BLOCK,
            XMaterial.JUKEBOX,
            XMaterial.LADDER,
            XMaterial.NOTE_BLOCK,
            XMaterial.SIGN,
            XMaterial.WALL_SIGN,
            XMaterial.TRAPPED_CHEST,
            XMaterial.LEGACY_WOOD,
            XMaterial.LEGACY_WOOD_BUTTON,
            XMaterial.LEGACY_WOODEN_DOOR,
            XMaterial.LEGACY_LOG,
            XMaterial.LEGACY_LOG_2,
            XMaterial.WOOD_PLATE,
            XMaterial.LEGACY_WOOD_STEP,
            XMaterial.LEGACY_WOOD_DOUBLE_STEP,
            XMaterial.LEGACY_BIRCH_WOOD_STAIRS,
            XMaterial.ACACIA_STAIRS,
            XMaterial.DARK_OAK_STAIRS,
            XMaterial.LEGACY_JUNGLE_WOOD_STAIRS,
            XMaterial.LEGACY_SPRUCE_WOOD_STAIRS,
            XMaterial.LEGACY_WOOD_STAIRS,
            XMaterial.LEGACY_TRAP_DOOR
    ));

    public static List<XMaterial> SHOVELS_BLOCKS = new ArrayList<>(Arrays.asList(
            XMaterial.CLAY,
            XMaterial.DIRT,
            XMaterial.LEGACY_CONCRETE_POWDER,
            XMaterial.GRASS,
            XMaterial.GRAVEL,
            XMaterial.SAND,
            XMaterial.SOUL_SAND,
            XMaterial.SNOW,
            XMaterial.SNOW_BLOCK
    ));

    public static List<XMaterial> SWORDS_BLOCKS = new ArrayList<>(Arrays.asList(
            XMaterial.COBWEB
    ));

}
