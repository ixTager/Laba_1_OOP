package module.types.research;

import module.Module;

public class ResearchModule extends Module {
    public ResearchModule() {
        super(2, "ResearchModule");
    }

    public ResearchModule(Module module) {
        super(module);
    }
    @Override
    public Module clone() {
        return new ResearchModule(this);
    }

    @Override
    public String getType() {
        return "ResearchModule";
    }
}
