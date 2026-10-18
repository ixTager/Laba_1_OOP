package module;

public interface ModuleFactory {
    Module createResidentialModule(String name);
    Module createEnergyModule(String name);
    Module createResearchModule(String name);
}
