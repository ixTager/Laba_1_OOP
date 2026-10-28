package module.types.energyRelated.impl;

import module.Module;

import module.types.energyRelated.EnergyModule;

public class SolarModule extends EnergyModule {
    public SolarModule() {
        super();
    }

    public SolarModule(Module module) {
        super(module);
    }

    @Override
    public Module clone() {
        return super.clone();
    }

    @Override
    public String getType() {
        return "SolarModule";
    }
}
