package module.types.residential.impl;

import module.Module;
import module.types.residential.ResidentialModule;

public class MedicalCabin extends ResidentialModule {
    public MedicalCabin() {
        super();
    }

    public MedicalCabin(Module module) {
        super(module);
    }

    @Override
    public Module clone() {
        return super.clone();
    }

    @Override
    public String getType() {
        return "MedicalCabin";
    }
}
