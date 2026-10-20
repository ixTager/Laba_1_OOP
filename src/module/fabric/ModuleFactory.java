package module.fabric;

import module.types.energyRelated.EnergyModule;
import module.types.research.ResearchModule;
import module.types.residential.ResidentialModule;

public interface ModuleFactory {
    ResidentialModule createResidentialModule();
    EnergyModule createEnergyModule();
    ResearchModule createResearchModule();
}
