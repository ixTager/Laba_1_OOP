package module;

import module.moduleData.Capacity;
import module.moduleData.Durability;
import module.moduleData.EnergyConsumption;

public abstract class Module {
    int id;
    String name;
    int efficiency;
    ModuleState state;
    Durability durability;
    EnergyConsumption energyConsumption;
    Capacity capacity;

    static int nextId = 0;

    public Module() {
        this.id = nextId + 1;
        nextId++;
    }

    public int getId() {
        return this.id;
    }

    public void clone(Module module) {
        this.id = module.id;
        this.name = module.name;
        this.efficiency = module.efficiency;
        this.state = module.state;
        this.durability = module.durability;
        this.energyConsumption = module.energyConsumption;
        this.capacity = module.capacity;
    }

    public String getType() {
        return this.name;
    }

    public void activate() {
        this.state = ModuleState.ACTIVE;
    }

    public void deactivate() {
        this.state = ModuleState.DEACTIVATE;
    }

    public void setState(ModuleState state) {
        this.state = state;
    }
}
