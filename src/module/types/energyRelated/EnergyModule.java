package module.types.energyRelated;

import module.Module;

public class EnergyModule extends Module {

    public EnergyModule() {
        super("EnergyModule", 2);
    }

    @Override
    public void clone(Module module) {}

    @Override
    public String getType() {
        return "EnergyModule";
    }
}
