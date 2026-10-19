package module.fabric;

import module.Module;

public interface ModuleFactory {
    module.Module createResidentialModule();
    module.Module createEnergyModule();
    Module createResearchModule();
}
