package module.energyRelated;

import module.Capacity;
import module.Durability;
import module.EnergyConsumption;
import module.Module;

public class EnergyRelatedModule implements Module {
    private final Durability durability;
    private final EnergyConsumption energyConsumption;
    private final Capacity capacity;

    private int efficiency = 0;

    public EnergyRelatedModule() {
        durability = new Durability();
        energyConsumption = new EnergyConsumption();
        capacity = new Capacity();
    }

    public EnergyRelatedModule(Durability durability,  EnergyConsumption energyConsumption, Capacity capacity) {
        this.durability = durability;
        this.energyConsumption = energyConsumption;
        this.capacity = capacity;
    }

    @Override
    public int getEfficiency() {
        return efficiency;
    }

    @Override
    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }
}
