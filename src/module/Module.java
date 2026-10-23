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

    static int nextId = 0;

    public Module(String name, int efficiency) {
        if (efficiency < 0) throw new IllegalArgumentException("Efficiency cannot be negative");
        else if (efficiency > 100) throw new IllegalArgumentException("Efficiency cannot be higher than 100");

        this.id = nextId + 1;
        this.name = name;
        this.efficiency = efficiency;
        this.state = ModuleState.ON;

        nextId++;
    }

    public Module(String name) {
        this.id = nextId++;
        this.name = name;
        this.efficiency = 0;
        this.state = ModuleState.ON;

        nextId++;
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

    public abstract void clone(Module module);

    public abstract String getType();

    public void activate() {
        this.state = ModuleState.ON;
    }

    public void deactivate() {
        this.state = ModuleState.ON;
    }

    public void setState(ModuleState state) {
        this.state = state;
    }
}
