package io.ncbpfluffybear.fluffymachines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.ncbpfluffybear.fluffymachines.items.Barrel;
import io.ncbpfluffybear.fluffymachines.items.EnderChestExtractionNode;
import io.ncbpfluffybear.fluffymachines.items.EnderChestInsertionNode;
import io.ncbpfluffybear.fluffymachines.items.FireproofRune;
import io.ncbpfluffybear.fluffymachines.items.HelicopterHat;
import io.ncbpfluffybear.fluffymachines.items.tools.ACBUpgradeCard;
import io.ncbpfluffybear.fluffymachines.items.tools.CargoManipulator;
import io.ncbpfluffybear.fluffymachines.items.tools.Dolly;
import io.ncbpfluffybear.fluffymachines.items.tools.FluffyWrench;
import io.ncbpfluffybear.fluffymachines.items.tools.Paxel;
import io.ncbpfluffybear.fluffymachines.items.tools.PortableCharger;
import io.ncbpfluffybear.fluffymachines.items.tools.Scythe;
import io.ncbpfluffybear.fluffymachines.items.tools.UpgradedExplosivePickaxe;
import io.ncbpfluffybear.fluffymachines.items.tools.UpgradedExplosiveShovel;
import io.ncbpfluffybear.fluffymachines.items.tools.UpgradedLumberAxe;
import io.ncbpfluffybear.fluffymachines.items.tools.WarpPadConfigurator;
import io.ncbpfluffybear.fluffymachines.items.tools.WateringCan;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedAutoDisenchanter;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedChargingBench;
import io.ncbpfluffybear.fluffymachines.machines.AlternateElevatorPlate;
import io.ncbpfluffybear.fluffymachines.machines.AutoAncientAltar;
import io.ncbpfluffybear.fluffymachines.machines.AutoArmorForge;
import io.ncbpfluffybear.fluffymachines.machines.AutoCraftingTable;
import io.ncbpfluffybear.fluffymachines.machines.AutoMagicWorkbench;
import io.ncbpfluffybear.fluffymachines.machines.AutoTableSaw;
import io.ncbpfluffybear.fluffymachines.machines.BackpackLoader;
import io.ncbpfluffybear.fluffymachines.machines.BackpackUnloader;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustFabricator;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustRecycler;
import io.ncbpfluffybear.fluffymachines.machines.WarpPad;
import io.ncbpfluffybear.fluffymachines.machines.WaterSprinkler;
import io.ncbpfluffybear.fluffymachines.multiblocks.CrankGenerator;
import io.ncbpfluffybear.fluffymachines.multiblocks.ExpDispenser;
import io.ncbpfluffybear.fluffymachines.multiblocks.Foundry;
import io.ncbpfluffybear.fluffymachines.multiblocks.components.GeneratorCore;
import io.ncbpfluffybear.fluffymachines.multiblocks.components.SuperheatedFurnace;
import io.ncbpfluffybear.fluffymachines.utils.FluffyItems;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public final class FluffyItemSetup {

    private static final SlimefunItemStack advancedCircuitBoard = SlimefunItems.ADVANCED_CIRCUIT_BOARD;
    private static final ItemStack orangeGlass = new ItemStack(Material.ORANGE_STAINED_GLASS);
    private static final ItemStack brownGlass = new ItemStack(Material.BROWN_STAINED_GLASS);

    // ItemGroup
    private static final NestedItemGroup fluffymachines = new NestedItemGroup(
            new NamespacedKey(FluffyMachines.getInstance(), "fluffymachines"),
            new CustomItemStack(Material.SMOKER, "&6蓬松机器")
    );

    private static final ItemGroup generators = new SubItemGroup(
            new NamespacedKey(FluffyMachines.getInstance(), "generators"), fluffymachines,
            new CustomItemStack(Material.BLAST_FURNACE, "&a发电机"), 1
    );

    private static final ItemGroup machines = new SubItemGroup(
            new NamespacedKey(FluffyMachines.getInstance(), "machines"), fluffymachines,
            new CustomItemStack(Material.SMOKER, "&9机器"), 2
    );

    private static final ItemGroup tools = new SubItemGroup(
            new NamespacedKey(FluffyMachines.getInstance(), "tools"), fluffymachines,
            new CustomItemStack(Material.IRON_PICKAXE, "&b工具"), 3
    );

    private static final ItemGroup multiblocks = new SubItemGroup(
            new NamespacedKey(FluffyMachines.getInstance(), "multiblocks"), fluffymachines,
            new CustomItemStack(Material.BRICKS, "&c多方块结构"), 4
    );

    private static final ItemGroup fluffybarrels = new SubItemGroup(
            new NamespacedKey(FluffyMachines.getInstance(), "barrels"), fluffymachines,
            new CustomItemStack(Material.BARREL, "&6蓬松桶"), 5
    );

    private static final ItemGroup portableChargers = new SubItemGroup(
            new NamespacedKey(FluffyMachines.getInstance(), "portable_chargers"), fluffymachines,
            new CustomItemStack(FluffyItems.CARBONADO_PORTABLE_CHARGER, "&e便携式充电器"), 6
    );

    private static final ItemGroup wrenches = new SubItemGroup(
            new NamespacedKey(FluffyMachines.getInstance(), "wrenches"), fluffymachines,
            new CustomItemStack(FluffyItems.CARBONADO_FLUFFY_WRENCH, "&7扳手"), 7
    );

    private static final ItemGroup cargo = new SubItemGroup(
            new NamespacedKey(FluffyMachines.getInstance(), "cargo"), fluffymachines,
            new CustomItemStack(Material.CHEST, "&3货运"), 8
    );

    private static final ItemGroup misc = new SubItemGroup(
            new NamespacedKey(FluffyMachines.getInstance(), "misc"), fluffymachines,
            new CustomItemStack(Material.HOPPER, "&8杂项"), 9
    );

    private FluffyItemSetup() {
    }

    public static void setup(@Nonnull FluffyMachines plugin) {

        // Barrels
        new Barrel(fluffybarrels, FluffyItems.SMALL_FLUFFY_BARREL, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.OAK_LOG), new ItemStack(Material.BARREL), new ItemStack(Material.OAK_LOG),
                        new ItemStack(Material.OAK_LOG), new ItemStack(Material.BARREL), new ItemStack(Material.OAK_LOG),
                        new ItemStack(Material.OAK_LOG), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.OAK_LOG)},
                "&e小型蓬松桶", Barrel.SMALL_BARREL_SIZE
        ).register(plugin);

        new Barrel(fluffybarrels, FluffyItems.MEDIUM_FLUFFY_BARREL, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.SMOOTH_STONE), FluffyItems.SMALL_FLUFFY_BARREL, new ItemStack(Material.SMOOTH_STONE),
                        new ItemStack(Material.SMOOTH_STONE), FluffyItems.SMALL_FLUFFY_BARREL, new ItemStack(Material.SMOOTH_STONE),
                        new ItemStack(Material.SMOOTH_STONE), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.SMOOTH_STONE)},
                "&6中型蓬松桶", Barrel.MEDIUM_BARREL_SIZE
        ).register(plugin);

        new Barrel(fluffybarrels, FluffyItems.BIG_FLUFFY_BARREL, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.BRICKS), FluffyItems.MEDIUM_FLUFFY_BARREL, new ItemStack(Material.BRICKS),
                        new ItemStack(Material.BRICKS), FluffyItems.MEDIUM_FLUFFY_BARREL, new ItemStack(Material.BRICKS),
                        new ItemStack(Material.BRICKS), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.BRICKS)},
                "&b大型蓬松桶", Barrel.BIG_BARREL_SIZE
        ).register(plugin);

        new Barrel(fluffybarrels, FluffyItems.LARGE_FLUFFY_BARREL, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.IRON_BLOCK), FluffyItems.BIG_FLUFFY_BARREL, new ItemStack(Material.IRON_BLOCK),
                        new ItemStack(Material.IRON_BLOCK), FluffyItems.BIG_FLUFFY_BARREL, new ItemStack(Material.IRON_BLOCK),
                        new ItemStack(Material.IRON_BLOCK), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.IRON_BLOCK)},
                "&a超大型蓬松桶", Barrel.LARGE_BARREL_SIZE
        ).register(plugin);

        new Barrel(fluffybarrels, FluffyItems.MASSIVE_FLUFFY_BARREL, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.OBSIDIAN), FluffyItems.LARGE_FLUFFY_BARREL, new ItemStack(Material.OBSIDIAN),
                        new ItemStack(Material.OBSIDIAN), FluffyItems.LARGE_FLUFFY_BARREL, new ItemStack(Material.OBSIDIAN),
                        new ItemStack(Material.OBSIDIAN), SlimefunItems.REINFORCED_PLATE, new ItemStack(Material.OBSIDIAN)},
                "&5巨型蓬松桶", Barrel.MASSIVE_BARREL_SIZE
        ).register(plugin);

        new Barrel(fluffybarrels, FluffyItems.BOTTOMLESS_FLUFFY_BARREL,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REINFORCED_PLATE, FluffyItems.MASSIVE_FLUFFY_BARREL, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.REINFORCED_PLATE, FluffyItems.MASSIVE_FLUFFY_BARREL, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.REINFORCED_PLATE},
                "&c无底蓬松桶", Barrel.BOTTOMLESS_BARREL_SIZE
        ).register(plugin);

        // Chargers
        new PortableCharger(portableChargers, FluffyItems.SMALL_PORTABLE_CHARGER,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.STEEL_INGOT, SlimefunItems.COPPER_WIRE, SlimefunItems.STEEL_INGOT,
                SlimefunItems.STEEL_INGOT, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.STEEL_INGOT,
                new ItemStack(Material.BRICK), SlimefunItems.STEEL_PLATE, new ItemStack(Material.BRICK)},
                PortableCharger.Type.SMALL.chargeCapacity, PortableCharger.Type.SMALL.chargeSpeed
        ).register(plugin);

        new PortableCharger(portableChargers, FluffyItems.MEDIUM_PORTABLE_CHARGER,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.STEEL_INGOT, SlimefunItems.COPPER_WIRE, SlimefunItems.STEEL_INGOT,
                SlimefunItems.STEEL_INGOT, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.STEEL_INGOT,
                new ItemStack(Material.IRON_INGOT), SlimefunItems.STEEL_PLATE, new ItemStack(Material.IRON_INGOT)},
                PortableCharger.Type.MEDIUM.chargeCapacity, PortableCharger.Type.MEDIUM.chargeSpeed
        ).register(plugin);

        new PortableCharger(portableChargers, FluffyItems.BIG_PORTABLE_CHARGER,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.STEEL_INGOT, SlimefunItems.COPPER_WIRE, SlimefunItems.STEEL_INGOT,
                SlimefunItems.STEEL_INGOT, SlimefunItems.BIG_CAPACITOR, SlimefunItems.STEEL_INGOT,
                new ItemStack(Material.GOLD_INGOT), SlimefunItems.STEEL_PLATE, new ItemStack(Material.GOLD_INGOT)},
                PortableCharger.Type.BIG.chargeCapacity, PortableCharger.Type.BIG.chargeSpeed
        ).register(plugin);

        new PortableCharger(portableChargers, FluffyItems.LARGE_PORTABLE_CHARGER,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.STEEL_INGOT, SlimefunItems.COPPER_WIRE, SlimefunItems.STEEL_INGOT,
                SlimefunItems.STEEL_INGOT, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.STEEL_INGOT,
                new ItemStack(Material.NETHER_BRICK), SlimefunItems.STEEL_PLATE, new ItemStack(Material.NETHER_BRICK)},
                PortableCharger.Type.LARGE.chargeCapacity, PortableCharger.Type.LARGE.chargeSpeed
        ).register(plugin);

        new PortableCharger(portableChargers, FluffyItems.CARBONADO_PORTABLE_CHARGER,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.STEEL_INGOT, SlimefunItems.COPPER_WIRE, SlimefunItems.STEEL_INGOT,
                SlimefunItems.STEEL_INGOT, SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.STEEL_INGOT,
                new ItemStack(Material.NETHERITE_INGOT), SlimefunItems.STEEL_PLATE,
                new ItemStack(Material.NETHERITE_INGOT)},
                PortableCharger.Type.CARBONADO.chargeCapacity, PortableCharger.Type.CARBONADO.chargeSpeed
        ).register(plugin);

        // Multiblocks
        new CrankGenerator(generators, FluffyItems.CRANK_GENERATOR).register(plugin);
        new Foundry(multiblocks, FluffyItems.FOUNDRY).register(plugin);
        new ExpDispenser(multiblocks, FluffyItems.EXP_DISPENSER, new ItemStack[]{
                null, null, null,
                null, new ItemStack(Material.GRINDSTONE), null,
                null, new ItemStack(Material.DISPENSER), null
        }).register(plugin);

        // Tools
        new WateringCan(tools, FluffyItems.WATERING_CAN,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.IRON_INGOT), null, new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.BUCKET), new ItemStack(Material.IRON_INGOT),
                null, new ItemStack(Material.IRON_INGOT), null
        }).register(plugin);

        new Scythe(tools, FluffyItems.SCYTHE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT),
                null, new ItemStack(Material.IRON_HOE), null,
                null, new ItemStack(Material.STICK), null
        }).register(plugin);

        new FluffyWrench(wrenches, FluffyItems.FLUFFY_WRENCH,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.COPPER_INGOT, null, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT,
                null, SlimefunItems.COPPER_INGOT, null
        }, FluffyWrench.Wrench.DEFAULT).register(plugin);

        new FluffyWrench(wrenches, FluffyItems.REINFORCED_FLUFFY_WRENCH,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REINFORCED_ALLOY_INGOT, null, SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.REINFORCED_ALLOY_INGOT, FluffyItems.FLUFFY_WRENCH, SlimefunItems.REINFORCED_ALLOY_INGOT,
                null, SlimefunItems.SYNTHETIC_DIAMOND, null
        }, FluffyWrench.Wrench.REINFORCED).register(plugin);

        new FluffyWrench(wrenches, FluffyItems.CARBONADO_FLUFFY_WRENCH,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.CARBONADO, null, SlimefunItems.CARBONADO,
                SlimefunItems.CARBONADO, FluffyItems.REINFORCED_FLUFFY_WRENCH, SlimefunItems.CARBONADO,
                null, SlimefunItems.CARBONADO_EDGED_CAPACITOR, null
        }, FluffyWrench.Wrench.CARBONADO).register(plugin);

        new UpgradedLumberAxe(tools, FluffyItems.UPGRADED_LUMBER_AXE,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.DIAMOND), new ItemStack(Material.DIAMOND),
                null, SlimefunItems.LUMBER_AXE, null,
                null, new ItemStack(Material.OBSIDIAN), null
        }).register(plugin);

        new UpgradedExplosivePickaxe(tools, FluffyItems.UPGRADED_EXPLOSIVE_PICKAXE,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_EMERALD,
                new ItemStack(Material.TNT), SlimefunItems.EXPLOSIVE_PICKAXE, new ItemStack(Material.TNT),
                null, new ItemStack(Material.OBSIDIAN), null
        }).register(plugin);

        new UpgradedExplosiveShovel(tools, FluffyItems.UPGRADED_EXPLOSIVE_SHOVEL,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_EMERALD,
                new ItemStack(Material.TNT), SlimefunItems.EXPLOSIVE_SHOVEL, new ItemStack(Material.TNT),
                null, new ItemStack(Material.OBSIDIAN), null
        }).register(plugin);

        new Paxel(tools, FluffyItems.PAXEL,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.SYNTHETIC_EMERALD, new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.SYNTHETIC_EMERALD,
                SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.DIAMOND_AXE), SlimefunItems.REINFORCED_ALLOY_INGOT,
                SlimefunItems.SYNTHETIC_DIAMOND, new ItemStack(Material.DIAMOND_SHOVEL), SlimefunItems.SYNTHETIC_DIAMOND,
        }).register(plugin);

        // Machines
        new WaterSprinkler(machines, FluffyItems.WATER_SPRINKER,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.IRON_INGOT), SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.BUCKET), new ItemStack(Material.DISPENSER), new ItemStack(Material.BUCKET),
                new ItemStack(Material.IRON_INGOT), SlimefunItems.SMALL_CAPACITOR, new ItemStack(Material.IRON_INGOT)
        }).register(plugin);

        new AutoCraftingTable(machines, FluffyItems.AUTO_CRAFTING_TABLE,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REINFORCED_PLATE, advancedCircuitBoard, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.CARGO_MOTOR, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.CARGO_MOTOR,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_PLATE
        }).register(plugin);

        new AutoAncientAltar(machines, FluffyItems.AUTO_ANCIENT_ALTAR,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.ANCIENT_PEDESTAL,
                SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems.ANCIENT_ALTAR, SlimefunItems.ANCIENT_PEDESTAL,
                SlimefunItems.ANCIENT_PEDESTAL, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ANCIENT_PEDESTAL
        }).register(plugin);

        new AutoTableSaw(machines, FluffyItems.AUTO_TABLE_SAW,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                advancedCircuitBoard, SlimefunItems.MEDIUM_CAPACITOR, advancedCircuitBoard,
                new ItemStack(Material.SMOOTH_STONE_SLAB), new ItemStack(Material.STONECUTTER),
                new ItemStack(Material.SMOOTH_STONE_SLAB),
                SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.IRON_BLOCK), SlimefunItems.ELECTRIC_MOTOR
        }).register(plugin);

        new AutoMagicWorkbench(machines, FluffyItems.AUTO_MAGIC_WORKBENCH,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.BOOKSHELF), advancedCircuitBoard, new ItemStack(Material.BOOKSHELF),
                new ItemStack(Material.BOOKSHELF), new ItemStack(Material.CRAFTING_TABLE),
                new ItemStack(Material.DISPENSER),
                new ItemStack(Material.BOOKSHELF), FluffyItems.AUTO_CRAFTING_TABLE, new ItemStack(Material.BOOKSHELF)
        }).register(plugin);

        new AutoArmorForge(machines, FluffyItems.AUTO_ARMOR_FORGE,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.ANVIL), new ItemStack(Material.ANVIL), new ItemStack(Material.ANVIL),
                advancedCircuitBoard, new ItemStack(Material.DISPENSER), advancedCircuitBoard,
                new ItemStack(Material.ANVIL), FluffyItems.AUTO_CRAFTING_TABLE, new ItemStack(Material.ANVIL)
        }).register(plugin);

        new AdvancedAutoDisenchanter(machines, FluffyItems.ADVANCED_AUTO_DISENCHANTER,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.REDSTONE_ALLOY, SlimefunItems.AUTO_ANVIL_2, SlimefunItems.REDSTONE_ALLOY,
                SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.AUTO_DISENCHANTER, SlimefunItems.BLISTERING_INGOT_3,
                SlimefunItems.WITHER_PROOF_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN,
                SlimefunItems.WITHER_PROOF_OBSIDIAN
        }).register(plugin);

        new BackpackLoader(machines, FluffyItems.BACKPACK_LOADER,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                orangeGlass, orangeGlass, orangeGlass,
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.HOPPER), new ItemStack(Material.IRON_INGOT),
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.BIG_CAPACITOR, SlimefunItems.ELECTRIC_MOTOR
        }).register(plugin);

        new BackpackUnloader(machines, FluffyItems.BACKPACK_UNLOADER,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                brownGlass, brownGlass, brownGlass,
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.DISPENSER), new ItemStack(Material.IRON_INGOT),
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.BIG_CAPACITOR, SlimefunItems.ELECTRIC_MOTOR
        }).register(plugin);

        new GeneratorCore(generators, FluffyItems.GENERATOR_CORE,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.IRON_INGOT), SlimefunItems.ELECTRO_MAGNET, new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.IRON_INGOT), advancedCircuitBoard, new ItemStack(Material.IRON_INGOT)
        }).register(plugin);

        new SuperheatedFurnace(multiblocks, FluffyItems.SUPERHEATED_FURNACE,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN),
                new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.BLAST_FURNACE),
                new ItemStack(Material.LAVA_BUCKET),
                new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN)
        }).register(plugin);

        // Misc
        new HelicopterHat(misc, FluffyItems.HELICOPTER_HAT,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT),
                advancedCircuitBoard, new ItemStack(Material.LEATHER_HELMET), advancedCircuitBoard,
                SlimefunItems.COMPRESSED_CARBON, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.COMPRESSED_CARBON
        }).register(plugin);

        new FireproofRune(misc, FluffyItems.FIREPROOF_RUNE,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.SYNTHETIC_EMERALD, new ItemStack(Material.NETHERITE_INGOT), SlimefunItems.SYNTHETIC_EMERALD,
                new ItemStack(Material.OBSIDIAN), SlimefunItems.FIRE_RUNE, new ItemStack(Material.OBSIDIAN),
                SlimefunItems.SYNTHETIC_EMERALD, new ItemStack(Material.OBSIDIAN), SlimefunItems.SYNTHETIC_EMERALD
        }).register(plugin);

        new EnderChestInsertionNode(cargo, FluffyItems.ENDER_CHEST_INSERTION_NODE,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ENDER_LUMP_2, SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ENDER_LUMP_2,
                new ItemStack(Material.DISPENSER), new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.HOPPER),
                SlimefunItems.ENDER_LUMP_2, SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ENDER_LUMP_2
        }).register(plugin);

        new EnderChestExtractionNode(cargo, FluffyItems.ENDER_CHEST_EXTRACTION_NODE,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ENDER_LUMP_2, SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ENDER_LUMP_2,
                new ItemStack(Material.HOPPER), new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.DISPENSER),
                SlimefunItems.ENDER_LUMP_2, advancedCircuitBoard, SlimefunItems.ENDER_LUMP_2
        }).register(plugin);

        new Dolly(misc, FluffyItems.DOLLY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER), new ItemStack(Material.LEATHER),
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.MINECART), new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.IRON_INGOT)
        }).register(plugin);

        new SlimefunItem(misc, FluffyItems.ANCIENT_BOOK,
                RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                new ItemStack(Material.BOOK), SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, new ItemStack(Material.BOOK),
                SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, SlimefunItems.ENCHANTMENT_RUNE,
                SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE,
                new ItemStack(Material.BOOK), SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE, new ItemStack(Material.BOOK)
        }).register(plugin);

        new WarpPad(misc, FluffyItems.WARP_PAD,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.ENDER_EYE), new ItemStack(Material.ENDER_EYE), new ItemStack(Material.ENDER_EYE),
                new ItemStack(Material.ENDER_EYE), SlimefunItems.GPS_TELEPORTER_PYLON, new ItemStack(Material.ENDER_EYE),
                new ItemStack(Material.ENDER_EYE), new ItemStack(Material.ENDER_EYE), new ItemStack(Material.ENDER_EYE)
        }).register(plugin);

        new WarpPadConfigurator(misc, FluffyItems.WARP_PAD_CONFIGURATOR,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, new ItemStack(Material.ENDER_EYE), null,
                null, SlimefunItems.MAGNESIUM_INGOT, null,
                null, SlimefunItems.MAGNESIUM_INGOT, null
        }).register(plugin);

        new ElectricDustFabricator(machines, FluffyItems.ELECTRIC_DUST_FABRICATOR,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_ORE_GRINDER_2,
                SlimefunItems.ELECTRIC_ORE_GRINDER_2,
                SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ELECTRIC_GOLD_PAN_3,
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ELECTRIC_MOTOR
        }).register(plugin);

        new ElectricDustRecycler(machines, FluffyItems.ELECTRIC_DUST_RECYCLER,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.PISTON), new ItemStack(Material.LAVA_BUCKET),
                new ItemStack(Material.LAVA_BUCKET), SlimefunItems.ELECTRIFIED_CRUCIBLE_3,
                new ItemStack(Material.LAVA_BUCKET),
                SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.PISTON), SlimefunItems.ELECTRIC_MOTOR
        }).register(plugin);

        new AlternateElevatorPlate(misc, FluffyItems.ALTERNATE_ELEVATOR_PLATE,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.STONE_PRESSURE_PLATE), new ItemStack(Material.STONE_PRESSURE_PLATE), new ItemStack(Material.STONE_PRESSURE_PLATE),
                new ItemStack(Material.PISTON), SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.PISTON),
                SlimefunItems.ALUMINUM_BRONZE_INGOT, SlimefunItems.ALUMINUM_BRONZE_INGOT,
                SlimefunItems.ALUMINUM_BRONZE_INGOT},
                new SlimefunItemStack(FluffyItems.ALTERNATE_ELEVATOR_PLATE, 2)
        ).register(plugin);

        new AdvancedChargingBench(machines, FluffyItems.ADVANCED_CHARGING_BENCH,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.CORINTHIAN_BRONZE_INGOT, advancedCircuitBoard, SlimefunItems.CORINTHIAN_BRONZE_INGOT,
                advancedCircuitBoard, SlimefunItems.CHARGING_BENCH, advancedCircuitBoard,
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.ELECTRIC_MOTOR
        }).register(plugin);

        new ACBUpgradeCard(machines, FluffyItems.ACB_UPGRADE_CARD,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.CORINTHIAN_BRONZE_INGOT, advancedCircuitBoard, SlimefunItems.CORINTHIAN_BRONZE_INGOT,
                advancedCircuitBoard, SlimefunItems.ELECTRIC_MOTOR, advancedCircuitBoard,
                SlimefunItems.GOLD_24K, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.GOLD_24K
        }).register(plugin);

        new CargoManipulator(cargo, FluffyItems.CARGO_MANIPULATOR,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.CARGO_MOTOR, new ItemStack(Material.ENDER_EYE), SlimefunItems.ELECTRIC_MOTOR,
                new ItemStack(Material.ENDER_EYE), new ItemStack(Material.COMPASS), new ItemStack(Material.ENDER_EYE),
                SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.ENDER_EYE), SlimefunItems.CARGO_MOTOR
        }).register(plugin);
    }

}
