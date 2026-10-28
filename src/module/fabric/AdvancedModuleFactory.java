package module.fabric;

import module.types.energyRelated.EnergyModule;
import module.types.energyRelated.impl.ReactorModule;
import module.types.research.ResearchModule;
import module.types.research.impl.PhysicsLab;
import module.types.residential.ResidentialModule;
import module.types.residential.impl.MedicalCabin;

public class AdvancedModuleFactory implements  ModuleFactory {

    public ResidentialModule createResidentialModule() {
        return new MedicalCabin();
    }

    public EnergyModule createEnergyModule() {
        return new ReactorModule();
    }

    public ResearchModule createResearchModule() {
        return new PhysicsLab();
    }
}
