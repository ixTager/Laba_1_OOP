package module;

import module.energyRelated.EnergyRelatedModule;
import module.research.ResearchModule;
import module.residential.ResidentialModule;

public class ModuleFactoryImpl implements  ModuleFactory{

    @Override
    public Module createResidentialModule(String name) {
        return new ResidentialModule();
    }

    @Override
    public Module createEnergyModule(String name) {
        return new EnergyRelatedModule();
    }

    @Override
    public Module createResearchModule(String name) {
        return new ResearchModule();
    }
}
