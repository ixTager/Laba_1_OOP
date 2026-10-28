package module.types.research.impl;

import module.Module;
import module.types.research.ResearchModule;

public class PhysicsLab extends ResearchModule {
    public PhysicsLab() {
        super();
    }

    public PhysicsLab(Module module) {
        super(module);
    }

    @Override
    public Module clone() {
        return super.clone();
    }

    @Override
    public String getType() {
        return "PhysicsLab";
    }

}
