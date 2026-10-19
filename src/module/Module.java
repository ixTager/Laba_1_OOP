package module;

import module.moduleData.Capacity;
import module.moduleData.Durability;
import module.moduleData.EnergyConsumption;

public abstract class Module {
    int id;
    static int nextId;
    String name;
    int efficiency;
    ModuleState state;
    Durability durability;
    EnergyConsumption energyConsumption;
    Capacity capacity;

    public void clone(Module module) {
        this.id = module.id;
        this.name = module.name;
        this.efficiency = module.efficiency;
        this.state = module.state;
        this.durability = module.durability;
        this.energyConsumption = module.energyConsumption;
        this.capacity = module.capacity;
    }

    public ModuleState getState() {
        return state;
    }

    public void setState(ModuleState state) {
        this.state = state;
    }
}
