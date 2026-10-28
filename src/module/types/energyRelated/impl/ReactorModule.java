package module.types.energyRelated.impl;

import module.Module;
import module.types.energyRelated.EnergyModule;

public class ReactorModule extends EnergyModule {
    public ReactorModule() {
        super();
    }

    public ReactorModule(Module module) {
        super(module);
    }

    @Override
    public Module clone() {
        return super.clone();
    }

    @Override
    public String getType() {
        return "ReactorModule";
    }
}
