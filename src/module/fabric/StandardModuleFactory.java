package module.fabric;

import module.types.energyRelated.EnergyModule;
import module.types.energyRelated.impl.SolarModule;
import module.types.research.ResearchModule;
import module.types.research.impl.BiologyLab;
import module.types.residential.ResidentialModule;
import module.types.residential.impl.CrewCabin;

public class StandardModuleFactory implements  ModuleFactory {
    public ResidentialModule createResidentialModule() {
        return new CrewCabin();
    }

    public EnergyModule createEnergyModule() {
        return new SolarModule();
    }

    public ResearchModule createResearchModule() {
        return new BiologyLab();
    }
}
