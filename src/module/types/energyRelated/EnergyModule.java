package module.types.energyRelated;

import module.Module;

public class EnergyModule extends Module {
    public EnergyModule() {
        super(2, "EnergyModule");
    }

    public EnergyModule(Module module) {
        super(module);
    }

    @Override
    public Module clone() {
        return new EnergyModule(this);
    }

    @Override
    public String getType() {
        return "EnergyModule";
    }
}
