package module.types.research;

import module.Module;

public class ResearchModule extends Module {
    public ResearchModule() {
        super("ResearchModule", 2);
    }

    @Override
    public void clone(Module module) {}

    @Override
    public String getType() {
        return "ResearchModule";
    }
}
