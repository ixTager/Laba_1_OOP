package module.types.research;

import module.Module;

public class ResearchModule extends Module {
    public ResearchModule() {
        super(2, "ResearchModule");
    }

    @Override
    public Module clone() {
        //Todo
        return null;
    }

    @Override
    public String getType() {
        return "ResearchModule";
    }
}
