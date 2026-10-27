package module;

import module.moduleData.Capacity;
import module.moduleData.Durability;
import module.moduleData.EnergyConsumption;

public abstract class Module {
    private int id;
    private String name;
    private int efficiency;
    private ModuleState state;
    private Durability durability;
    private EnergyConsumption energyConsumption;
    private Capacity capacity;

    private static int nextId = 0;

    public Module(int efficiency, String name) {
        if (!checkValidEfficiency(efficiency)) throw new IllegalArgumentException("Invalid efficiency");

        this.id = ++nextId;
        this.name = name;
        this.efficiency = efficiency;
        this.state = ModuleState.ON;
        this.durability = new Durability();
        this.energyConsumption = new EnergyConsumption();
        this.capacity = new Capacity();
    }

    public Module(
            int efficiency, String name, ModuleState state, Durability durability,
            EnergyConsumption energyConsumption, Capacity capacity) {
        if (!checkValidEfficiency(efficiency)) throw new IllegalArgumentException("Invalid efficiency");

        this.id = ++nextId;
        this.name = name;
        this.efficiency = efficiency;
        this.state = state;
        this.durability = new Durability(durability.getValue());
        this.energyConsumption = new EnergyConsumption(energyConsumption.getValue());
        this.capacity = new Capacity(capacity.getValue());
    }

    public Module(Module module) {
        this.id = ++nextId;
        this.name = module.name;
        this.efficiency = module.efficiency;
        this.state = module.state;
        this.durability = new Durability(module.durability.getValue());
        this.energyConsumption = new EnergyConsumption(module.energyConsumption.getValue());
        this.capacity = new Capacity(module.capacity.getValue());
    }

    public boolean checkValidEfficiency(int efficiency) {
        return efficiency >= 0 && efficiency <= 100;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getEfficiency() {
        return this.efficiency;
    }

    public ModuleState getState() {
        return this.state;
    }

    public Durability getDurability() {
        return this.durability;
    }

    public EnergyConsumption getEnergyConsumption() {
        return this.energyConsumption;
    }

    public Capacity getCapacity() {
        return this.capacity;
    }

    public abstract Module clone();

    public abstract String getType();

    public void activate() {
        this.state = ModuleState.ON;
    }

    public void deactivate() {
        this.state = ModuleState.OFF;
    }

    public void setState(ModuleState state) {
        if (state == null) throw new IllegalArgumentException("ModuleState cannot be null");
        this.state = state;
    }
}
