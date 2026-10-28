package module.types.research.impl;

import module.Module;
import module.types.research.ResearchModule;

public class BiologyLab extends ResearchModule {
    public BiologyLab() {
        super();
    }

    public BiologyLab(Module module) {
        super(module);
    }

    @Override
    public Module clone() {
        return super.clone();
    }

    @Override
    public String getType() {
        return "BiologyLab";
    }
}
