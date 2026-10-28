package module.types.residential.impl;

import module.Module;
import module.types.residential.ResidentialModule;

public class CrewCabin extends ResidentialModule {
    public CrewCabin() {
        super();
    }

    public CrewCabin(Module module) {
        super(module);
    }

    @Override
    public Module clone() {
        return super.clone();
    }

    @Override
    public String getType() {
        return "CrewCabin";
    }
}
